<%@include file="jspf/cabecalho.jspf" %>

<c:choose>
    <c:when test="${empty sedes}">
        <div class="text-center">
            <h2 class="text-danger">Não existem sedes cadastradas!</h2>
        </div>
    </c:when>
    <c:otherwise>
        <table class="table-striped">
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
            <tr>
                <td>{$sede.getNomeFantasia()}</td>
                <td>{$sede.getEstado()}</td>
                <td>{$sede.getCidade()}</td>
                <td>{$sede.getBairro}</td>
                <td>{$sede.getTelefone}</td>
                <td>{$sede.getSite()}</td>
                <td colspan="2">
                    <a href="">Excluir</a>
                    <a href="">Editar</a>
                </td>
            </tr>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>
<%@include file="jspf/rodape.jspf" %>