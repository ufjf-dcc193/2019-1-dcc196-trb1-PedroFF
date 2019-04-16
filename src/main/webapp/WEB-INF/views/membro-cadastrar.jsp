<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>


<h2>Cadastrar Membro</h2>
<form action="membro-cadastrar.html" method="post">
    <div class="form-group">
        <label>Nome Completo</label>
        <input type="text" name="nome" class="form-control" placeholder="Digite seu nome">
    </div>
    <div class="form-group">
        <label>Função</label>
        <input type="text" name="funcao" class="form-control" placeholder="Digite seu email">
    </div>
    <div class="form-group">
        <label>Email</label>
        <input type="email" name="email" class="form-control" placeholder="Digite seu email">
    </div>
    <div class="form-group">
        <label>Data Entrada</label>
        <input type="date" name="dataEntrada" class="form-control" placeholder="Escolha sua data de entrada">
    </div>
    <div class="form-group">
        <label>Data Saída</label>
        <input type="date" name="dataSaida" class="form-control" placeholder="Se existir, escolha sua data de saída">
    </div>
    <div class="form-group">
        <label>Sede</label>
        <select class="form-control">
            <option selected>Selecione</option>
            <c:forEach var="sede" items="${sedes}">
                <option value="${sede.sedeId}">${sede.nomeFantasia}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-success">Cadastrar</button>
    <a href="/membros.html" class="btn btn-danger">Cancelar</a>
</form>

<%@include file="jspf/rodape.jspf" %>