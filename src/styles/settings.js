const colors = {
  primary: '#233f5b',
  brand: '#149eb5',
  success: '#188842',
  warning: '#eaa000',
  danger: '#d81e3b',
  light: '#ffffff',
  lighter: '#f1f1f1',
  border: '#c1c1c1',
  background: '#e7ecf1',
  text: '#444',
  warningDark: '#b77d00',
  indigo: '#5071BE',
};

const family = {
  light: 'Poppins-Light',
  regular: 'Poppins-Regular',
  bold: 'Poppins-SemiBold',
};

const themes = [
  'primary',
  'brand',
  'success',
  'warning',
  'warningDark',
  'danger',
  'light',
  'lighter',
  'text',
  'indigo',
];

const shadow = {
  shadowColor: colors.text,
  shadowOffset: {
    width: 0,
    height: 10,
  },
  shadowOpacity: 0.12,
  shadowRadius: 60,
  elevation: 4,
};

const noShadowStyle = {
  shadowColor: 'black',
  shadowOffset: {
    width: 0,
    height: 0,
  },
  shadowOpacity: 0,
  shadowRadius: 0,
  elevation: 0,
};

const borderRadius = 14;
const borderWidth = 1.5;

const padding = {
  settings: {
    limit: 10,
    multiplier: 2.5,
  },
  properties: [
    {
      name: 'p',
      property: ['padding'],
    },
    {
      name: 'pt',
      property: ['paddingTop'],
    },
    {
      name: 'pr',
      property: ['paddingRight'],
    },
    {
      name: 'pb',
      property: ['paddingBottom'],
    },
    {
      name: 'pl',
      property: ['paddingLeft'],
    },
    {
      name: 'py',
      property: ['paddingLeft', 'paddingRight'],
    },
    {
      name: 'px',
      property: ['paddingTop', 'paddingBottom'],
    },
  ],
};

const margin = {
  settings: {
    limit: 8,
    multiplier: 2.5,
  },
  properties: [
    {
      name: 'm',
      property: ['margin'],
    },
    {
      name: 'mt',
      property: ['marginTop'],
    },
    {
      name: 'mr',
      property: ['marginRight'],
    },
    {
      name: 'mb',
      property: ['marginBottom'],
    },
    {
      name: 'ml',
      property: ['marginLeft'],
    },
    {
      name: 'my',
      property: ['marginLeft', 'marginRight'],
    },
    {
      name: 'mx',
      property: ['marginTop', 'marginBottom'],
    },
  ],
};

const sizing = {
  settings: {
    limit: 20,
    multiplier: 5,
    unit: '%',
    isValueName: true,
  },
  properties: [
    {
      name: 'w',
      property: ['width'],
    },
    {
      name: 'mw',
      property: ['minWidth'],
    },
    {
      name: 'h',
      property: ['height'],
    },
    {
      name: 'mh',
      property: ['minHeight'],
    },
  ],
};

const sizingRelative = {
  settings: {
    limit: 20,
    multiplier: 5,
    isValueName: true,
  },
  properties: [
    {
      name: 'wr',
      property: ['width'],
    },
    {
      name: 'hr',
      property: ['height'],
    },
  ],
};

const column = {
  settings: {
    limit: 12,
    multiplier: 100 / 12,
    unit: '%',
  },
  properties: [
    {
      name: 'col',
      property: ['width'],
    },
  ],
};

const fontSize = {
  settings: {
    limit: 10,
    multiplier: 4,
    isValueName: true,
  },
  properties: [
    {
      name: 'fs',
      property: ['fontSize'],
    },
  ],
};

const border = {
  border: {
    borderWidth,
    borderColor: colors.border,
  },
  borderTop: {
    borderTopWidth: borderWidth,
    borderTopColor: colors.border,
  },
  borderTopLighter: {
    borderTopWidth: borderWidth,
    borderTopColor: colors.lighter,
  },
  borderRight: {
    borderRightWidth: borderWidth,
    borderRightColor: colors.border,
  },
  borderBottom: {
    borderBottomWidth: borderWidth,
    borderBottomColor: colors.border,
  },
  borderLeft: {
    borderLeftWidth: borderWidth,
    borderLeftColor: colors.border,
  },
  borderPrimary: {
    borderColor: colors.primary,
  },
};

const borderRadiusStyle = {
  borderRadius: {
    borderRadius,
  },
  borderTopLeftRadius: {
    borderTopLeftRadius: borderRadius,
  },
  borderTopRightRadius: {
    borderTopRightRadius: borderRadius,
  },
  borderBottomLeftRadius: {
    borderBottomLeftRadius: borderRadius,
  },
  borderBottomRightRadius: {
    borderBottomRightRadius: borderRadius,
  },
};

const colorStyle = {
  textDanger: {
    color: colors.danger,
  },
  textPrimary: {
    color: colors.primary,
  },
  textWarning: {
    color: colors.warning,
  },
  textSuccess: {
    color: colors.success,
  },
  textMd: {
    fontSize: 18,
  },
  textLg: {
    fontSize: 22,
  },
};

const flex = {
  flex: {
    flex: 1,
  },
  flexGrow: {
    flexGrow: 1,
  },
  row: {
    flexDirection: 'row',
  },
  rowReverse: {
    flexDirection: 'row-reverse',
  },
  column: {
    flexDirection: 'column',
  },
  columnReverse: {
    flexDirection: 'column-reverse',
  },
  justifyStart: {
    justifyContent: 'flex-start',
  },
  justifySpaceEvenly: {
    justifyContent: 'space-evenly',
  },
  justifyCenter: {
    justifyContent: 'center',
  },
  justifyEnd: {
    justifyContent: 'flex-end',
  },
  justifyBetween: {
    justifyContent: 'space-between',
  },
  justifyAround: {
    justifyContent: 'space-around',
  },
  alignStart: {
    alignItems: 'flex-start',
  },
  alignEnd: {
    alignItems: 'flex-end',
  },
  alignCenter: {
    alignItems: 'center',
  },
  alignStretch: {
    alignItems: 'stretch',
  },
  alignSelfStretch: {
    alignSelf: 'stretch',
  },
  alignSelfCenter: {
    alignSelf: 'center',
  },
  alignContentCenter: {
    alignContent: 'center',
  },
  textDecorationLine: {
    textDecorationLine: 'line-through',
  },
  textAlignVerticalTop: {
    textAlignVertical: 'top',
  },
  wrap: {
    flexWrap: 'wrap',
  },
  overflowHidden: {
    overflow: 'hidden',
  },
  positionAbsolute: {
    position: 'absolute',
  },
  top: {
    top: 0,
  },
  right: {
    right: 0,
  },
  bottom: {
    bottom: 0,
  },
  left: {
    left: 0,
  },
  zIndex: {
    zIndex: 2,
  },
  zIndex100: {
    zIndex: 100,
  },
  borderNone: {
    borderWidth: 0,
    borderColor: 'transparent',
  },
  borderPrimary: {
    borderWidth: 1,
    borderColor: colors.text,
  },
  w33: {
    width: '33.33%',
  },
  op90: {
    opacity: 0.9,
  },
  roundRadius: {
    borderRadius: borderRadius * 2,
  },
};

export {
  colors,
  family,
  themes,
  padding,
  margin,
  sizing,
  sizingRelative,
  column,
  flex,
  shadow,
  noShadowStyle,
  borderRadius,
  borderRadiusStyle,
  borderWidth,
  border,
  colorStyle,
  fontSize,
};
