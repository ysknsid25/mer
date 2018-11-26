/**
 * 全件検索画面のJavaScriptです。
 * カードスタイルの動きをホバーさせます。
 */

$(window).load(function() {
  $('.post-module').hover(function() {
    $(this).find('.description').stop().animate({
      height: "toggle",
      opacity: "toggle"
    }, 300);
  });
});

$(function(){
	  $('input[type="text"],input[type="password"]')
	  .focus(function(){
	$(this).prev('label').addClass("inputted");
	  })
	  .focusout(function(){
	  if($(this).val()==""){
	$(this).prev('label').
	removeClass("inputted");
	  }
	});
	});
