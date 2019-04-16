<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<h2>Editar Membro</h2>
<form action="/membro-editar.html" method="post">
    <div class="form-group">
        <label>Nome Completo</label>
        <input required type="text" name="nome" class="form-control" value="${membro.nome}">
    </div>
    <div class="form-group">
        <label>Função</label>
        <input required type="text" name="funcao" class="form-control" value="${membro.funcao}">
    </div>

    <div class="form-group">
        <label>Email</label>
        <input required type="email" name="email" class="form-control" value="${membro.email}">
    </div>
    <div class="row form-group">
        <div class="col-md-6">
            <label>Data Entrada</label>
            <input type="date" name="dataEntrada" class="form-control" value="${membro.dataEntrada}">
        </div>
        <div class="col-md-6">
            <label>Data Saída</label>
            <input type="date" name="dataSaida" class="form-control" value="${membro.dataSaida}">
        </div>
    </div>
    <div class="form-group">
        <label>Sede</label>
        <select name="sede" class="form-control" required>
            <c:forEach var="sede" items="${sedes}">
                <c:if test="${sede.nomeFantasia eq membro.sede.nomeFantasia}">
                    <option selected value="${sede.sedeId}">${sede.nomeFantasia}</option>
                </c:if>
                <c:if test="${sede.nomeFantasia ne membro.sede.nomeFantasia}">
                    <option value="${sede.sedeId}">${sede.nomeFantasia}</option>
                </c:if>
            </c:forEach>
        </select>
    </div>
    <input type="hidden" name="id" value="${membro.id}">
    <button type="submit" class="btn btn-success">Salvar</button>
    <a href="/membros.html" class="btn btn-danger">Cancelar</a>
</form>

<%@include file="jspf/rodape.jspf" %>