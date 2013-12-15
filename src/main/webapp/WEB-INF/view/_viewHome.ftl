<#include "/spring.ftl" />
<#include "util/Macro.ftl" />
<@doctype />

<html>
	<head>
        <@charset />
		<title>Welcome</title>
	</head> 
	<body>

    <@hello person="User Name"/>

    ${model.message}

	</body>
</html>
