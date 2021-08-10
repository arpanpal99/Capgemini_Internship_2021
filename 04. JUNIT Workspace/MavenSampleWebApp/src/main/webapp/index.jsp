<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>My Coursera!</title>
	<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
	<header id = "top">I'll keep updating this page with whatever I learn regarding HTML, CSS & JavaScript. This will keep a decent track. Happy learning!</header>
	<h1><a href="https://github.com/arpanpal99/My-Coursera" target="_blank" title="My Github Page"><B><U>Learning HTML with Coursera</U></B></a></h1>
		<nav>Nav Tag: Contains links to different parts of the page.
			<ol>
				<li><a href="#Heading1">GIT Commands in CMD</a></li>
				<li><a href="#Heading2">Browser Sync</a></li>
				<li><a href="#Heading3">DIV and SPAN elemets</a></li>
				<li><a href="#Heading4">Semantic Tags</a></li>
				<li><a href="#Heading5">Lists</a></li>
				<li><a href="#Heading6">Character Entity Reference</a></li>
				<li><a href="#Heading7">Creating Links</a></li>
			</ol>
		</nav>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading1">1. <U>Git Commands in CMD:</U></h2>
		<ul>
			<li>git --version</li>
			<li>After installing nodeJS:
				<ul>
					<li>node --version</li> 
					<li>npm --version</li>
				</ul>
			</li>
			<li>git status</li>
			<li>mkdir site	<I>(Save the Sublime Text File onto the "site" folder everytime)</I></li>
			<li>git clone my_repository_site_link</li>
			<li>git add . 	<I>(This starts tracking the "site" folder wihtout commiting to the git server)</I></li>
			<li>git commit -m "My First Page" 	<I>(This makes the local directory commited to the git server)</I></li>
			<li>git status</li>
			<li>git push <I>(Because the changes made in local folder needs to be updated in the remote server as well)</I></li>
		</ul>
		How to update the local HTML files in the remote server?
		<ol>
			<li>git add .</li>
			<li>git commit -m "My First Page"</li>
			<li>git push</li>
		</ol>
		<p><a href="#top">Back to TOP</a></p>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading2">2. <U>Browser Sync:</U></h2>
			Here's how I'm updating the modifications I've made in Sublime Text.
			<ul>
				<li>npm install -g browser-sync</li>
				<li>browser-sync --version</li>
				<li>browser-sync start --server --directory --files "*" <I>(To start serving all the directories under "My-Coursera")</I></li>
			</ul>
			<p><a href="#top">Back to TOP</a></p>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading3">3. <U>Div and Span elements:</U></h2>
		<ul>
			<li><h3>Block Level Elements (Roughly &quot;Flow Content&quot; in HTML5)</h3></li>
				Begin on a new-line. May contain Inline elements.
			<li><h3>Inline Elements (Roughly &quot;Phrasing Content&quot; in HTML5)</h3></li>
				Render on the same line. Doesn't contain block-level elements.
			<li><h3>Application:</h3></li>
				<div>*** Div 1: Some contents go here ***</div>
				<div>*** Div 2: This comes in the next line as that of Div 1 ***</div>
				<span>*** Span 1: The Span also comes in the next line as that of Div 2. Because when Div 2 closes, it automatically transfers the upcoming text to the next line ***</span>
				<div>
					*** Div 3: This follows in the next line as that of Span 1.
					<span>*** Span 2: This comes inside Div 3 ***</span>
					This line continues after Span 2.
				</div>
		</ul>
		<p><a href="#top">Back to TOP</a></p>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading4">4. <U>Semantic Tags:</U></h2>
			
				Humans and/or Machines can understand meaning of the content surrounded by a semantic element better.
				<div>It may help in Search Engine Optimizations (SEO).</div>
				<h3> Examples: </h3>
					<div><B>a. <U>Header</U></B>: An example of a header is provided at the top of the page.</div>
					<div><B>b. <U>Footer:</U></B> An example of a footer is provided down this page.</div>
					<B>c. <U>Section Tags & Article Tags:</U></B>
					<section>
						<B>Section 1:</B>
						<article>* Article 1</article>
						<article>* Article 2</article>
					</section>
					<section>
						<B>Section 2:</B>
						<article>* Article 3</article>
						<article>* Article 4</article>
					</section>
					<aside><B>d. <U>Aside Tag:</U></B> Some information that relates to the main topic, i.e., related posts.</aside>
				<p><a href="#top">Back to TOP</a></p>
			
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading5">5. <U>Lists:</U></h2>
		<ol>
			<B><li><h3>Unordered List:</h3></li></B>
			<div>
				<B><U id = "Internal-Linking">My PC Build Components are:</U></B>
				<ul>
					<p><li><a href="https://www.amazon.in/Motherboard-Gigabit-802-11ax-heatsinks-Lighting/dp/B07SW8DQVL/ref=sr_1_1?dchild=1&keywords=x570+strix+e+gaming&qid=1596140169&sr=8-1" target="_blank" title="Buy from Amazon">ASUS AMD X570 ATX Gaming Motherboard with PCIe 4.0, 2.5 Gbps and Intel Gigabit LAN, Wi-Fi 6 (802.11ax), <br/>16 Power Stages, Dual M.2 with heatsinks, SATA 6Gb/s, USB 3.2 Gen 2 and Aura Sync RGB Lighting<p><img style="-webkit-user-select: none;margin: auto;" src="https://www.overclock3d.net/gfx/articles/2019/06/27084935372s.jpg" width="798" height="500"></p></a></li>
					<li><a href="https://www.amazon.in/Asus-GX601-Mid-Tower-Motherboards-Construction/dp/B07T28NZZ3/ref=sr_1_2?dchild=1&keywords=strix+helios&qid=1596139954&sr=8-2" target="_blank" title="Buy from Amazon">ROG Strix Helios RGB Cabinet</a></li>
					<li><a href="https://www.amazon.in/Certified-Fully-Modular-Power-Supply-LiveDash/dp/B07JZLGPCB/ref=sr_1_1?dchild=1&keywords=asus+thor&qid=1596140084&sr=8-1" target="_blank" title="Buy from Amazon">ASUS ROG THOR 850 watt PSU</a></li></p>
					<li>
						<p class = "brown"><B>Motherboard Components:</B>
						<ul>
							<li><a href="https://www.amazon.in/AMD-Ryzen-3900XT-Processor-100-100000277WOF/dp/B089WD454D/ref=sr_1_1?dchild=1&keywords=3900xt&qid=1596139807&sr=8-1" target="_blank" title="Buy from Amazon">AMD Ryzen 9 3900XT Processor</a></li>
							<li><a href="https://www.amazon.in/Asus-ROG-360-Radiator-LIVEDASH/dp/B07JHX169J" target="_blank" title="Buy from Amazon">ASUS ROG Ryujin 360mm AIO Cooler</a></li>
							<li><a href="https://www.amazon.in/GeForce-Overclocked-Type-C-Graphics-ROG-STRIX-RTX2070-A8G-GAMING/dp/B07TXRW3HX/ref=sr_1_1?dchild=1&keywords=strix+2070+super&qid=1596140518&s=computers&sr=1-1" target="_blank" title="Buy from Amazon">ASUS ROG Strix GeForce RTX 2070 Super Overclocked 8 GB GDDR6 Graphics Card</a></li>
							<li><a href="https://www.amazon.com/ASUS-ROG-Flexible-Extender-Extension/dp/B082G52H1L" target="_blank" title="Buy from Amazon">ASUS ROG Strix Riser Cable PCI-E 3.0 x16 High Speed Flexible Extender Card Extension Port, 90 Degree Adapter (240 mm)</a></li>
							<li><a href="https://www.amazon.in/Corsair-Vengeance-3200MHz-Memory-Black/dp/B07GTG2T7L/ref=sr_1_2?dchild=1&keywords=corsair+rgb+pro+32&qid=1596140625&s=computers&sr=1-2" target="_blank" title="Buy from Amazon">Corsair Vengeance RGB Pro 2x16 GB 3200 MHz DDR4 RAM</a></li>
							<li><a href="https://www.amazon.in/Corsair-Vengeance-RGB-Light-Enhancement/dp/B07L2QSY96/ref=sr_1_1?dchild=1&keywords=corsair+rgb+pro+light+enhancement&qid=1596143180&s=computers&sr=1-1" target="_blank" title="Buy from Amazon">Corsair Vengeance RGB Pro Light Enhancement Kit</a></li>
							<li><a href="https://www.amazon.in/Corsair-Vengeance-3200MHz-Memory-Black/dp/B07GTG2T7L/ref=sr_1_2?dchild=1&keywords=corsair+rgb+pro+32&qid=1596140625&s=computers&sr=1-2" target="_blank" title="Buy from Amazon">Sabrent Rocket 1 TB PCIe 4.0 M.2 NVME SSD</a></li>
							<li><a href="https://www.amazon.in/Sabrent-Internal-Maximum-Performance-SB-ROCKET-NVMe4-500/dp/B07XFGPFZK/ref=pd_sbs_147_6/260-6228553-0300361?_encoding=UTF8&pd_rd_i=B07XFGPFZK&pd_rd_r=b2db91a8-01b7-4e46-b342-4680773d7ac2&pd_rd_w=NHzFI&pd_rd_wg=A057x&pf_rd_p=00b53f5d-d1f8-4708-89df-2987ccce05ce&pf_rd_r=J2JV93Y7EJZR1JWYWEAX&psc=1&refRID=J2JV93Y7EJZR1JWYWEAX" target="_blank" title="Buy from Amazon">Sabrent Rocket 500 GB PCIe 4.0 M.2 NVME SSD</a></li>
						</ul></p>
					</li>
					<li>
						<p class = "brown"><B>Other Storage Devices:</B>
						<ul>
							<li><a href="https://www.amazon.in/Seagate-Barracuda-256MB-Desktop-Internal/dp/B071WLPRHN/ref=sr_1_2?crid=2J53FJ4OHAFF5&dchild=1&keywords=barracuda+pro&qid=1596141267&s=computers&sprefix=barracu%2Ccomputers%2C374&sr=1-2" target="_blank" title="Buy from Amazon">Barracuda 4TB 3.5 inch HDD</a></li>
							<li><a href="https://www.amazon.in/TEAMGROUP-MAX-SSD-Internal-T253TM500G3C302/dp/B07WR3R5DH" target="_blank" title="Buy from Amazon">T-force Delta MAX 500 GB RGB SSD</a></li>
						</ul></p>
					</li>
					<li>
						<p class = "brown"><B>Other PC Parts:</B>
						<ul>
							<li><a href="https://www.amazon.in/Asus-XG32VQ-Curved-Gaming-Monitor/dp/B07DWH1XFV" target="_blank" title="Buy from Amazon">Asus ROG Strix 32-inch Curved Gaming Monitor 1440p 144Hz VA</a></li>
							<li><a href="https://www.amazon.in/Gladius-Ergonomic-Optical-Gaming-Optimised/dp/B06X158PYV/ref=sr_1_1?adgrpid=58360571665&dchild=1&ext_vrnc=hi&gclid=CjwKCAjw34n5BRA9EiwA2u9k31D2TUkQ3tvrcxxXMNoXzx3lqXE9r1DpQtG6CnZBYxx-3JsYfWRPtRoC8dIQAvD_BwE&hvadid=398113467809&hvdev=c&hvlocphy=9298481&hvnetw=g&hvqmt=b&hvrand=7787920985498806975&hvtargid=kwd-296259214054&hydadcr=15883_1995156&keywords=rog+gladius+ii&qid=1596141787&sr=8-1&tag=googinhydr1-21" target="_blank" title="Buy from Amazon">Asus ROG Gladius II RGB Gaming Mouse</a></li>
							<li><a href="https://www.amazon.in/Corsair-Rapidfire-CH-9127014-NA-Mechanical-Keyboard/dp/B01N5IISXY" target="_blank" title="Buy from Amazon">CORSAIR K95 RGB Mechanical Gaming Keyboard - Cherry MX Speed</a></li>
							<li><a href="https://www.amazon.in/ROG-Playstation-Teamspeak-Quad-DAC-Microphone/dp/B07KK31T7T/ref=sr_1_3?adgrpid=58947329215&dchild=1&ext_vrnc=hi&gclid=CjwKCAjw34n5BRA9EiwA2u9k31mLTRWDZY8IPI2hjeC1wbw5xioB45o1Ub7x95PkXHn_3Xyp78TBMBoCmBkQAvD_BwE&hvadid=398113511216&hvdev=c&hvlocphy=9298481&hvnetw=g&hvqmt=b&hvrand=15987234591551379695&hvtargid=kwd-298572091836&hydadcr=15886_1995162&keywords=rog+headset&qid=1596142069&sr=8-3&tag=googinhydr1-21" target="_blank" title="Buy from Amazon">ASUS ROG Delta RGB Gaming Headset with Hi-Res ESS Quad-DAC, Circular RGB Lighting Effect</a></li>
							<li><a href="https://www.amazon.in/3in1-Customizable-addressable-Controller-Available/dp/B07D3K4XG1/ref=sr_1_2?adgrpid=59241718792&dchild=1&ext_vrnc=hi&gclid=CjwKCAjw34n5BRA9EiwA2u9k39oFsby0XoER8-k72PTnnKpQZG_vBPRtABKKE-Jf065QpzKrNvMpOhoCMNIQAvD_BwE&hvadid=398026072053&hvdev=c&hvlocphy=9298481&hvnetw=g&hvqmt=b&hvrand=15232681162710555183&hvtargid=kwd-528381467210&hydadcr=7978_1982463&keywords=deepcool+cf120&qid=1596142221&sr=8-2&tag=googinhydr1-21" target="_blank" title="Buy from Amazon">DEEPCOOL CF120 3in1, Customizable Addressable RGB LED Lighting, 120mm PWM Fans</a></li>
							<li><a href="https://www.amazon.in/ROG-Balteus-Vertical-Micro-Textured-Pass-Through/dp/B07M65DNKH" target="_blank" title="Buy from Amazon">ASUS ROG Balteus Gaming Mouse Pad with Aura Sync RGB Lighting</a></li>
							<li><a href="https://www.amazon.in/SureLock-100mm-Locking-Nylon-Cable/dp/B00TQUIUNE/ref=sr_1_9?dchild=1&keywords=cable+ties&qid=1596143361&s=electronics&sr=1-9" target="_blank" title="Buy from Amazon">Generic Self Locking Nylon Cable Zip Ties, 2.5 X 100mm (Black, 100 Piece)</a></li>
						</ul></p>
					</li>
				</ul>
			</div>
			<B><li><h3>Ordered Lists:</h3></li></B>
			<div>
				Oreo cookie eating procedure:
			    <ol>
			      <li>Open box</li>
			      <li>Take out cookie</li>
			      <li>Make a Double Oreo
			        <ol>
			          <li>Peel off the top part</li>
			          <li>Place another cookie in the middle</li>
			          <li>Put back the top part</li>
			        </ol>
			      </li>
			      <li>Enjoy!</li>
			    </ol>
			</div>
			<p><a href="#top">Back to TOP</a></p>
		</ol>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading6">6. <U>Character Entity Reference:</U> </h2>
			<ul>
				<B><li><h3>Entities application</h3></li></B>
				<ul>
					<li><B>Before:</B> 				Don't be afraid to be <then a 100% success & >more:</li></then>
					<li><B>After:</B>  				Don't be afraid to be &lt;then a 100% success &amp; &gt;more</li>
					<li><B>Less than:</B> 	 		& lt; </li>
					<li><B>Greater than:</B> 		& gt; </li>
					<li><B>Ampercent(&):</B> 		& amp;</li>
					<li><B>Non breaking space:</B> 	& nbsp;</li>
					<li><B>Quotes:</B>				& quot;</li>
				</ul>
				<p class = "brown">
				  	&quot;It is not the critic who counts; not the man who points out how the strong man stumbles, or where the doer of deeds could have done them better. The credit belongs to the man who is actually in the arena, whose face is marred by dust and sweat and blood; who strives valiantly; who errs, who comes short again and again, because there is no effort without error and shortcoming; but who does actually strive to do the deeds; who knows great enthusiasms, the great devotions; who spends himself in a worthy cause; who at the best knows in the end the triumph of high achievement, and who at the worst, if he fails, at least fails while daring greatly, so that his place shall never be with those cold and timid souls who neither know victory&nbsp;nor&nbsp;defeat.&quot;
				</p>
				<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/President_Roosevelt_-_Pach_Bros.jpg/800px-President_Roosevelt_-_Pach_Bros.jpg" width="435" height="564">
				<div>Theodore Roosevelt 1910 &copy; Copyright</div>
				<p><a href="#top">Back to TOP</a></p>
			</ul>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2 id = "Heading7">7. <U>Creating LINKS:</U></h2>
		<ol>
			<B><li><h3>Internal Links:</h3></li></B>
				We can link to a file in the same directory as this HTML file like this:
				<a href="hi.html" title="same dir link">Linking to a file in the same directory</a>
				<a href="hi.html" title="same dir link">
					<div> DIV Linking to a file in the same directory</div>
				</a>
				<p>Other internal links examples: <a href="#Internal-Linking" title = "Section in the same page" target="_blank">Ultimate Overkill Dream</a></p>
			<B><li><h3>External Links:</h3></li></B>
				<p>My Coursera page on Github.com: <a href="https://github.com/arpanpal99/My-Coursera" target="_blank" title="My Github Page"><I>arpanpal99</I></a></p>
				
				<p>Module 2 Assignment Solution: <a href="https://arpanpal99.github.io/My-Coursera/Module_2_Assignment/" target="_blank" title="Github Module 2 Assignment"><I>Assignment 2 Link</I></a></p>
			<p><a href="#top">Back to TOP</a></p>
		</ol>
		<!------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
		<h2>That's all. Thanks for visiting.</h2>
		<footer>Royalty Free Page by @AP</footer>
</body>
</html>