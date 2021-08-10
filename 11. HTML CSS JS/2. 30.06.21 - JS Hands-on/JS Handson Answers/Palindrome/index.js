function palindrome() {
	const text = document.getElementById('input').value;

	const arr = text.split('');
	const revarr = arr.reverse();
	const revText = revarr.join('');

	let ans = '';

	if (text === revText)
		ans = "\""+ text + "\" is a Palindrome <br />";
	else
		ans = "\""+ text + "\" is not a palindrome <br />";

	document.getElementById('ans').innerHTML += ans;

}