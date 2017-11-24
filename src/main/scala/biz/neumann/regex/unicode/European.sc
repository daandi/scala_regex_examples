val text = "Demokratie (von altgriechisch δημοκρατία, deutsch ‚Herrschaft des Staatsvolkes‘; von δῆμος dēmos „Staatsvolk“ und altgriechisch κρατός kratós „Gewalt“, „Macht“, „Herrschaft“) bezeichnet Herrschaftsformen, politische Ordnungen oder politische Systeme, in denen Macht und Regierung vom Volk ausgehen."

//We want to extract words : https://regex101.com/

`[A-Za-z]` only Ascii
`\w` mostly the same with correct anchor works not in (js,go and Java)
`\p{L}` a letter
`\p{InGreek}` a letter or `\p{Greek}` negation `\P`
`p{InHebrew}`
https://www.regular-expressions.info/unicode.html