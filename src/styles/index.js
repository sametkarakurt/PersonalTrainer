//@ Theme settings should be provider

import {StyleSheet} from 'react-native';
import {DefaultTheme} from '@react-navigation/native';
import {getStyle, getBgStyles, styleHandler} from './helper';
import {
  colors,
  themes,
  padding,
  margin,
  sizing,
  sizingRelative,
  column,
  flex,
  border,
  borderRadiusStyle,
  colorStyle,
  fontSize,
  shadow,
} from './settings';

const theme = {
  ...DefaultTheme,
  colors: {
    ...DefaultTheme.colors,
    background: colors.background,
  },
};

const s = StyleSheet.create({
  ...getStyle(padding),
  ...getStyle(margin),
  ...getStyle(sizing),
  ...getStyle(column),
  ...getStyle(fontSize),
  ...getStyle(sizingRelative),
  ...getBgStyles(colors, themes),
  ...flex,
  ...border,
  ...borderRadiusStyle,
  ...colorStyle,
  shadow,
});

//console.log(s);

const bs = ({raw: [str = '']}) => styleHandler(s, str.trim());

export {colors, theme, bs};
