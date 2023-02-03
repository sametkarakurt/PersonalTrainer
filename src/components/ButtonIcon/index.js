import React from 'react';
import {View, TouchableOpacity} from 'react-native';
import FontAwesome from 'react-native-vector-icons/FontAwesome';
import FontAwesome5 from 'react-native-vector-icons/FontAwesome5';
import Feather from 'react-native-vector-icons/Feather';
import {styles, sizes, types, noShadowStyle} from './style';

const renderIcon = type => {
  if (type === 'FontAwesome') {
    return FontAwesome;
  } else if (type === 'FontAwesome5') {
    return FontAwesome5;
  } else if (type === 'Feather') {
    return Feather;
  } else {
    return FontAwesome5;
  }
};

const ButtonIcon = props => {
  const {
    icon = 'chevron-left',
    type = 'single',
    theme = 'primary',
    dimension = 'md',
    isReverse = false,
    style = {},
    touchableStyle = {},
    iconType = 'FontAwesome5',
    noShadow = false,
    onPress = () => {},
    actionable = true,
  } = props;

  const Icon = renderIcon(iconType);

  const {view, text} = styles[theme] || styles.primary;
  const height = sizes[dimension]?.height || sizes.md.height;
  const fontSize = sizes[dimension]?.fontSize || sizes.md.fontSize;

  const backColor = isReverse
    ? {backgroundColor: 'transparent'}
    : view.backgroundColor;
  const fontColor = isReverse ? view.backgroundColor : text.color;

  const size = {
    width: height,
    height,
  };

  const viewStyle = {
    ...view,
    ...backColor,
    ...types[type],
    ...size,
  };

  const shadowStyle = noShadow ? noShadowStyle : {};

  return actionable ? (
    <TouchableOpacity
      onPress={onPress}
      focusable={false}
      accessible={false}
      style={touchableStyle}>
      <View style={[viewStyle, style, shadowStyle]}>
        <Icon name={icon} size={fontSize} color={fontColor} />
      </View>
    </TouchableOpacity>
  ) : (
    <View style={[viewStyle, style, shadowStyle]}>
      <Icon name={icon} size={fontSize} color={fontColor} />
    </View>
  );
};

export default ButtonIcon;
