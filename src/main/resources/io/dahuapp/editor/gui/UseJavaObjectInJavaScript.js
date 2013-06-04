/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

var i = 1;

UsingJava = function () {
    document.getElementById("test").textContent = "button is pressed !"+ " " + i + " times";
    i++;
    var obj = new io.dahuapp.editor.gui.PrintHello();
    obj.print() ;
    alert(obj.getString()) ;
};


