<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<form action="/atividade-editar.html" method="post">
    <div class="form-group">
        <label>Atividade</label>
        <input required type="text" name="titulo" class="form-control" value="${atividade.titulo}">
    </div>
    <div class="form-group">
        <label>descrição</label>
        <textarea required name="descricao" cols="30" rows="5" class="form-control">${atividade.descricao}</textarea>
    </div>
    <div class="row form-group">
        <div class="col-md-6">
            <label>Data Início</label>
            <input required type="date" name="dataIni" class="form-control" value="${atividade.dataIni}">
        </div>
        <div class="col-md-6">
            <label>Data Fim</label>
            <input type="date" name="dataFim" class="form-control" value="${atividade.dataFim}">
        </div>
    </div>

    <div class="row form-group">
        <div class="col-md-3">
            <label>Horas Assistenciais</label>
            <input required name="totalHorasAssistencial" type="number" class="form-control" value="${atividade.totalHorasAssistencial}" min="0">
        </div>
        <div class="col-md-3">
            <label>Horas Jurídicas</label>
            <input required name="totalHorasJuridica" type="number" class="form-control" min="0" value="${atividade.totalHorasJuridica}">
        </div>
        <div class="col-md-3">
            <label>Horas Financeiras</label>
            <input required name="totalHoraFinanceira" type="number" class="form-control" min="0" value="${atividade.totalHorasFinanceira}">
        </div>
        <div class="col-md-3">
            <label>Horas Executivas</label>
            <input required name="totalHorasExecutiva" type="number" class="form-control" min="0" value="${atividade.totalHorasExecutiva}">
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
    <input type="hidden" value="${atividade.id}">
    <button type="submit" class="btn btn-success">Salvar</button>
    <button type="reset" class="btn btn-secondary">Limpar</button>
    <a href="/atividades.html" class="btn btn-danger">Cancelar</a>
</form>


<%@include file="jspf/rodape.jspf" %>