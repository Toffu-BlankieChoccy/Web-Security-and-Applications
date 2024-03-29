function decrypt() {
  var text = document.getElementById("cipherText").value;
  var key = document.getElementById("key").value;
  var output = "";

  for (var i = 0; i < text.length; i++) {
    var ascii = text.charCodeAt(i);

    if (ascii >= 65 && ascii <= 90) {
      output += String.fromCharCode(((ascii - 65 - key + 26) % 26) + 65);
    } else if (ascii >= 97 && ascii <= 122) {
      output += String.fromCharCode(((ascii - 97 - key + 26) % 26) + 97);
    } else {
      output += text.charAt(i);
    }
  }

  document.getElementById("output").innerHTML = output;
}
