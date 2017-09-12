<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>

<g:form action="index">
    <div>
        <label>Bind Me</label>
        <g:textField name="bindMe" value="${cmd?.bindMe}"/>
    </div>

    <div>
        <g:actionSubmit class="btn btn-primary action" action="index" value="Go"/>
    </div>
</g:form>

</body>
</html>