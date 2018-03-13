

window.addEventListener("load", function () 
{
	var DownButton = document.getElementById("downloadbutton");
	var ConfirmButton = document.getElementById("confirm_button");
	var CloseButton = document.getElementById("close_button");
	
	DownButton.onclick = function() {
      
		modal.style.display = "block";
    };
    
    // 엑셀로 다운받도록하기
    ConfirmButton.onclick = function(){
    	var data_type = 'data:application/vnd.ms-excel;charset=utf-8';
        var table_html = encodeURIComponent(document.getElementById(id).outerHTML);
      
        var a = document.createElement('a');
        a.href = data_type + ',%EF%BB%BF' + table_html;
        a.download = id+'_excel'+'.xls';
        a.click();
    }
    
    // 창 닫기
    CloseButton.onclick = function() {
    	modal.style.display = "none";
    };
});