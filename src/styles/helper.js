const getStyle = ({ settings, properties }) => {
  const { limit, multiplier, unit, isValueName = false } = settings
  if (!settings && !properties) {
    return
  }

  return properties.reduce((obj, { name, property }) => {
    for (var i = 0; i < limit; i++) {
      const idx = i + 1
      const value = idx * multiplier
      const key = `${name}-${isValueName ? value : idx}`

      obj[key] = property.reduce((subObj, prop) => {
        subObj[prop] = unit ? `${value}${unit}` : value
        return subObj
      }, {})
    }
    return obj
  }, {})
}

const getBgStyles = (colors, themes) => {
  return themes.reduce((obj, key) => {
    obj[`bg-${key}`] = {
      backgroundColor: colors[key] || colors.primary
    }
    return obj
  }, {})
}

const styleHandler = (style, str = '') => {
  const list = str.split(' ') || []
  return list.reduce((obj, key) => {
    key = key.trim()

    if (key !== '') {
      obj = {
        ...obj,
        ...(style[key] || {})
      }
    }

    return obj
  }, {})
}

export { getStyle, getBgStyles, styleHandler }
