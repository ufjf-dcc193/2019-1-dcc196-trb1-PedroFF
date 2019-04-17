<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<h2>Cadastrar Sede</h2>

<form action="sede-cadastrar.html" method="post">
    <div class="form-group">
        <label>Nome Fantasia</label>
        <input required type="text" name="nomeFantasia" class="form-control" placeholder="Digite o nome fantasia">
    </div>
    <div class="row form-group">
        <div class="col-md-4">
            <label>Cidade</label>
            <input required type="text" name="cidade" class="form-control" placeholder="Digite a cidade">
        </div>
        <div class="col-md-4">
            <label>Bairro</label>
            <input required type="text" name="bairro" class="form-control" placeholder="Digite o bairro">
        </div>
        <div class="col-md-4">
            <label>Estado</label>
            <input required type="text" name="estado" class="form-control" placeholder="Digite o estado">
        </div>
    </div>
    <div class="row form-group">
        <div class="col-md-6">
        <label>Site</label>
        <input required type="text" name="site" class="form-control" placeholder="Digite o site">
        </div>
        <div class="col-md-6">
            <label>Telefone</label>
            <input type="tel" name="telefone"
                   pattern="[0-9]({2})[0-9]{4}-[0-9]{4}"
                   class="form-control"
                   placeholder="(DDD) 1234-5678"
                   required>
        </div>
    </div>


    <button type="submit" class="btn btn-success">Cadastrar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/sedes.html" class="btn btn-danger">Cancelar</a>
</form>

<%@include file="jspf/rodape.jspf" %>
