/**
 * 
 */

function update(sno,name,city){
	console.log(sno,name,city)
	document.forms[0].sno.value=sno;
	document.forms[0].name.value=name;
	document.forms[0].city.value=city;
}

function deletedata(sno){
	location.href="simpleform.do?id="+sno+"&method=delete";
}