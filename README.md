# Conversor de Moedas em Java 💱

Projeto desenvolvido como desafio do programa **Oracle Next Education + Alura**.

## 📋 Funcionalidades

- Conversão de moedas em tempo real via API
- Consumo da ExchangeRate API
- Interface interativa via console
- Menu com 8 opções de conversão
- Validação de entradas do usuário
- Exibição formatada do resultado

## 🛠️ Tecnologias utilizadas

- Java 17
- Gson 2.10.1
- HttpClient (nativo do Java 11+)
- [ExchangeRate API](https://www.exchangerate-api.com/)

## 🌍 Moedas suportadas

| Código | Moeda             |
|--------|-------------------|
| BRL    | Real Brasileiro   |
| USD    | Dólar Americano   |
| ARS    | Peso Argentino    |
| CLP    | Peso Chileno      |
| BOB    | Boliviano         |
| COP    | Peso Colombiano   |

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/mlylemos/conversor-moedas-java.git
   ```
2. Abra o projeto na sua IDE (IntelliJ IDEA recomendado)
3. Adicione a biblioteca **Gson 2.10.1** ao classpath do projeto
4. Insira sua chave da API no arquivo `ApiExchange.java` (campo `API_KEY`)
5. Execute o arquivo `Main.java`

## 📦 Estrutura do projeto

```
src/
└── conversordemoedas/
    ├── Main.java           → Ponto de entrada
    ├── Menu.java           → Interface com o usuário
    ├── ConversorMoeda.java → Lógica de conversão
    └── ApiExchange.java    → Comunicação com a API
```

## 👩‍💻 Autora

**Emily Lemos**  
Desenvolvido com 💙 durante o programa Oracle Next Education + Alura
