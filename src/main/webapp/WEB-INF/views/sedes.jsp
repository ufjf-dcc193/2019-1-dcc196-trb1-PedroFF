<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>
<h3>Listar Sedes</h3>
<button class="btn btn-primary">Criar Sede</button>
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
                <td colspan="4">
                    <a href="" class="btn btn-primary">Membros</a>
                    <a href="" class="btn btn-primary">Atividades</a>
                    <a href="">Excluir</a>
                    <a href="">Editar</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>
<%@include file="jspf/rodape.jspf" %>