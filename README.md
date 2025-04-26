
<h1 align="center">Observer</h1>


<p > O <b>Observer</b> é um padrão de projeto comportamental de software, ele define uma
dependência <i>um-para-muitos</i>  entre objetos, de modo que quando
um objeto muda seu estado, todos seus dependentes são
notificados e atualizados automaticamente.</p>

#


- <p style = "font-size : 14px"><b>Design Patterns (Padrões de Projeto) </b> : são soluções testadas e aprovadas para problemas comuns no desenvolvimento de software</p>
- <p style = "font-size : 14px"><b>Padrões de Projeto Comportamentais </b>: focam na forma como as classes e objetos interagem e se comunicam, especialmente na atribuição de responsabilidades e na gestão de algoritmos</p>


# Problema

<p>Imagine que você tem dois tipos de objetos : <b>Cliente</b> e uma <b>Loja.</b>O cliente está muito interessado em uma marca particular de um produto que logo deverá estar disponível na loja.</p>
<p>O cliente pode visitar a loja todo dia para ver se o produto chegou. Porém enquanto o produto não chega todas essas visitas seriam uma perda de tempo.</p>
<p>Por outro lado a loja pode mandar vários e-mails para todos os clientes assim que um produto se torna disponível.</p>
<p>Entre as duas opções temos um <b>conflito</b>, ou o <b>cliente</b> gasta seu tempo indo verificar se o produto chegou ou a <b>loja</b> gasta recursos notificando os clientes errados </p>

# Solução implementada no código

<h3>Objetivo:</h3>
<p>Quando o produto chegar, apenas os clientes interessados são automaticamente notificados, sem haver desperdício de tempo e nem de recursos.</p>

 - <b> Interface Observer</b> : Ela foi criada para ser usada pra quem deseja ser notificado sobre os produtos pelo método update.
 - <b> Interface Subject </b> : Ela representa a estrutura abstrata da loja e define o comportamento que o observável deve ter. Ela não tem diretamente a lista dos observadores, mas qualquer classe que faça a implementação dela saiba : Adicionar e remover observadores,  notificar todos observadores cadastrados quando houver novidade e adicionar uma nova mensagem ou evento que vai ser enviado para os observadores.
 - <b> Classe Newsletter </b> : Ela representa a Loja e é responsável por implementar o comportamento definido na interface Subject.
Sua função é gerenciar a comunicação com os observadores (como clientes, fornecedores, parceiros e funcionários). Ela contém : Uma lista de observadores, métodos para adicionar e remover observadores  e Notificar todos observadores cadastrados quando houver novidade
- <b> Classes Cliente, Funcionario, Fornecedor, Parceiro </b> : Elas representam os observadores que desejam receber as notificações da loja. Elas implementam a interface **Observer** permitindo que os observadores recebam o e-mail sempre que houver uma nova mensagem da loja. 
- <b> Classe Email </b> : Ela é responsável por simular o envio de e-mails para os observadores cadastrados.
