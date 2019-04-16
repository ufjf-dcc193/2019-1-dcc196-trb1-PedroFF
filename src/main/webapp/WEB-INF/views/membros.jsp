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
        <h3>Listar Membros</h3>
    </div>
    <div class="col-md-6 right">
        <a href="membro-cadastrar.html" class="btn btn-primary">Criar Membro</a>
    </div>
</div>
<br/>
<c:choose>
    <c:when test="${empty membros}">
        <div class="text-center">
            <h2 class="text-danger">Não existem membros cadastrados!</h2>
        </div>
    </c:when>
    <c:otherwise>
        <table class="table table-striped">
            <thead>
            <th>Nome</th>
            <th>Função</th>
            <th>Email</th>
            <th>Data Entrada</th>
            <th>Data Saída</th>
            <th>Sede</th>
            <th>Ações</th>
            </thead>
            <tbody>
            <c:forEach var="membro" items="${membros}">
                <tr>
                    <td>${membro.getNome()}</td>
                    <td>${membro.getFuncao()}</td>
                    <td>${membro.getEmail()}</td>
                    <td>${membro.getDataEntrada()}</td>
                    <td>${membro.getDataSaida()}</td>
                    <td>${membro.getSede().getNomeFantasia()}</td>
                    <td colspan="4">
                        <a href="membro-editar/${membro.id}.html">Editar</a>
                        <a href="membro-deletar/${membro.id}.html">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

<%@include file="jspf/rodape.jspf" %>