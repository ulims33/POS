<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ��Ȳ</title>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
		<link href= "../../CSS/style.css"  type="text/css" rel="stylesheet" />
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
		<link href= "../../CSS/cal.css"  type="text/css" rel="stylesheet" />

		<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
		<script  src="../../js/Revenue.js"></script>	
</head>
<body>
	<header id="header">
			<div class="top">
				<img src="../images/vpos_icon.png"  />
			
				<a href ="#" >
				<div class="topNav">
					<img src="../images/main_close.png" />
				</div> </a>
				
				<a href ="#" >
				<div class="topNav">
					<img src="../images/main_minimize.png"  />
				</div></a>
				
				<a href ="Select.html" >
				<div class="topNav">
					<img src="../images/main_back.png"  />
				</div></a>
				
				<a href ="#" >
				<div class="topNav">
					<h5>Admin</h5> 
				</div> </a>
			</div>
			
		</header>
		

		
		<main id="main">
		
			<div class="visual">
			</div>
			
			<button id="downloadbutton">
					<img src="../images/down.png"  />   �ٿ�ε� 
				</button>
			
			
			<!-- ���â -->
			<div id="modal">
			    <h3> �ٿ�ε�  </h3>
			    <p> �ٿ� ���� �����Ͱ� �����ϴ�. </p>
			    <button id="confirm_button">Ȯ��</button>
			    <button id="close_button">���</button>
			</div>
			
			<div class="payment">			
				<a href="Revenue2_day.html"><button class="btn btn1">�� </button></a>
				<a href="Revenue2_month.html"><button class="btn btn7">��</button></a>
				<a href="Revenue2_year.html"><button class="btn btn2">��</button></a>
				</div>
				
				<!-- �޷�  -->
				<div class="container">
					<div class="bx--form-item" style="width:400px;">
							<div data-date-picker data-date-picker-type="range" class="bx--date-picker bx--date-picker--range" style="width: 300px;">
								<div class="bx--date-picker-container">
									
									<input type="text" id="date-picker-1" class="bx--date-picker__input" pattern="\d{1,2}/\d{1,2}/\d{4}" placeholder="mm/dd/yyyy"
										data-date-picker-input-from />
									<div class="bx--form-requirement">
										Invalid date format.
									</div>
								</div>
								<div class="bx--date-picker-container">
									
									<input type="text" id="date-picker-2" class="bx--date-picker__input" pattern="\d{1,2}/\d{1,2}/\d{4}" placeholder="mm/dd/yyyy"
										data-date-picker-input-to />
									<div class="bx--form-requirement">
										Invalid date format.
									</div>
								</div>
								<svg data-date-picker-icon class="bx--date-picker__icon" width="17" height="19" viewBox="0 0 17 19">
									<path d="M12 0h2v2.7h-2zM3 0h2v2.7H3z" />
									<path d="M0 2v17h17V2H0zm15 15H2V7h13v10z" />
									<path d="M9.9 15H8.6v-3.9H7.1v-.9c.9 0 1.7-.3 1.8-1.2h1v6z" />
								</svg>
							</div>
						</div>
					</div>
					  <script src='https://unpkg.com/carbon-components@latest/scripts/carbon-components.js'></script>	
			

		</main>

	<footer>		
		<div class="footer">
		<img src="../images/vpos_icon.png"  />
			<div class="inf">
				<h5>
				ȸ������
				�ּ�: ����Ư���� ������ �����źϷ� 21, 2�� D��(������, ǳ������) / �����ڸ���: admin33@vpos.com 
				����� ��Ϲ�ȣ: 816-14-000286  / ��� �Ǹž� �Ű���: 2018-���ﰭ��-0989 ȣ  
				<p>
				��ȣ: VPOS / ��ǥ: ���Ű�   / ��ȭ��ȣ: 070-7676-4784 
				Copyright ��vpos.com 2018-2020 All Right Reserved. Contact admin@vpos.com for more information
				</h5>
			</div>
		</div>
	</footer>
</body>
</html>