# Conversor de Moedas
### Desafio 02 - Curso One-Alura
Programa desenvolvido durante o curso One da plataforma Alura, utilizando uma API de conversão de moedas.<br>

<br>

## Funcionalidades
O programa consiste no usuário escolher um tipo de moeda que a API oferece, sendo bastante diversificada as opções.<br>
O usuário poderá escolher as seguintes opções no console do programa:
- Escolher uma moeda e seu valor;
- Terá a opção de digitar quantas moedas quer que a conversão retorne;
- Poderá escolher as moedas retornadas;
- Caso não queira escolher nenhuma moeda, há uma opção para que o programa retorne 6 moedas fixas;

<strong>Nota:</strong> Caso o usuário digite uma moeda que está na opção das moedas fixas, ela será contada como uma das 6 moedas.

<br>

## 📚 Tecnologias utilizadas

<div>
  <table>
    <tr>
      <th>
        Linguagem
      </th>
      <td>
        <img alt="Static Badge" src="https://img.shields.io/badge/java-yellow?style=for-the-badge">
      </td>
    </tr>
    <tr>
      <th>
         Biblioteca
      </th>
       <td>
         <img alt="Static Badge" src="https://img.shields.io/badge/gson-grey?style=for-the-badge">
      </td>
    </tr>
    <tr>
      <th>
        IDE
      </th>
      <td>
        <img alt="Static Badge" src="https://img.shields.io/badge/intelij-black?style=for-the-badge">
      </td>
    </tr>
  </table>
</div>

<br>

## Classes

<div>
  <table>
    <tr>
      <th>
        Classe
      </th>
      <th width="450px">
        Funcionalidade
      </th>
    </tr>
    <tr>
      <th>
        MoedaJson
      </th>
      <td>
        Uma classe record que é a entrada da requisição e devolve um map do conversion_rates, que seria a conversão de moedas com a key do json e o valor da moeda
      </td>
    </tr>
    <tr>
      <th>
        ConsultaMoeda
      </th>
      <td>
        Classe que utiliza a MoedaJson para requisição dos dados. Aqui ela faz a requisição da API e já é responsável por tratar e converter o Json para Gson (objeto).
      </td>
    </tr>
    <tr>
      <th>
        Moeda
      </th>
      <td>
        Classe objeto com construtores e getters e setters simples, para ser utilizado como uma lista de objeto.
      </td>
    </tr>
    <tr>
      
    </tr>
  </table>
</div>

https://www.exchangerate-api.com/docs/supported-currencies
