let produtos = [];

function mostrarMenu(opcao) {
    const formContainer = document.getElementById('formContainer');
    formContainer.innerHTML = ''; // Limpa o conteúdo anterior
    if (opcao === 1) {
        realizarVenda(formContainer);
    } else if (opcao === 2) {
        cadastrarProduto(formContainer);
    } else {
        alert("Escolha uma opção válida!");
    }
}

function realizarVenda(container) {
    container.innerHTML = `
        <h3>Realizar Venda</h3>
        <label>Código do Produto:</label>
        <input type="text" id="codigoVenda">
        <label>Quantidade:</label>
        <input type="number" id="quantidadeVenda">
        <label>Valor do Produto:</label>
        <input type="number" id="valorVenda" step="0.01">
        <button onclick="calcularTotal()">Calcular Total</button>
    `;
}

function calcularTotal() {
    const codigo = document.getElementById('codigoVenda').value;
    const quantidade = parseInt(document.getElementById('quantidadeVenda').value);
    const valor = parseFloat(document.getElementById('valorVenda').value);
    const total = quantidade * valor;

    document.getElementById('resultado').innerText = `Total da venda: R$ ${total.toFixed(2)}`;
}

function cadastrarProduto(container) {
    container.innerHTML = `
        <h3>Cadastrar Produto</h3>
        <label>Código do Produto:</label>
        <input type="text" id="codigoProduto">
        <label>Descrição do Produto:</label>
        <input type="text" id="descricaoProduto">
        <label>Valor do Produto:</label>
        <input type="number" id="valorProduto" step="0.01">
        <button onclick="salvarProduto()">Salvar Produto</button>
    `;
}

function salvarProduto() {
    const codigo = document.getElementById('codigoProduto').value;
    const descricao = document.getElementById('descricaoProduto').value;
    const valor = parseFloat(document.getElementById('valorProduto').value);

    produtos.push({ codigo, descricao, valor });
    alert("Produto cadastrado com sucesso!");
}

function sair() {
    alert("Terminado");
    window.close(); // Fecha a aba, mas pode não funcionar em todos os navegadores
}
