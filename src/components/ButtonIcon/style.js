import {colors, themes, shadow, noShadowStyle} from '../../styles/settings';

const size = 50;
const sizes = {
  xs: {
    height: 20,
    fontSize: 12,
  },
  sm: {
    height: 30,
    fontSize: 15,
  },
  md: {
    height: 40,
    fontSize: 21,
  },
  lg: {
    height: 50,
    fontSize: 25,
  },
  xl: {
    height: 60,
    fontSize: 28,
  },
  xxl: {
    height: 70,
    fontSize: 32,
  },
};
const types = {
  circle: {
    borderRadius: 50,
    overflow: 'hidden',
  },
  rounded: {borderRadius: 5},
  square: {},
  single: {},
};

const button = {
  view: {
    width: size,
    height: size,
    alignItems: 'center',
    justifyContent: 'center',
    ...shadow,
  },
  text: {
    color: colors.light,
  },
};

const styles = themes.reduce((style, key) => {
  const themeColor = colors[key] || colors.primary;
  const islight = key === 'light';

  style[key] = {
    view: {
      ...button.view,
      backgroundColor: themeColor,
    },
    text: {
      ...button.text,
      color: islight ? colors.text : colors.light,
    },
  };

  return style;
}, {});

export {styles, sizes, types, noShadowStyle};
