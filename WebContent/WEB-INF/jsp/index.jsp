<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
      <head>
        <meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" href="static/bootstrap.min.css" type="text/css"/>
        <link rel="stylesheet" href="static/webui.css" type="text/css"/>
        <script src="static/sorttable.js"></script>
        <title>Xockets Appliance details</title>
      </head>
      <body>
        <div class="container-fluid">
          <div class="row-fluid">
            <div class="span12">
              <h3 style="vertical-align: middle; display: inline-block;">
                <img src="static/xockets.jpg" style="margin-right: 15px;"/>
                Acceleration at http://br12.xockets.com:7077
              </h3>
            </div>
          </div>
          <div class="row-fluid">
          <div class="span12">
            <ul class="unstyled">
              <li><strong>URL:</strong> http://br12.xockets.com:7077</li>
              <li><strong>Cores:</strong> 144 Total,
                0 Used</li>
              <li><strong>Memory:</strong>
                33.3 GB Total,
                0.0 B Used</li>
              <li><strong>Applications:</strong>
                0 Running,
                0 Completed </li>
              <li><strong>Drivers:</strong>
                0 Running,
                0 Completed </li>
              <li><strong>Status:</strong> ALIVE</li>
            </ul>
          </div>
        </div><div class="row-fluid">
          <div class="span12">
            <h4> Servers: </h4>
            <table class="table table-bordered table-striped table-condensed sortable">
      <thead><th width="">Id</th><th width="">Address</th><th width="">State</th><th width="">Cores</th><th width="">Memory</th></thead>
      <tbody>
      
      	<c:forEach items="${appliances}" var="appliance">
    		<tr>
        		<td><a href="/XIMMAppliance/TabPage.jsp"><c:out value="${appliance.applianceId}"/></a></td>
        		<td> <c:out value="${appliance.applianceAddress}"/></td>  
        		<td> <c:out value="${appliance.applianceState}"/></td>
        		<td> <c:out value="${appliance.applianceCores}"/></td>
        		<td> <c:out value="${appliance.applianceMemory}"/></td>
    		</tr>
		</c:forEach>
        
      </tbody>
    </table>
          </div>
        </div><div>
          
        </div><div>
          
        </div>
        </div>
      </body>
 </html>
