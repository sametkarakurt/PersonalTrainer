import { StyleSheet, View, Text, TouchableOpacity, NativeModules } from 'react-native'

import { GoogleSignin, statusCodes } from '@react-native-google-signin/google-signin'
import React from 'react'

const App = () => {
  GoogleSignin.configure({
    webClientId: '991915358860-umq4f0i5f9qkjdhbh5n8k7cl78f57k84.apps.googleusercontent.com' // client ID of type WEB for your server (needed to verify user ID and offline access)
  })

  const { IyzipayModule } = NativeModules
  // Somewhere in your code
  const signIn = async () => {
    try {
      await GoogleSignin.hasPlayServices()
      const userInfo = await GoogleSignin.signIn()

      alert(JSON.stringify(userInfo))
      await GoogleSignin.signOut()
    } catch (error) {
      console.log(error)
      if (error.code === statusCodes.SIGN_IN_CANCELLED) {
        // user cancelled the login flow
      } else if (error.code === statusCodes.IN_PROGRESS) {
        // operation (e.g. sign in) is in progress already
      } else if (error.code === statusCodes.PLAY_SERVICES_NOT_AVAILABLE) {
        // play services not available or outdated
      } else {
        // some other error happened
      }
    }
  }
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <TouchableOpacity onPress={signIn}>
        <Text>Google Sign ın</Text>
      </TouchableOpacity>

      <TouchableOpacity
        onPress={() => IyzipayModule.makeSales((response) => console.log(response))}
      >
        <Text>Native Module</Text>
      </TouchableOpacity>
    </View>
  )
}

export default App
