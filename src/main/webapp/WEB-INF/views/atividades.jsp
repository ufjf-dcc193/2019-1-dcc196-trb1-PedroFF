<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<c:if test="${param.deletado==true}">
    <div class="alert alert-success alert-dismissible fade show col-lg-12 text-center" role="alert">
        <strong>Exclusão realizada com sucesso</strong>
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>
<c:if test="${param.alterado==true}">
    <div class="alert alert-success alert-dismissible fade show col-lg-12 text-center" role="alert">
        <strong>Alteração realizada com sucesso</strong>
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>
<c:if test="${param.cadastrado==true}">
    <div class="alert alert-success alert-dismissible fade show col-lg-12 text-center" role="alert">
        <strong>Cadastro realizado com sucesso</strong>
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>
    </div>
</c:if>
<br/>

<div class="row col-md-12">
    <div class="col-md-6">
        <h3>Listar Atividades</h3>
    </div>
    <div class="col-md-6 right">
        <a href="/atividade-cadastrar.html" class="btn btn-primary">Criar Atividade</a>
    </div>
</div>
<br/>
<c:choose>
    <c:when test="${empty atividades}">
        <div class="text-center">
            <h2 class="text-danger">Não existem atividades cadastradas!</h2>
        </div>
    </c:when>
    <c:otherwise>

        <table class="table table-striped">
            <thead>
            <th>Atividade</th>
            <th>Descrição</th>
            <th>Data Inicio</th>
            <th>Data Fim</th>
            <th>Horas Assistencial</th>
            <th>Horas Jurídica</th>
            <th>Horas Financeira</th>
            <th>Horas Executiva</th>
            <th>Ações</th>
            </thead>
            <tbody>
            <c:forEach  var="atividade" items="${atividades}">
                <tr>
                    <td>${atividade.nome}</td>
                    <td>${atividade.descricao}</td>
                    <td>${atividade.dataIni}</td>
                    <td>${atividade.dataFim}</td>
                    <td>${atividade.totalHorasAssistencial}</td>
                    <td>${atividade.totalHorasJuridica}</td>
                    <td>${atividade.totalHorasFinanceira}</td>
                    <td>${atividade.totalHorasExecutiva}</td>
                    <td colspan="2">
                        <a class="btn btn-primary" href="atividade-editar/${atividade.id}.html">Editar</a>
                        <a class="btn btn-danger" href="atividade-deletar/${atividade.id}.html">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

<%@include file="jspf/rodape.jspf" %>
