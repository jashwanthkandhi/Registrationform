document.getElementById("form").onsubmit=function(e){

    e.preventDefault();

    let phone=document.getElementById("phone").value;

    if(phone.length !=10 || isNaN(phone)){
        alert("enter valid registration number")
        return
    }

    alert("registration succesful")

};