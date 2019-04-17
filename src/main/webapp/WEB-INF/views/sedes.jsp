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
        <h3>Listar Sedes</h3>
    </div>
    <div class="col-md-6 right">
        <a href="sede-cadastrar.html" class="btn btn-primary">Criar Sede</a>
    </div>
</div>
<br/>
<c:choose>
    <c:when test="${empty sedes}">
        <div class="text-center">
            <h2 class="text-danger">Não existem sedes cadastradas!</h2>
        </div>
    </c:when>
    <c:otherwise>

        <table class="table table-striped">
            <thead>
            <th>Sede</th>
            <th>Estado</th>
            <th>Cidade</th>
            <th>Bairro</th>
            <th>Telefone</th>
            <th>Site</th>
            <th>Ações</th>
            </thead>
            <tbody>
            <c:forEach  var="sede" items="${sedes}">
            <tr>
                <td>${sede.getNomeFantasia()}</td>
                <td>${sede.getEstado()}</td>
                <td>${sede.getCidade()}</td>
                <td>${sede.getBairro()}</td>
                <td>${sede.getTelefone()}</td>
                <td><a>${sede.getSite()}</a></td>
                <td colspan="2">
                    <a class="btn btn-primary" href="sede-editar/${membro.id}.html">Editar</a>
                    <a class="btn btn-danger" href="sede-deletar/${membro.id}.html">Excluir</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>
<%@include file="jspf/rodape.jspf" %>