<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


   <form action="insert" method="post">
   <table>
   <tr>
   <td>Emp Name</td>
   <td><input type="text" name="name"/></td>
   </tr>
   <tr>
    <td>Emp Email</td>
   <td><input type="email" name="email"/></td>
   </tr>
   
   <tr>
    <td>Emp Gender</td>
   <td><input type="radio" name="gender" value="Male">Male</td>
   <td><input type="radio" name="gender" value="FeMale">Fe-Male</td>
    </tr>
    
    <tr>
    <td>Emp Dept</td>
   <td>
    <select name="dept">
  <option value="">Select</option> 
   <option value="development">Development</option>
    <option value="testing">Testing</option>
     <option value="database">Database</option>
      <option value="operation">Operation</option>   
    </select>
   </td>
    </tr>
    
    <tr>
    <td>Emp Exp</td>
   <td>
    <select name="dept">
  <option value="">Select</option> 
   <option value="1">1</option>
    <option value="2">2</option>
     <option value="3">3</option>
      <option value="4">4</option>   
    </select>
   </td>
    </tr>
    
    <tr>
    <td></td>
    <td><input type="submit" value="Save"/></td>
    </tr>
    
    
   </table>
    </form>
    
    <a href="emp.jsp">View Employees</a>

</body>
</html>