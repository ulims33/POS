<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ����</title>
		<link href= "../../../CSS/style.css"  type="text/css" rel="stylesheet" />
</head>
<body>
	<header id="header">
			<div class="top">
				<img src="../images/vpos_icon.png"  />
				
				<a href ="#" >
					<div class="topNav">
						<img src="../../../images/main_close.png"  />
					</div>
				</a>   
				
				<a href ="#" >
					<div class="topNav">
						<img src="../../../images/main_minimize.png"  />
					</div>
				</a>
				
				<a href ="menu.html" >
					<div class="topNav">
						<img src="../../../images/main_back.png"  />
					</div>
				</a>
				
				<a href ="../../../Login/login.html" >
					<div class="topNav">
						<h5>Admin</h5> 
					</div>
				</a>
			</div>
		</header>
		
		<main>
			<div class="visual">
			</div>
		  
		    <div class="alter">
		    <img src="../../../images/main_information.png">
		                �� �� �� ��
		    </div>
			<div class="contact">
				<form id="form1" method="post" enctype="multipart/form-data">
					<div class="profile">
						<input id="photo-file-button" type="file" name="file" class="hidden"/>
						<img id="photo" src="../images/puppy.jpg"  />
						<input class="btn-text btn-default" type="button" id="photo-button" value="�̹�������" />
					</div>
				</form>
				
		     	<form id="form">
			      <legend>  Cafe �� �� </legend>
			      <fieldset>
			        <label aria-hidden="true"></label>
			        <input type="text" placeholder="��й�ȣ" id="pw"/>
			      </fieldset>
			      
			      <fieldset>
			        <label aria-hidden="true"></label>
			        <input type="text" placeholder="�� ��й�ȣ" id="new-pw"/>
			      </fieldset>
			      
			      <fieldset>
			        <label aria-hidden="true"></label>
			        <textarea placeholder="�� ��й�ȣ Ȯ��" id="check-pw"></textarea>
			      </fieldset>
			      
	
			        <a href ="menu.html" >
			        	<button type="button" id="btn-submit">Ȯ ��</button>
			        </a>
			    </form>
		    </div>
		</main>
		
		<script>
		window.addEventListener("load",function()
		{
			 var photoButton = document.querySelector("#photo-button");
	         var photoFileButton = document.querySelector("#photo-file-button");
	         var photo = document.querySelector("#photo");	         

	         photoButton.onclick = function(e)
	         {
	                var evt = new MouseEvent("click",
	                {
	                    view: window,
	                    bubbles: true,
	                    cancelable: true
	                });
	                
	                photoFileButton.dispatchEvent(evt);
	          };
	            
	            photoFileButton.onchange= function(e)
	            {
	                var file = photoFileButton.files[0];

	                var info = "name:" +file.name;
	                info += "size:" +file.size;
	                info += "type:" +file.type;

	                /*���� �ٽ� �ѹ� �� Ȯ���ϱ�
	                var typeParts = file.files.split("/");
	                
	                if(typeParts[0] != "image")
	                    alert("�����Ǵ� �̹��� ������ ������ �ƴմϴ�.");
	                */
	                
	                var reader = new FileReader();
	                reader.onload = function(evt)
	                {
	                    photo.src = evt.target.result;
	                };

	                reader.readAsDataURL(file);
	            };
		});		
		</script>
	
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
					</p>
				</h5>
			</div>
		</div>
	</footer>
</body>
</html>