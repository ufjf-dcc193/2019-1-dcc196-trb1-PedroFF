<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<h2>Alterar Sede</h2>

<form action="sede-editar.html" method="post">
    <div class="form-group">
        <label>Nome Fantasia</label>
        <input required type="text" name="nomeFantasia" class="form-control" value="${sede.nomeFantasia}">
    </div>
    <div class=" row form-group">
        <div class="colm-md-4">
            <label>Cidade</label>
            <input required type="text" name="cidade" class="form-control" value="${sede.cidade}">
        </div>
        <div class="colm-md-4">
            <label>Bairro</label>
            <input required type="text" name="bairro" class="form-control" value="${sede.bairro}">
        </div>
        <div class="colm-md-4">
            <label>Estado</label>
            <input required type="text" name="estado" class="form-control" value="${sede.estado}">
        </div>
    </div>
    <div class="form-group">
        <label>Site</label>
        <input required type="text" name="site" class="form-control" value="${sede.site}">
    </div>


    <button type="submit" class="btn btn-success">Cadastrar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/sedes.html" class="btn btn-danger">Cancelar</a>
</form>

<%@page pageEncoding="UTF-8" %>
