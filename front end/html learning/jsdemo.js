function html_content() {
    // user given input are type
    content = document.getElementById("type").value;
    // create paragraph in html using js
    para = document.createElement("p");
    // creating text node get user input
    our_data = document.createTextNode(content);
    // adding user input in paragraph
    para.appendChild(our_data);
    //creating  given id name
    mydiv = document.getElementById("div1");
    // adding paragraph and div
    mydiv.appendChild(para);
}
