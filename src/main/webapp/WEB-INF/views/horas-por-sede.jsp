<%@include file="jspf/cabecalho.jspf" %>
<%@page pageEncoding="UTF-8" %>

<table class="table striped-table">
    <thead>
    <th>Sede</th>
    <th>Horas Assistenciais</th>
    <th>Horas Jurídicas</th>
    <th>Horas Financeiras</th>
    <th>Horas Executivas</th>
    </thead>
    <tbody>
    <c:forEach  var="total" items="${totais}">
        <tr>
            <td>${total.sede.nomeFantasia}</td>
            <td>${total.totalHorasAssistencial}</td>
            <td>${total.totalHorasJuridica}</td>
            <td>${total.totalHorasFinanceira}</td>
            <td>${total.totalHorasExecutiva}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@include file="jspf/rodape.jspf" %>