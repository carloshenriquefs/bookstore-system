# 📖 - Desafio - Sistema de Livraria

- Sistema básico para gerenciar o empréstimo de livros em uma biblioteca;
- Focado na listagem de livros disponíveis e na funcionalidade de empréstimo.

## ⚙️ - Funcionalidades do Sistema:

<strong>Gerenciamento de Livros:</strong>

- <strong> Adicionar um novo livro: </strong> incluindo título e autor.
- <strong> Listar todos os livros disponíveis: </strong> mostrar apenas os livros que estão disponíveis para empréstimo.
- <strong> Realizar empréstimo de um livro: </strong> permitir que um usuário escolha um livro disponível e registre o empréstimo.

## 🗒️- Regras de Negócio:

<strong>Gerencimento de Livros: </strong>

- Apenas livros marcados como disponíveis podem ser emprestados.
- O usuário deverá pode informar seu nome ao fazer empréstimo do livro.

<strong>Empréstimo de Livros: </strong>

- Ao realizar um empréstimo, o livro escolhido deve ser marcado como indisponível e durante esta execução do programa NÃO poderá fazer o emprestimo do mesmo livro novamente.

## 📂 - Estrutura do Projeto:

O projeto é dividido nas seguintes classes principais:

- Livro: Representa os livros na biblioteca, com atributos como `id`, `titulo`, `autor`, `disponivel`, `dataCadastro` e `dataAtualizacao`.
- Autor: Representa os autores dos livros, com atributos como `id`, `nome`, e `dataNascimento`.
- Emprestimo: Gerencia os empréstimos de livros, com informações sobre o livro emprestado e datas de empréstimo e devolução.
- Biblioteca: Gerencia a coleção de livros, autores e empréstimos.
