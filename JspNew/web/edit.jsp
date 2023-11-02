<jsp:useBean class="model.Student"  id="s" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="s" property="*" />

<% 
int result=StudentDao.editStudent(s);

if(result>0){
    response.sendRedirect("showAllStudent.jsp");
    
    }
    else{
    
    response.sendRedirect("error.jsp");
    
    }


%>