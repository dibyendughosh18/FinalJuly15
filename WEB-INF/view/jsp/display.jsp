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

<div>

<div>

<div style="margin-top: 39px;">DATE</div>
<div style="margin-top: -41px;">USER</div>
<div style="margin-top: 27px;">NAME CTRL</div>
<div style="margin-top: 10px;">DISTRICT OFF</div>
</div>

<div>
<div style="margin-left: 511px; margin-top: -54px;">CATEGORY</div>
<div style="margin-left: 511px; margin-top: 5px;">SUB CATEGORY</div>
<div style="margin-left: 511px; margin-top: 4px;">SUB FILE</div>
</div>

<div>
<div style="margin-left:511px; margin-top: 105px;">REQUESTER</div>
</div>

<div>
<div style="float:right; margin-top: -221px; margin-right: 282px;">PAGE NUMBER</div>
<div style="float:right; margin-top: -192px; margin-right: 265px;">CURRENT BATCH</div>
<div style="float:right; margin-top: -164px; margin-right: 260px;">BATCH LOCATION</div>
<div style="float:right; margin-top: -138px; margin-right: 262px;">CURRENT STATUS</div>
<div style="float:right; margin-top: -113px; margin-right: 294px;">STATUS DATE</div>
</div>

<div>
<div style="float:right; margin-top: -70px; margin-right: 272px;">PREVIOUS USER</div>
<div style="float:right; margin-top: -45px; margin-right: 260px;">PREVIOUS BATCH</div>
<div style="float:right; margin-top: -19px; margin-right: 233px;">PREVIOUS LOCATION</div>
</div>
 <c:forEach items="${headerPageList.pageList}" var="headervar" varStatus="status">

<div>

<div style="margin-top: -203px; margin-left: 129px; text-decoration:underline;">${headervar.today_date}</div>
<div style="margin-top: -40px; margin-left: 130px; text-decoration:underline;">${headervar.user_id_num}</div>
<div style="margin-top: 25px; margin-left: 129px; text-decoration:underline;">${headervar.abbreviation}</div>
<div style="margin-top: 12px; margin-left: 127px; text-decoration:underline;">${headervar.district_cd}</div>
</div>

<div>
<div style="margin-left: 664px; margin-top: -56px; text-decoration:underline;">${headervar.category1}</div>
<div style="margin-left: 664px; margin-top: 5px; text-decoration:underline;">${headervar.category2}</div>
<div style="margin-left: 664px; margin-top: 2px; text-decoration:underline;">${headervar.key}</div>
</div>

<div>
<div style="margin-left: 664px; margin-top: 111px; text-decoration:underline;">${headervar.req_u_num}</div>
</div>

<div style="text-decoration: underline;">
<div style="float: right; margin-right: 193px; margin-top: -222px; text-decoration:underline;">${printedPageList.page+1}</div>
<div style="float:right; margin-right: 168px; margin-top: -194px; text-decoration:underline;">${headervar.group_num_type}${headervar.group_seq_num}</div>
<div style="float: right; margin-right: 180px; margin-top: -165px; text-decoration:underline;">${headervar.loc_number}</div>
<div style="float: right; margin-right: 188px; margin-top: -139px; text-decoration:underline;">${headervar.group_status_cd}</div>
<div style="float: right; margin-right: 123px; margin-top: -115px; text-decoration:underline;">${headervar.group_status_date}</div>
            
</div>

<div>  
<div style="float:right; margin-right: 124px; margin-top: -73px; text-decoration:underline;">${headervar.old_u_num}</div>
<div style="float:right; margin-right: 163px; margin-top: -47px; text-decoration:underline;">${headervar.old_loc_num}</div>
<div style="float:right; margin-right: 137px; margin-top: -21px; text-decoration:underline;">${headervar.old_group_num_type}${headervar.old_group_seq_num}</div>
                
</div>

<c:if test="${printedPageList.page+1 == 1 && headerTag == 1}">
<div style="margin-right: 137px; margin-top: -21px; text-decoration:underline;">${headervar.prss_code}${headervar.prss_code_emp}${headervar.prss_code_dt}</div>
</c:if>
 </c:forEach>


</div>

<c:if test="${printedPageList.page < historyPageList.pageCount}">

<div>
<div>

<div style="margin-top: 30px;">HISTORY INFO</div>
<div style="margin-top: 12px;">PROCESS CODE</div>
<div style="margin-top: -17px; margin-left: 130px;">UID NUMBER</div>
<div style="margin-top: -17px; margin-left: 244px;">PROCESS DATE</div>
<div style="margin-top: -17px; margin-left: 376px;">DUE DATE</div>
</div>
</div>

 <c:forEach items="${historyPageList.pageList}" var="historyvar" > 
<div>  
<div style="margin-right: 124px; margin-top: -2px; text-decoration:underline;">${historyvar.process_code}</div>
<div style="margin-left: 133px; margin-top: -14px; text-decoration:underline;">${historyvar.uid_number}</div>
<div style="margin-left: 244px; margin-top: -17px; text-decoration:underline;">${historyvar.process_date}</div>
<div style="margin-left: 375px; margin-top: -17px; text-decoration:underline;">${historyvar.deadline__date}</div>
 </div>
  </c:forEach>    
  
 </c:if> 
 
 <c:if test="${printedPageList.page >= historyPageList.pageCount}">
 <div style="margin-top: 100px;"></div>
 </c:if>
 
<c:if test="${printedPageList.page < coresponsePageList.pageCount}">
  
 

<div>

<div style="float: right; margin-top: -68px; margin-right: 262px;">CORRESPONDENCE INFO</div>
<div style="float: right;margin-top: -39px; margin-right: 410px;">DATE</div>
<div style="float: right;margin-top: -39px; margin-right: 264px;">UNDEL IND</div>
</div>


 <c:forEach items="${coresponsePageList.pageList}" var="coresponsevar" > 
<div>  
<div style="float:right; margin-right: 379px; margin-top: -17px; text-decoration:underline;">${coresponsevar.coresponse_date}</div>
<div style="float:right; margin-right: -112px; margin-top: -18px; text-decoration:underline;">${coresponsevar.undel_ind}</div>

 <c:if test="${coresponsevar.a_HREF_indicator == 1}">
 
 <a href="givenLink">Call Program</a>
  
  </c:if>
  
 </div>
  </c:forEach>
  
  </c:if>
  
            
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

<div style="margin-top: 154px; margin-left: 23px;">
<c:choose>
    <%-- Show Prev as link if not on first page --%>
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
        <%-- In PagedListHolder page count starts from 0 --%>
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
    <%-- Show Next as link if not on last page --%>
    <c:when test="${printedPageList.lastPage}">
      <span>Next</span>
    </c:when>
    <c:otherwise>
        <c:url value="/request/next" var="url" />                  
        <a href='<c:out value="${url}" />'>Next</a>
    </c:otherwise>
</c:choose>
</div>
</body>
</html>