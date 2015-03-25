<div id="menu">
	<nobr class= "login">
		<g:if test="${session.user}">
			<b>${session.user?.firstName}&nbsp;${session.user?.lastName}</b> |
			<g:link controller="user" action="logout">Logout</g:link>
		</g:if>
		<g:else>
			<g:link controller="user" action="login">login</g:link>
		</g:else>
	</nobr>
</div>