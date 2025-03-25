# Análise de Sentimentos em Textos com Azure Language Studio
**Projeto de Processamento de Linguagem Natural (PLN)**

Este projeto teve como objetivo analisar sentimentos e extrair palavras-chave de um conjunto de frases usando IA do Azure Language Studio. A ideia era simular um caso real de análise de feedback de clientes para identificar padrões emocionais e termos relevantes.

# Método Utilizado
**1. Dados de Entrada**
Criei um arquivo textos.txt na pasta inputs com as seguintes frases (simulando avaliações de clientes):

"Adorei o produto, a qualidade é excelente!"  
"O atendimento foi péssimo e demorou muito."  
"A entrega chegou antes do prazo, muito satisfeito."  
"Não recomendo, o produto veio com defeito."  
"O suporte resolveu meu problema rapidamente."  

**2. Ferramenta de Análise**</br>
Utilizei o Azure Language Studio para:</br>
**Análise de Sentimentos:** Classificar cada frase como positiva, neutra ou negativa.</br>
**Extração de Palavras-Chave:** Identificar termos mais relevantes em cada texto.

# Resultados Obtidos
**Análise de Sentimentos**</br>
Frase	Sentimento	Pontuação (0 a 1)</br>
"Adorei o produto, a qualidade é excelente!"	Positivo	0.92</br>
"O atendimento foi péssimo e demorou muito."	Negativo	-0.85</br>
"A entrega chegou antes do prazo, muito satisfeito."	Positivo	0.88</br>
"Não recomendo, o produto veio com defeito."	Negativo	-0.78</br>
"O suporte resolveu meu problema rapidamente."	Positivo	0.81</br>

# Insights:

80% das frases foram classificadas corretamente (4/5).

A IA atribuiu pontuações altas para sentimentos extremos (ex: "péssimo" → -0.85).

**Palavras-Chave Extraídas**
"produto", "qualidade", "excelente"

"atendimento", "péssimo", "demorou"

"entrega", "prazo", "satisfeito"

"defeito", "recomendo"

"suporte", "problema", "rapidamente"
