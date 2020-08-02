<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: inaje
  Date: 25/06/2020
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <style type="text/css">
 table {
 /*  border-collapse: separate;
  border-spacing: 86px 0; */
  table-layout:fixed;
   width: 90%;
  /* word-wrap:break-word; */
}

td {
  padding: 3px 43px;
} 
td{
text-decoration:underline;
}
 
    </style>
</head>
<body>
<!-- <form method="POST" action="./requestPage">
    Page Number	: 	 <input type="text" name="pageNumber" />
    <input type="submit"value="Load Data" />
</form> -->

<!-- <h1>Display Page HTML5 Table</h1> -->

<c:set value="${printedList}" var="printedPageList" />
<c:set value="${headerList}" var="headerPageList" />
<c:set value="${coresponseList}" var="coresponsePageList" />
<c:set value="${historyList}" var="historyPageList" />
<c:set value="${dataTag}" var="headerTag" />
<c:set value="${requestDto}" var="requestDto" />
<c:set value="${userDto}" var="userDto" />
<c:set value="${letterDto}" var="letterDto" />

<table>



<c:forEach items="${headerPageList}" begin="0" end="0" var="headervar" varStatus="status">

<table>
<tr>
<th>USER</th>
<td>${userDto.name}</td>
<th colspan="1"></th>
<th colspan="1"></th>
<th colspan="1"></th>
<th colspan="1"></th>
</table>

<table>
<tr>
<th colspan="1"></th>
<th colspan="1"></th>
<th>CASE HISTORY TRANSCRIPT</th>
<td>${headervar.today_date}</td>
<th colspan="1"></th>
<th colspan="1"></th>
</table>

<table>
<tr>
<th>DATE</th>
<td>${headervar.today_date}</td>
<th>YEAR</th>
<td>${requestDto.process_year}</td>
<th>PAGE NUMBER</th>
<td>1</td>
</tr>
</table>

<table>
<tr>
<th>ID</th>
        <td>${requestDto.SSN}</td>
        <th>CASE LOCATION</th>
        <td>${headervar.group_num_type}${headervar.group_seq_num}${headervar.seq_num}</td>
        <th>CURRENT BATCH</th>
        <td>${headervar.group_num_type}${headervar.group_seq_num}</td>
</table>

<%-- row 4 --%>
<table>
<tr>
<th>NAME CTRL</th>
        <td>${headervar.abbreviation}</td>
        <th>CATEGORY</th>
        <td>${headervar.category1}</td>
        <th>BATCH LOCATION</th>
        <td>${headervar.loc_number}</td>
</tr>

</table>

<%-- row 5 --%>
<table>
<tr>
<th >DISTRICT OFF</th>
        <td>${headervar.district_cd}</td>
        <th>SUB CATEGORY</th>
        <td>${headervar.category2}</td>
        <th>CURRENT STATUS</th>
        <td>${headervar.group_status_cd}</td>
        </tr>
</table> 

<%-- row 6 --%>
<table>
<tr>
        <th colspan="1"></th>
        <th colspan="1"></th>
        <th>SUB FILE</th>
        <td>${headervar.key}</td>
        <th>STATUS DATE</th>
        <td>${headervar.group_status_date}</td>
        </tr>
</table>

<table>
<tr>
<th colspan="1"></th>
<th >SUB FILE2</th>
<td>${headervar.sub_file2}</td>
        </tr>
</table>  

<%-- row 7 --%>
<table>
<tr>
<th colspan="1"></th>
<th colspan="1"></th>
<th colspan="1"></th>
<th colspan="1"></th>
<th >PREVIOUS CSN</th>
<td>${headervar.old_group_num_type}${headervar.old_group_seq_num}${headervar.old_wk_unit}</td>
        </tr>
</table>  

<%-- row 8 --%>
<table>
<tr>
         <th colspan="1"></th>
        <th colspan="1"></th>
        <th>USER</th>
        <td>${headervar.user_id_num}</td>
        <th>PREVIOUS USER</th>
        <td>${headervar.old_u_num}</td>
    </tr>

    

    
</table>  

<%-- row 9 --%>
<table>
<tr>
        <th colspan="1"></th>
        <th colspan="1"></th>
        <th>REQUESTER</th>
        <td>${headervar.req_u_num}</td>
        <th>PREVIOUS BATCH</th>
        <td>${headervar.old_group_num_type}${headervar.old_group_seq_num}</td>
    </tr>
</table>  

<%-- row 10 --%>
<table>
<tr>
        <th colspan="1"></th>
        <th colspan="1"></th>
        <th colspan="1"></th>
        <th colspan="1"></th>
        <th>PREVIOUS LOCATION</th>
        <td>${headervar.old_loc_num}</td>
    <tr>
</table>       
</c:forEach>






<%--  <c:forEach items="${headerPageList}" var="headervar" varStatus="status"> --%>









<%-- <c:if test="${printedPageList.page+1 == 1 && headerTag == 1}"> --%>
<c:if test="${headerTag == 1}">
<div style="margin-right: 137px; margin-top: -21px; text-decoration:underline;">${headervar.prss_code}${headervar.prss_code_emp}${headervar.prss_code_dt}</div>
</c:if>
<%--  </c:forEach> --%>


</table>

<%-- <c:if test="${printedPageList.page < historyPageList.pageCount}"> --%>

<table>
<tr>
<th>HISTORY INFO</th>
<th>CORRESPONDENCE INFO</th>
</tr>
</table>

<table>

<tr>
<th>PROCESS CODE</th>
<th>UID NUMBER</th>
<th>PROCESS DATE</th>
<th>DUE DATE</th>
<th>CORRESPONSE DATE</th>
<th>CORRESPONSE TYPE</th>
<th>UNDEL IND</th>

</tr>

<c:if test="${historyPageList.size() >= coresponsePageList.size()}">
 <c:forEach items="${historyPageList}" var="historyvar" varStatus="status"> 
<tr>  
<td>${historyvar.process_code}</td>
<td>${historyvar.uid_number}</td>
<td>${historyvar.process_date}</td>
<td>${historyvar.deadline__date}</td>
<td>${coresponsePageList[status.index].coresponse_date}</td>
<td>${coresponsePageList[status.index].coresponse_type}</td>
<td>${coresponsePageList[status.index].undel_ind}</td>
<c:if test="${coresponsePageList[status.index].a_HREF_indicator == 1}">
 
 <td><a href="http://www.myweb.com/myweb1?${letterDto.print_name_prg}${letterDto.process_year_component}+ID+
 ${coresponsePageList[status.index].coresponse_date}+${coresponsePageList[status.index].recipient}+
 ${requestDto.location_id}+${letterDto.process_year}${coresponsePageList[status.index].recipient}${letterDto.letter_name}">Call Program</a></td>
  
  </c:if>
 </tr>


  </c:forEach>  
  </c:if>  
 </table>
  
  <c:if test="${coresponsePageList.size() >= historyPageList.size()}">
 <c:forEach items="${coresponsePageList}" var="coresponsevar" varStatus="status"> 
<tr>  
<td>${historyPageList[status.index].process_code}</td>
<td>${historyPageList[status.index].uid_number}</td>
<td>${historyPageList[status.index].process_date}</td>
<td>${historyPageList[status.index].deadline__date}</td>

<td>${coresponsevar.coresponse_date}</td>
<td>${coresponsePageList[status.index].coresponse_type}</td>
<td>${coresponsevar.undel_ind}</td>

<c:if test="${coresponsevar.a_HREF_indicator == 1}">
 
 <td><a href="http://www.myweb.com/myweb1?${letterDto.print_name_prg}${letterDto.process_year_component}+ID+
 ${coresponsePageList.coresponse_date}+${coresponsePageList.recipient}+
 ${requestDto.location_id}+${letterDto.process_year}${coresponsePageList.recipient}${letterDto.letter_name}">Call Program</a></td>
  
  </c:if>
 </tr>
  </c:forEach>  
  </c:if> 
  
<%--  </c:if>  --%>
 
<%--  <c:if test="${printedPageList.page >= historyPageList.pageCount}">
 <div style="margin-top: 100px;"></div>
 </c:if> --%>
 
<%-- <c:if test="${printedPageList.page < coresponsePageList.pageCount}"> --%>
  
 

<%-- <div>

<div style="float: right; margin-top: -231px; margin-right: 262px;">CORRESPONDENCE INFO</div>
<div style="float: right;margin-top: -203px; margin-right: 410px;">DATE</div>
<div style="float: right;margin-top: -203px; margin-right: 264px;">UNDEL IND</div>
</div>


 <c:forEach items="${coresponsePageList.pageList}" var="coresponsevar" > 
<div>  
<div style="margin-left: 900px; margin-top: -30px;  text-decoration:underline;">${coresponsevar.coresponse_date}</div>
<div style="margin-left: 1002px; margin-top: -20px; text-decoration:underline;">${coresponsevar.undel_ind}</div>

 
  
 </div>
  </c:forEach> --%>
  
<%--   </c:if> --%>
  
            
<%--     <c:forEach items="${headerPageList.pageList}" var="headervar" varStatus="status">
    <thead>
    <tr>
        <th rowspan="1" colspan="1">USER</th>
        <th rowspan="1" colspan="8">${headervar.user_id_num}</th>
		
    </tr>
    <tr>
        <th rowspan="1" colspan="3">CASE HISTORY TRANSCRIPT</th>
        <th rowspan="1" colspan="3">${headervar.text1}</th>
    </tr>
    <tr>
        <th rowspan="1" colspan="1">DATE</th>
        <th rowspan="1" colspan="1">${headervar.today_date}</th>
        <th rowspan="1" colspan="2">YEAR</th>
        <th rowspan="1" colspan="2">${headervar.year}</th>
        <th rowspan="1" colspan="2">PAGE NUMBER</th>
        <th rowspan="1" colspan="1">${headervar.user_id_num}</th>
    </tr>
    <tr>
        <th rowspan="1" colspan="1">SSN</th>
        <th rowspan="1" colspan="1">${headervar.ssn}${headervar.prim_digit}</th>
        <th rowspan="1" colspan="2">CASE LOCATION</th>
        <th rowspan="1" colspan="2">HARD_CODE for now</th>
        <th rowspan="1" colspan="2">CURRENT BATCH</th>
        <th rowspan="1" colspan="1">${headervar.group_num_type}${headervar.group_seq_num}</th>
    </tr>

    <tr>
        <th rowspan="1" colspan="1">NAME CTRL</th>
        <th rowspan="1" colspan="1">${headervar.abbreviation}</th>
        <th rowspan="1" colspan="2">CATEGORY</th>
        <th rowspan="1" colspan="2">${headervar.category1}</th>
        <th rowspan="1" colspan="2">BATCH LOCATION</th>
        <th rowspan="1" colspan="1">${headervar.loc_number}</th>
    </tr>

    <tr>
        <th rowspan="1" colspan="1">DISTRICT OFF</th>
        <th rowspan="1" colspan="1">${headervar.district_cd}</th>
        <th rowspan="1" colspan="2">SUB CATEGORY</th>
        <th rowspan="1" colspan="2">${headervar.category2}</th>
        <th rowspan="1" colspan="2">CURRENT STATUS</th>
        <th rowspan="1" colspan="1">${headervar.group_status_cd}</th>
    </tr>

    <tr>
        <th rowspan="1" colspan="3"></th>
        <th rowspan="1" colspan="1">SUB FILE</th>
        <th rowspan="1" colspan="2">${headervar.key}</th>
        <th rowspan="1" colspan="1">STATUS DATE</th>
        <th rowspan="1" colspan="2">${headervar.group_status_date}</th>
    </tr>

    <tr>
        <th rowspan="1" colspan="6"></th>
        <th rowspan="1" colspan="1">PREVIOUS CSN</th>
        <th rowspan="1" colspan="2">HARD Code previous CSN</th>
    <tr>

    <tr>
        <th rowspan="1" colspan="3"></th>
        <th rowspan="1" colspan="1">USER UID</th>
        <th rowspan="1" colspan="2">${headervar.user_id_num}</th>
        <th rowspan="1" colspan="1">PREVIOUS USER</th>
        <th rowspan="1" colspan="2">${headervar.old_u_num}</th>
    </tr>

    <tr>
        <th rowspan="1" colspan="3"></th>
        <th rowspan="1" colspan="1">REQUESTER</th>
        <th rowspan="1" colspan="2">${headervar.req_u_num}</th>
        <th rowspan="1" colspan="1">PREVIOUS BATCH</th>
        <th rowspan="1" colspan="2">${headervar.old_group_num_type}${headervar.old_group_seq_num}</th>
    </tr>

    <tr>
        <th rowspan="1" colspan="6"></th>
        <th rowspan="1" colspan="1">PREVIOUS LOCATION</th>
        <th rowspan="1" colspan="2">${headervar.old_loc_num}</th>
    <tr>
    </thead>


    <thead>

    <tr>
        <th rowspan="1" colspan="1"></th>
        <th rowspan="1" colspan="4">DISPLAY CODE</th>
        <th rowspan="1" colspan="4">DISPLAY LETTER/CALL INFORMATION</th>
    </tr>

     
    <tr>
        <th rowspan="1" colspan="1">CODE</th>
        <th rowspan="1" colspan="1">USER ID</th>
        <th rowspan="1" colspan="2">INPUT DATE</th>
        <th rowspan="1" colspan="2">DEADLINE DATE</th>
        <th rowspan="1" colspan="2">"DATE"</th>
        <th rowspan="1" colspan="1">"ACTION"</th>
        <th rowspan="1" colspan="1">"RESPONDSE INDICATOR"</th>
    </tr>

    </thead>

    <tbody>
    <tr>
        <td rowspan="1" colspan="1">${history[status.index].process_code}</td>
        <td rowspan="1" colspan="1">${history[status.index].uid_number}</td>
        <td rowspan="1" colspan="2">${history[status.index].process_cd_date}</td>
        <td rowspan="1" colspan="2">${history[status.index].deadline__date}</td>
        <td rowspan="1" colspan="2">${Coresponses[status.index].coresponse_date}</td>
        <td rowspan="1" colspan="1">${Coresponses[status.index].coresponse_type}</td>
        <td rowspan="1" colspan="1">${history[status.index].year}</td>
    </tr>
    </tbody>
    </c:forEach>
</table> --%>

<%-- <div style="margin-top: 154px; margin-left: 23px;">
<c:choose>
    Show Prev as link if not on first page
    <c:when test="${printedPageList.firstPage}">
      <span>Prev</span>
    </c:when>
    <c:otherwise>
        <c:url value="/request/prev" var="url" />                  
        <a href='<c:out value="${url}" />'>Prev</a>
    </c:otherwise>
</c:choose>
<c:forEach begin="${printedPageList.page+1}" end="${printedPageList.page+6 < printedPageList.pageCount ? printedPageList.page+6 : printedPageList.pageCount}" step="1"  varStatus="tagStatus">
    <c:choose>
        In PagedListHolder page count starts from 0
        <c:when test="${(printedPageList.page + 1) == tagStatus.index}">
            <span>${tagStatus.index}</span>
        </c:when>
        <c:otherwise>
            <c:url value="/request/${tagStatus.index}" var="url" />                  
            <a href='<c:out value="${url}" />'>${tagStatus.index}</a>
        </c:otherwise>
    </c:choose>
</c:forEach>
<c:choose>
    Show Next as link if not on last page
    <c:when test="${printedPageList.lastPage}">
      <span>Next</span>
    </c:when>
    <c:otherwise>
        <c:url value="/request/next" var="url" />                  
        <a href='<c:out value="${url}" />'>Next</a>
    </c:otherwise>
</c:choose>
</div> --%>
</body>
</html>