<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<form action="/atividade-cadastrar.html" method="post">
    <div class="form-group">
        <label>Atividade</label>
        <input required type="text" name="atividade" class="form-control" placeholder="Digite a atividade">
    </div>
    <div class="form-group">
        <label>descrição</label>
        <textarea required name="descricao" cols="30" rows="5" class="form-control" placeholder="Digite a descrição"></textarea>
    </div>
    <div class="row form-group">
        <div class="col-md-6">
            <label>Data Início</label>
            <input required type="date" name="dataIni" class="form-control" placeholder="Escolha sua data de início">
        </div>
        <div class="col-md-6">
            <label>Data Fim</label>
            <input type="date" name="dataFim" class="form-control" placeholder="Se existir, escolha sua data de fim">
        </div>
    </div>

    <div class="row form-group">
        <div class="col-md-3">
            <label>Horas Assistencias</label>
            <input required type="number" min="0">
        </div>
        <div class="col-md-3">
            <label>Horas Jurídicas</label>
            <input required type="number" min="0">
        </div>
        <div class="col-md-3">
            <label>Horas Financeiras</label>
            <input required type="number" min="0">
        </div>
        <div class="col-md-3">
            <label>Horas Executivas</label>
            <input required type="number" min="0">
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