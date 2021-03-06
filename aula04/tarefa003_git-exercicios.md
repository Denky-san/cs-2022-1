### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.

1. Qual o comando para obter a versão instalada do Git?

- git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?

a. git help

- Exibe informações de ajuda sobre o Git

b. git help checkout

- Abre o seguinte url file:///C:/Program%20Files/Git/mingw64/share/doc/git-doc/git-checkout.html

c. git help merge

- Abre o seguinte url file:///C:/Program%20Files/Git/mingw64/share/doc/git-doc/git-merge.html

d. git init

- Cria um novo repositório do Git

e. git add --all

- Adiciona todos os arquivos ou alterações ao repositório desde a raiz passando por todos os subdiretórios

f. git add -u

- Adiciona os arquivos modificados ao repositório

g. git config -l

- Obtem e define o repositório ou as opções globais

h. git mv a.txt b.txt

- Mover ou renomear um arquivo, um diretório ou um link simbólico

i. git reset --hard

- Reseta e apaga todas as alterações sem commit

j. git log -27

- Visualiza historico de commits

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

- git add --all e git commit -m '<commit_message>'

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?

- git log -p

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?

- git status -u

6. Qual o comando para efetuar um _commit_?

- git commit

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?

- git clean

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

- Crie um arquivo chamado .gitignore - se ele não existir.
  Adicione o diretório ao arquivo .gitignore
  Se você executar o git status, o diretório não deverá mais aparecer.

9. O que acontece se o seu repositório local for acidentalmente removido?

- Você irá perder os arquivos e tera de fazer um git reset para recupera-los

10. Como clonar um repositório remoto?

- git clone _linkDoRepositorio_

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?

- git log --oneline

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?

- .gitconfig localizado no diretório $HOME

13. Qual o comando para criar um repositório local?

- git init

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?

- Será o nome da pasta em questão

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)

- git add -u

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

- SHA-1 é uma função de dispersão criptográfica (ou função hash criptográfica) projetada pela Agência de Segurança Nacional dos Estados Unidos e é um Padrão Federal de Processamento de Informação dos Estados Unidos publicado pelo Instituto Nacional de Padrões e Tecnologia (NIST).

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?

- Head

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?

- Sim

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
    **git reset --soft HEAD~1**
    **git reset --hard**

- Eliminar o ultimo commit, e limpar as alterações para o ultimo commit (Head do repo)

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?

- git ignore --""

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?

- .Ignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?

- adicionando o "padrão" de arquivos no arquivo .ignore como "\*.Extensão"

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
    **git shortlog -sne**?

- Mostra o ID o nome e email dos ultimos commits, ex: 1714 John Resig <jeresig@gmail.com>

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?

- Exibe as urls de conexões remotas com o repositório

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?

- git tag

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?

- git tag -l "padrão"

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?

- Adiciona tag e descrição ao projeto

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?

- Mostra a tag e descrição adicionados

30. O que o comando **git push origin 3.4-gold** teria como efeito?

- Envia o branch atual para um branch correspondente com o mesmo nome.

31. Após executar um commit, qual o efeito de **git commit --amend**?

- Abre uma nova tela com varios comentarios para poder editar a mensagem

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?

- Voce remove o arquivo da branch

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?

- Descarta as alterações no diretório de trabalho

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?

- No git reset HEAD a.txt se um arquivo diferente entre <commit> e HEAD tiver alterações locais, a redefinição será interrompida.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
