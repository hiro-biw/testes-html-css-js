const botao = document.querySelector('.toggle')
const menulateral = document.querySelector('.menuLateral')
const background = document.querySelector('.background')
const conteudo = document.querySelector('.conteudo')

botao.addEventListener  /*quando meu botão for clicado(ou aglo acontecer), ele precisa avisar, ou fazer algo*/ ('click', () =>{
    menulateral.classList.toggle('ativo')
    botao.classList.toggle('ativo')
    background.classList.toggle('ativo')
    conteudo.classList.toggle('ativo')

    document.body.style.backgroundColor = menulateral.classList.contains('ativo') ? '#34495e' : '#ecf0f1' //if e else
})

background.addEventListener('click', () =>{
    menulateral.classList.remove('ativo')
    botao.classList.remove('ativo')
    background.classList.remove('ativo')
    conteudo.classList.remove('ativo')

    document.body.style.backgroundColor = "#ecf0f1"
})