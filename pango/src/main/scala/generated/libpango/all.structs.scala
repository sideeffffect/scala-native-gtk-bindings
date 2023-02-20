package libpango
package all

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

export _root_.libpango.structs.PangoAnalysis
export _root_.libpango.structs.PangoAttrClass
export _root_.libpango.structs.PangoAttrColor
export _root_.libpango.structs.PangoAttrFloat
export _root_.libpango.structs.PangoAttrFontDesc
export _root_.libpango.structs.PangoAttrFontFeatures
export _root_.libpango.structs.PangoAttrInt
export _root_.libpango.structs.PangoAttrIterator
export _root_.libpango.structs.PangoAttrLanguage
export _root_.libpango.structs.PangoAttrList
export _root_.libpango.structs.PangoAttrShape
export _root_.libpango.structs.PangoAttrSize
export _root_.libpango.structs.PangoAttrString
export _root_.libpango.structs.PangoAttribute
export _root_.libpango.structs.PangoColor
export _root_.libpango.structs.PangoContext
export _root_.libpango.structs.PangoContextClass
export _root_.libpango.structs.PangoCoverage
export _root_.libpango.structs.PangoEngine
export _root_.libpango.structs.PangoEngineClass
export _root_.libpango.structs.PangoEngineInfo
export _root_.libpango.structs.PangoEngineLang
export _root_.libpango.structs.PangoEngineLangClass
export _root_.libpango.structs.PangoEngineScriptInfo
export _root_.libpango.structs.PangoEngineShape
export _root_.libpango.structs.PangoEngineShapeClass
export _root_.libpango.structs.PangoFont
export _root_.libpango.structs.PangoFontClass
export _root_.libpango.structs.PangoFontDescription
export _root_.libpango.structs.PangoFontFace
export _root_.libpango.structs.PangoFontFaceClass
export _root_.libpango.structs.PangoFontFamily
export _root_.libpango.structs.PangoFontFamilyClass
export _root_.libpango.structs.PangoFontMap
export _root_.libpango.structs.PangoFontMapClass
export _root_.libpango.structs.PangoFontMetrics
export _root_.libpango.structs.PangoFontset
export _root_.libpango.structs.PangoFontsetClass
export _root_.libpango.structs.PangoFontsetSimple
export _root_.libpango.structs.PangoFontsetSimpleClass
export _root_.libpango.structs.PangoGlyphGeometry
export _root_.libpango.structs.PangoGlyphInfo
export _root_.libpango.structs.PangoGlyphItem
export _root_.libpango.structs.PangoGlyphItemIter
export _root_.libpango.structs.PangoGlyphString
export _root_.libpango.structs.PangoGlyphVisAttr
export _root_.libpango.structs.PangoItem
export _root_.libpango.structs.PangoLanguage
export _root_.libpango.structs.PangoLayout
export _root_.libpango.structs.PangoLayoutClass
export _root_.libpango.structs.PangoLayoutIter
export _root_.libpango.structs.PangoLayoutLine
export _root_.libpango.structs.PangoLogAttr
export _root_.libpango.structs.PangoMatrix
export _root_.libpango.structs.PangoRectangle
export _root_.libpango.structs.PangoRenderer
export _root_.libpango.structs.PangoRendererClass
export _root_.libpango.structs.PangoRendererPrivate
export _root_.libpango.structs.PangoScriptIter
export _root_.libpango.structs.PangoTabArray
export _root_.libpango.structs._PangoAnalysis
export _root_.libpango.structs._PangoAttrClass
export _root_.libpango.structs._PangoAttrColor
export _root_.libpango.structs._PangoAttrFloat
export _root_.libpango.structs._PangoAttrFontDesc
export _root_.libpango.structs._PangoAttrFontFeatures
export _root_.libpango.structs._PangoAttrInt
export _root_.libpango.structs._PangoAttrIterator
export _root_.libpango.structs._PangoAttrLanguage
export _root_.libpango.structs._PangoAttrList
export _root_.libpango.structs._PangoAttrShape
export _root_.libpango.structs._PangoAttrSize
export _root_.libpango.structs._PangoAttrString
export _root_.libpango.structs._PangoAttribute
export _root_.libpango.structs._PangoColor
export _root_.libpango.structs._PangoContext
export _root_.libpango.structs._PangoContextClass
export _root_.libpango.structs._PangoCoverage
export _root_.libpango.structs._PangoEngine
export _root_.libpango.structs._PangoEngineClass
export _root_.libpango.structs._PangoEngineInfo
export _root_.libpango.structs._PangoEngineLang
export _root_.libpango.structs._PangoEngineLangClass
export _root_.libpango.structs._PangoEngineScriptInfo
export _root_.libpango.structs._PangoEngineShape
export _root_.libpango.structs._PangoEngineShapeClass
export _root_.libpango.structs._PangoFont
export _root_.libpango.structs._PangoFontClass
export _root_.libpango.structs._PangoFontDescription
export _root_.libpango.structs._PangoFontFace
export _root_.libpango.structs._PangoFontFaceClass
export _root_.libpango.structs._PangoFontFamily
export _root_.libpango.structs._PangoFontFamilyClass
export _root_.libpango.structs._PangoFontMap
export _root_.libpango.structs._PangoFontMapClass
export _root_.libpango.structs._PangoFontMetrics
export _root_.libpango.structs._PangoFontset
export _root_.libpango.structs._PangoFontsetClass
export _root_.libpango.structs._PangoFontsetSimple
export _root_.libpango.structs._PangoFontsetSimpleClass
export _root_.libpango.structs._PangoGlyphGeometry
export _root_.libpango.structs._PangoGlyphInfo
export _root_.libpango.structs._PangoGlyphItem
export _root_.libpango.structs._PangoGlyphItemIter
export _root_.libpango.structs._PangoGlyphString
export _root_.libpango.structs._PangoGlyphVisAttr
export _root_.libpango.structs._PangoItem
export _root_.libpango.structs._PangoLanguage
export _root_.libpango.structs._PangoLayout
export _root_.libpango.structs._PangoLayoutClass
export _root_.libpango.structs._PangoLayoutIter
export _root_.libpango.structs._PangoLayoutLine
export _root_.libpango.structs._PangoLogAttr
export _root_.libpango.structs._PangoMatrix
export _root_.libpango.structs._PangoRectangle
export _root_.libpango.structs._PangoRenderer
export _root_.libpango.structs._PangoRendererClass
export _root_.libpango.structs._PangoRendererPrivate
export _root_.libpango.structs._PangoScriptIter
export _root_.libpango.structs._PangoTabArray
