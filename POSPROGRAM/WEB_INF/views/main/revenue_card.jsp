<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ��Ȳ_ī��</title>
		<link href= "../../CSS/style.css"  type="text/css" rel="stylesheet" />
		<script src="../../js/Revenue.js"></script>
</head>
<body>
	
		<header id="header">
			<div class="top">
				<img src="../images/vpos_icon.png"  />
			
				<a href ="#" >
				<div class="topNav">
					<img src="../images/main_close.png"  />
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
			    <p> �����͸� �ٿ�ε� �Ͻðڽ��ϱ�? </p>
			    <button id="confirm_button" value="excel" onclick="saveExcel('card_table','CARD')"> Ȯ�� </button> 
			    <button id="close_button">���</button>
			</div>
			
			<div class="payment">
				<a href="Revenue_card.html"><button class="btn btn3">ī �� </button></a>
				<a href="Revenue_cash.html"><button class="btn btn4">�� ��</button></a>
			</div>
	<section>
			  <div class="tbl-header">
    <table id="card_table" cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          <th> ǰ �� </th>
          <th> �� �� </th>
          <th> �� �� �� �� </th>
          <th> �� �� �� �� </th>
          <th> �� �� �� �� </th>
          <th> �� �� �� �� </th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table id="myTable" cellpadding="0" cellspacing="0" border="0">
      <tbody>
        <tr>
          <td>�Ƹ޸�ī��</td>
          <td>1</td>
          <td>1500</td>
          <td>500</td>
          <td>1000</td>
          <td>2018-01-30 18:48</td>
        </tr>
        <tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      </tbody>
    </table>
  </div>
  </section>
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