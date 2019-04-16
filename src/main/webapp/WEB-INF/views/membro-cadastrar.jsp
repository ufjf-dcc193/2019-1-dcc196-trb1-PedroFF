<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>


<h2>Cadastrar Membro</h2>
<form action="membro-cadastrar.html" method="post">
    <div class="form-group">
        <label>Nome Completo</label>
        <input required type="text" name="nome" class="form-control" placeholder="Digite seu nome">
    </div>
    <div class="form-group">
        <label>Função</label>
        <input required type="text" name="funcao" class="form-control" placeholder="Digite seu email">
    </div>
    <div class="form-group">
        <label>Email</label>
        <input required type="email" name="email" class="form-control" placeholder="Digite seu email">
    </div>
    <div class="row form-group">
        <div class="col-md-6">
            <label>Data Entrada</label>
            <input type="date" name="dataEntrada" class="form-control" placeholder="Escolha sua data de entrada">
        </div>
        <div class="col-md-6">
            <label>Data Saída</label>
            <input type="date" name="dataSaida" class="form-control" placeholder="Se existir, escolha sua data de saída">
        </div>
    </div>
    <div class="form-group">
        <label>Sede</label>
        <select name="sede" class="form-control" required>
            <option selected value="">Selecione</option>
            <c:forEach var="sede" items="${sedes}">
                <option value="${sede.sedeId}">${sede.nomeFantasia}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-success">Cadastrar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/membros.html" class="btn btn-danger">Cancelar</a>
</form>

<%@include file="jspf/rodape.jspf" %>