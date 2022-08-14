
function check(){
    // store div id in seprate id
   area= document.getElementById("mydiv")
   //normal give a document in some case document have seprate name give th name
   box =area.getElementsByTagName("input")
   //give seperate name of paragraph
   box2 = document.getElementsByTagName("p")
    // add box2 value box paragraph value in
    //    box2[0].innerHTML=box[0].value
    //    box2[1].innerHTML=box[1].value

for(i=0;i<box.length;i++){
    box2[i].innerHTML=box[i].value
    // box2[i].style.color="red"
    box2[i].className="myclass1"
    
   // console.log(i)

}

}
