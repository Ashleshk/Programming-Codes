<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Email from SVAM service</title>
</head>

<body>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td align="center" valign="top" bgcolor="#838383"
				style="background-color: #05082e;"><br> <br>
				<table width="600" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="center" valign="top" bgcolor="#d3be6c"
							style="background-color: #c9e6cf; font-family: Arial, Helvetica, sans-serif; font-size: 13px; color: #000000; padding: 0px 15px 10px 15px;">
							
							<div style="font-size: 36px; color:rgb(17, 6, 70);">
								<b>Your claim has been ${claimStatus}!</b>
							</div>
							
							<div style="font-size: 24px; color: #555100;">
								<br> Hi ${Name}, <br>
								Your claim has been ${claimStatus}!
								<br>
								<br>
								Details regarding the claim
								<br><br>
							</div>
							<div>
								<table style="width:100%">
									<tr>
									  <th>Claim ID:</th>
									  <td>${claimId}</td>
									</tr>
									<tr>
										<th>Amount received:</th>
										<td>${amount}</td>
									</tr>
									<tr>
										<th>Claim date:</th>
										<td>${claimDate}</td>
									</tr>
									<tr>
										<th>Policy ID:</th>
										<td>${policyId}</td>
									</tr>
									<tr>
										<th>Plan Type:</th>
										<td>${planType}</td>
									</tr>
								  </table>
							</div>
						</td>
					</tr>
				</table> <br> <br></td>
		</tr>
	</table>
</body>
</html>
