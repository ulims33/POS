window.addEventListener("load", function () 
{
	var SelectButton = document.getElementById("select1");
	var ConfirmButton = document.getElementById("confirm_button");
	var CloseButton = document.getElementById("close_button");
	
	SelectButton.onclick = function() {
      
		modal1.style.display = "block";
    };
    
    // 엑셀로 다운받도록하기
    ConfirmButton.onclick = function(){
    	
    }
    
    // 창 닫기
    CloseButton.onclick = function() {
    	modal.style.display = "none";
    };
});