/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM.MSN;

import HTM.TestHTM1;
import Personal.HTML;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class X01 {
    String S1="<!DOCTYPE html><html prefix=\"og: http://ogp.me/ns# fb: http://ogp.me/ns/fb#\"  lang=\"zh-TW\"  style=\"font-size:62.5%\"  class=\"hiperf\"  dir=\"ltr\" >\n" +
"\n" +
"<head data-info=\"v:20190112_13811432;a:5ccff976-c56c-4a53-9087-c2a9ffe97c17;cn:18;az:{did:e676481d24d242d2bf61dbf23bf32fe6, rid: 18, sn: easia-prod-hp, dt: 2019-01-05T01:09:29.9738179Z, bt: 2019-01-13T01:13:27.2867203Z};ddpi:1;dpio:1.4;dpi:1.4;dg:tmx.pc.webkit.chrome.chrome64plus;th:start;PageName:startPage;m:zh-tw;cb:;l:zh-tw;mu:zh-tw;ud:{cid:,vk:homepage,n:,l:zh-tw,ck:};xd:BBqiJv5;ovc:f;al:;fxd:f;xdpub:2019-01-04 08:50:58Z;xdmap:2019-01-19 15:40:18Z;axd:;f:muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf;userOptOut:false;userOptOutOptions:\"  data-js=\"{&quot;dpi&quot;:1.4,&quot;ddpi&quot;:1.0,&quot;dpio&quot;:1.4,&quot;forcedpi&quot;:null,&quot;dms&quot;:6000,&quot;ps&quot;:1000,&quot;bds&quot;:7,&quot;dg&quot;:&quot;tmx.pc.webkit.chrome.chrome64plus&quot;,&quot;ssl&quot;:true,&quot;moduleapi&quot;:&quot;https://www.msn.com/zh-tw/homepage/api/modules/fetch&quot;,&quot;cdnmoduleapi&quot;:&quot;https://static-global-s-msn-com.akamaized.net/zh-tw/homepage/api/modules/cdnfetch&quot;,&quot;pdpdeltaupdateapi&quot;:&quot;https://www.msn.com/zh-tw/homepage/api/pdp/updatepdpdata&quot;,&quot;xd&quot;:&quot;bbqijv5&quot;,&quot;signedin&quot;:0,&quot;sso&quot;:&quot;https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;checkda=1&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=lbi&amp;wreply=https%3a%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fsecure%2fsilentpassport%3fsecure%3dtrue&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&quot;,&quot;exchangeenabled&quot;:true,&quot;twitterimpenabled&quot;:true,&quot;greenidcallenabled&quot;:false,&quot;ispreload&quot;:false,&quot;anonckname&quot;:&quot;&quot;,&quot;ssocomplete&quot;:false}\"  data-client-settings=\"{&quot;geo_country&quot;:&quot;tw&quot;,&quot;geo_subdivision&quot;:&quot;tainan city&quot;,&quot;geo_zip&quot;:&quot;700&quot;,&quot;geo_ip&quot;:&quot;114.39.19.0&quot;,&quot;geo_lat&quot;:&quot;22.9944&quot;,&quot;geo_long&quot;:&quot;120.199&quot;,&quot;os_region&quot;:&quot;&quot;,&quot;apps_locale&quot;:&quot;&quot;,&quot;base_url&quot;:&quot;/zh-tw/homepage/&quot;,&quot;aid&quot;:&quot;5ccff976c56c4a539087c2a9ffe97c17&quot;,&quot;sid&quot;:null,&quot;v&quot;:&quot;20190112_13811432&quot;,&quot;static_page&quot;:false,&quot;empty_gif&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif&quot;,&quot;functionalonly_cookie_experience&quot;:false,&quot;functional_cookies&quot;:&quot;&quot;,&quot;functional_cookie_patterns&quot;:&quot;&quot;,&quot;fbid&quot;:&quot;132970837947&quot;,&quot;lvk&quot;:&quot;homepage&quot;,&quot;vk&quot;:&quot;homepage&quot;,&quot;cat&quot;:null,&quot;autorefresh&quot;:true,&quot;bingssl&quot;:false,&quot;autorefreshsettings&quot;:{&quot;is_market_enabled&quot;:true,&quot;timeout&quot;:30,&quot;idle_enabled&quot;:false,&quot;idle_timeout&quot;:&quot;2&quot;},&quot;uipr&quot;:false,&quot;uiprsettings&quot;:{&quot;enabled&quot;:false,&quot;frequency_minutes&quot;:0,&quot;banner_delay_minutes&quot;:null,&quot;maxfresh_display&quot;:null,&quot;minfresh_count&quot;:&quot;5&quot;,&quot;ajaxtimeoutinseconds&quot;:&quot;60&quot;},&quot;imgsrc&quot;:{&quot;quality_high&quot;:&quot;60&quot;,&quot;quality_low&quot;:&quot;5&quot;,&quot;order_timeout&quot;:&quot;quot;1000&quot;},&quot;adsettings&quot;:{&quot;wait_for_ad_in_sec&quot;:&quot;3&quot;,&quot;retry_for_ad&quot;:&quot;2&quot;},&quot;mecontroluri&quot;:&quot;https://mem.gfx.ms/meversion/?partner=msn&amp;market=zh-tw&quot;,&quot;lazyload&quot;:{&quot;enabled&quot;:true}}\"  data-xd-id=\"BBqiJv5\"    data-delayed-js=\"//static-global-s-msn-com.akamaized.net/hp-eas/zh-tw/homepage/_sc/js/b443689a-2923b6c2/direction=ltr.locales=zh-tw.themes=start.dpi=resolution14x/41-0bee62-68ddb2ab?ver=20190112_13811432&amp;fdhead=muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf&amp;ocid=mailsignout&amp;csopd=20190117002427&amp;csopdb=20190118225755\" >\n" +
"    \n" +
"		<script>if(window&&(typeof window.performance==\"object\")){if(typeof window.performance.mark==\"function\"){window.performance.mark(\"TimeToHeadStart\");}}</script>\n" +
"\n" +
"    <meta charset=\"utf-8\" />\n" +
"    <script>window.performance&&window.performance.mark&&window.performance.mark(\"Ars-begin\")</script>\n" +
"        <script>\n" +
"                /*<![CDATA[*///Copyright Instart Logic Wed Dec 19 2018 - All rights reserved - version: 10.5.8\n" +
"function Ea(){var t=window;if(function(){var n=!0,i=!1,e=\"\";try{var r=\"object\"==typeof t.IXC_353_1119062411120848&&t.IXC_353_1119062411120848;if(n=!r||void 0===r.CanRun||\"_353_1119062411120848\"!==r._353_1119062411120848||r.CanRun(\"abd\"))r=t.IXC_353_1119062411120848=t.IXC_353_1119062411120848||{},r.InitStartTime=(t.performance?t.performance:Date).now(),r._353_1119062411120848=\"_353_1119062411120848\",t.INSTART_TARGET_NAME=\"abd\",t.I12C=t.I12C||{};else{var o=t.INSTART_TARGET_NAME;e=\"double nanovisor injection: abd after \"+o,(i=\"abd\"!==o)&&console.warn(e)}t.INSTART=t.INSTART||{},t.INSTART.Init=function(){i&&console.error(\"ignored Init call after \"+e)}}catch(t){try{console.error(t)}catch(t){}n=!0}return n}()){!function(){function n(n,i){function e(i){return n.req.a(t.atob(i))}(e(\"bWVkaWNpbmVuZXQuY29t\")||e(\"b25oZWFsdGguY29t\")||e(\"cnhsaXN0LmNvbQ==\")||e(\"d2VibWQuY29t\"))&&n.req.b(\"firefox\")&&i({iadb:{ierelbanenoitcerid:!0}})}function i(){return(i=Object.assign||function(t){for(var n,i=1,e=arguments.length;i<e;i++){n=arguments[i];for(var r in n)Object.prototype.hasOwnProperty.call(n,r)&&(t[r]=n[r])}return t}).apply(this,arguments)}function e(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var i in n)n.hasOwnProperty(i)&&(t[i]=n[i])})(t,n)}function r(t){return t.split(\"\").filter(function(t,n){return 0==n%2}).reverse().join(\"\")}function o(t){var n=location.origin;n=n+\"/g00\"+location.pathname,n+=location.search;var i=\"\"===location.search?\"?\":\"&\";t&&(n+=i+\"i10c.ua=\"+t,i=\"&\");try{var e=btoa(document.referrer);void 0===(t=void 0)&&(t=40);for(var r=[],o=0,u=0;u<e.length;u++){var c=e.charAt(u);t<u-o||Q.test(c)?(r.push(\"%\"+(\"00\"+c.charCodeAt(0).toString(16)).slice(-2)),o=u):r.push(c)}n+=i+\"i10c.encReferrer=\"+r.join(\"\")}catch(t){}return\"\"!==location.hash&&(n+=location.hash),n}function u(t){if(navigator.userAgent){var n=void 0;try{n=t instanceof ReferenceError&&/^\\w+$/.test(t.message)}catch(t){n=!0}n&&(n=o(void 0),location.replace(n))}throw t}function c(t){return function(){try{t.apply(this,arguments)}catch(t){u(t)}}}function a(){if(void 0!==xt)return xt;var n=!0;try{if(\"l2n9s8hg5p\"!==t.atob(t.btoa(\"l2n9s8hg5p\")))throw\"l2n9s8hg5p\";n=!1}catch(t){}return xt=n}function s(t){return void 0===t&&(t=Vt),1===t.w.iytep}function h(t){return void 0===t&&(t=Vt),4===t.w.iytep}function d(t){return void 0===t&&(t=Vt),2===t.w.iytep}function l(t,n){function i(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(i.prototype=n.prototype,new i)}function f(t,n){t||(console.error(n),0<(t=[]).length&&console.log(t))}function b(){if(void 0!==Gt)return Gt;var t=!1,n=Object.getOwnPropertyDescriptor(HTMLFrameElement.prototype,\"contentWindow\");return(n=n&&n.get&&n.get.toString())&&(t=-1===n.indexOf($)),Gt=t}function m(){var t=0,n=[];for(n.push(Et+\"=\"+Date.now()+\";max-age=86400\"),n.push(Nt+\"=1;max-age=86400\"),n.push(_t+\"=\"+document.referrer+\";path=/;max-age=10\");t<n.length;t++)document.cookie=n[t];t=o(At.iytep),location.replace(t)}function v(t,n,i){var e=Object.getOwnPropertyDescriptor(t,n)||{};if(!1!==e.writable){e.writable=!1,e.value=i;try{Object.defineProperty(t,n,e)}catch(t){}}else f(e.value===i,n+\" is already defined on object with different value\");return i}function p(t,n,i){try{t[n]=i}catch(t){}return i}function y(n,i,e){n=n.split(\".\"),e=e?v:p;for(var r,o=t||{},u=0;u<n.length-1;++u){if(r=n[u],!o)return;o=e(o,r,o[r]||{})}r=n[n.length-1],o&&(f(!!r,\"In Export, name not defined\"),e(o,r,i))}function R(t,n){try{y(P+\".\"+t,n)}catch(t){}try{y(U+\".\"+t,n)}catch(t){}try{y(\"IXC_353_1119062411120848.\"+t,n)}catch(t){}}function L(){for(var t=[],n=0;n<arguments.length;n++)t[n]=arguments[n];It?t.forEach(function(t){return t(It)}):Qt=Qt.concat(t)}function g(n,i){It=n;var e=!0;try{Qt.forEach(function(t){e=t(n)&&e});var r=i&&t[i];r&&r instanceof Array&&(r.forEach(function(t){e=t(n)&&e}),r.push=L)}catch(t){e=!1}return e}function w(t,n,i,e){if(t||(t={}),n)for(var r=Object.keys(n),o=r.length-1;0<=o;--o){var u=r[o],c=t[u];c=(void 0===c?Ut:e&&e[u]||i)(c,n[u]),t[u]=c}return t}function E(t,n){return function(i,e){return null===e||\"object\"!=typeof e||e instanceof RegExp?e:Array.isArray(e)?!Array.isArray(i)&&i?(console.error(\"Error while attempting to merge an array \"+e+\" with a non-array \"+i),e):t(i,e):n(i,e)}}function N(t,n){return w(t,n,Ut)}function _(t,n){for(var i=0;i<n.length;i++)t=w(t,n[i],Ut);return t}function D(t,n){var i=n&&_({},n);return function(n,e){return w(n,e,t,i)}}function S(t,n){return w(t,n,Jt)}function Y(t,n){return w(t,n,$t)}function j(t,n){return t?n?function(){t.apply(this,arguments),n.apply(this,arguments)}:t:n}function T(t){var n=nn[t]?nn[t]:null;if(n)return F(n);if(!(n=en.exec(\"\"+t)))return{ihcseme:null,iedercslaitn:null,imodnia:null,ioptr:null,ihtapeman:t,iuqyre:null,igarftnem:null};var i=F(n={ihcseme:H(n[1]),iedercslaitn:H(n[2]),imodnia:H(n[3]),ioptr:H(n[4]),ihtapeman:H(n[5]),iuqyre:W(n[6]),igarftnem:W(n[7])}),e=Object.keys(nn);return 0!==e.length&&e.length>tn-1&&delete nn[e[e.length%tn]],nn[t]=i,n}function H(t){return\"string\"==typeof t&&0<t.length?t:null}function W(t){return\"string\"==typeof t?t:null}function F(t){return{ihcseme:t.ihcseme,iedercslaitn:t.iedercslaitn,imodnia:t.imodnia,ioptr:t.ioptr,ihtapeman:t.ihtapeman,iuqyre:t.iuqyre,igarftnem:t.igarftnem}}function Z(t){return{ihcseme:t[0],iedercslaitn:t[1],imodnia:t[2],ioptr:t[3],ihtapeman:t[4],iuqyre:t[5],igarftnem:t[6]}}function k(t,n){return null===t?t===n:t.toLowerCase()===n.toLowerCase()}function M(t,n){return null!==t&&void 0!==t&&n.test(t)}function O(t,n){for(var i=0;i<t.length;i++)if(t[i]===n)return!0;return!1}function x(t,n){if(void 0===n&&(n=ei),\"string\"!=typeof t.url){var i=t.url.itegferh()||\"\";t.url=i||t.url}else i=t.url;var e=new n.Fa;if(t.onload&&(e.onload=function(){return t.onload(new ii(e,t))}),t.onerror&&(e.onerror=function(){return t.onerror(new ii(e,t))}),e.withCredentials=!!t.credentials,t.fb&&e.overrideMimeType(t.fb),n.Ta.call(e,t.method,i,!1!==t.async),t.S)for(i=0;i<t.S.length;i++)e.setRequestHeader(t.S[i].ianem,t.S[i].Za);i=t.body&&(\"string\"==typeof t.body?t.body:JSON.stringify(t.body));var r=!1===t.async;try{n.Xa.call(e,i)}catch(n){r&&t.onerror&&t.onerror(null)}return r?new ii(e,t):null}function C(t){return t[St]||t[Ht]===at}function V(t,n,i){var e;return e={},e[Ht]=t,e[St]=n,t=e,i&&(t[Yt]=i),t}function A(t,n){var i=\"\";if(t){var e=t.indexOf(n);-1<e&&(t=t.slice(e),n=n.replace(/[.]/g,\"[.]\").replace(/\\$/g,\"[$]\"),(t=new RegExp(\"(?:\\\\b\"+n+\"\\\\b\\\\s*=\\\\s*)([^;]*);?\").exec(t))&&t[1]&&(i=t[1]))}return i}function B(){var t={};try{if(G(Zt)){var n=sessionStorage._353_1119062411120848;n&&(t=JSON.parse(n))}}catch(t){}return t}function G(n){try{var i=t[n];return i.setItem(\"TEST\",\"TEST\"),i.removeItem(\"TEST\"),!0}catch(t){return!1}}function X(){return new yi(function(t){var n=c(function(n){var i=!1;\"load\"===n.type?i=!1:\"error\"===n.type&&(i=!0),t(V(ot,i,n.currentTarget.src))}),i=document.createElement(\"img\");i.onload=n,i.onerror=n,n=Math.floor(Math.random()*si.length),i.src=si[n]+\"?\"+Ri[Math.floor(Math.random()*Ri.length)],1<si.length&&si.splice(n,1)})}function z(t,n,i,e,r){return new yi(function(o){var u=\"script\"===t?rt:ut,a=h();if(s()||a||d()){var l;a&&(l=setTimeout(c(function(){o(V(u,!1,\"Timed out on error\"))}),500));var f=!1,b=c(function(t){if(!f){f=!0,a&&clearTimeout(l);var n=!1;\"load\"===t.type?n=!1:\"error\"===t.type&&(n=!0),o(V(u,n,t.currentTarget.href)),m&&m.parentNode&&m.parentNode.removeChild(m)}}),m=document.createElement(\"link\");m.onload=b,m.onerror=b,m.rel=r||d()?\"prefetch\":\"preload\",m.as=t,i&&m.setAttribute(\"crossorigin\",\"anonymous\"),e&&m.setAttribute(\"referrerpolicy\",\"no-referrer\"),b=Math.floor(Math.random()*n.length),m.href=n[b],pi&&pi.parentNode?pi&&pi.parentNode&&pi.parentNode.insertBefore(m,pi):document.head.appendChild(m),1<n.length&&n.splice(b,1)}else o(V(u,!1,\"Neither Chrome nor Safari\"))})}function I(){return new yi(function(t){var n=Li[Math.floor(Math.random()*Li.length)],i=document.createElement(n[0]);i.id=n[1],i.style.width=\"1px\",i.style.height=\"1px\",i.style.top=\"-555px\",i.style.left=\"-555px\",i.style.display=\"block\";var e=setInterval(c(function(){document&&document.body&&(document.body.appendChild(i),clearInterval(e),setTimeout(c(function(){var n,e=getComputedStyle(i),r=!1;(\"none\"===e.display||(n=e.getPropertyValue(\"-moz-binding\"))&&-1!==n.indexOf(\"abp-elemhidehit\"))&&(r=!0),t(V(ft,r)),i&&i.parentNode&&i.parentNode.removeChild(i)}),200))}),10)})}var Q=/[^A-Za-z0-9\\-_.]/,P=r(\"C52619I8\"),U=r(\"C91314I0\");r(\"T9R8A6T5S6N6I7\");var J=r(\"d4e6r7i3f5_5d5a3o8l0n4o1_0e9l4g5o3o4g6\"),$=r(\"e2d5o9c0 9e7v4i2t0a3n6\"),q=r(\"k7c0a9b2l6l8a5C2d0b3A7r5e1t7s7i4g7e0R9\"),K=r(\"E9B4U0O2Y8\");r(\"B5U5O4Y4\"),r(\"P1B4A8\");var tt=r(\"B3A6\");r(\"S4T1A2T7S8B7D3A4\"),r(\"G4D2A4\");var nt=r(\"P2C7X6E6\"),it=r(\"X0L0O6V9\");r(\"E2N1O2N8\");var et=r(\"E4V9A2R5B9\"),rt=r(\"T5P4I9R7C0S2B7\"),ot=r(\"G7M9I6B3\"),ut=r(\"L3M8T8H0B4\"),ct=r(\"I1R5U1D1A4D2E2K6C3O9L5B8\"),at=r(\"E2M2A2R2F8B8\");r(\"D1E5T1S6E8U6Q0E6R2D3A8P1F0D3\");var st=r(\"D3E7D5A6O2L3P3F9D4\"),ht=r(\"E9L2B9A8W5E3I5V2P9F5D2\"),dt=r(\"E3G1N2A6H0C6W3E6I4V5P5F3D3\"),lt=r(\"D5E8R0E3D7N8E6R1P7F0D1\"),ft=r(\"T9N7E5M7E9L8E3\"),bt=r(\"D9F2\"),mt=r(\"T8S0I6H6\"),vt=r(\"I6R0U7D4A8D5E0D2A9O5L3\"),pt=r(\"K3R0O7W7T4E7N5\"),yt=r(\"O9F8N6I5G4I9S1N1O4N9\");r(\"S7T7A3T2S2D3I6B2E2R0P4\"),r(\"S8T7S4E0T4G0I9S9N8O6N9T9P5R6\");var Rt=r(\"T8L2U0S0E8R5D9E1R7O0T9S5\"),Lt=r(\"T8N5E8S5E7R9P1\"),gt=r(\"T3O2N8\"),wt=r(\"Y5D6A8E3R8T8O7N7\"),Et=r(\"e0t5u0o0r3.8h996r909m4\"),Nt=r(\"c50316i5h8p7r0o0m9\"),_t=r(\"r7e7r4r2e0f7e0r8.8c50611i7\");r(\"e9t4a5t3S3h6p5r5o3M9\"),r(\"d7e8k9c9o9l9b8\"),r(\"d0e0k2c3o0l7b0n7u3\");var Dt=r(\"/4)3]2z3-8a896-306[5]796-803[3g7:4?3(2/3^8\"),St=r(\"d6e8t3c6e1t7e4D4\"),Yt=r(\"n2o0s1a4e1R1\"),jt=r(\"s1t1l1u8s3e1R8\"),Tt=r(\"y0c3n6e4t3a4L5n4o6i9t2c4e6t8e2D5\"),Ht=r(\"e8p8y2T4\"),Wt=r(\"D3E2D9A8O5L4_3V0\"),Ft=r(\"D1E2D5A7O8L3T5O1N9_9V4\"),Zt=r(\"e5g7a0r1o2t1S7n8o8i8s8s7e3s2\"),kt=r(\"d3f3c80313i0\"),Mt=r(\"l7r8u3d4b6a1t9e2g9.5c80015i2\");r(\"k6c9a6b9l9l8a9c8a4h5c0t5p3a0c3\"),r(\"a7h1c6t8p6a3c6e0r9g7\"),r(\"o1x665N509Y7P3k6d8S3V4k636J1V7v6x51136N565X9q7k3e6v8M3f4Z6z6t1H7\"),r(\"e6i6k5o5o2c0\"),r(\"b9d0d3d2b4.5c10417i7\"),r(\"e2m9o1r9h2c2\"),r(\"i9s3c7\"),r(\"T3d5a1o4l4n8o3\"),r(\"n2o5i0s1s3i4m5r6e6p4\"),r(\"s9n6o6i4s0s2i2m8r2e4p6\"),r(\"y0r8e6u3q9\"),r(\"d0e3i9n7e8d4\"),r(\"t7p0m5o3r2p1\"),r(\"r7e5v3i4r8d5b5e6w6\"),r(\"k0c9i6l6c1\"),r(\"t9r4a9t1s0h3c2u5o3t3\"),r(\"s1s9e9r0p9y6e5k1\"),r(\"e4v9o3m7e8s6u4o8m3\"),r(\"l9l2o1r6c0s0\"),r(\"t0u1p0n7i9\"),r(\"e0t5s7a1p0\"),r(\"n3o7i2t4o3m2e9c2i5v9e7d7\"),r(\"m3o8t0n2a3h8p3_1\"),r(\"m8o5t9n6a7h7P4l2l2a4c3\"),r(\"s7j8m4o3t7n5a2h2p6\");var Ot=t.IXC_353_1119062411120848;Ot||(Ot=t.IXC_353_1119062411120848={}),Ot.na=u;var xt=void 0,Ct=function(){function t(t){this.w=this.ka(t,[{g:/MSIE\\s([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?/,iytep:3},{g:/Edge\\/([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?/,iytep:5},{g:/Trident.*rv:([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?/,iytep:3},{g:/Chrome\\/([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?/,iytep:1},{g:/Firefox\\/([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?/,iytep:2},{g:/Version\\/([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?.*Safari/,iytep:4}])||{iytep:0,M:0,X:0,W:0},this.oa=this.ka(t,[{g:/Android\\s([\\d]+)(\\.([\\d]+))?(\\.([\\d]+))?/,iytep:1},{g:/CPU OS ([\\d]+)(_([\\d]+))?(_([\\d]+))?/,iytep:2},{g:/CPU iPhone OS ([\\d]+)(_([\\d]+))?(_([\\d]+))?/,iytep:2},{g:/Mac OS X ([\\d]+)(_([\\d]+))?(_([\\d]+))?/,iytep:3},{g:/Windows NT ([\\d]+)(.([\\d]+))?(.([\\d]+))?/,iytep:4},{g:/Linux [a-z]*([\\d]+)(_([\\d]+))?(_([\\d]+))?/,iytep:5},{g:/CrOS [a-z]*([\\d]+)(_([\\d]+))?(_([\\d]+))?/,iytep:5}])||{iytep:0,M:0,X:0,W:0}}return t.prototype.ka=function(t,n){for(var i=0;i<n.length;++i){var e=n[i],r=e.g.exec(t);if(null!==r)return{iytep:e.iytep,M:parseInt(r[1])||0,X:parseInt(r[3])||0,W:parseInt(r[5])||0}}return{iytep:0,M:0,W:0,X:0}},t}(),Vt=new Ct(\"undefined\"!=typeof navigator&&navigator.userAgent?navigator.userAgent:\"\"),At=Vt.w,Bt=function(t){function n(){var n=t.call(this)||this;return n.wa=!1,t.prototype.u.call(n,function(){}),n}return l(n,t),n.prototype.L=function(t){return function(){if(!this.wa){for(var n=0,i=t.length;n<i;++n)t[n].apply(this,arguments);this.wa=!0}}},n}(function(t){function n(){var n=t.call(this)||this;return t.prototype.u.call(n,function(){n.Sa=this,n.ma=arguments}),n}return l(n,t),n.prototype.L=function(n){var i=this,e=t.prototype.L.call(this,n);return function(){e.apply(this,arguments),i.Ya()}},n.prototype.u=function(n){this.ma?n.apply(this.Sa,this.ma):t.prototype.u.call(this,n)},n}(function(){function t(){this.j=this.P}return t.prototype.P=function(){},t.prototype.L=function(t){return function(){for(var n=0,i=t.length;n<i;++n)t[n].apply(this,arguments)}},t.prototype.u=function(t){if(this.j===this.P)this.j=t;else if(this.j!==this.va){var n=this.ea;n||(n=this.ea=[this.j,t],this.j=this.va=this.L(n))}else this.ea.push(t)},t.prototype.Ya=function(){this.j!==this.P&&(this.j!==this.va?this.j=this.P:this.ea.length=0)},t}())),Gt=void 0,Xt=new Bt,zt=s()&&a()&&b();Xt.j(zt);var It,Qt=[];R(q,L),a()&&Xt.u(function(t){t&&(t={},t[jt]=[],t[Tt]=0,t[St]=!0,g(t)&&m())});var Pt=/webcache[.]googleusercontent[.]com|cc[.]bingj[.]com|web[.]archive[.]org/i,Ut=E(function(t,n){return n.slice()},N),Jt=E(function(t,n){return t.concat(n)},S),$t=E(function(t,n){return t.concat(n.filter(function(n){return 0>t.indexOf(n)}))},Y),qt=Object.create(null,{Version:{value:\"10.5.8\",writable:!1,configurable:!1,enumerable:!0}}),Kt=function(t,n,i){var e=this,r=N(i||{},qt);this.h=function(i,e,o,u){e=new t(e);var c=Object.create(r);return o&&(c=n(c,o)),i(e,function(t){return t?n(c,t):c}),u&&(c=n(c,u)),c},this.qa=function(){},this.ComputeAll=function(t,n,i){return e.h(e.qa,t,n,i)}},tn=5,nn={},en=/^(?:([^:/?#]+):)?(?:\\/\\/+(?:([^/?#]*)@)?([^/?#:@]*)(?::([0-9]+)?)?)?([^?#]+)?(?:\\?([^#]*))?(?:#(.*))?$/,rn=/[#\\/\\?@]/g,on=/[#\\/\\?]/g,un=/[#\\?]/g,cn=/[#]/g,an=/(\\/|^)(?:[^./][^/]*|\\.{2,}(?:[^./][^/]*)|\\.{3,}[^/]*)\\/\\.\\.(?:\\/|$)/,sn=/^([/])?(?:\\.\\.(?:[/]|$))+/,hn=/(^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$)|([^.]+[.](?:([^.]{2}[.][^.]{2})|([^.]+))$)/,dn=/[^.]+[.](no|com|co|io|it|de|net|org|fr|one|tv|today|fm|kr|jp|com[.]au|co[.]uk|ca)$/,ln=/^([^=]*)(?:=(.*))?$/,fn=function(){function t(t){t&&(this.israpirude=\"string\"==typeof t?T(t):t),this.israpirude||(this.israpirude={ihcseme:null,iedercslaitn:null,imodnia:null,ioptr:null,ihtapeman:null,iuqyre:null,igarftnem:null}),this.iacehc={o:null,iironig:null,D:null,H:null,I:null,l:[null]}}return t.prototype.itegferh=function(){var t;if(!(t=this.iacehc.o)){var n=\"\";null!==(t=this.israpirude).ihcseme&&(n+=t.ihcseme+\":\"),null!==t.imodnia&&(n+=\"//\",null!==t.iedercslaitn&&(n+=t.iedercslaitn+\"@\"),n+=t.imodnia,null!==t.ioptr&&(n+=\":\"+t.ioptr)),null!==t.ihtapeman&&(n+=t.ihtapeman),null!==t.iuqyre&&(n+=\"?\"+t.iuqyre),null!==t.igarftnem&&(n+=\"#\"+t.igarftnem),t=this.iacehc.o=n}return t},t.prototype.iotegnigir=function(){var t=this.iacehc;if(!t.iironig){var n=\"\",i=this.istegemehc();this.icurtssilruderut()||!i?(i&&(n+=i+\":\"),(i=this.itegtsoh())&&(n+=\"//\"+i),t.iironig=\"\"!==n?n:null):t.iironig=\"null\"}return t.iironig},t.prototype.istegemehc=function(){return this.israpirude.ihcseme},t.prototype.iosbasilruetul=function(){return!!this.israpirude.ihcseme&&!!this.israpirude.imodnia},t.prototype.icurtssilruderut=function(){var t=this.israpirude.ihcseme;return null!==t&&(\"http\"===t||\"https\"===t||\"ftp\"===t)},t.prototype.istesemehc=function(t){return null!==t&&rn.test(t)?this:(this.israpirude.ihcseme=t?t.toLowerCase():null,t=this.iacehc,t.o=null,t.iironig=null,this)},t.prototype.irpteglocoto=function(){var t=this.istegemehc();return t&&t+\":\"},t.prototype.iderctegslaitne=function(){return this.israpirude.iedercslaitn},t.prototype.iderctesslaitne=function(t){return null!==t&&rn.test(t)?this:(this.israpirude.iedercslaitn=t,this.iacehc.o=null,this)},t.prototype.itegtsoh=function(){var t=this.iacehc;if(!t.D){var n=\"\",i=this.idtegniamo();i&&(n+=i,(i=this.itegtrop())&&(n+=\":\"+i)),t.D=\"\"!==n?n:null}return t.D},t.prototype.idtegniamo=function(){return this.israpirude.imodnia},t.prototype.idtesniamo=function(t){return null!==t&&on.test(t)?this:(this.israpirude.imodnia=t,(t=this.israpirude.ihtapeman)&&\"/\"!==t[0]&&(this.israpirude.ihtapeman=\"/\"+t),t=this.iacehc,t.o=null,t.iironig=null,t.D=null,t.H=null,t.I=null,this)},t.prototype.iamodtoorkcehcehcacdltdnani=function(){var t=this.iacehc;if(!t.H){var n=this.idtegniamo();if(n){var i=dn.exec(n);i?(t.H=i[0],t.I=i[1]):(i=hn.exec(n))&&(t.H=i[0],(t.I=i[4]||null)||(t.I=i[3]))}}},t.prototype.ielpottegniamodlev=function(){return this.iamodtoorkcehcehcacdltdnani(),this.iacehc.I},t.prototype.ioortegniamodt=function(){return this.iamodtoorkcehcehcacdltdnani(),this.iacehc.H||this.idtegniamo()},t.prototype.itegtrop=function(){return this.israpirude.ioptr},t.prototype.itestrop=function(t){if(t){if((t=Number(t))!==(65535&t))return this;this.israpirude.ioptr=\"\"+t}else this.israpirude.ioptr=null;return t=this.iacehc,t.o=null,t.iironig=null,t.D=null,this},t.prototype.iteghtap=function(){var t=\"\",n=this.iaptegemanht();return n&&(t+=n),(n=this.iqtegyreu())&&(t+=\"?\"+n),(n=this.irftegtnemga())&&(t+=\"#\"+n),\"\"!==t?t:null},t.prototype.iaptegemanht=function(){return this.israpirude.ihtapeman},t.prototype.iaptesemanht=function(n,i){if(n){if(un.test(n))return this;n=!i||!this.icurtssilruderut()&&this.istegemehc()?n:t.Ea(n),this.israpirude.ihtapeman=this.israpirude.imodnia&&\"/\"!==n[0]?\"/\"+n:n||null}else this.israpirude.ihtapeman=null;return this.iacehc.o=null,this},t.prototype.izilamronemanhtape=function(){return this.iaptesemanht(this.israpirude.ihtapeman,!0)},t.prototype.isteghcrae=function(){var t=this.iqtegyreu();return t&&\"?\"+t},t.prototype.iqtegyreu=function(){return this.israpirude.iuqyre},t.prototype.iqtesyreu=function(t){return null!==t&&cn.test(t)?this:(this.israpirude.iuqyre=t,t=this.iacehc,t.o=null,t.l=[null],this)},t.prototype.iteghsah=function(){var t=this.irftegtnemga();return t&&\"#\"+t},t.prototype.irftegtnemga=function(){return this.israpirude.igarftnem},t.prototype.irftestnemga=function(t){return this.israpirude.igarftnem=t,this.iacehc.o=null,this},t.prototype.iqddayreu=function(t){var n=t;return this.israpirude.iuqyre&&(n=this.israpirude.iuqyre+\"&\"+t),this.iqtesyreu(n)},t.prototype.ieuqddamarapyr=function(t,n){return this.iqddayreu(n?t+\"=\"+n:t)},t.prototype.iarapkcehcehcacretem=function(){var t=this.iacehc;if(1===t.l.length&&null===t.l[0]){var n=this.israpirude.iuqyre;if(n){for(var i=[],e=-1,r=0,o=(n=n.split(\"&\")).length;r<o;++r){var u=ln.exec(n[r]);u&&(i[++e]=u[1],u[2]||\"\"===u[2]?i[++e]=u[2]:i[++e]=null)}t.l=i}else t.l=[]}},t.prototype.iapllatessretemar=function(t){for(var n=\"\",i=\"\",e=t.length,r=0;r<e;){var o=t[r++],u=t[r++];n+=i+o,i=\"&\",(u||\"\"===u)&&(n+=\"=\"+u)}return this.iqtesyreu(n||null)},t.prototype.iemaraptesseulavret=function(t,n){\"string\"==typeof n&&(n=[n]),this.iarapkcehcehcacretem();for(var i,e=0,r=this.iacehc.l,o=[],u=0,c=r.length;u<c;u+=2)t===r[u]?(i=!0,e<n.length&&o.push(t,n[e++])):o.push(r[u],r[u+1]);for(;e<n.length;)o.push(t,n[e++]);return(0<e||i)&&this.iapllatessretemar(o),this},t.prototype.ipevomerretemara=function(t){return this.iemaraptesseulavret(t,[])},t.prototype.iapllategsretemar=function(){return this.iarapkcehcehcacretem(),this.iacehc.l.slice(0,this.iacehc.l.length)},t.prototype.iemaraptegseulavret=function(t){this.iarapkcehcehcacretem();for(var n=this.iacehc.l,i=[],e=0,r=n.length;e<r;e+=2)t===n[e]&&i.push(n[e+1]);return i},t.prototype.imaraptegeulavrete=function(t){this.iarapkcehcehcacretem();for(var n=this.iacehc.l,i=0,e=n.length;i<e;i+=2)if(t===n[i])return n[i+1];return null},t.Ea=function(t){t=t.replace(/(^|\\/)\\.(?:\\/|$)/g,\"$1\").replace(/\\/{2,}/g,\"/\");for(var n;(n=t.replace(an,\"$1\"))!=t;t=n);return t=t.replace(sn,\"$1\")},t.prototype.itumetaercwodahselba=function(n){return new(n=n||t)(Object.create(this.israpirude))},t.prototype.ierfeze=function(){return Object.freeze(this.israpirude),this},t.prototype.ilceno=function(){return new t({ihcseme:this.israpirude.ihcseme,iedercslaitn:this.israpirude.iedercslaitn,imodnia:this.israpirude.imodnia,ioptr:this.israpirude.ioptr,ihtapeman:this.israpirude.ihtapeman,iuqyre:this.israpirude.iuqyre,igarftnem:this.israpirude.igarftnem})},t.prototype.iiresezila=function(){var t=this.israpirude;return[t.ihcseme,t.iedercslaitn,t.imodnia,t.ioptr,t.ihtapeman,t.iuqyre,t.igarftnem]},t}(),bn=function(){function t(t){this.v=t instanceof fn?t:new fn(t&&Z(t))}return t.prototype.a=function(t){return this.v.ioortegniamodt()===t},t.prototype.scheme=function(t){return this.v.istegemehc()===t},t.prototype.domain=function(t){return this.v.idtegniamo()===t},t.prototype.cb=function(t){return M(this.v.idtegniamo(),t)},t.prototype.gb=function(){return M(this.v.iqtegyreu(),/abdtrigger/)},t.prototype.R=function(t){return O(this.v.iemaraptegseulavret(\"abdtrigger\"),t)},t.prototype.port=function(t){return this.v.itegtrop()===t},t.prototype.href=function(t){return this.v.itegferh()===t},t}(),mn={ie:3,chrome:1,edge:5,firefox:2,safari:4},vn={android:1,ios:2,mac:3,windows:4,linux:5},pn=function(t){function n(n){(n=n||{}).headers=n.headers||{};var i=n.uri,e=n.url;return(i=i instanceof fn?i:new fn(i?Z(i):e?T(e):void 0)).idtegniamo()||(e=new fn(\"//\"+n.headers.host),i.idtesniamo(e.idtegniamo()),i.itestrop(e.itegtrop())),i=t.call(this,i)||this,i.ca=n,n=n.headers[\"i-resutnega\"],i.O=n?new Ct(n):Vt,i}return l(n,t),n.prototype.U=function(t){var n=this.ca.headers;return n&&n[t]||null},n.prototype.ia=function(){var t=this.ca.headers;return t&&t.cookie||\"\"},n.prototype.la=function(t,n,i){return void 0!==(t=t.M)&&(void 0===n||n<=t)&&(void 0===i||t<=i)},n.prototype.method=function(t){return this.ca.method===t},n.prototype.xa=function(t,n){return k(this.U(t),n)},n.prototype.host=function(t){return this.xa(\"host\",t)},n.prototype.ab=function(t){return M(this.ia(),t)},n.prototype.cookie=function(t,n){return-1!==this.ia().indexOf(t)&&this.ab(new RegExp(t+\"s*=[^;]*\"+n+\"[^;]*\"))},n.prototype.b=function(t,n,i){return void 0===(t=mn[t])&&(t=0),this.O.w.iytep===t&&this.la(this.O.w,n||Number.MIN_VALUE,i||Number.MAX_VALUE)},n.prototype.ya=function(t){return void 0===(t=vn[t])&&(t=0),this.O.oa.iytep===t&&this.la(this.O.oa,Number.MIN_VALUE,Number.MAX_VALUE)},n}(bn),yn={ietupmochctefno:new Kt(pn,S).h},Rn=D(Ut,[{i_irurefed:N,ii_irueniln:N,iart_iruremrofsn:S,itcelloc_irustats_frep_:N,i_iruepyt:N}]),Ln=new Kt(bn,Rn).h,gn=function(){function t(t){this.ua=t||[]}return t.prototype.domain=function(t){t=t.replace(/[\\/\\\\^$*+?.()|[\\]{}]/g,\"\\\\$&\");t:{var n=this.ua;t=new RegExp(\"^(?:(?:[^:/?#]+):)?(?://(\"+t+\"))(?:$|[:/?#])\");for(var i=0;i<n.length;i++){var e=n[i];if(e&&t.test(e)){n=!0;break t}}n=!1}return n},t.prototype.href=function(t){return O(this.ua,t)},t}(),wn=function(){function t(t){this.m=t||\"\"}return t.prototype.pattern=function(t,n){return M(this.m,new RegExp(\"\\\\b\"+t.toString()+\"=\"+(n?n.toString():\"\")+\"\\\\b\"))},t}(),En=new Kt(function(t){void 0===t&&(t={}),this.scripts=new gn(t.scripts),this.cookie=new wn(t.value)},D(Jt,[{ier_eikoocretlif_da:Jt}])).h,Nn=function(){function t(t){this.m=t||\"\"}return t.prototype.pattern=function(t,n){return M(this.m,new RegExp(\"^\"+t.toString()+\"=\"+(n?n.toString():\"\")+\"\\\\b\"))},t}(),_n=new Kt(function(t){void 0===t&&(t={}),this.scripts=new gn(t.scripts),this.cookie=new Nn(t.value)},D(Ut,[{irw_eikoocretlif_eti:S}])).h,Dn=function(){function t(t){void 0===t&&(t={}),this.m=t}return t.prototype.tagName=function(t){return this.m&&this.m.TagName===t},t}(),Sn=function(){function t(t){this.m=t||\"\"}return t.prototype.pattern=function(t){return M(this.m,t)},t}(),Yn=function(){function t(t){this.Qa=t||{}}return t.prototype.contentType=function(t){return this.Qa.ContentType===t},t}(),jn=new Kt(function(t){void 0===t&&(t={}),this.uri=new bn(t.uri),this.tag=new Dn(t.tag),this.str=new Sn(t.str),this.meta=new Yn(t.meta)},D(Ut,[{i_irurefed:N,ii_irueniln:N,iart_iruremrofsn:S,itcelloc_irustats_frep_:N,i_iruepyt:N,imrofsnartelbatnoita:S,irttnetnocremrofsna:S,ini_gatnoitcej:S}])).h,Tn=function(){function t(t){this.Wa=t=t||{}}return t.prototype.U=function(t){var n=this.Wa.headers;return n&&n[t]||null},t.prototype.xa=function(t,n){return k(this.U(t),n)},t}(),Hn=new Kt(Tn,S).h,Wn=new Kt(pn,S).h,Fn=new Kt(Tn,S).h,Zn=new Kt(pn,S).h,kn=new Kt(function(){},S).h,Mn=new Kt(function(){function t(t){void 0===t&&(t={}),this.m=t}return t.prototype.on_event=function(t){return this.m.event===t},t}(),S).h,On=i({},yn,{iolcaetupmocdaereikoocn:En,iolcaetupmocetirweikoocn:_n,isetupmoctcejbobu:jn,ibusetupmociruecruoser:Ln,ixorpetupmocesnopsernoy:Hn,inoyxorpetupmoctseuqermaertspu:Wn,iunoyxorpetupmocesnopsermaertsp:Fn,idleihsdaetupmoctseuqerdedocedno:Zn,inoxotobetupmoctseuqerdedoced:kn,ilcetupmoctnevetnei:Mn,inovnetupmoctnevetneilc:Mn}),xn=function(t){function n(n,i,e){return t.call(this,function(t){this.env=new n(t.env),this.req=new i(t.req),this.inp=new i(t.inp)},e,On)||this}return l(n,t),n}(Kt),Cn=function(){function t(t){void 0===t&&(t={}),this.C=t}return t.prototype.applicationName=function(t){return this.C.applicationName===t},t.prototype.applicationVersion=function(t){return this.C.applicationVersion===t},t.prototype.instanceName=function(t){return t===this.C.instanceName},t.prototype.attribute=function(t,n){return\"object\"==typeof this.C.attributes&&this.C.attributes[t]===n},t}(),Vn=function(){function t(t){void 0===t&&(t={}),this.eb=t}return t.prototype.itnuocedocyr=function(t){return this.eb.itnuocedocyr===t},t}(),An=function(){function t(t){void 0===t&&(t={}),this.bb=t}return t.prototype.iecivedylimaf=function(t){return this.bb.iecivedylimaf===t},t}(),Bn=function(t){function n(n){void 0===n&&(n={});var i=t.call(this,n)||this;return i.igoe=new Vn(n.igoe),i.ivedeci=new An(n.ivedeci),i}return l(n,t),n}(pn),Gn=_({},[{Version:function(t){return console.error(\"Version cannot be changed from \"+t),t},ilgo:S,itemscir:S},{ireggolgifnoc:Y,itreggoltropsnar:S,icirtemgifnoc:Y,itcirtemtropsnar:N,if_nohcte:j}]);D(Ut,[Gn]);var Xn=D(Jt,[{ikooc_nodaer_ei:j,ikooc_noetirw_ei:j}]),zn=D(Jt,[{ieilc_notneve_tn:j}]),In=D(Jt,[{iedoced_notseuqer_d:j}]),Qn=D(Jt,[{iedoced_notseuqer_d:j}]),Pn=D(S,[{ier_noesnops:j,iaertspu_noesnopser_m:j,irapyreuqecalperma:Jt}]),Un=D(Ut,[{uri:j}]),Jn=new xn(Cn,Bn,D(Ut,[Gn,{ialc:Xn,inv:zn,igolreg:S,ihsdadlei:In,iobxot:Qn,impp:N,ieis:N,irpyxo:Pn,irmu:S,ieikooctcelfer:S,iciruotpyr:N,iletdayrteme:N,iosivonanecivres_r:N,imarfieerte:N,ierbusecruos:Un,iobustcejb:j,i_emonececivres:N,ipa_emonececivres_i:N,iipa_cabrecivres_:N}])),$n=Jn.ComputeAll;Jn.qa=function(i,e){(i.req.b(\"chrome\",46,1e3)||i.req.b(\"safari\",10,1e3))&&e({iadb:{ierelbanenoitcerid:!0}}),(i.req.b(\"chrome\",46,1e3)||i.req.b(\"firefox\",38,1e3)||i.req.b(\"safari\",10,1e3)||i.req.b(\"ie\",10,1e3)&&document&&10>document.documentMode||i.req.b(\"edge\",12,1e3))&&e({iadb:{idelbanenoitcete:!0}}),e({iadb:{ivetatselbaira:\"MorphState\",iolbetatseulavdekc:\"blocked\",ilbtonetatseulavdekco:\"not-blocked\",iycnetalelbairav:\"Abdt\",iircsdekcolbmunsrotcetedkniltp:4,isdekcolbnamregmunsrotcetedkniltpirc:0,imthdekcolbmunsrotcetedknill:4,ihtnemelemunsrotcetededi:4,iidekcolbmunsrotcetedgm:4,inoitceteddlohserht:3,ilufelbanenoitcetedl:!0,iyrotsihelbanenoitceriderrof:!1,irotsihmundlohserhty:1,iawirudatsilhct:[/(?:pubads[.])|(?:prebid[.]js)|(?:openx[.]net)|(?:googlesyndication[.](?:net|com))|(?:indexww[.]com)|(?:[.]adnxs[.]com)/i],itemeletdbatniopdneyr:\"/g00/2_d3d3LmJvc3Rvbi5jb20%3D_/TU9SRVBIRVVTOCRodHRwOi8vY3AtaW4ubmFub3Zpc29yLmlvL2NsaWVudHByb2ZpbGVyL2FkYj9pMTBjLm1hcmsuc2NyaXB0LnR5cGU%3D_$/$/$\",iceriderelbasidnoissesrofnoit:!1,isabnoitceriderelbanesrotcetedkniltpircsde:!0,ietedtratsemitnoitc:0,iofetavitcarekcolbynar:!0}}),i.req.b(\"safari\",10,1e3)&&e({iadb:{icolbdaslru_k:\"https://s0.2mdn.net/ads/richmedia/studio/pv2/60282074/20170720084443516/script.js https://cdn.doubleverify.com/dv-match4.js https://cdn.springserve.com/vd/vd0.2.82.8.js https://cdn.revcontent.com/build/css/rev2.min.css https://c.betrad.com/a/n/269/635.js https://s0.2mdn.net/6440533/1495124845208/Raise%20Your%20Hands_728x90/global.min.css\".split(\" \")}}),(i.req.b(\"firefox\",38,1e3)||i.req.b(\"safari\",10,1e3)||i.req.b(\"ie\",10,1e3)&&document&&10>document.documentMode||i.req.b(\"edge\",12,1e3))&&e({iadb:{ilufelbanenoitcetedl:!1,iyrotsihelbanenoitceriderrof:!1,iceriderelbasidnoissesrofnoit:!1}}),(i.req.domain(t.atob(\"d3d3LmxpZmV3aXJlLmNvbQ==\"))||i.req.domain(t.atob(\"d3d3LnRoZWJhbGFuY2UuY29t\"))||i.req.domain(t.atob(\"d3d3LnRoZXNwcnVjZS5jb20=\"))||i.req.domain(t.atob(\"d3d3LnRob3VnaHRjby5jb20=\"))||i.req.domain(t.atob(\"d3d3LnRyaXBzYXZ2eS5jb20=\")))&&(e({iadb:{iyrotsihelbanenoitceriderrof:!1,isabnoitceriderelbanesrotcetedkniltpircsde:!1,ilufelbanenoitcetedl:!1,ihtnemelemunsrotcetededi:0,iidekcolbmunsrotcetedgm:0,ietedtratsemitnoitc:300}}),i.req.gb()&&(i.req.R(\"300\")&&e({iadb:{ietedtratsemitnoitc:300}}),i.req.R(\"500\")&&e({iadb:{ietedtratsemitnoitc:500}}),i.req.R(\"dcl\")&&e({iadb:{ietedtratsemitnoitc:\"DOMContentLoaded\"}}),i.req.R(\"load\")&&e({iadb:{ietedtratsemitnoitc:\"load\"}}))),i.req.a(t.atob(\"cG9wc2NpLmNvbQ==\"))&&e({iadb:{isabnoitceriderelbanesrotcetedkniltpircsde:!1}}),!i.req.a(t.atob(\"Y25ldC5jb20=\"))||i.req.host(t.atob(\"d3d3LmNuZXQuY29t\"))||i.req.host(t.atob(\"dGVzdC5jbmV0LmNvbQ==\"))||i.req.host(t.atob(\"ZG93bmxvYWQuY25ldC5jb20=\"))||i.req.host(t.atob(\"ZG93bmxvYWQuc3RhZ2UuY25ldC5jb20=\"))||e({iadb:{idelbanenoitcete:!1}}),i.req.b(\"firefox\")&&i.req.host(t.atob(\"dGVzdC5jbmV0LmNvbQ==\"))&&e({iadb:{ierelbanenoitcerid:!0}}),i.req.host(t.atob(\"d3d3LmNuZXQuY29t\"))&&e({iadb:{inietatseulavti:\"detecting\"}}),i.req.a(t.atob(\"aG9tZXMuY29t\"))&&i.req.b(\"firefox\",54,1e3)&&e({iadb:{ierelbanenoitcerid:!0}}),i.req.a(t.atob(\"ZWRtdW5kcy5jb20=\"))&&i.req.b(\"firefox\",54,1e3)&&e({iadb:{ierelbanenoitcerid:!0}}),i.req.a(t.atob(\"dHJlbmQtY2hhc2VyLmNvbQ==\"))&&i.req.b(\"firefox\",54,1e3)&&e({iadb:{ierelbanenoitcerid:!0}}),i.req.host(t.atob(\"d3d3LmxvbGtpbmcubmV0\"))&&e({iadb:{ilufelbanenoitcetedl:!0,iyrotsihelbanenoitceriderrof:!0,iawirudatsilhct:[/(?:mb[.]zam)/i]}}),i.req.host(t.atob(\"d3d3LmxvbGtpbmcubmV0\"))&&i.req.cookie(\"i10cfd\",\"1\")&&e({iadb:{iyrotsihelbanenoitceriderrof:!0,iawirudatsilhct:[/(?:mb[.]zam)/i]}}),(i.req.host(t.atob(\"d3d3Lm1zbi5jb20=\"))||i.req.host(t.atob(\"aW50MS5tc24uY29t\")))&&e({iadb:{ivetatselbaira:\"Abd\",iolbetatseulavdekc:1,ilbtonetatseulavdekco:0,isabnoitceriderelbanesrotcetedkniltpircsde:!1,itemeletdbatniopdneyr:\"//tu9srvbirvvtocrjcc1pbi5uyw5vdmlzb3iuaw80.g00.msn.com/g00/2_d3d3LmJvc3Rvbi5jb20%3D_/TU9SRVBIRVVTOCRodHRwOi8vY3AtaW4ubmFub3Zpc29yLmlvL2NsaWVudHByb2ZpbGVyL2FkYj9pMTBjLm1hcmsuc2NyaXB0LnR5cGU%3D_$/$/$\"}}),(i.req.host(t.atob(\"d3d3Lm1zbi5jb20=\"))||i.req.host(t.atob(\"aW50MS5tc24uY29t\")))&&(i.req.b(\"firefox\")||i.req.b(\"edge\"))&&e({iadb:{ierelbanenoitcerid:!0}}),i.req.host(t.atob(\"d3d3Lm1zbi5jb20=\"))&&(i.req.b(\"chrome\",46,1e3)||i.req.b(\"safari\",10,1e3))&&e({iadb:{ilufelbanenoitcetedl:!0,ierelbanenoitcerid:!0,iyrotsihelbanenoitceriderrof:!0,iceriderelbasidnoissesrofnoit:!1,iawirudatsilhct:[/(?:cdn[.]3lift[.]com)|(?:ib[.]3lift[.]com\\/ttj)|(?:widgets[.]outbrain[.]com\\/external\\/publishers\\/msn\\/MSNOBCore[.]min[.]js)|(?:cdn[.]taboola[.]com\\/libtrc\\/msn-home-network\\/loader[.]js)|(?:cdn[.]taboola[.]com\\/libtrc\\/msn-section-network\\/loader[.]js)|(?:h6[.]msn[.]com\\/nativeads\\/ms-nativeads-msn[.]min[.]js)|(?:at[.]atwola[.]com)|(?:pixel[.]advertising[.]com)/i]}}),(i.req.host(t.atob(\"d3d3Lm1zbi5jb20=\"))||i.req.host(t.atob(\"aW50MS5tc24uY29t\")))&&t&&1===t[\"ad-instart2\"]&&e({iadb:{ierelbanenoitcerid:!1}}),i.req.host(t.atob(\"bnYuY29t\"))&&e({iadb:{iircsdekcolbmunsrotcetedkniltp:4,isdekcolbnamregmunsrotcetedkniltpirc:4,imthdekcolbmunsrotcetedknill:0,ihtnemelemunsrotcetededi:4,iidekcolbmunsrotcetedgm:4,inoitceteddlohserht:16,ierelbanenoitcerid:!1,ilufelbanenoitcetedl:!1,iyrotsihelbanenoitceriderrof:!1}}),(i.req.a(t.atob(\"Y2FsZ2FyeWhlcmFsZC5jb20=\"))||i.req.a(t.atob(\"Y2FsZ2FyeXN1bi5jb20=\"))||i.req.a(t.atob(\"Y2FuYWRhLmNvbQ==\"))||i.req.a(t.atob(\"Y2Fub2UuY29t\"))||i.req.a(t.atob(\"ZWRtb250b25qb3VybmFsLmNvbQ==\"))||i.req.a(t.atob(\"ZWRtb250b25zdW4uY29t\"))||i.req.a(t.atob(\"ZmFjZW9mZi5jb20=\"))||i.req.a(t.atob(\"ZmluYW5jaWFscG9zdC5jb20=\"))||i.req.a(t.atob(\"aG9ja2V5aW5zaWRlb3V0LmNvbQ==\"))||i.req.a(t.atob(\"bGVhZGVycG9zdC5jb20=\"))||i.req.a(t.atob(\"bGZwcmVzcy5jb20=\"))||i.req.a(t.atob(\"bW9udHJlYWxnYXpldHRlLmNvbQ==\"))||i.req.a(t.atob(\"bmF0aW9uYWxwb3N0LmNvbQ==\"))||i.req.a(t.atob(\"b3R0YXdhY2l0aXplbi5jb20=\"))||i.req.a(t.atob(\"b3R0YXdhc3VuLmNvbQ==\"))||i.req.a(t.atob(\"dGhlZ2lmdGd1aWRlLmNh\"))||i.req.a(t.atob(\"dGhlcHJvdmluY2UuY29t\"))||i.req.a(t.atob(\"dGhlc3RhcnBob2VuaXguY29t\"))||i.req.a(t.atob(\"dG9yb250b3N1bi5jb20=\"))||i.req.a(t.atob(\"dmFuY291dmVyc3VuLmNvbQ==\"))||i.req.a(t.atob(\"d2luZHNvcnN0YXIuY29t\"))||i.req.a(t.atob(\"d2lubmlwZWdzdW4uY29t\")))&&e({iadb:{ilufelbanenoitcetedl:!1,iyrotsihelbanenoitceriderrof:!1}}),i.req.host(t.atob(\"d3d3LnJhbmtlci5jb20=\"))&&(i.req.ya(\"mac\")||i.req.ya(\"windows\"))&&e({iadb:{isabnoitceriderelbanesrotcetedkniltpircsde:!1,ierelbanenoitcerid:!0,ilufelbanenoitcetedl:!0,iyrotsihelbanenoitceriderrof:!0}}),i.req.domain(t.atob(\"d3d3LnN1cGVyY2hldnkuY29t\"))&&e({iadb:{iyrotsihelbanenoitceriderrof:!1,isabnoitceriderelbanesrotcetedkniltpircsde:!1,ilufelbanenoitcetedl:!1,ihtnemelemunsrotcetededi:0,iidekcolbmunsrotcetedgm:0,ietedtratsemitnoitc:300}}),(i.req.host(t.atob(\"dHZ0cm9wZXMub3Jn\"))||i.req.host(t.atob(\"d3d3LnR2dHJvcGVzLm9yZw==\")))&&e({iadb:{iofetavitcarekcolbynar:!1,ifetavitcakcolbdaro:!0,irofetavitcasulpkcolbda:!0}}),i.req.a(t.atob(\"d2FzaGluZ3RvbnBvc3QuY29t\"))&&e({iadb:{ilufelbanenoitcetedl:!1,ietedtratsemitnoitc:\"DOMContentLoaded\",iotelbairavlabolgskcabllacretsiger:\"__il_wapo\",ierelbanenoitcerid:!1}}),n(i,e),i.req.host(t.atob(\"d3d3Lndvd2hlYWQuY29t\"))&&e({iadb:{ilufelbanenoitcetedl:!0,iyrotsihelbanenoitceriderrof:!0,iawirudatsilhct:[/(?:mb[.]zam)/i]}}),i.req.host(t.atob(\"d3d3Lndvd2hlYWQuY29t\"))&&i.req.cookie(\"i10cfd\",\"1\")&&e({iadb:{iyrotsihelbanenoitceriderrof:!0,iawirudatsilhct:[/(?:mb[.]zam)/i]}}),i.req.b(\"chrome\",46,1e3)&&e({iadb:{iidekcolbmunsrotcetedgm:0}}),i.req.cb(Pt)&&e({iadb:{idelbanenoitcete:!1}}),i.req.cookie(\"i10c.expt.history\",\"true\")&&e({iadb:{iyrotsihelbanenoitceriderrof:!0}})};var qn,Kn=null,ti=qn={url:t.location.href,headers:{host:t.location.host,cookie:document.cookie}};Kn=$n({env:{},inp:ti,req:qn},{});var ni,ii=function(){function t(t,n){this.J=t,this.$a=n}return t.prototype.iulr=function(){return this.$a.url},t.prototype.ta=function(){return 1223===this.J.status?204:this.J.status},t.prototype.Headers=function(){return this.J.getAllResponseHeaders()},t.prototype.iaehred=function(t){return this.J.getResponseHeader(t)},t.prototype.Error=function(){return 100>this.ta()||599<this.ta()?\"Network request failed\":null},t.prototype.Text=function(){return this.J.responseText},t}(),ei={Fa:XMLHttpRequest,Ta:XMLHttpRequest.prototype.open,Xa:XMLHttpRequest.prototype.send},ri=(ni={},ni[Ht]=it,ni[St]=!1,ni);t.addEventListener(\"message\",function(t){\"string\"!=typeof(t=t.data)||0!==t.lastIndexOf(Wt,Wt.length+1)&&0!==t.lastIndexOf(Ft,Ft.length+1)||(ri[St]=!0,ri[Yt]=t)});var oi;!function(t){t[t.PENDING=0]=\"PENDING\",t[t.FULLFILLED=1]=\"FULLFILLED\",t[t.REJECTED=2]=\"REJECTED\"}(oi||(oi={}));var ui=function(){function t(t){if(!t)throw\"no executor provided\";if(\"object\"!=typeof this)throw\"use new\";if(\"function\"!=typeof t)throw\"not a function\";this.state=oi.pa,this.La(t)}return t.prototype.La=function(t){var n=this;try{t(function(t){n.Va(t)},function(t){n.sa(t)})}catch(t){n.sa(t)}},t.prototype.Va=function(t){this.za&&this.za.call(this,t),this.state=oi.ha},t.prototype.sa=function(t){this.fa&&this.fa.call(this,t),this.state=oi.ra},t.prototype.then=function(n,i){return this.state===oi.pa?(this.fa=i,this.za=n):this.state===oi.ha?n.call(this,void 0):this.state===oi.ra&&i.call(this,void 0),new t(function(){})},t.prototype.catch=function(n){return this.state===oi.pa?this.fa=n:this.state!==oi.ha&&this.state===oi.ra&&n.call(this,void 0),new t(function(){})},t.prototype.all=function(n){var i=Array.prototype.slice.call(n);return new t(function(t,n){function e(o,u){try{if(u&&(\"object\"==typeof u||\"function\"==typeof u)){var c=u.then;if(\"function\"==typeof c)return void c.call(u,function(t){e(o,t)},n)}i[o]=u,0==--r&&t(i)}catch(t){n(t)}}if(0===i.length)return t([]);for(var r=i.length,o=0;o<i.length;o++)e(o,i[o])})},t}(),ci=(new fn).idtesniamo(t.location.hostname).ioortegniamodt(),ai={},si=\"aHR0cHM6Ly9wYWdlYWQyLmdvb2dsZXN5bmRpY2F0aW9uLmNvbS9mYXZpY29uLmljbw== aHR0cHM6Ly9zMC4ybWRuLm5ldC8xNjM1OTA5LzF4MWltYWdlLmpwZw== aHR0cHM6Ly9jb25uZWN0LmZhY2Vib29rLm5ldC9mYXZpY29uLmljbw== aHR0cHM6Ly9hZHMudHdpdHRlci5jb20vZmF2aWNvbi5pY28= aHR0cHM6Ly93d3cuZ29vZ2xlLWFuYWx5dGljcy5jb20vX191dG0uZ2lm aHR0cHM6Ly90cGMuZ29vZ2xlc3luZGljYXRpb24uY29tL2Zhdmljb24uaWNv aHR0cHM6Ly9zZWN1cmUuZm9vdHByaW50Lm5ldC95aWVsZG1hbmFnZXIvYXBleC9tZWRpYXN0b3JlL2FkY2hvaWNlXzEucG5n\".split(\" \"),hi=\"aHR0cHM6Ly9jZG4uZmxhc2h0YWxraW5nLmNvbS83MTE5NS8xODkwMTQ2L2pzL3Rpbnlyb29tLmpz aHR0cHM6Ly9jZG4ubWVkaWF2b2ljZS5jb20vbmF0aXZlYWRzL3NjcmlwdC9jYWZlbW9tL3BvbGFyX3RoZXN0aXJfcGlwaW5nLmpz aHR0cHM6Ly9jLmJldHJhZC5jb20vYS9uLzI3OS83ODE3NS5qcw== aHR0cHM6Ly9zY3JpcHRzLmhvc3QuYmFubmVyZmxvdy5jb20vMS4wLjAvd2lkZ2V0Lm1pbi5qcw== aHR0cHM6Ly9zdGF0aWMuZG91YmxlY2xpY2submV0L2luc3RyZWFtL2FkX3N0YXR1cy5qcw== aHR0cHM6Ly9zMC4ybWRuLm5ldC82OTU1NTEyLzE0OTkzNDQxOTMxMjMvd2ViLzMwMHgyNTBfZWRnZS5qcw==\".split(\" \"),di=\"aHR0cHM6Ly9ydGF4LmNyaXRlby5jb20vZGVsaXZlcnkvcnRhL3J0YS5qcw== aHR0cHM6Ly9pYi5hZG54cy5jb20vanB0 aHR0cHM6Ly90bHguM2xpZnQuY29tL2hlYWRlci9hdWN0aW9u aHR0cHM6Ly9hZC55aWVsZGxhYi5uZXQveXAvNTE5NDc4 aHR0cHM6Ly9wYWdlYWQyLmdvb2dsZXN5bmRpY2F0aW9uLmNvbS9wYWdlYWQvanMvZ29vZ2xlX3RvcF9leHAuanM= aHR0cHM6Ly9zZWN1cmUuYWRueHMuY29tL3R0ag==\".split(\" \"),li=new Bt,fi=s()&&a()&&!b();li.j(fi);var bi=void 0,mi=new Bt,vi=s()&&(void 0!==bi?bi:bi=!!t[J]);mi.j(vi);var pi=t.document.currentScript||t.document.scripts[document.scripts.length-1],yi=t.Promise||ui,Ri=\"&ad_box_ &ad_channel= &ad_classid= &ad_height= &ad_keyword= &ad_network_ &ad_number= &ad_type= &ad_type_ &ad_url= &ad_zones= &adbannerid=\".split(\" \"),Li=[[\"iframe\",\"google_ads_frame\"],[\"iframe\",\"google_ads_iframe\"],[\"div\",\"ADV-SLOT-\"],[\"div\",\"YFBMSN\"],[\"div\",\"google_dfp_\"],[\"div\",\"MarketGid\"]],gi=function(){function n(t){this.G={},this.Config=t,this.s={F:0,Z:0,Y:0},this.Ra=this.Na(),this.ba=[]}return n.prototype.f=function(t){return this.G[t]},n.prototype.Ma=function(){var t=[];t.push(V(yt,!0,JSON.stringify(this.s)));var n,i=B();for(n in i)t.push(V(n,i[n].A,\"STORED:\"+JSON.stringify(i[n].B)));i=this.G,ai=B();for(var e in i)ai&&ai[e]?ai[e].A===i[e]?ai[e].B+=1:(ai[e].A=i[e],ai[e].B=1):ai[e]={A:i[e],B:1};for(e in ai)i[e]||delete ai[e];if(e=JSON.stringify(ai),G(Zt))try{sessionStorage._353_1119062411120848=e}catch(t){}return A(document.cookie,kt)||(document.cookie=kt+\"=1; domain=\"+ci+\"; path=/\"),t},n.prototype.ja=function(){for(var n=[],i=new Date,e=1;6>=e;e++){var r=e+\":\"+i.getMonth()+\":\"+e+\":\"+i.getDate()+\":\"+e+\":\"+i.getHours()%2+\":\"+e,o=Mt+\"=\"+e+\"&ad_channel=1\";r=\"//hxyzhas.g00.\"+new fn(t.location.href).ioortegniamodt()+\"/g00/\"+encodeURIComponent(t.btoa(r))+\"/ad?\"+o,n.push(r)}return n},n.prototype.Na=function(){for(var t=[],n=this.Config.iadb.icolbdaslru_k?this.Config.iadb.icolbdaslru_k.slice():this.Config.iadb.isabnoitceriderelbanesrotcetedkniltpircsde?this.ja():hi.slice(),i=di.slice(),e=0;e<this.Config.iadb.iircsdekcolbmunsrotcetedkniltp;e++)t.push(z(\"track\",n,!1,s(),!1));for(e=0;e<this.Config.iadb.isdekcolbnamregmunsrotcetedkniltpirc;e++)t.push(z(\"track\",i,void 0,void 0,void 0));for(e=0;e<this.Config.iadb.ihtnemelemunsrotcetededi;e++)t.push(I());for(e=0;e<this.Config.iadb.iidekcolbmunsrotcetedgm;e++)t.push(X());return this.s.F=t.length,t},n.prototype.Oa=function(){var t=[],n=this.Config.iadb.isabnoitceriderelbanesrotcetedkniltpircsde?this.ja():hi.slice();0<this.Config.iadb.isdekcolbnamregmunsrotcetedkniltpirc&&(n=n.concat(di));for(var i=0;i<n.length;i++)t.push(z(\"track\",n,void 0,void 0,void 0));return this.s.F+=t.length,t},n.prototype.Ga=function(t){this.Ja(t),this.Ha(t),this.Ia(t)},n.prototype.Ja=function(t){function n(n,e){i.G[n]=e,t(V(n,e))}var i=this;Xt.u(function(t){return n(tt,t)}),mi.u(function(t){return n(et,t)}),li.u(function(t){return n(K,t)})},n.prototype.Ha=function(t){for(var n=this,i=0;i<this.s.F;i++)this.Ra[i].then(function(i){return n.ga(i,t)})},n.prototype.Ia=function(n){var i=this;this.Config.iadb.ilufelbanenoitcetedl&&(this.ba=this.Oa(),t.addEventListener(\"load\",c(function(){for(var t=0;t<i.ba.length;t++)i.ba[t].then(function(t){return i.ga(t,n)})})))},n.prototype.ga=function(t,n){if(this.s.Z++,t[St]){var i=++this.s.Y;!this.G[pt]&&i>=this.Config.iadb.inoitceteddlohserht&&(this.G[pt]=!0)}n(t)},n}();[si,hi,di].forEach(function(n){return n.forEach(function(n,i,e){return e[i]=t.atob(n)})});try{t[P]||y(P,{})}catch(t){}try{t[U]||y(U,{})}catch(t){}try{t.IXC_353_1119062411120848||y(\"IXC_353_1119062411120848\",{})}catch(t){}var wi=function(){function n(t){var n;this.i=(n={},n[St]=!1,n[Tt]=0,n[jt]=[],n),this.Ka=Date.now(),this.$=this.da=this.K=!1,this.Config=t,this.c=new gi(t),t.iadb.iceriderelbasidnoissesrofnoit&&!A(document.cookie,\"_353_1119062411120848\")&&(document.cookie=\"_353_1119062411120848=1; domain=\"+ci+\"; path=/\"),this.T=this.Config.iadb.iyrotsihelbanenoitceriderrof&&this.Ba()}return n.prototype.V=function(){var t=this.Config.iadb.ierelbanenoitcerid;return A(document.cookie,\"_353_1119062411120848\")&&(t=!1),t},n.prototype.Ua=function(){var t,n=this.$=!0;try{R(this.Config.iadb.ivetatselbaira,this.K?this.Config.iadb.iolbetatseulavdekc:this.Config.iadb.ilbtonetatseulavdekco),R(this.Config.iadb.iycnetalelbairav,this.i[Tt]);var i=g(this.i,this.Config.iadb.iotelbairavlabolgskcabllacretsiger);this.K&&!this.c.f(et)&&!this.c.f(K)&&i&&this.V()&&(this.N(!1),this.aa()),n=!1}catch(i){this.i[jt].push((t={},t[Ht]=nt,t[St]=!0,t)),this.N(!0),this.V()&&this.aa(),n=!1}finally{n&&this.V()&&this.aa()}},n.prototype.N=function(n){if(this.da){this.da=!0,this.Ca(n),n=this.Config.iadb.itemeletdbatniopdneyr;var i=this.i;if(n)try{var e=[];e=i[jt]&&(i[St]?i[jt]:i[jt].filter(C)),ri[St]&&e.push(ri);var r={adbType:[i[St]?Lt:gt],otherData:JSON.stringify(e),clientIpAddr:\"\",userAgent:navigator.userAgent,pageUrl:t.location.href,detectionTime:i[Tt]},o={data_stream_type:\"adb\",json_data:JSON.stringify(r),generated_timestamp_msec:Date.now()};t.navigator.sendBeacon?t.navigator.sendBeacon(n,JSON.stringify(o)):x({method:\"POST\",url:n,body:o,async:!0,onload:void 0,onerror:void 0,onchange:void 0,S:[{ianem:\"Content-type\",Za:\"text/plain\"}]})}catch(t){}}},n.prototype.Ca=function(t){var n,i;this.Config.iadb.iyrotsihelbanenoitceriderrof&&this.i[jt].push((n={},n[Ht]=mt,n[St]=!0,n)),this.Config.iadb.ilufelbanenoitcetedl&&(this.i[jt].push((i={},i[Ht]=bt,i[St]=!0,i)),t&&(this.i[jt]=this.i[jt].concat(this.c.Ma())))},n.prototype.Ba=function(){var t,n=B(),i=this.Config.iadb.irotsihmundlohserhty;return n[at]&&n[at].A&&n[at].B>=i&&(t=at),n[pt]&&n[pt].A&&n[pt].B>=i&&(t=t?t+\":\"+pt:pt),n[ct]&&n[ct].A&&(t=t?t+\":\"+ct:ct),t},n.prototype.Da=function(){var t=!1;if(this.$){var n=this.c.s;n.Z!==n.F||this.Config.iadb.ilufelbanenoitcetedl&&(void 0===this.c.f(lt)||void 0===this.c.f(st)||void 0===this.c.f(ht)||void 0===this.c.f(dt)||void 0===this.c.f(at)||void 0===this.c.f(ct)||void 0===this.c.f(vt))||(t=!0)}return t},n.prototype.Pa=function(){var t,n=this.Config.iadb.iircsdekcolbmunsrotcetedkniltp+this.Config.iadb.ihtnemelemunsrotcetededi+this.Config.iadb.iidekcolbmunsrotcetedgm+this.Config.iadb.isdekcolbnamregmunsrotcetedkniltpirc,i=this.c.s,e=this.Config.iadb.inoitceteddlohserht,r=void 0!==this.c.f(tt)&&void 0!==this.c.f(et)&&void 0!==this.c.f(K);return!0===this.c.f(tt)||!0===this.c.f(et)||!0===this.c.f(K)||i.Y>=e||this.T&&r?(this.T&&this.i[jt].push((t={},t[Ht]=Rt,t[St]=!0,t[Yt]=this.T,t)),Lt):n===i.Z&&i.Y<e&&!1===this.c.f(tt)?gt:wt},n.prototype.Aa=function(){var n=this;t.addEventListener(\"unload\",function(){return n.N(!0)}),this.c.Ga(function(t){n.i[jt].push(t),n.$?!n.da&&n.Da()&&n.N(!0):(t=n.Pa())!==wt&&(n.K=t===Lt,n.i[St]=n.K,n.i[Tt]=Date.now()-n.Ka,n.Ua())})},n.prototype.aa=function(){m()},n}();if(t===top&&!new RegExp(Dt,\"i\").test(t.location.pathname)&&Kn.iadb.idelbanenoitcete){var Ei=c(function(){new wi(Kn).Aa()}),Ni=Kn.iadb.ietedtratsemitnoitc;Ni?\"string\"==typeof Ni?t.addEventListener(Ni,Ei):t.setTimeout(Ei,Ni):Ei()}}();var n=t.IXC_353_1119062411120848;n&&n.Init||(n=t.INSTART),n.Init(null)}try{t.IXC_353_1119062411120848.ComputeAll=\"CENOME_PLACEHOLDER\"}catch(t){}}try{Ea()}catch(t){try{var nb=window.IXC_353_1119062411120848;nb&&nb.na&&nb.na(t)}catch(t){}}//]]>\n" +
"        </script>\n" +
"    <script>Object.prototype.watch||(Object.defineProperty(Object.prototype,\"watch\",{value:function(n,t){var i=this[n],r=function(){return i},u=function(r){var u=i;return i=r,u!=r?i=t.call(this,n,u,r):i};delete this[n]&&(Object.defineProperty?Object.defineProperty(this,n,{get:r,set:u}):Object.prototype.__defineGetter__&&Object.prototype.__defineSetter__&&(Object.prototype.__defineGetter__.call(this,n,r),Object.prototype.__defineSetter__.call(this,n,u)))},enumerable:!1}),Object.defineProperty(Object.prototype,\"unwatch\",{value:function(n){var t=this[n];delete this[n];this[n]=t},enumerable:!1}));window.performance&&window.performance.mark&&(window.performance.mark(\"Ars-end\"),window.performance.measure&&window.performance.measure(\"InstartExecutionTime\",\"Ars-begin\",\"Ars-end\"))</script>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n";
String S2="            <link rel=\"preload\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/25d540.woff2\" as=\"font\" type=\"font/woff2\" crossorigin=\"anonymous\"/>\n" +
"<link rel=\"preconnect\" href=\"img-s-msn-com.akamaized.net\" /><link rel=\"preconnect\" href=\"c.msn.com\" /><link rel=\"preconnect\" href=\"c.msn.cn\" /><link rel=\"preconnect\" href=\"https://www.bing.com\" /><link rel=\"preconnect\" href=\"//otf.msn.com\" /><link rel=\"dns-prefetch\" href=\"img-s-msn-com.akamaized.net\" /><link rel=\"dns-prefetch\" href=\"c.msn.com\" /><link rel=\"dns-prefetch\" href=\"c.msn.cn\" /><link rel=\"dns-prefetch\" href=\"https://www.bing.com\" /><link rel=\"dns-prefetch\" href=\"//otf.msn.com\" /><link rel=\"canonical\" href=\"https://www.msn.com/zh-tw/\" /><meta name=\"msapplication-TileColor\" content=\"#224f7b\"/><meta name=\"msapplication-TileImage\" content=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/1f/08ced4.png\"/><meta name=\"msapplication-config\" content=\"none\"/><meta name=\"robots\" content=\"noydir,noodp\"/><link rel=\"chrome-webstore-item\" href=\"https://chrome.google.com/webstore/detail/msn-homepage-bing-search/aodojjhnfnfhaplflfohfddffmjkdjak\" />        <title>msn 台灣｜Windows 10, Windows app 應用程式, Microsoft Store 商城, hotmail, outlook, skype, 即時新聞</title>\n" +
"<meta name=\"description\" content=\"MSN台灣提供Windows 10 升級資訊、Windows app 應用程式推薦與下載連結，以及Surface等微軟商城 Microsoft Store 推薦商品。您也可以閱讀選舉、政治、運動、名人、財經、天氣、旅遊、健康、星座等熱門新聞，並結合 Outlook、Facebook、Twitter、Hotmail 與 Skype 等實用工具。\"/>\n" +
" <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,maximum-scale=2.0\" />\n" +
"\n" +
"<link rel=\"stylesheet\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/zh-tw/homepage/_sc/css/b443689a-3b49c9c2/direction=ltr.locales=zh-tw.themes=start.dpi=resolution14x/61-cc157a-7671518b/af-37d959-382170f/31-c31fb0-68ddb2ab/49-481f80-7eae05f8/25-6efef1-fce9433e/f1-153e2c-bdb2961c/6e-d0a082-77515f0c/25-dd7b49-f58f55bd/47-65dfbf-8fd3dd03/18-56aa26-dbc6220a/2a-91f1d1-dd7daec7/b8-cbc6ea-793099c5/67-f5a030-5770e913/1e-ed96c4-74b5c9cc/b5-77bbe0-155dcdc6/15-ee8111-1a8ff8cd/d8-c523c0-70b73742/91-7bd6e1-5209838f/7c-4a4739-dc5e5fdd/51-157940-294d173b/eb-dfc493-882a8855/ae-0f4566-ee675a14/12-6e175b-a5200a3e/d4-d9c441-e0ed2b3d?ver=20190112_13811432&amp;fdhead=muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf&amp;ocid=mailsignout&amp;csopd=20190117002427&amp;csopdb=20190118225755\" type=\"text/css\" media=\"all\" /><script>(function(n){function i(i,r){try{var u=new n.FontFace(i,r,{}).load();t.push(u)}catch(f){}}var t=[];typeof n.FontFace==\"function\"&&i(\"ps_g\",\"url(//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/25d540.woff2)\")})(window),function(n,t){function h(n,i,r){typeof n!=\"string\"&&(r=i,i=n,n=t);i&&i.splice||(r=i,i=[]);n==it?a=!0:n==rt&&(v=!0);l(n,i,r,!1,!1)}function l(n,t,i,r,f,e){var s,y;if(!n||!c[n]){var h=ot(n,t),o=h.dependencyNotFound,l=h.resolved;if(o){typeof u[o]==\"undefined\"&&(u[o]=[]);u[o].push(e||{i:n,d:t,f:i,r:r,s:f});return}s=typeof i==\"function\";y=v&&a&&s&&!f;y?et(n,i,l,r):ft(s,n,i,l,r)}}function ft(n,t,i,r,u){var f;f=n?i.apply(null,r):i;d(t,f,u)}function et(n,t,i,r){setTimeout(function(){var u=t.apply(null,i);d(n,u,r)},1)}function d(t,i,r){r&&(i={});t&&(i?(c[t]=i,f.push(t),g()):n.console&&console.error(\"Dependencies resolved, but object still not defined (or is otherwise falsey). id:\"+t+\"; typeof obj: \"+typeof i))}function g(){var t,s,h,i,o,c,r,n;if(e)e&&(e=2);else{t=[];do{for(e=1,h=f.length,i=0;i<h;i++)o=f[i],c=u[o]||[],t=t.concat(c),delete u[o];for(f=[],s=t.length,r=0;r<s;r++)n=t[r],l(n.i,n.d,n.f,n.r,n.s,n);t=[]}while(e>1);e=0}}function ot(n,t){for(var e,i=[],r,o=t?t.length:0,u=0;u<o;u++){var f=t[u],s=c[f],h=typeof s!=\"undefined\";if(!h){if(e=st(n,f),e){i.push(e);continue}r||(r=f);break}i.push(s)}return o===i.length?{resolved:i}:{dependencyNotFound:r}}function st(i,r){var f=k.exec(r),e,u;if(f){if(e=f[1],u=n[e],u!==t)return u;s||(s=setTimeout(nt,w))}}function nt(){var i,r,e,o,h;s=0;i=!1;for(r in u)e=k.exec(r),e&&(o=e[1],h=n[o],h!==t?f.push(r):i=!0);i&&!s&&(s=setTimeout(nt,w));f.length&&g()}function ht(n,t,i){if((typeof n!=\"object\"||n&&n.splice)&&(i=t,t=n,n={}),t&&t.splice||(i=t,t=[]),ct(n.js),i){var r,u=n.synchronous||!1;l(r,t,i,!0,u)}}function ct(n){if(typeof n==\"string\")tt(n);else if(n)for(var t=0;t<n.length;t++)tt(n[t])}function tt(n){if(!b[n]){b[n]=1;var i=o.getElementsByTagName(\"script\")[0],t=o.createElement(\"script\");t.src=n;t.onload=t.onreadystatechange=function(){this.readyState&&this.readyState!=\"loaded\"&&this.readyState!=\"complete\"||(t.onload=t.onreadystatechange=null,t.parentNode&&t.parentNode.removeChild(t))};i.parentNode.insertBefore(t,i)}}function lt(n){return ut?n?i.now():Math.round(i.now()):new Date-y}var it=n._jsLoaderAsyncCanary||\"c.dom\",rt=\"c.pageReveal\",a=!1,v=typeof n._jsLoaderRevealMode==\"undefined\"?!0:n._jsLoaderRevealMode,i=n.performance,ut=i&&typeof i.now==\"function\",r=\" ----- \",y=((i||{}).timing||{}).navigationStart||+new Date,o=n.document,p=null;try{p=n.localStorage}catch(at){}var c={date:Date,document:o,image:n.Image,localStorage:p,location:o&&o.location,navigator:navigator,pageStart:y,pageTime:lt,screen:n.screen,window:n},u={},f=[],e,w=50,s,b={},k=/^window\\.(.+)$/;h.amd={jQuery:1};h.is=function(n){return typeof c[n]!=\"undefined\"};n.define=h;n.require=ht;h.showUserMarks=function(){var n=[\"Mark Name\"+r+\"Start time in ms\"];return i.getEntriesByType(\"mark\").forEach(function(t){n.push(t.name+r+t.startTime+\"ms\")}),n.join(\"\\n\")};h.showUserMeasures=function(){var n=[\"Measure name\"+r+\"Start time in ms\"+r+\"Duration in ms\"];return i.getEntriesByType(\"measure\").forEach(function(t){n.push(t.name+r+t.startTime+\"ms\"+r+t.duration+\"ms\")}),n.join(\"\\n\")}}(window);define(\"perfPing\",function(){function n(n){require([\"w3cTimer\"],n)}function t(t){n(function(n){n.mark(t)})}function i(t){n(function(n){n.fire();typeof t==\"function\"&&t(n.payload)})}return{setMarker:t,getPayLoad:i}});define(\"perfMarker\",[\"window\"],function(n){function o(){return s?t.now()|0:r&&c()-r}function f(n){return typeof n==\"function\"}var t=n.performance,i;if(!t)return i=function(){},i.now=function(){return 0},i;var s=f(t.now),h=f(t.mark),r=(t.timing||{}).navigationStart,u=n.Date,c=f(u.now)?u.now:function(){return+new u},l,e=n._pageTimings||(n._pageTimings={}),a=!1,i=function(n,i,u,f){var s,c;typeof n!=\"string\"||i&&e[n]&&!u||(s=typeof i==\"number\",s||(h&&t.mark(n),l&&console.timeStamp(n)),(i||a)&&(c=s?Math.round(i-(f?0:r)):o(),isNaN(c)||(e[n]=c)))};return i.now=o,n._perfMarker=i,i});define(\"perfMeasure\",[\"window\"],function(n){function f(){}function r(n,i,r,f){var e=\"string\",s,h,o;typeof n===e&&typeof i===e&&typeof r===e&&(s=t.getEntriesByName(i),h=t.getEntriesByName(r),s.length>=1&&h.length>=1&&(t.measure(n,i,r),f&&(o=t.getEntriesByName(n),o.length>=1&&(u[n]=Math.round(o[0].duration)))))}function e(){require([\"c.onload\"],function(){i(\"TimeFordomComplete\",\"domLoading\",\"domComplete\");i(\"TimeFordomInteractive\",\"domLoading\",\"domInteractive\");i(\"TimeFordomContentLoaded\",\"domContentLoadedEventStart\",\"domContentLoadedEventEnd\");i(\"TimeForloadEvent\",\"loadEventStart\",\"loadEventEnd\")})}function i(n,i,r){try{t.measure(n,i,r)}catch(u){console&&console.error(\"Error while measuring native marker: \"+n+\", error: \"+u)}}var u=n._pageTimings||(n._pageTimings={}),t=n.performance;return typeof t==\"object\"&&typeof t.measure==\"function\"&&typeof t.getEntriesByName==\"function\"?(e(),n._perfMeasure=r,r):f});define(\"evaluate\",function(){return window.JSON&&window.JSON.parse||function(n){return eval(\"(\"+n+\")\")}});define(\"headData\",[\"evaluate\",\"document\"],function(n,t){var r=t.getElementsByTagName(\"head\")[0],i,u,f;return r?(i={},u=r.getAttribute(\"data-js\"),u&&(i=n(u)),f=r.getAttribute(\"data-client-settings\"),f&&(i.clientSettings=n(f)),i.xdid=r.getAttribute(\"data-xd-id\"),i.locale=t.getElementsByTagName(\"html\")[0].getAttribute(\"lang\").toLowerCase(),i.currentFlights=((/f:\\s*([^;]+)/i.exec(r.getAttribute(\"data-info\"))||{})[1]||\"\").toLowerCase(),i.userOptOut=((/userOptOut:\\s*([^;]+)/i.exec(r.getAttribute(\"data-info\"))||{})[1]||\"\").toLowerCase(),i):{}});define(\"requestPageRevealCallback\",[\"window\",\"headData\"],function(n,t){function u(u){typeof u==\"function\"&&(t.ispreload?i?u(i):n.require([\"c.pageReveal\"],function(n){i=n;u(i)}):u(r))}var i=null,r={didPreload:!1,timeTakenForRevealInMs:0};return u})</script><script async=\"async\"  src=\"//acdn.adnxs.com/ast/ast.js\"></script><script async=\"async\"  src=\"//static-global-s-msn-com.akamaized.net/hp-eas/_h/975a7d20/webcore/externalscripts/jquery/jquery-2.1.1.min.js\" crossorigin=\"anonymous\"></script><script async=\"async\"  src=\"//static-global-s-msn-com.akamaized.net/hp-eas/zh-tw/homepage/_sc/js/b443689a-ea9cb139/direction=ltr.locales=zh-tw.themes=start.dpi=resolution14x/97-9a8c47-68ddb2ab/e1-557388-3ad0ecc7/7e-312127-e72da089/fe-53353d-68ddb2ab/d9-222405-e211f3f8/9e-a7a255-68ddb2ab/a9-ac9b58-68ddb2ab/6c-23e9a8-cae48929/9c-627b70-1988ecdd/30-ea66ac-35c4b177/f1-d6770c-68ddb2ab/a7-636d60-35c4b177/fe-718b87-243aa040/42-dd91f1-d397ee68/9e-639daf-68ddb2ab/85-0f8009-68ddb2ab?ver=20190112_13811432&amp;fdhead=muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf&amp;ocid=mailsignout&amp;csopd=20190117002427&amp;csopdb=20190118225755\" crossorigin=\"anonymous\"></script><script>define(\"headInfo\",[\"document\"],function(n){function l(n){var r={},i,t,u;if(!n)return r;for(n=n.substring(1,n.length-1),i=n.split(\",\"),t=0,u=i.length;t<u;t++)if(t in i){var e=i[t],f=e.split(\":\"),o=f.splice(0,1),s=f.join(\":\").replace(/^\\s+/,\"\").replace(/\\s+$/,\"\");r[o[0].replace(/^\\s+/,\"\").replace(/\\s+$/,\"\")]=s}return r}var e=n.getElementsByTagName(\"head\")[0],r,u,i,t,o;if(e){if(r={},u=e.getAttribute(\"data-info\"),u)for(i=u.split(\";\"),t=0,o=i.length;t<o;t++)if(t in i){var h=i[t],s=h.split(\":\"),c=s.splice(0,1),f=s.join(\":\");r[c[0]]=f.charAt(0)===\"{\"?l(f):f.replace(/^\\s+/,\"\").replace(/\\s+$/,\"\")}return r}return{}});define(\"deviceGroup\",function(){return{isTmx:1,isPc:1,isWebKit:1,isChrome:1}});define(\"measure\",function(){return function(n,t){var i=window.getComputedStyle(n);return t?i[t]||i.getPropertyValue(t):function(n){return i[n]||i.getPropertyValue(n)}}});define(\"deviceInit\",function(){function u(i){return n[t(i)]}function f(i){return n[t(i)]==\"true\"}var n={},t=function(n){return n.toUpperCase()},i,r={capability:u,isCapable:f};return function(u){var f,e;if(i)throw\"device was already initialized.\";for(f in u)e=u[f],n[t(f)]=e;i=1;define(\"device\",r)}});define(\"requestAnimationFrame\",[\"window\"],function(n){return function(){return n.requestAnimationFrame||n.webkitRequestAnimationFrame||n.mozRequestAnimationFrame||n.oRequestAnimationFrame||n.msRequestAnimationFrame||function(t){typeof t==\"function\"&&n.setTimeout(t,16.7)}}()});define(\"requestAnimationFrameBackground\",[\"window\",\"requestAnimationFrame\",\"headData\"],function(n,t,i){function u(i){typeof i==\"function\"&&(n.define.is(r)?t(i):i())}var r=\"c.pageReveal\";return i.ispreload&&!n.define.is(r)?u:t});define(\"mediator\",function(){function i(n){return t[n]||(t[n]=new r),t[n]}function r(){var n={};return{pub:function(t,i){var u=n[t],r;if(u)for(r=0;r<u.length;r++)u[r](i)},sub:function(t,i){if(typeof i==\"function\"){var r=n[t];r||(r=[],n[t]=r);r.push(i)}},unsub:function(t,i){var u=n[t],r;if(u)for(r=0;r<u.length;r++)u[r]===i&&u.splice(r--,1)}}}var n=new r,t={};return{pub:n.pub,sub:n.sub,unsub:n.unsub,pubChannel:function(n,t,r){i(t).pub(n,r)},subChannel:function(n,t,r){i(t).sub(n,r)},unsubChannel:function(n,t,r){i(t).unsub(n,r)}}});define(\"mediaQueryMatch\",[\"device\",\"deviceGroup\",\"mediator\",\"requestAnimationFrame\",\"window\"],function(n,t,i,r,u){function s(){function e(n,t){var i=n.exec(t);return i?i[1]*16:null}function n(){r(function(){t=u.innerWidth;f=u.innerHeight;for(var n=0;n<o.length;n++)h(o[n])})}function h(n){var r=p(n),t,i;if(n.matches!=r)for(n.matches=r,i=0;t=n.queryFunctions[i];i++)typeof t==\"function\"&&t()}function p(n){var i=!n.maxWidth||t<=n.maxWidth,r=!n.minWidth||t>=n.minWidth,u=!n.maxHeight||f<=n.maxHeight,e=!n.minHeight||f>=n.minHeight;return i&&r&&u&&e}function c(n){return{isMatching:function(){return!1},addListener:function(){},matches:!1,media:n,queryFunctions:[]}}var l=/min\\-width\\:\\s*(\\d+(\\.\\d+)?)/,a=/max\\-width\\:\\s*(\\d+(\\.\\d+)?)/,v=/min\\-height\\:\\s*(\\d+(\\.\\d+)?)/,y=/max\\-height\\:\\s*(\\d+(\\.\\d+)?)/,t,f,o=[],s;return require([\"jquery\"],function(t){t(u).resize(function(){clearTimeout(s);s=setTimeout(n,50)});require([\"c.deferred\"],n);setTimeout(n,500);i.subChannel(\"update\",\"mediaQuery\",n)}),function(i){if(!i)return c(i);var r={addListener:function(n){typeof n==\"function\"&&r.queryFunctions.push(n)},isMatching:function(){return n(),r.matches},matches:!1,media:i,queryFunctions:[]};return(r.minWidth=e(l,i),r.maxWidth=e(a,i),r.minHeight=e(v,i),r.maxHeight=e(y,i),!r.minWidth&&!r.maxWidth&&!r.minHeight&&!r.maxHeight)?c(i):(t=u.innerWidth,f=u.innerHeight,h(r),o.push(r),r)}}function h(n){var t=f(n);return t.isMatching=function(){return t.matches},t}var f=u.msMatchMedia||u.matchMedia,e=f?h:null,o=n.isCapable(\"UseCustomMatchMedia\");return!o&&e||s()});define(\"scaledView\",[],function(){return{addListener:function(){},removeListener:function(){},isScaled:function(){return!1}}});require([\"measure\",\"scaledView\",\"document\"],function(n,t,i){function u(){r=f.rem=parseFloat(n(i.getElementsByTagName(\"head\")[0],\"font-size\"))}function f(n){return n*r}function e(n){return n/r}var r;t.addListener(u);u();define(\"remToPixel\",function(){return f});define(\"pixelToRem\",function(){return e})});define(\"viewAwareInit\",[\"deviceGroup\",\"pageTime\",\"mediaQueryMatch\",\"document\",\"remToPixel\"],function(n,t,i,r){return function(t){function f(n,t){var r,u,f;n&&(r=n.match(/calc\\((.*?)\\)/),r&&r.length==2&&(n=n.replace(r[0],eval(r[1]))),u=i(n),f=u.isMatching(),f&&(e=t),u.addListener(function(){u.matches&&s(t)}),h.push({mq:u,viewValue:t}))}function s(n){e=n;for(var t=0;t<o.length;t++)o[t](e)}var u={NONE:0,SIZE1COLUMN:1,SIZE2COLUMN:2,SIZE3COLUMN:4,SIZE4COLUMN:8,SIZE12COLUMN:3,SIZE23COLUMN:6,SIZE34COLUMN:12,SIZE234COLUMN:14,SIZE1ROW:256,SIZE1ROWSIZE1COLUMN:257,SIZE1ROWSIZE2COLUMN:258,SIZE1ROWSIZE3COLUMN:260,SIZE1ROWSIZE4COLUMN:264,SIZE2ROW:512,SIZE2ROWSIZE1COLUMN:513,SIZE2ROWSIZE2COLUMN:514,SIZE2ROWSIZE3COLUMN:516,SIZE2ROWSIZE4COLUMN:520,ALL:783},o=[],h=[],e=n.isMobile?u.SIZE1ROWSIZE1COLUMN:u.SIZE2ROWSIZE4COLUMN;f(t.size1rowsize1column,u.SIZE1ROWSIZE1COLUMN);f(t.size2rowsize1column,u.SIZE2ROWSIZE1COLUMN);f(t.size1rowsize2column,u.SIZE1ROWSIZE2COLUMN);f(t.size2rowsize2column,u.SIZE2ROWSIZE2COLUMN);f(t.size1rowsize3column,u.SIZE1ROWSIZE3COLUMN);f(t.size2rowsize3column,u.SIZE2ROWSIZE3COLUMN);f(t.size1rowsize4column,u.SIZE1ROWSIZE4COLUMN);f(t.size2rowsize4column,u.SIZE2ROWSIZE4COLUMN);s(e);define(\"viewAware\",{listen:function(n){typeof n==\"function\"&&(o.push(n),n(e))},views:u,currentView:function(){return e}})}});define(\"screenDpiImpl\",[\"window\"],function(n){return function(){return n.devicePixelRatio||1}});define(\"dpi\",[\"screenDpiImpl\",\"headData\",\"measure\",\"deviceGroup\",\"document\",\"window\",\"location\"],function(n,t,i,r,u,f,e){var v=t.dpi||1,o={screen:1,detected:t.ddpi,override:t.dpio,forceServerDpi:t.forcedpi||!(typeof navigator.msManipulationViewsEnabled==\"undefined\"?!0:navigator.msManipulationViewsEnabled),server:v,client:v,dpiMultiplier:1,sizeMultiplier:1,refresh:!1},h,p,s,c,y,l,a;if(e.href.indexOf(\"nodpi=1\")==-1&&(o.screen=n(o)),h=r.isMobile?[1.5,2.25,2.4,2.7]:[1,1.4,1.8,2],p=/<link[^>]*rel=\"stylesheet\"[^>]*href=\"([^\"]*)\"[^>]*\\/>/ig,o.forceServerDpi===!0)t.dpi=t.ddpi;else if(o.server!=o.screen){for(s=0;s<h.length;s++)if(c=h[s],o.screen<=c||s==h.length-1){o.dpiMultiplier=(o.client=c)/o.server;break}o.client!=o.server&&(y=\"dpio\",l=y+\"=\",t&&t.clientSettings&&!t.clientSettings.functionalonly_cookie_experience&&(u.cookie=l+o.client+\";path=/\"),o.refresh&&e.href.indexOf(\"dpir=1\")==-1&&e.href.indexOf(l)==-1&&require([\"navigation\"],function(n){var t=e.href.replace(/dpio=[\\d.]*/,\"\");t+=(t.indexOf(\"?\")==-1?\"?\":\"&\")+\"dpir=1\";n.navigate(t,!0)}))}return a=parseFloat(i(u.documentElement,\"font-size\")),a&&(o.sizeMultiplier=a/10/o.client),o});define(\"escape\",[\"window\"],function(n){function r(t){return t!=null&&n.encodeURI(t)||\"\"}function u(t){return t!=null&&n.encodeURIComponent(t)||\"\"}function f(n){return n!=null&&(\"\"+n).replace(t,function(n){return i[n]||\"\"})||\"\"}var t=/[\"&'\\/<>]/g,i={'\"':\"&quot;\",\"&\":\"&amp;\",\"'\":\"&#39;\",\"/\":\"&#47;\",\"<\":\"&lt;\",\">\":\"&gt;\"};return{url:r,urlPart:u,html:f}});define(\"classList\",function(){function i(n){return t[n]||(t[n]=new RegExp(\"(\\\\s|^)\"+n+\"(\\\\s|$)\"))}function n(n,t){return n?n.classList?n.classList.contains(t):n.className?n.className.match(i(t)):!1:!1}function r(t,i){t&&(t.classList?t.classList.add(i):n(t,i)||(t.className+=\" \"+i))}function f(t,i){t&&(t.classList?t.classList.toggle(i):n(t,i)?u(t,i):r(t,i))}function u(t,r){t&&(t.classList?t.classList.remove(r):n(t,r)&&(t.className=t.className?t.className.replace(i(r),\" \"):!1))}var t=[];return{add:r,remove:u,toggle:f,contains:n}});define(\"viewport\",[\"mediator\",\"requestAnimationFrame\",\"window\",\"document\"],function(n,t,i,r){function kt(){l=at();a=lt();(l!=s||a!=f)&&(u=!0,e=!0)}function g(){return{left:s,right:et,top:f,bottom:ot,width:h,height:c}}function ht(){u&&(s=l||at(),f=a||lt(),l=a=null,!nt&&f>yt&&(nt=!0,setTimeout(function(){define(\"c.scrolled\",1)},ft)));o&&(h=i.innerWidth||r.documentElement.clientWidth,c=i.innerHeight||r.documentElement.clientHeight);(u||o)&&(et=s+h,ot=f+c);u=o=!1}function w(){if(e){pt=new Date;e=!1;var i=o,r=u,l=h,a=c,v=s,y=f;ht();i=i&&(a!=c||l!=h);r=r&&(v!=s||y!=f);i||r?(b||(b=setTimeout(function(){b=0;var t=g();n.pub(tt,t);r&&n.pub(it,t);i&&n.pub(rt,t)},ft)),dt(),setTimeout(w,ut)):t(w)}else t(w)}function dt(){v&&(st=+new Date,y||(y=setTimeout(function t(){y=v=!1;var i=new Date-st;i>d?n.pub(bt,k):y=setTimeout(t,d-i)},d)))}function ct(){u=!0;o=!0;e=!0}function lt(){if(typeof pageYOffset!=\"undefined\")return pageYOffset;var t=r.body,n=r.documentElement;return n=n.clientHeight?n:t,n.scrollTop}function at(){if(typeof i.pageXOffset!=\"undefined\")return i.pageXOffset;var t=r.body,n=r.documentElement;return n=n.clientWidth?n:t,n.scrollLeft}function gt(n){for(var i=null,t;n&&n.nodeName!=\"BODY\"&&n.nodeName!=\"HTML\";){if(t=n.getAttribute(wt),t){t=t.split(\";\");i={x:parseInt(t[0])||0,y:parseInt(t[1])||0};break}n=n.parentNode}return i}function ni(n,t,i,r){var u=n.getBoundingClientRect();if(!u.top&&!u.right&&!u.bottom&&!u.left)return 0;r||(r=g());var o=r.width*(t||0),s=r.height*(i||0),h={left:-o,right:r.width+o,top:0-s,bottom:r.bottom+s},f={left:u.left,right:u.right,top:u.top,bottom:u.bottom},e=gt(n.parentNode);return e&&(f.left+=e.x,f.right+=e.x,f.top+=e.y,f.bottom+=e.y),ti(h,f)}function ti(n,t){return!(t.left>n.right||t.right<n.left||t.top>n.bottom||t.bottom<n.top)}function vt(n,t){i.addEventListener(n,t,!1)}var e=!0,u=!0,o=!0,l=null,a=null,yt=10,nt,tt=\"viewport_change\",it=\"viewport_scroll_change\",rt=\"viewport_size_change\",ut=parseInt(\"\")||200,ft=50,b,s=0,et=0,f=0,ot=0,h=0,c=0,pt,wt=\"data-offset\",k=\"\",v=!1,y=0,d=1e3,st,bt=\"ViewabilityUpdatedEvent\",p;return ht(),require([\"c.dom\"],ct),p=\"c.deferred\",require([p],function(){i.setInterval(kt,ut);t(w)}),require([p],ct),vt(\"resize\",function(){v=!0;k=\"resize\";o=!0;e=!0}),vt(\"scroll\",function(){v=!0;k=\"scroll\";u=!0;e=!0}),{getDimensions:function(){return g()},changeEventName:tt,sizeChangeEventName:rt,scrollChangeEventName:it,isInViewport:ni,deferredCanaryName:p}});require([\"window\"],function(n){n._llic=function(n){require([\"imgSrc\"],function(t){t.checkLoad(n)})}});define(\"imgSrc\",[\"viewAware\",\"measure\",\"dpi\",\"evaluate\",\"mediator\",\"viewport\",\"classList\",\"window\",\"document\",\"image\",\"headData\",\"logging\",\"perfMarker\"],function(n,t,i,r,u,f,e,o,s,h,c,l){function ai(){u.sub(f.changeEventName,function(n){var t=Math.abs(n.left-p.left+n.width-p.width),i=Math.abs(n.top-p.top+n.height-p.height);(t>vt()||i>yt())&&(vt=function(){return n.width/4},yt=function(){return n.height/4},p=n,b())})}function vi(){w=[]}function yi(n,t){var i=n.getAttribute(t);if(i)try{return r(i)}catch(u){l.error(\"[imgSrc] error evaluating the '\"+t+\"' attribute: '\"+i+\"'\",u)}}function pi(n,t){var u=!1,i=ht(n),r;return i&&i.src&&t&&typeof t.find==\"function\"&&typeof t.filter==\"function\"&&(r=t.find(\"img[data-src]\").filter(function(){return this.imgSrcObj&&this.imgSrcObj.loadedSrc==i.src}),r.length&&(i.loadingSrc=i.src,n.imgSrcObj=i,ti(n,i,r[0]),u=!0)),u}function ht(n,t){var i=yi(n,ci),f,r,u;if(i){if(f=i.dpi||1,i=i[a]!==t?i[a]:i[v]!==t?i[v]:i[\"default\"],r=typeof i,r==\"string\")i={src:i};else if(r!=\"object\"||!i)return null;return i.dpi=f,i.src?(u=i.src.indexOf(\"//\"),u>0&&(i.src=i.src.substring(u)),i.src=di(i.src,fi)):i.src=bt,i}return null}function dt(n,t){var i,r;return kt?(n.onload=null,i=ht(n),i&&(r=wi(n,i,t),r&&k(n,i,!0)),r):!1}function wi(n,t,i){return kt==2?!0:t.load==\"wait\"||t.load==\"defer\"?!1:e.contains(n,\"wait\")?!1:e.contains(n,\"defer\")?!1:n.getAttribute(rt)?!1:gt(n)?ct(n,t)?(i||f.isInViewport(n,0,0))?!0:!1:!1:!1}function bi(t){var i=nt&&nt!=t;nt=t;switch(t){case n.views.SIZE1ROWSIZE1COLUMN:a=\"size1rowsize1column\";v=\"size1column\";break;case n.views.SIZE2ROWSIZE1COLUMN:a=\"size2rowsize1column\";v=\"size1column\";break;case n.views.SIZE1ROWSIZE2COLUMN:a=\"size1rowsize2column\";v=\"size2column\";break;case n.views.SIZE2ROWSIZE2COLUMN:a=\"size2rowsize2column\";v=\"size2column\";break;case n.views.SIZE1ROWSIZE3COLUMN:a=\"size1rowsize3column\";v=\"size3column\";break;case n.views.SIZE2ROWSIZE3COLUMN:a=\"size2rowsize3column\";v=\"size3column\";break;case n.views.SIZE1ROWSIZE4COLUMN:a=\"size1rowsize4column\";v=\"size4column\";break;default:a=\"size2rowsize4column\";v=\"size4column\"}i&&b()}function ki(n){return(n||s).getElementsByTagName(\"img\")}function b(n){var c,u,i;if(st){var s=\"TimeToLoadDeferredImagesStart\"+d,h=\"TimeToLoadDeferredImagesEnd\"+d,l=\"TimeForLoadDeferredImages\"+d;for(d++,o._perfMarker&&o._perfMarker(s),c=0,u=ki(n),i=0;i<u.length;i++){var t=u[i],r=ii(t),a=r&&r.load!=\"wait\"&&!e.contains(t,\"wait\")&&!t.getAttribute(rt)&&ct(t,r)&&(e.contains(t,\"defer\")||gt(t)&&f.isInViewport(t,oi,si));a&&(c++,k(t,r))}o._perfMarker&&o._perfMarker(h);o._perfMeasure&&o._perfMeasure(l,s,h)}}function gt(n){do{if(t(n,\"display\")==\"none\")return!1;n=n.parentNode}while(n&&n.nodeName!=\"BODY\");return!0}function di(n,t){var i=n.match(li);return i&&i[y]!=t?n.replace(i[0],i[0].replace(i[y],t)):n}function gi(n,t){var r=n.match(pt),u,i,f;return r&&(u=r[y]*t+.5|0,n=n.replace(r[0],r[0].replace(r[y],u))),i=n.match(wt),i&&(f=i[y]*t+.5|0,n=n.replace(i[0],i[0].replace(i[y],f))),n}function ni(n,t){t()}function nr(n,t,i){var r=g(n);t.src==r.loadingSrc&&(t.lowq&&i.loadingSrc==t.lowq?(t.lowqLoaded=!0,e.remove(n,at),k(n,t)):(n.src=t.src,e.remove(n,et),e.remove(n,ot),e.add(n,ft)))}function ti(n,t,r){var u=g(n);t.src==u.loadingSrc&&(u.loadedSrc=t.src,i.sizeMultiplier>1&&(n.width=r.width*i.sizeMultiplier+.5|0),n.removeAttribute(\"height\"),n.src=r.src,t.lowq&&r.loadingSrc==t.lowq?(t.lowqLoaded=!0,e.remove(n,at),k(n,t)):(e.add(n,ot),e.remove(n,ft),e.remove(n,et)))}function ct(n,t){if(!t||!t.src)return!1;var i=g(n);return i.loadedSrc!=t.src&&t.src!=i.loadingSrc}function ii(n,t){if(!n)return null;if(t)t.src||(t={src:t});else{if(t=ht(n),!t)return null;var r=t.dpi||1;r!=i.client&&(t.src=gi(t.src,i.client/r))}return t}function ri(n,t){n&&(t=ii(n,t),ct(n,t)&&k(n,t))}function g(n){var t=n.imgSrcObj;return t||n.nodeName!=\"IMG\"||(t={img:n,id:w.length},n.imgSrcObj=t,w[n.imgSrcObj.id]=t),t}function k(n,t){var r=g(n,t),u,i;r.isInViewport===undefined&&(r.isInViewport=!0);r.loadingSrc=t.src;t.w&&t.h?n.setAttribute(ut,\"width:\"+t.w+\"rem;height:\"+t.h+\"rem;\"):n.hasAttribute(ut)&&n.removeAttribute(ut);e.add(n,et);e.remove(n,ot);e.remove(n,ft);u=(t.lowqLoaded?null:t.lowq)||t.src;i=new h;i.onload=function(){i.onload=null;i.onerror=null;ni(n,function(){ti(n,t,i)},t)};i.onerror=function(){i.onload=null;i.onerror=null;ni(n,function(){nr(n,t,i)},t)};i.src=i.loadingSrc=u}var nt,a,v,tt=(c.clientSettings||{}).imgsrc||{},fi=tt.quality_high||60,tr=tt.quality_low||5,ei=tt.order_timeout||1e3,oi=1,si=1,hi=!1,it,d=0,lt=100*i.client,rt=\"data-noupdate\",ci=\"data-src\",ut=\"style\",ft=\"err\",et=\"loading\",ot=\"loaded\",at=\"lowq\",vt=function(){return 10},yt=function(){return 10},w=[],y=2,pt=/([?&]w=|_w)(\\d+)/,wt=/([?&]h=|_h)(\\d+)/,li=/([?&]q=|_q)(\\d+)/,bt=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAEALAAAAAABAAEAAAIBTAA7\",kt={all:0,auto:1,none:2}[(location.search.match(/[?&]llibf=([^&#]+)/i)||[])[1]]||1,p,st;return o._llic=dt,p=f.getDimensions(),n.listen(bi),st=!1,require([\"c.deferred\"],function(){st=!0;ai();b()}),o.loadDeferredImages=b,{go:ri,reset:ri,noUpdate:rt,data:bt,checkLoad:dt,isInViewport:f.isInViewport,loadInViewport:b,dataOffsetAttr:\"data-offset\",force:pi,clearImages:vi}});define(\"imageLoad\",[\"imgSrc\",\"classList\",\"document\",\"window\"],function(n,t,i,r){function a(){s();n.isInViewport?y():f(i.querySelectorAll(\"main img[data-src]\"),c)}function s(n){u(\".ip .swipenav>li:first-child+li img,.carousel .slides li+li img\",\"defer\",n);u(\".sip .swipenav>li:first-child+li img,.carousel .slides li+li img\",\"defer\",n);u(\".ip .swipenav>li+li+li img\",\"wait\",n);u(\".sip .swipenav>li+li+li img\",\"wait\",n);u(\".todaystripe .pipedheadlinelistwithimage img\",\"defer\",n)}function v(n,t){typeof n==\"string\"&&(n=i.querySelector(n));s(n);o(n,t)}function y(){e=!1;h(i.getElementById(\"precontent\"));f((i.getElementById(\"main\")||{}).childNodes,p);h(i.getElementById(\"aside\"))}function p(i){var r=!1,u;return!t.contains(i,\"mestripeouter\")&&i.querySelector(\"img[data-src]\")&&(u=n.isInViewport(i,0,0),u?(e=!0,o(i)):e&&(r=!0)),r}function h(t){var i=!1;return t&&t.querySelector(\"img[data-src]\")&&n.isInViewport(t,0,0)&&(i=!0,o(t)),i}function o(n,t){f(n.querySelectorAll(\"img[data-src]\"),function(n){c(n,t)})}function c(n){var i;return n&&(!n.src||!t.contains(n,\"loaded\")&&!t.contains(n,\"loading\"))&&l(n,i)?!0:!1}function f(n,t){var i,r;if(n&&n.length)for(i=0;r=n[i];++i)if(r.nodeType==1&&t(r))break}function u(n,r,u){f((u||i).querySelectorAll(n),function(n){t.add(n,r)})}var l=n.checkLoad||r._llic,e;return{cleanup:a,module:v}});define(\"autoSizeFlex\",[\"jquery\",\"jqBehavior\",\"mediator\",\"pixelToRem\",\"dir.tokens\"],function(n,t,i,r,u){function f(n){function e(){var i;(t=n.children(\":visible\").last(),f.length&&t.length)&&(i=u.ltr?t.offset().left-n.offset().left+t.outerWidth():f.offset().left-t.offset().left+f.outerWidth(!0),i>n.width()&&n.width(r(i)+\"rem\"))}var t,f=n.children().first();return i.sub(\"tabChanged\",e),{setup:e,update:e}}return t(f)});require([\"binding\",\"c.dom\"],function(n){n(\"autoSizeFlex\",\".autosizeflex\").all()});define(\"allPageBindings\",function(){return function(n){var t=function(t){t(n)};require([\"pageBindings\"],t);require([\"pageBindings.pc\"],t);require([\"pageBindings.pc-!ms.ie10plus\"],t)}});require([\"allPageBindings\"],function(n){n(\"html\")});define(\"navigation\",[\"escape\",\"location\",\"document\"],function(n,t,i){function o(t,i,r){var u=t[i],e,f;if(!u||u.length===0)return\"\";for(e=\"\",f=0;f<u.length;f++)u[f]&&(e=e+r+i+\"=\"+n.urlPart(u[f]),r===\"?\"&&(r=\"&\"));return e}function u(n,t,i){var s=function(n){return n=n.replace(/\\+/g,\" \"),decodeURIComponent(n)},u={},o,e;if(n)for(n=n.split(\"#\")[0],o=n.split(\"&\"),e=0;e<o.length;e++){var h=o[e].split(\"=\"),r=h[0],f=h[1];i&&(r=s(r),f&&(f=s(f)));t||r===\"item\"?(u[r]||(u[r]=[]),u[r].push(f)):u[r]=f}return u}function f(n){var t=i.createElement(\"a\");return t.href=n,{protocol:t.protocol,host:t.host,hostName:t.hostname,port:t.port,path:t.pathname,hash:t.hash,query:t.search,origin:t.origin}}function e(n){return f(n).hostName}var r={getUrl:function(n){return r.filter?r.filter(n):n},navigate:function(n,i){r.filter&&(n=r.filter(n));i?t.replace(n):t.href=n},getHostName:e,parseUrl:f,isLocal:function(n){var i=e(n);return!i||t.hostname==i},getParams:u,getParamsFromUrl:function(n,t,i){var r=n.split(\"?\")[1];return u(r,t,i)},mergeQueryStringParams:function(t,i){var s,f,e,h,r,c;if(i){if(s=t.split(\"?\"),s[1]){f=u(s[1],!1,!0);for(r in i)f[r]=i[r]}else f=i;t=s[0];e=\"?\";h=\"item\";for(r in f)r!==h&&(t+=f[r]?e+n.urlPart(r)+\"=\"+n.urlPart(f[r]):e+n.urlPart(r),e===\"?\"&&(e=\"&\"));c=o(f,h,e);t=t+c}return t},filter:null};return r});require([\"logging\",\"measure\",\"document\",\"c.onload\"],function(n,t,i){var e=t(i.getElementsByTagName(\"head\")[0]),o=e(\"boxSizing\"),r;if(o!=\"border-box\"){var s=\"Ad block is \"+(window.adsEnabled?\"off.\":\"on.\"),u=\"\",f=i.getElementsByTagName(\"head\")[0];f?(r=f.querySelectorAll(\"link[href*='/_sc/css/']\"),u=r.length===0?\"No css found.\":r.length===1?r[0].href:\"Multiple css urls found: \"+r[0].href+\" \"+r[1].href):u=\"No head element found.\";n.fatalError(\"C5001 Css was not loaded correctly. \"+s+\" \"+u)}});define(\"logging\",[\"navigation\",\"headData\",\"requestAnimationFrame\",\"window\",\"document\",\"pageTime\",\"escape\"],function(n,t,i,r,u,f,e){function ut(n,t){if(n.addEventListener)n.addEventListener(\"error\",t,!1);else if(n.onerror){var i=n.onerror;n.onerror=function(n,r,u,f,e){return i(n,r,u,f,e),t(n,r,u,f,e)}}else n.onerror=t}function ft(){if(!o&&(o=n.getUrl(t.clientSettings.base_url+\"_log\"),!/[?&]fdhead=[^&#]*/i.test(o))){var i=(/\\bf\\:([^;]*)/.exec(u.getElementsByTagName(\"head\")[0].getAttribute(\"data-info\"))||{})[1]||\"\";i&&(o+=(o.indexOf(\"?\")>0?\"&\":\"?\")+\"fdhead=\"+i)}return o}function g(){c&&k&&!p&&(p=setTimeout(function(){var h,l,o,i,f,e;if(p=0,s.length){if(h=ft(),l=\"POST\",r.hybridEnabled===1&&(d=!0),o=[],i=u.querySelectorAll&&u.querySelectorAll(\"[data-anadid]\"),i&&i.length)for(f=0;f<i.length;f++)o.push(i[f].getAttribute(\"data-anadid\"));e={aid:t.clientSettings.aid,v:t.clientSettings.v,messages:s,isInstart:d,adIds:o};e=JSON.stringify(e);var v=JSON.stringify({data:e}),n=new XMLHttpRequest;n.onload=function(){n.status!=200&&(a(\"error\",\"[506] Could not log, request status: \"+n.status+\"; response text: \"+n.responseText),c=!1)};n.open(l,h,!0);n.setRequestHeader(\"Content-Type\",\"application/json;charset=UTF-8\");n.send(v);s=[]}},2e3))}function l(n,t){return(t==b&&n.indexOf(\"Script error\")>=0&&(t=h),t==h)?\"warn\":t==y?\"info\":(c&&(s.push({m:e.urlPart(n),t:t,d:f()}),g()),t==y?\"info\":t==h?\"warn\":\"error\")}function a(n,t,i){if(r.console){if(!i&&n==\"info\")return;if(!i&&n==\"warn\")return;var u=console[n];u&&typeof u==\"function\"?console[n](t):console.log&&console.log(t)}}function v(n){var r=[],t,i;if(n)for(t=0;t<n.length;++t)i=nt(n[t]),i&&r.push(i);return r.join(\", \")}function nt(n,t,i,u,f){var o=(n==null||typeof n==\"string\"?n:n.message||n.description)||\"\",e,s;return!o&&(n!=null&&(typeof n==\"object\"&&n.toString()==\"[object Event]\"?(e=r.event,e&&e.type==\"error\"&&(o=e.errorMessage,t=e.errorUrl,i=e.errorLine,u=e.errorCharacter)):o=n.toString()),!o)?\"\":(t=n.url||n.filename||t,i=n.lineno||i,u=n.colno||u,s=n.stack||n.error&&n.error.stack,o.trim()+(f||\"\")+(i?\"\\nLine=\"+i:\"\")+(u?\"\\nColumn=\"+u:\"\")+(t?\"\\nScriptUrl=\"+t:\"\")+(s?\"\\nStack=\"+s:\"\"))}function et(){var n=v(arguments);l(n,it);i(function(){var n=u.location,i=e.html(n.protocol+\"//\"+n.host),f=e.url(n.href),o=function(n){var i=\"\",r,t;if(n)for(r=n.length,t=0;t<r;t++)(t===8||t===12||t===16||t===20)&&(i+=\"-\"),i+=n[t];return i};u.getElementsByTagName(\"body\")[0].innerHTML=\"<style>body{font-family:Arial;margin-left:40px}img{border:0 none}#content{margin-left:auto;margin-right:auto}#message h2{font-size:20px;font-weight:normal;color:#000;margin:34px 0 0 0}#message p{font-size:13px;color:#000;margin:7px 0 0 0}#errorref{font-size:11px;color:#737373;margin-top:41px}<\\/style><div id='content'><div id='message'><h2>此頁面目前無法使用<\\/h2><p>若您的網路連線有問題，或您正在執行軟體/外掛程式時，有時候會發生這種情況，這可能會影響您的網路流量。<br/><br/><a href=\\\"\"+e.html(f)+'\" onclick=\"window.location.reload(true)\">按這裡<\\/a> 請再嘗試一次此頁面，或造訪： <a href=\"'+i+'\">'+i+\"<\\/a><\\/p><\\/div><div id='errorref'><span>Ref 1: \"+e.html(o(t.clientSettings.aid))+\"&nbsp;&nbsp;&nbsp;Ref 2: \"+e.html(t.clientSettings.sid||\"000000\")+\"&nbsp;&nbsp;&nbsp;Ref 3: \"+e.html((new r.Date).toUTCString())+\"<\\/span><\\/div><\\/div>\"})}function tt(){var n=v(arguments);a(l(n,b),n,!0)}function ot(){var n=v(arguments);a(l(n,h),n)}function st(){var n=v(arguments);a(l(n,y),n)}function ht(n){(r.console||{}).timeStamp?console.timeStamp(n):(r.performance||{}).mark&&r.performance.mark(n)}var w=0,it=-1,b=0,h=1,y=2,s=[],p,k,rt,o,d=!1,c=Math.random()*100<=-1;return ut(r,function(n,t,i,r){return w++,n=nt(n,t,i,r,\" [ENDMESSAGE]\"),n&&tt(\"[SCRIPTERROR] \"+n),!0}),c&&require([\"jquery\",\"c.deferred\"],function(n){k=!0;rt=n;s.length&&g()}),{error:tt,fatalError:et,unhandledErrorCount:function(){return w},perfMark:ht,warning:ot,information:st}});require([\"viewAwareInit\"],function(n){n({size2row:\"(min-height: 48.75em)\",size1row:\"(max-height: 48.74em)\",size4column:\"(min-width: 79em)\",size3column:\"(min-width: 58.875em) and (max-width: 78.99em)\",size2column:\"(min-width: 43.75em) and (max-width: 58.865em)\",size2rowsize4column:\"(min-width: 79em) and (min-height: 48.75em)\",size2rowsize3column:\"(min-width: 58.875em) and (max-width: 78.99em) and (min-height: 48.75em)\",size2rowsize2column:\"(max-width: 58.865em) and (min-height: 48.75em)\",size1rowsize4column:\"(min-width: 79em) and (max-height: 48.74em)\",size1rowsize3column:\"(min-width: 58.875em) and (max-width: 78.99em) and (max-height: 48.74em)\",size1rowsize2column:\"(max-width: 58.865em) and (max-height: 48.74em)\"})});require([\"deviceInit\"],function(n){n({AllowTransform3d:\"false\",AllowTransform2d:\"true\",RtlScrollLeftAdjustment:\"fromLeft\",ShowMoveTouchGestures:\"true\",SupportFixedPosition:\"true\",UseCustomMatchMedia:null,Viewport_Behavior:\"Default\",Viewport_Landscape:null,Viewport:\"width=device-width,initial-scale=1.0,maximum-scale=2.0\",IsMobileDevice:\"false\"})})</script><meta property=\"sharing_url\" content=\"https://www.msn.com/zh-tw\"/><meta property=\"og:url\" content=\"https://www.msn.com/zh-tw/\"/><meta property=\"og:title\" content=\"msn 台灣｜Windows 10, Windows app 應用程式, Microsoft Store 商城, hotmail, outlook, skype, 即時新聞\"/><meta property=\"twitter:card\" content=\"summary_large_image\"/><meta property=\"og:type\" content=\"website\"/><meta property=\"og:site_name\" content=\"MSN\"/><meta property=\"og:image\" content=\"https://static-global-s-msn-com.akamaized.net/hp-eas/sc/c6/519670.jpg\"/><link rel=\"shortcut icon\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/a5ea21.ico\" /><style>@media screen and (max-width:78.99em) and (min-width:58.875em){.layout-none:not(.mod1) .pos2{left:0}}.ie8 .grid .pick4~li.pick{display:none}.todaystripe .todayshowcasead:hover{opacity:1}.spartan #main .paging-container.snap{overflow-x:hidden}#addRemoveSectionsModalContainer #addRemoveSectionsModal{display:block}.tmx.mobile .superbowl .matchupstripe{margin:0 auto}.stripecontainer .stripeouter.noborder{height:33.7rem}html[dir='rtl'] .ie8 .mip>ul>li.triptych h3+a{border-right:0}html[dir='ltr'] .ie8 .mip>ul>li.triptych h3+a{border-left:0}.meflyouts .integratedskype .signin>ul li:first-child{display:none}.tmx.pc.webkit.chrome .stripecontent ul{overflow-x:hidden}.meflyouts .bingrewards{display:none}.mobile .galleryinfo .img-divider{display:none}.homepage.tmx.pc.chrome #main .one-col,.homepage.tmx.pc.chrome #main .two-col,.homepage.tmx.pc.chrome #main .three-col{margin-right:-.016rem;margin-left:-.016rem}.homepage.midlevel .pagingsection>button.show,.channelplayerpage.midlevel .pagingsection>button.show{display:none}.settings.start.tmx.pc .globalsettings .social.twitter{display:none}</style>\n" +
"    \n" +
"            <script>(function(){function u(){window.performance.mark(\"frame\");console.timeStamp(\"frame\");i||s();performance.now()<o&&requestAnimationFrame(u)}function s(){r=n;n=performance.now();n-r<=e?n-t>=f&&(window._pageTimings||(window._pageTimings={}),window._pageTimings.TimeToPageInteractive=Math.round(t),i=!0):t=n}var i=!1,n=0,r=0,t=0,f=1e3,e=200,o=3e4;window.performance&&window.performance.mark&&window.performance.now&&window.requestAnimationFrame&&requestAnimationFrame(u)})()</script>\n" +
"\n" +
"\n" +
"    \n" +
"\n" +
"    \n" +
"        <script>window._perfMarker && window._perfMarker(\"TimeToHeadEnd\"); window._perfMeasure && window._perfMeasure(\"TimeForHead\", \"TimeToHeadStart\", \"TimeToHeadEnd\", true);</script>\n" +
"</head>\n" +
"\n" +
"    <body class=\"startpage sp center-content start tmx pc webkit chrome chrome64plus fltmuidflt14cf fltmuidflt49cf fltmuidflt52cf fltadflt-unruly fltmuidflt259cf fltmmxios1cf fltstartedge1cf fltmoneyedge3cf fltplatagyhp3cf fltpnehz2cf fltaudexhz3cf fltartgly5cf fltgallery2cf\">\n" +
"            <script>window._perfMarker && window._perfMarker(\"TimeToBodyStart\");</script>\n" +
"\n" +
"            <script>\n" +
"                require([\"headData\", \"pageInstance\", \"mediator\"], function (headData, pageInstance, mediator)\n" +
"                {\n" +
"                    var url = '//c.msn.com/c.gif?udc=true&rid=5ccff976c56c4a539087c2a9ffe97c17&rnd=636835093161444845&rf=&tp=https%253A%252F%252Fwww.msn.com%252Fzh-tw%252F%253Focid%253Dmailsignout&di=37&lng=zh-tw&activityId=5ccff976c56c4a539087c2a9ffe97c17&d.dgk=tmx.pc.webkit.chrome.chrome64plus&d.imd=0&st.dpt=&st.sdpt=&subcvs=homepage&pg.n=startpage&pg.t=hp&pg.c=&pg.p=prime&anoncknm=&issso=0&aadState=0';\n" +
"                    if (headData && headData.clientSettings && headData.clientSettings.static_page)\n" +
"                    {\n" +
"                        mediator.pub(pageInstance.eventName);\n" +
"                        var rid = pageInstance.getActivityId();\n" +
"                        url = url.replace(/([?&]rid=)[^&#]*/i, \"$1\" + rid);\n" +
"                    }\n" +
" \n" +
"                    var img = new Image();\n" +
"                    img.onload = img.onerror = function ()\n" +
"                    {\n" +
"                        img.onload = img.onerror = null;\n" +
"                    };\n" +
"                    img.src = url;\n" +
"                    \n" +
" });\n" +
"</script>\n" +
" <script>\n" +
"/*<![CDATA[*/\n" +
" require([\"track\",\"track.generic\",\"c.track.mobi\"],function(t,g,o){t.extend({\"sitePage\":{\"department\":\"\",\"subDepartment\":\"\",\"channel\":\"homepage\",\"page_name\":\"startpage\",\"page_type\":\"hp\",\"page_product\":\"prime\",\"storeocid\":\"msn\",\"pageUrl\":\"https%3A%2F%2Fwww.msn.com%2Fzh-tw%2F%3Focid%3Dmailsignout\",\"autoRefresh\":\"0\",\"requestId\":\"5ccff976c56c4a539087c2a9ffe97c17\",\"serverImpressionGuid\":\"5ccff976c56c4a539087c2a9ffe97c17\",\"canvas\":\"Browser\",\"vertical\":\"homepage\",\"entityId\":\"\",\"entityCollectionId\":\"\",\"entitySrc\":\"\",\"cvAuthor\":\"\",\"d_dgk\":\"tmx.pc.webkit.chrome.chrome64plus\",\"d_imd\":\"0\",\"cvPartner\":\"\",\"cvPublcat\":\"\",\"provid\":\"\",\"templ\":\"EAggMo:0;IP:None;RV:None;infopane:0;cat:0;EP:0;CI:1;mIpH:2;mRvH:2\",\"pageIndex\":\"\",\"pageTotalCount\":\"\",\"isStaticPage\":\"False\",\"pageVersion\":\"15\",\"contentType\":\"unknown_use_metadata_to_set_the_content_type\",\"isCorePV\":\"\",\"chartBeatUID\":\"42635\",\"chartBeatDomain\":\"msn.com\",\"chartBeatBase\":\"https://a248.e.akamai.net/chartbeat.download.akamai.com/102508\",\"otfURL\":\"//otf.msn.com/c.gif?\",\"flightid\":\"muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf\",\"exa\":\"muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf\",\"device\":\"Unknown Unknown\",\"domainId\":\"37\",\"propertyId\":\"\",\"propertySpecifier\":\"\",\"pageMode\":\"\",\"localeCode\":\"zh-tw\"},\"userStatic\":{\"isSignedIn\":\"False\",\"beginRequestTicks\":\"636835093161444845\"}});t.register(new g({\"base\":\"//c.msn.com/c.gif?\",\"id\":\"ctag\",\"disableOnAutoRefresh\":\"scorecard\",\"isGeneratedEarly\":1,\"rmca\":1,\"impr\":{\"param\":{'udc': 'true'},\"paramMap\":{\"event\":{'evt':'type'},\"userDynamic\":{'rid':'requestId','rnd':'timeStamp'},\"client\":{'rf':'referrer','tp':'pageUrl','scr':'screenResolution','anoncknm':'getAnonCookieName','issso':'getSsoComplete','aadState':'getAadAuthentication'},\"sitePage\":{'di':'domainId','lng':'localeCode','activityId':'requestId','d.dgk':'d_dgk','d.imd':'d_imd','st.dpt':'department','st.sdpt':'subDepartment','subcvs':'vertical','pg.n':'page_name','pg.t':'page_type','pg.c':'page_configuration','pg.p':'page_product'}}}}),new g({\"base\":\"https://sb.scorecardresearch.com/b?\",\"id\":\"scorecard\",\"disableOnAutoRefresh\":\"scorecard\",\"isGeneratedEarly\":0,\"impr\":{\"param\":{'c1': '2', 'c2': '3000001', 'cs_ucfr': '1'},\"paramMap\":{\"userDynamic\":{'rn':'timeStamp'},\"client\":{'c7':'pageUrl','c8':'pageTitle','c9':'referrer'}}},\"page_candidate\":{\"paramMap\":{\"event\":{'evt':'type'},\"userDynamic\":{'rn':'timeStamp'},\"client\":{'c7':'pageUrl','c8':'pageTitle','c9':'referrer'}}}}),new g({\"base\":\"//otf.msn.com/c.gif?\",\"id\":\"udc\",\"disableOnAutoRefresh\":\"scorecard\",\"commonMap\":{\"userDynamic\":{'rid':'requestId','cts':'timeStamp','idx':'currentEventIndex'},\"client\":{'clid':'clientId','anoncknm':'getAnonCookieName','issso':'getSsoComplete','aadState':'getAadAuthentication'},\"sitePage\":{'di':'domainId','mkt':'localeCode','su':'pageUrl','flightid':'flightid','activityId':'requestId','cvs':'canvas','subcvs':'vertical','pg.n':'page_name','pg.t':'page_type','pg.c':'page_configuration','pg.p':'page_product','pivot':'pagePivot','pageuid':'pageUserId','pageutype':'pageUserType'}},\"isGeneratedEarly\":0,\"impr\":{\"param\":{'evt': 'impr', 'js': '1'},\"paramMap\":{\"userStatic\":{'pp':'isSignedIn'},\"userDynamic\":{'dv.snlogin':'settings','dv.grpfrmod':'defaultSlotTrees'},\"client\":{'rf':'referrer','cu':'pageUrl','scr':'screenResolution','bh':'height','bw':'width','dv.Title1':'pageTitle','viewType':'viewType','e1':'OTFTelemetry','prs':'personalization','oscm':'connectionMode','osver':'buildVersion'},\"sitePage\":{'st.dpt':'department','st.sdpt':'subDepartment','cv.partner':'cvPartner','cv.publcat':'cvPublcat','cv.author':'cvAuthor','CndEl':'conditionalItem','cv.entityId':'entityId','cv.entitySrc':'entitySrc','cv.parentId':'entityCollectionId','provid':'provid','ar':'autoRefresh','d.dgk':'d_dgk','d.imd':'d_imd','tmpl':'templ','isStaticPage':'isStaticPage','pgIdx':'pageIndex','pgTot':'pageTotalCount','jids':'joinIds','fid':'feedId','fn':'feedName','ft':'feedType','ex':'extflightid','osgp':'groupPolicy','rt':'referrerType','ccn':'cookieConsentNotice'},\"custom\":{'pb':'addCustomTags'}}},\"click\":{\"paramMap\":{\"event\":{'evt':'type'},\"userDynamic\":{'slidetype':'slideType'},\"client\":{'gesture':'gesture','viewType':'viewType'},\"sitePage\":{'fid':'feedId','fn':'feedName','ft':'feedType','tmpl':'templ'},\"report\":{'cm':'contentModule','hl':'headline','du':'destinationUrl','e1':'module','l':'nLineage','lo':'oLineage','TTI':'timeToInteract','ca':'contentAction'},\"custom\":{'pb':'addCustomTagsForClickEvent'}}},\"page_candidate\":{\"paramMap\":{\"event\":{'evt':'type'}}},\"unload\":{\"paramMap\":{\"event\":{'evt':'type'},\"client\":{'frd':'frameData','wbh':'wasBrowserHiddenAtLeastOnce','mfd':'maxFrameDuration'}}},\"app_error\":{\"paramMap\":{\"event\":{'evt':'type'},\"report\":{'errId':'errId','errMsg':'errMsg','errSource':'errSource'}}},\"adimpr_update\":{\"paramMap\":{\"event\":{'evt':'type'},\"report\":{'dst':'dst','den':'den','id':'id','pg':'pg','w':'w','h':'h','status':'status','anAd':'anAd','seqid':'seqid','sdk':'sdk','fen':'fen'}}}}));define(\"c.trackExtComplete\", 1);var trackingCallInitiated = false;var instartTimer = setTimeout(function(){if (window.I10C != undefined) {window.I10C.unwatch(\"Abd\",function(){return;});}if(!trackingCallInitiated) { trackingCallInitiated = true;  t.trackPage(); }}, 100);if (window.I10C != undefined) {if (window.I10C.Abd == 0){clearTimeout(instartTimer);if(!trackingCallInitiated) { trackingCallInitiated = true; t.trackPage(); }}else if(window.I10C.Abd == 1){clearTimeout(instartTimer);return;}else{window.I10C.watch(\"Abd\", function (prop, val, newval) {if (window.I10C != undefined && newval != undefined) {clearTimeout(instartTimer);if (newval == 0) {if(!trackingCallInitiated) {trackingCallInitiated = true; t.trackPage();}}} return newval;}); }}});\n" +
"//]]>\n" +
"</script>\n" +
" <noscript>\n" +
" <img src=\"//c.msn.com/c.gif?udc=true&amp;rid=5ccff976c56c4a539087c2a9ffe97c17&amp;rnd=636835093161444845&amp;rf=&amp;tp=https%253A%252F%252Fwww.msn.com%252Fzh-tw%252F%253Focid%253Dmailsignout&amp;di=37&amp;lng=zh-tw&amp;activityId=5ccff976c56c4a539087c2a9ffe97c17&amp;d.dgk=tmx.pc.webkit.chrome.chrome64plus&amp;d.imd=0&amp;st.dpt=&amp;st.sdpt=&amp;subcvs=homepage&amp;pg.n=startpage&amp;pg.t=hp&amp;pg.c=&amp;pg.p=prime&amp;anoncknm=&amp;issso=0&amp;aadState=0\" alt=\"image beacon\" width=\"1\" height=\"1\" /><img src=\"https://sb.scorecardresearch.com/p?c1=2&amp;c2=3000001&amp;cs_ucfr=1&amp;rn=636835093161444845&amp;c7=https%253A%252F%252Fwww.msn.com%252Fzh-tw%252F%253Focid%253Dmailsignout&amp;c8=&amp;c9=\" alt=\"image beacon\" width=\"1\" height=\"1\" /><img src=\"//otf.msn.com/c.gif?js=0&amp;evt=impr&amp;di=37&amp;pi=&amp;ps=&amp;su=https%253A%252F%252Fwww.msn.com%252Fzh-tw%252F%253Focid%253Dmailsignout&amp;mkt=zh-tw&amp;pp=False&amp;cv.partner=&amp;cv.publcat=&amp;st.dpt=&amp;st.sdpt=&amp;dv.Title1=&amp;cts=636835093161444845&amp;rf=&amp;rid=5ccff976c56c4a539087c2a9ffe97c17&amp;cvs=Browser&amp;subcvs=homepage&amp;cv.entityId=&amp;cv.entitySrc=&amp;provid=&amp;ar=0&amp;d.dgk=tmx.pc.webkit.chrome.chrome64plus&amp;d.imd=0&amp;cv.parentId=&amp;isCorePV=&amp;pgIdx=&amp;pgTot=&amp;activityId=5ccff976c56c4a539087c2a9ffe97c17&amp;pm=&amp;pg.n=startpage&amp;pg.t=hp&amp;pg.c=&amp;pg.p=prime&amp;anoncknm=&amp;issso=0&amp;ex=&amp;aadState=0\" alt=\"image beacon\" width=\"1\" height=\"1\" />\n" +
"</noscript>\n" +
"        <div id=\"irisbannerph\"></div>\n" +
"\n" +
"        <div class=\"head\" >\n" +
"            \n" +
"\n" +
"\n" +
"\n" +
"<header id=\"header-common\"  class=\"no-overlay\" role=\"banner\"  data-region=\"header\"  data-id=\"1\" data-m='{\"i\":1,\"n\":\"header\",\"y\":6}'>\n" +
" \n" +
"\n" +
"\n" +
"\n" +
" <h1 class=\"h1\">\n" +
"  <a class=\"logo\" aria-label=\"返回 msn 首頁\" href=\"/zh-tw\"\n" +
" data-id=\"2\" data-m='{\"i\":2,\"p\":1,\"n\":\"msnLogo\",\"y\":14,\"l\":\"homepage\",\"o\":1}' tabindex=\"2\">\n" +
"<span class=\"\">msn</span> \n" +
"</a>\n" +
" <a aria-haspopup=\"true\" class=\"vertical\" href=\"/zh-tw\"  data-id=\"3\" data-m='{\"i\":3,\"p\":1,\"n\":\"HeaderVerticalLink\",\"y\":14,\"l\":\"homepage\",\"o\":2}' tabindex=\"2\">msn</a>\n" +
"\n" +
"</h1>\n" +
"\n" +
"<ul>\n" +
"<li>\n" +
"\n" +
"\n" +
"<section id=\"header-search\" role=\"search\"  data-aop=\"search\"  data-id=\"4\" data-m='{\"i\":4,\"p\":1,\"n\":\"headersearch\",\"y\":9,\"o\":3}'  class=\"\">\n" +
"<form action=\"https://www.bing.com/search?scope=web\" method=\"get\" id=\"srchfrm\" target=\"_blank\" data-form-code=\"PRTWZH\"   data-bing-action-uri=\"https://www.bing.com/search?scope=web\">\n" +
" \n" +
"\n" +
"<div class=\"qc\">\n" +
"<input id=\"q\" name=\"q\" accesskey=\"S\" autocomplete=\"off\" type=\"search\" value=\"\" maxlength=\"250\"\n" +
" \n" +
"  aria-label=\"搜尋:\"\n" +
" \n" +
"  data-id=\"5\" data-m='{\"i\":5,\"p\":4,\"n\":\"searchinput\",\"y\":9,\"o\":1}'>\n" +
"\n";
String S3="  </div>\n" +
"<div class=\"buttons\">\n" +
" <svg viewBox=\"0 0 40 40\" xmlns=\"http://www.w3.org/2000/svg\" class=\"bingicon\" role=\"img\">\n" +
"<path fill=\"#666\" d=\"M 14 30.94 v -28.14 l -8 -2.8 v 35.54 l 8 4.46 l 20 -11.5 v -9.1 Z\" />\n" +
"<path opacity=\".75\" fill=\"#666\" d=\"M 25.28 24.43 l 8.72 -5.03 l -17.74 -6.2 l 3.47 8.65 l 5.55 2.58 Z\" />\n" +
"</svg>\n" +
"\n" +
" <button id=\"sb_form_go\" class=\"text \"  title=\"搜尋網路\"  data-id=\"6\" data-m='{\"i\":6,\"p\":4,\"n\":\"search_websearch\",\"y\":9,\"o\":2}'>搜尋網路</button>\n" +
" </div>\n" +
"<input type=\"hidden\" name=\"form\" value=\"PRTWZH\">\n" +
"     <input type=\"hidden\" name=\"httpsmsn\" value=\"1\">\n" +
"     <input type=\"hidden\" name=\"refig\" value=\"5ccff976c56c4a539087c2a9ffe97c17\">\n" +
"</form>\n" +
"<button type=\"button\"  title=\"搜尋網路\" id=\"sb\"  data-id=\"7\" data-m='{\"i\":7,\"p\":4,\"n\":\"search_sb\",\"y\":9,\"o\":3}'></button>\n" +
" \n" +
"</section>\n" +
" </li>\n" +
" <li>\n" +
"<button id=\"skip_to_nav\" class=\"skip-to\"  data-id=\"8\" data-m='{\"i\":8,\"p\":1,\"n\":\"skip_to_nav\",\"y\":11,\"o\":4}'>跳至導覽</button>\n" +
"</li>\n" +
" <li>\n" +
"<button id=\"skip_to_con\" class=\"skip-to\"  data-id=\"9\" data-m='{\"i\":9,\"p\":1,\"n\":\"skip_to_con\",\"y\":11,\"o\":5}'>跳至內容</button>\n" +
"</li>\n" +
" <li>\n" +
"<button id=\"skip_to_footer\" class=\"skip-to\"  data-id=\"10\" data-m='{\"i\":10,\"p\":1,\"n\":\"skip_to_footer\",\"y\":11,\"o\":6}'>跳至頁腳</button>\n" +
"</li>\n" +
"\n" +
" <li>\n" +
"  <ul id=\"user-profile\"  data-sso-dependent=\"true\" data-module-id=\"startpage|start.header|header|header-signin|signin\" data-dhp_cookie_days=\"0\"  data-id=\"11\" data-m='{\"i\":11,\"p\":1,\"n\":\"header-signin\",\"t\":\"signin\",\"o\":7}'>\n" +
" \n" +
"<li id=\"sign-in\" >\n" +
" <div id=\"meCtrl\"  data-sign-in-url=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\" data-sign-out-url=\"https://login.live.com/logout.srf?ct=1547912517&amp;rver=7.0.6730.0&amp;lc=1033&amp;id=1184&amp;lru=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout&amp;mkt=zh-tw&amp;pcexp=True\" data-me-url=\"https://login.live.com/me.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2F%2Fwww.msn.com%2Fzh-tw%2Fhomepage%2FSecure%2FPassport%3Fru%3Dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw\" data-anonckname=\"\">\n" +
" <a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\" title=\"登入\"  data-id=\"12\" data-m='{\"i\":12,\"p\":11,\"n\":\"SignInNavigation\",\"y\":14,\"o\":1}' >\n" +
"<span class=\"mectrlname mectrlsignin\">登入</span>\n" +
"</a>\n" +
" </div>\n" +
"                    <script>require([\"refreshSigninModule\", \"c.sso\"], function (r) { r() })</script>\n" +
" </li>\n" +
" <li role=\"presentation\" id=\"settings\" >\n" +
"<a href=\"#temp\"  data-id=\"13\" data-m='{\"i\":13,\"p\":11,\"n\":\"settings\",\"y\":14,\"o\":2}'  alt=\"設定\"  aria-label=\"頁面設定\"></a>\n" +
"  <ul>\n" +
"\n" +
" <li role=\"presentation\">\n" +
"<label>變更語言與內容:</label>\n" +
"<select role=\"menuitem\" id=\"site-market\" rel=\"nofollow\" aria-label=\"變更語言與內容:\"  data-id=\"14\" data-m='{\"i\":14,\"p\":11,\"n\":\"changemarket\",\"y\":14,\"o\":3}'>\n" +
" <option data-mkt=\"es-xl\" data-mkt-url=\"//www.msn.com/es-xl\" >Am&#233;rica Latina (espa&#241;ol)</option>\n" +
" <option data-mkt=\"es-ar\" data-mkt-url=\"//www.msn.com/es-ar\" >Argentina (espa&#241;ol)</option>\n" +
" <option data-mkt=\"en-au\" data-mkt-url=\"//www.msn.com/en-au\" >Australia (English)</option>\n" +
" <option data-mkt=\"nl-be\" data-mkt-url=\"//www.msn.com/nl-be\" >Belgi&#235; (Nederlands)</option>\n" +
" <option data-mkt=\"fr-be\" data-mkt-url=\"//www.msn.com/fr-be\" >Belgique (fran&#231;ais)</option>\n" +
" <option data-mkt=\"pt-br\" data-mkt-url=\"//www.msn.com/pt-br\" >Brasil (portugu&#234;s)</option>\n" +
" <option data-mkt=\"en-ca\" data-mkt-url=\"//www.msn.com/en-ca\" >Canada (English)</option>\n" +
" <option data-mkt=\"fr-ca\" data-mkt-url=\"//www.msn.com/fr-ca\" >Canada (fran&#231;ais)</option>\n" +
" <option data-mkt=\"es-cl\" data-mkt-url=\"//www.msn.com/es-cl\" >Chile (espa&#241;ol)</option>\n" +
" <option data-mkt=\"es-co\" data-mkt-url=\"//www.msn.com/es-co\" >Colombia (espa&#241;ol)</option>\n" +
" <option data-mkt=\"da-dk\" data-mkt-url=\"//www.msn.com/da-dk\" >Danmark (Dansk)</option>\n" +
" <option data-mkt=\"de-de\" data-mkt-url=\"//www.msn.com/de-de\" >Deutschland (Deutsch)</option>\n" +
" <option data-mkt=\"es-es\" data-mkt-url=\"//www.msn.com/es-es\" >Espa&#241;a (espa&#241;ol)</option>\n" +
" <option data-mkt=\"fr-fr\" data-mkt-url=\"//www.msn.com/fr-fr\" >France (fran&#231;ais)</option>\n" +
" <option data-mkt=\"en-in\" data-mkt-url=\"//www.msn.com/en-in\" >India (English)</option>\n" +
" <option data-mkt=\"hi-in\" data-mkt-url=\"//www.msn.com/hi-in\" >India (?????)</option>\n" +
" <option data-mkt=\"id-id\" data-mkt-url=\"//u.msn.com/id-id\" >Indonesia (Bahasa Indonesia)</option>\n" +
" <option data-mkt=\"en-xl\" data-mkt-url=\"//www.msn.com/en-xl\" >International Edition (English)</option>\n" +
" <option data-mkt=\"en-ie\" data-mkt-url=\"//www.msn.com/en-ie\" >Ireland (English)</option>\n" +
" <option data-mkt=\"it-it\" data-mkt-url=\"//www.msn.com/it-it\" >Italia (italiano)</option>\n" +
" <option data-mkt=\"en-my\" data-mkt-url=\"//www.msn.com/en-my\" >Malaysia (English)</option>\n" +
" <option data-mkt=\"es-mx\" data-mkt-url=\"//prodigy.msn.com/es-mx\" >M&#233;xico (espa&#241;ol)</option>\n" +
" <option data-mkt=\"nl-nl\" data-mkt-url=\"//www.msn.com/nl-nl\" >Nederland (Nederlands)</option>\n" +
" <option data-mkt=\"en-nz\" data-mkt-url=\"//www.msn.com/en-nz\" >New Zealand (English)</option>\n" +
" <option data-mkt=\"nb-no\" data-mkt-url=\"//www.msn.com/nb-no\" >Norge (norsk, bokm&#229;l)</option>\n" +
" <option data-mkt=\"de-at\" data-mkt-url=\"//www.msn.com/de-at\" >&#214;sterreich (Deutsch)</option>\n" +
" <option data-mkt=\"es-pe\" data-mkt-url=\"//www.msn.com/es-pe\" >Per&#250; (espa&#241;ol)</option>\n" +
" <option data-mkt=\"en-ph\" data-mkt-url=\"//www.msn.com/en-ph\" >Philippines (English)</option>\n" +
" <option data-mkt=\"pl-pl\" data-mkt-url=\"//www.msn.com/pl-pl\" >Polska (polski)</option>\n" +
" <option data-mkt=\"pt-pt\" data-mkt-url=\"//www.msn.com/pt-pt\" >Portugal (Portugu&#234;s)</option>\n" +
" <option data-mkt=\"de-ch\" data-mkt-url=\"//www.msn.com/de-ch\" >Schweiz (Deutsch)</option>\n" +
" <option data-mkt=\"en-sg\" data-mkt-url=\"//www.msn.com/en-sg\" >Singapore (English)</option>\n" +
" <option data-mkt=\"en-za\" data-mkt-url=\"//www.msn.com/en-za\" >South Africa (English)</option>\n" +
" <option data-mkt=\"fr-ch\" data-mkt-url=\"//www.msn.com/fr-ch\" >Suisse (fran&#231;ais)</option>\n" +
" <option data-mkt=\"fi-fi\" data-mkt-url=\"//www.msn.com/fi-fi\" >Suomi (suomi)</option>\n" +
" <option data-mkt=\"sv-se\" data-mkt-url=\"//www.msn.com/sv-se\" >Sverige (svenska)</option>\n" +
" <option data-mkt=\"tr-tr\" data-mkt-url=\"//www.msn.com/tr-tr\" >T&#252;rkiye (T&#252;rk&#231;e)</option>\n" +
" <option data-mkt=\"en-ae\" data-mkt-url=\"//www.msn.com/en-ae\" >United Arab Emirates (English)</option>\n" +
" <option data-mkt=\"en-gb\" data-mkt-url=\"//www.msn.com/en-gb\" >United Kingdom (English)</option>\n" +
" <option data-mkt=\"en-us\" data-mkt-url=\"//www.msn.com/en-us\" >United States (English)</option>\n" +
" <option data-mkt=\"es-us\" data-mkt-url=\"//www.msn.com/es-us\" >United States (espa&#241;ol)</option>\n" +
" <option data-mkt=\"es-ve\" data-mkt-url=\"//www.msn.com/es-ve\" >Venezuela (espa&#241;ol)</option>\n" +
" <option data-mkt=\"vi-vn\" data-mkt-url=\"//www.msn.com/vi-vn\" >Vi&#234;?t Nam (Ti&#234;?ng Vi&#234;?t)</option>\n" +
" <option data-mkt=\"el-gr\" data-mkt-url=\"//www.msn.com/el-gr\" >Ελλ?δα (ελληνικ?)</option>\n" +
" <option data-mkt=\"ru-ru\" data-mkt-url=\"//www.msn.com/ru-ru\" >?????? (P??????)</option>\n" +
" <option data-mkt=\"he-il\" data-mkt-url=\"//www.msn.com/he-il\" >????? (?????)?</option>\n" +
" <option data-mkt=\"ar-ae\" data-mkt-url=\"//www.msn.com/ar-ae\" >???????? ??????? ??????? (????????)</option>\n" +
" <option data-mkt=\"ar-sa\" data-mkt-url=\"//www.msn.com/ar-sa\" >??????? ??????? ???????? (????????)</option>\n" +
" <option data-mkt=\"ar-eg\" data-mkt-url=\"//www.msn.com/ar-eg\" >??? (????????)</option>\n" +
" <option data-mkt=\"th-th\" data-mkt-url=\"//www.msn.com/th-th\" >??? (???)</option>\n" +
" <option data-mkt=\"zh-cn\" data-mkt-url=\"//www.msn.cn/zh-cn\" >中?人民共和? (?体中文)</option>\n" +
" <option data-mkt=\"ja-jp\" data-mkt-url=\"//www.msn.com/ja-jp\" >日本 (日本語)</option>\n" +
" <option data-mkt=\"zh-tw\" data-mkt-url=\"//www.msn.com/zh-tw\"  selected>台灣 (繁體中文)</option>\n" +
" <option data-mkt=\"zh-hk\" data-mkt-url=\"//www.msn.com/zh-hk\" >香港特?行政區 (繁體中文)</option>\n" +
" <option data-mkt=\"ko-kr\" data-mkt-url=\"//www.msn.com/ko-kr\" >?? (???)</option>\n" +
" </select>\n" +
"</li>\n" +
"\n" +
"\n" +
"\n" +
" <li role=\"presentation\" >\n" +
"<a role=\"menuitem\" href=\"#\" id=\"usermenu-feedback\"  data-id=\"15\" data-m='{\"i\":15,\"p\":11,\"n\":\"feedback\",\"y\":14,\"o\":4}'>\n" +
" 意見反應\n" +
"</a>\n" +
"</li>\n" +
"\n" +
" <li role=\"presentation\" class=\"global\">\n" +
"<button role=\"menuitem\" class=\"personalization\"  data-id=\"16\" data-m='{\"i\":16,\"p\":11,\"n\":\"personalization\",\"y\":11,\"o\":5}'>自訂此頁面</button>\n" +
"</li>\n" +
"\n" +
" <li role=\"presentation\" >\n" +
"<a role=\"menuitem\" id=\"makehomepage\" target=\"_blank\" href=\"https://chrome.google.com/webstore/detail/msn-homepage-bing-search/aodojjhnfnfhaplflfohfddffmjkdjak\"  data-id=\"17\" data-m='{\"i\":17,\"p\":11,\"n\":\"homepagelink\",\"y\":14,\"l\":\"homepage\",\"o\":6}'>將 MSN 設定為我的首頁</a>\n" +
"</li>\n" +
"\n" +
" </ul>\n" +
"\n" +
"</li>\n" +
" \n" +
"</ul>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" \n" +
"</li>\n" +
"  </ul>\n" +
"\n" +
" \n" +
"</header>\n" +
"<div class=\"search-overlay\"  data-aop=\"search-overlay\"></div>\n" +
"\n" +
"\n" +
"            \n" +
"\n" +
"            \n" +
"        </div>\n" +
"    <div id=\"precontent\"  data-region=\"precontent\"  data-id=\"18\" data-m='{\"i\":18,\"n\":\"precontent\",\"y\":6}'>\n" +
"        \n" +
"        \n" +
"\n" +
"\n" +
"        \n" +
"        \n" +
" <div id=\"mestripebg\"></div>\n" +
"\n" +
"    </div>\n" +
"\n" +
"\n" +
"\n" +
"    <div id=\"maincontent\">\n" +
"         <div class=\"content\" id=\"content\">\n" +
"               <main id=\"main\" role=\"main\"  data-region=\"main\"  data-id=\"19\" data-m='{\"i\":19,\"n\":\"main\",\"y\":6}'>\n" +
"\n" +
"\n";
String S4="     <div class=\"stripeouter mestripeouter\"  data-aop=\"mestripe_mestripe\"  data-id=\"20\" data-m='{\"i\":20,\"p\":19,\"n\":\"meStripe\",\"t\":\"meStripe\",\"o\":1}'\n" +
"          data-section-id=\"mestripe\"  data-emptygif=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\">\n" +
"        \n" +
"        <div class=\"mestripescrollfix\">\n" +
"            <button class=\"stripearrow\"  data-aop=\"leftarrow\"  data-id=\"21\" data-m='{\"i\":21,\"p\":20,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            \n" +
"            <div class=\"mestripe\" >\n" +
"                    <h2 class=\"hide\">入口網站瀏覽</h2>\n" +
"                    <ul  role=\"menubar\" >\n" +
"            <li  role=\"presentation\"  class=\"mail\"   data-aop=\"mestripe.mail_me\"  data-id=\"22\" data-m='{\"i\":22,\"p\":20,\"n\":\"meStripe.mail\",\"t\":\"me\",\"o\":2}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://outlook.com/\" target=\"_blank\" data-piitxt=\"mail\" piiurl=\"https://outlook.com/\">\n" +
"\n" +
"                        <h3>Outlook.com<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"store\"   data-aop=\"mestripe.store_mestore2\"  data-id=\"23\" data-m='{\"i\":23,\"p\":20,\"n\":\"meStripe.store\",\"t\":\"meStore2\",\"o\":3}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://www.microsoft.com/zh-tw/store/b/home?icid=MSN_storeTILE\" target=\"_blank\" data-piitxt=\"store\" piiurl=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://www.microsoft.com/zh-tw/store/b/home?icid=MSN_storeTILE\">\n" +
"\n" +
"                        <h3>Microsoft Store<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"facebooklite\"   data-aop=\"mestripe.facebooklite2_mefacebooklite\"  data-id=\"24\" data-m='{\"i\":24,\"p\":20,\"n\":\"meStripe.facebooklite2\",\"t\":\"meFacebookLite\",\"o\":4}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://www.facebook.com/\" target=\"_blank\" data-piitxt=\"facebooklite\" piiurl=\"https://www.facebook.com/\">\n" +
"\n" +
"                        <h3>Facebook<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"onedrive\"   data-aop=\"mestripe.onedrive_me\"  data-id=\"25\" data-m='{\"i\":25,\"p\":20,\"n\":\"meStripe.onedrive\",\"t\":\"me\",\"o\":5}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://onedrive.live.com/?wt.mc_id=oo_msn_msnhomepage_header\" target=\"_blank\" data-piitxt=\"onedrive\" piiurl=\"https://onedrive.live.com/?wt.mc_id=oo_msn_msnhomepage_header\">\n" +
"\n" +
"                        <h3>OneDrive<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"jsskype\"   data-aop=\"mestripe.jsskype_mejsskype\"  data-id=\"26\" data-m='{\"i\":26,\"p\":20,\"n\":\"meStripe.jsSkype\",\"t\":\"meJsSkype\",\"o\":6}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://www.skype.com/\" target=\"_blank\" data-piitxt=\"jsSkype\" piiurl=\"https://www.skype.com/\">\n" +
"\n" +
"                        <h3>Skype<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"office\"   data-aop=\"mestripe.office_meoffice\"  data-id=\"27\" data-m='{\"i\":27,\"p\":20,\"n\":\"meStripe.office\",\"t\":\"meOffice\",\"o\":7}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"//afflnk.microsoft.com/c/1239701/439025/7804?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://www.office.com/?omkt=zh-tw%26WT.mc_id=MSN_site\" target=\"_blank\" data-piitxt=\"office\" piiurl=\"//afflnk.microsoft.com/c/1239701/439025/7804?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://www.office.com/?omkt=zh-tw%26WT.mc_id=MSN_site\">\n" +
"\n" +
"                        <h3>Office<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"maps\"   data-aop=\"mestripe.maps_memaps\"  data-id=\"28\" data-m='{\"i\":28,\"p\":20,\"n\":\"meStripe.maps\",\"t\":\"meMaps\",\"o\":8}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://bing.com/maps/?FORM=MSNMAP\" target=\"_blank\" data-piitxt=\"maps\" piiurl=\"https://bing.com/maps/?FORM=MSNMAP\">\n" +
"\n" +
"                        <h3>地圖<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"onenote\"   data-aop=\"mestripe.onenote_meonenote\"  data-id=\"29\" data-m='{\"i\":29,\"p\":20,\"n\":\"meStripe.onenote\",\"t\":\"meOneNote\",\"o\":9}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://www.onenote.com/notebooks?WT.mc_id=MSN_OneNote_TopMenu&amp;auth=1&amp;wdorigin=msn\" target=\"_blank\" data-piitxt=\"onenote\" piiurl=\"https://www.onenote.com/notebooks?WT.mc_id=MSN_OneNote_TopMenu&amp;auth=1&amp;wdorigin=msn\">\n" +
"\n" +
"                        <h3>OneNote<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"            <li  role=\"presentation\"  class=\"twitter\"   data-aop=\"mestripe.twitter_me\"  data-id=\"30\" data-m='{\"i\":30,\"p\":20,\"n\":\"meStripe.twitter\",\"t\":\"me\",\"o\":10}'\n" +
"                >\n" +
"\n" +
"                    <a href=\"https://twitter.com/\" target=\"_blank\" data-piitxt=\"twitter\" piiurl=\"https://twitter.com/\">\n" +
"\n" +
"                        <h3>Twitter<span></span></h3>\n" +
"                    </a>\n" +
"            </li>\n" +
"    </ul>\n" +
"\n" +
"            </div>\n" +
"            <button class=\"stripearrow\"  data-aop=\"rightarrow\"  data-id=\"31\" data-m='{\"i\":31,\"p\":20,\"n\":\"rightarrow\",\"y\":12,\"o\":11}'  title=\"下一頁\"></button>\n" +
"        </div>\n" +
"            <div class=\"meflyouts\">\n" +
"                        <div  class=\"meflyoutcontainer mail \"   data-id=\"32\" data-m='{\"i\":32,\"p\":20,\"n\":\"meStripe.mail\",\"y\":5,\"o\":12}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"\n" +
" <div class=\"mailsignedoutflyout signout\"  data-aop=\"outlooksignedoutflyout\"  data-id=\"33\" data-m='{\"i\":33,\"p\":32,\"n\":\"outlooksignedoutflyout\",\"y\":8,\"o\":1}'>\n" +
" \n" +
"<section>\n" +
"<h2>在此取得您的郵件</h2>\n" +
"<ul>\n" +
" <li>查看最近的電子郵件</li>\n" +
" <li>傳送快速電子郵件</li>\n" +
" <li>輕鬆管理您的行事曆</li>\n" +
" </ul>\n" +
"</section>\n";
String S5="<h3>使用任何 Microsoft 帳戶登入: Outlook、Hotmail、MSN、Live</h3>\n" +
"<p><a href=\"https://go.microsoft.com/fwlink/?LinkID=254486\"  data-id=\"34\" data-m='{\"i\":34,\"p\":33,\"n\":\"mailsignedoutflyout-accounthelp\",\"y\":12,\"o\":1}'>什麼是 Microsoft 帳戶?</a></p>\n" +
"            <ul>\n" +
"                <li>\n" +
"                    <a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"  data-id=\"35\" data-m='{\"i\":35,\"p\":33,\"n\":\"mailsignedoutflyout-signin\",\"y\":12,\"o\":2}'>登入</a>\n" +
"                </li>\n" +
"                <li>\n" +
"                    <a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"  data-id=\"36\" data-m='{\"i\":36,\"p\":33,\"n\":\"mailsignedoutflyout-createaccount\",\"y\":12,\"o\":3}'>立即建立</a>\n" +
"</li>\n" +
"</ul>\n" +
" \n" +
"</div>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer store \"   data-id=\"37\" data-m='{\"i\":37,\"p\":20,\"n\":\"meStripe.store\",\"y\":5,\"o\":13}'>\n" +
"            \n" +
"            <div class=\"meflyout signin\">\n" +
"                <section>\n" +
"                            <a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://www.microsoft.com/zh-tw/store/b/home?icid=MSN_storeHL\" target=\"_blank\"  data-id=\"38\" data-m='{\"i\":38,\"p\":37,\"n\":\"store\",\"y\":14,\"l\":\"me_store_headerText_signIn\",\"o\":1}'><h3>Microsoft Store</h3></a>\n" +
"                        <div >\n" +
"\n" +
" <ul  data-module-id=\"startpage|meStripe|meStripe|meStripe.store|meStore2\">\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_OFFICE&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\" target=\"_blank\"\n" +
"  data-id=\"39\" data-m='{\"i\":39,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":2}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKYZT.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"人氣首選A\" /> <h3>新敗電腦必備！Office 365 生產力大進化</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_WIN10&amp;u=https://www.microsoft.com/zh-tw/store/collections/windows/pc\" target=\"_blank\"\n" +
"  data-id=\"40\" data-m='{\"i\":40,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":3}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKLU0.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"人氣首選B\" /> <h3>史上最快的開機速度 立刻升級至Windows 10</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_O365YEAR&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\" target=\"_blank\"\n" +
"  data-id=\"41\" data-m='{\"i\":41,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":4}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKZ0c.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"人氣首選C\" /> <h3>令人驚喜的低價 Office 365只要$ 2,190！</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_VISUALSTUDIO&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\" target=\"_blank\"\n" +
"  data-id=\"42\" data-m='{\"i\":42,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":5}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKTJn.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"人氣首選D\" /> <h3>想寫App？快用程式設計師的最愛：Visual Studio</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" </ul>\n" +
"                        </div>\n" +
"                </section>\n" +
"                    <ul>\n" +
"                            <li  data-id=\"43\" data-m='{\"i\":43,\"p\":37,\"n\":\"store\",\"y\":14,\"l\":\"me_store_taskLinks_windows\",\"o\":6}'>\n" +
"                                <a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://www.microsoft.com/zh-tw/store/collections/windows?icid=MSN_Win10\" target=\"_blank\">Windows<span></span></a>\n" +
"                            </li>\n" +
"                            <li  data-id=\"44\" data-m='{\"i\":44,\"p\":37,\"n\":\"store\",\"y\":14,\"l\":\"me_store_taskLinks_support\",\"o\":7}'>\n" +
"                                <a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://support.microsoft.com/zh-tw/products/store\" target=\"_blank\">支援<span></span></a>\n" +
"                            </li>\n" +
"                    </ul>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer facebooklite \"   data-id=\"45\" data-m='{\"i\":45,\"p\":20,\"n\":\"meStripe.facebooklite2\",\"y\":5,\"o\":14}'>\n" +
"            \n" +
"            <div class=\"meflyout signin\">\n" +
"                <section>\n" +
"                            <a href=\"https://www.facebook.com/\" target=\"_blank\"  data-id=\"46\" data-m='{\"i\":46,\"p\":45,\"n\":\"facebooklite\",\"y\":14,\"l\":\"me_facebook_headerText_signIn\",\"o\":1}'><h3>Facebook</h3></a>\n" +
"                        <div >\n" +
"\n" +
"<ul>\n" +
"<li  data-id=\"47\" data-m='{\"i\":47,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":2}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com\">\n" +
"<span></span>\n" +
" 查看新聞摘要\n" +
"</a>\n" +
"</li>\n" +
"<li  data-id=\"48\" data-m='{\"i\":48,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":3}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com/notifications\">\n" +
"<span></span>\n" +
" 查看通知\n" +
"</a>\n" +
"</li>\n" +
"<li  data-id=\"49\" data-m='{\"i\":49,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":4}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com/messages\">\n" +
"<span></span>\n" +
" 檢視訊息\n" +
"</a>\n" +
"</li>\n" +
"<li  data-id=\"50\" data-m='{\"i\":50,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":5}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com/friends/requests\">\n" +
"<span></span>\n" +
" 確認交友邀請\n" +
"</a>\n" +
"</li>\n" +
"</ul>\n" +
" <a href=\"https://www.facebook.com/msntwnews\" target=\"_blank\"  data-id=\"51\" data-m='{\"i\":51,\"p\":45,\"n\":\"fbflyoutstndlike\",\"y\":14,\"o\":6}'>\n" +
"<h3>在 Facebook 上說 MSN 讚</h3>\n" +
"</a>\n" +
"            <ul>\n" +
"                <li>\n" +
"                    <div>\n" +
"                         <h3>msn</h3>\n" +
"                    </div>\n" +
"                    <p>取得 Facebook 最佳線上內容!</p>\n" +
"<iframe src=\"\" scrolling=\"no\" frameborder=\"0\" allowtransparency=\"true\"></iframe>\n" +
"</li>\n" +
"</ul>\n" +
"                        </div>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer onedrive \"   data-id=\"52\" data-m='{\"i\":52,\"p\":20,\"n\":\"meStripe.onedrive\",\"y\":5,\"o\":15}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"                        <div  data-signedout-image-url=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/95/8bd8bf.jpg\">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/95/8bd8bf.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>登入您的 Microsoft 的帳戶以查看最新的 OneDrive 內容。</p>\n" +
"                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"   data-id=\"53\" data-m='{\"i\":53,\"p\":52,\"n\":\"onedrive\",\"y\":14,\"l\":\"me_onedrive_footerText\",\"o\":1}'>登入</a>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer jsskype \"   data-id=\"54\" data-m='{\"i\":54,\"p\":20,\"n\":\"meStripe.jsSkype\",\"y\":5,\"o\":16}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"                        <div >\n" +
"\n" +
" <div >\n" +
"<p class=\"meloading\" ></p>\n" +
"<a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\" class=\"loginlink\" target=\"_blank\">登入</a>\n" +
"<div class=\"skype-recents\" data-style=\"msn\" data-locale=\"zh-tw\"></div>\n" +
"</div>\n" +
"\n" +
"                        </div>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer office \"   data-id=\"55\" data-m='{\"i\":55,\"p\":20,\"n\":\"meStripe.office\",\"y\":5,\"o\":17}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"                        <div  data-signedout-image-url=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/44/c08e43.jpg\">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/44/c08e43.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>免費透過 Office Online 檢視最近的文件或建立新文件。</p>\n" +
"\n" +
"<div  data-module-id=\"startpage|meStripe|meStripe|meStripe.office|meOffice\" data-sso-dependent=\"true\"  data-cache-duration=\"300000\"  data-module-deferred=\"true\">\n" +
"</div>                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"   data-id=\"56\" data-m='{\"i\":56,\"p\":55,\"n\":\"office\",\"y\":14,\"l\":\"me_office_footerText\",\"o\":1}'>登入</a>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer maps \"   data-id=\"57\" data-m='{\"i\":57,\"p\":20,\"n\":\"meStripe.maps\",\"y\":5,\"o\":18}'>\n" +
"            \n" +
"            <div class=\"meflyout signin\">\n" +
"                <section>\n" +
"                            <a href=\"https://www.bing.com/maps/?FORM=MSNLOC&amp;cp=25.04~121.56&amp;lvl=12\" target=\"_blank\"  data-id=\"58\" data-m='{\"i\":58,\"p\":57,\"n\":\"maps\",\"y\":14,\"l\":\"me_maps_headerText\",\"o\":1}'><h3>臺北市</h3></a>\n" +
"                        <div >\n" +
"\n" +
" <a href=\"https://www.bing.com/maps/?FORM=MSNSMP&amp;cp=25.04~121.56&amp;lvl=12&amp;trfc=1\" target=\"_blank\"  data-id=\"59\" data-m='{\"i\":59,\"p\":57,\"n\":\"static.map\",\"y\":14,\"o\":2}'>\n" +
" <img alt=\"含交通資訊的「Bing 地圖」影像\" data-src=\"{&quot;default&quot;:&quot;//ecn.dev.virtualearth.net/REST/v1/Imagery/Map/road/25.04,121.56/12?mapSize=368,182&amp;mapLayer=trafficflow&amp;c=zh&amp;key=Ar57SaDngRFDOGK62G-DuNqDGb44RUPiWza5E9lLntmzp2nFhJnvFELTRZFUhoyq&amp;maxAge=300&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"</a>\n" +
"                        </div>\n" +
"                </section>\n" +
"                    <ul>\n" +
"                            <li  data-id=\"60\" data-m='{\"i\":60,\"p\":57,\"n\":\"maps\",\"y\":14,\"l\":\"me_maps_directions\",\"o\":3}'>\n" +
"                                <a href=\"https://www.bing.com/maps/?FORM=MSNDIR&amp;rtp=pos.25.04_121.56&amp;mode=D\" target=\"_blank\">路線<span></span></a>\n" +
"                            </li>\n" +
"                            <li  data-id=\"61\" data-m='{\"i\":61,\"p\":57,\"n\":\"maps\",\"y\":14,\"l\":\"me_maps_traffic\",\"o\":4}'>\n" +
"                                <a href=\"https://www.bing.com/maps/?FORM=MSNTRF&amp;cp=25.04~121.56&amp;lvl=12&amp;trfc=1\" target=\"_blank\">交通狀況<span></span></a>\n" +
"                            </li>\n" +
"                    </ul>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer onenote \"   data-id=\"62\" data-m='{\"i\":62,\"p\":20,\"n\":\"meStripe.onenote\",\"y\":5,\"o\":19}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"                        <div  data-signedout-image-url=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/8c/865070.jpg\">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/8c/865070.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>登入您的 Microsoft 帳戶以檢視最近的筆記。</p>\n" +
"\n" +
"<div  data-module-id=\"startpage|meStripe|meStripe|meStripe.onenote|meOneNote\" data-sso-dependent=\"true\"  data-cache-duration=\"300000\"  data-module-deferred=\"true\">\n" ;

String S6="</div>                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"   data-id=\"63\" data-m='{\"i\":63,\"p\":62,\"n\":\"onenote\",\"y\":14,\"l\":\"me_onenote_footerText\",\"o\":1}'>登入</a>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer twitter \"  data-deferred=\"1\"  data-id=\"64\" data-m='{\"i\":64,\"p\":20,\"n\":\"meStripe.twitter\",\"y\":5,\"o\":20}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"                        <div  data-signedout-image-url=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/52/8adb60.jpg\">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/52/8adb60.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>取得您的 Twitter 更新</p>\n" +
"                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://twitter.com/\"   data-id=\"65\" data-m='{\"i\":65,\"p\":64,\"n\":\"twitter\",\"y\":14,\"l\":\"me_twitter_footerText\",\"o\":1}'>登入</a>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"\n" +
"            </div>\n" +
"        \n" +
"    </div>\n" +
"<div class='normalsection bannersectionad' role='region'  data-section-id=\"toptakeoverad\"><div class='full-width'><div class='sectioncontent'  data-region=\"toptakeoverad_section\">\n" +
" <div tabindex=\"-1\"  id=\"banner1_homepage_182b0889-f2ca-4709-8438-1f36a82434b1\"  class=\"widead\"   data-aop=\"toptakeover.ad_ad\"  data-id=\"66\" data-m='{\"i\":66,\"p\":19,\"n\":\"topTakeOver.ad\",\"t\":\"ad\",\"o\":2}'   aria-hidden=\"true\">\n" +
" \n" +
" \n" +
"<div class=\"outeradcontainer\">\n" +
" \n" +
"<div  id=\"banner1_homepage_container_182b0889-f2ca-4709-8438-1f36a82434b1\" class=\"adcontainer\" data-adjs='{\"allowedViews\":\"SIZE234COLUMN\"}' tabindex=\"-1\">\n" +
" <script class=\"sdkdapscript\">\n" +
"require([\"dap\"], function (dap)\n" +
"{\n" +
" dap(\"&amp;AP=1402&amp;PG=MSNTWZH15&amp;PVGUID=5ccff976c56c4a539087c2a9ffe97c17&amp;PROVIDERID=7HD66FC\", 1, 1, \"banner1_homepage_container_182b0889-f2ca-4709-8438-1f36a82434b1\", {\"isEnabled\":0, \"isDarkTheme\":0}, {\"scrollInit\":true,\"enableAdRefresh\":true,\"adaptiveRefresh\":true,\"adaptiveRefreshInterval\":3000,\"prid\":\"7HD66FC\",\"adsVNextHeight\":\"LB\",\"adsVNextWidth\":\"LB\",\"rid\":\"5ccff976c56c4a539087c2a9ffe97c17\",\"adtext\":\"\",\"showmute\":false,\"showvolume\":false,\"nonviewablebehavior\":\"\",\"showprogressbar\":false,\"allowfullscreen\":false,\"videothreshold\":1,\"videooffset\":5,\"skiplocation\":\"\",\"skiptext\":\"\",\"skipbuttontext\":\"\",\"playOnMouseover\":false,\"audioOnMouseover\":\"false\",\"playVideoVisibleThreshold\":50,\"disableTopBar\":false,\"preShowType\":\"none\",\"preShowUrl\":\"\",\"postShowType\":\"\",\"postShowUrl\":\"\",\"postShowClickUrl\":\"\",\"fallbackType\":\"\",\"fallbackUrl\":\"\",\"fallbackClickUrl\":\"\",\"vpaidTimeout\":5000,\"terminateUnresponsiveVPAIDCreative\":false,\"enableInlineVideoForIos\":false,\"delayExpandUntilVPAIDInit\":false,\"delayExpandUntilVPAIDImpression\":false,\"apnId\":280});\n" +
" });\n" +
"</script>\n" +
" </div>\n" +
" \n" +
"</div>\n" +
" \n" +
"</div>\n" +
"</div></div></div>    <div class=\"normalsection todaynavigation\"  data-section-id=\"todaynavigation\"  data-aop=\"todaynavigation_section\"  data-id=\"67\" data-m='{\"i\":67,\"p\":19,\"n\":\"todayNavigation\",\"y\":4,\"o\":3}'>\n" +
"        \n" +
"        <div class=\"full-width\">\n" +
"            <button tabindex=\"-1\" class=\"stripearrow\"  data-aop=\"leftarrow\"  data-id=\"68\" data-m='{\"i\":68,\"p\":67,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"sectioncontent\">\n" +
"\n" +
"\n" +
" <div class=\"weatodaymini\"  data-module-id=\"startpage|todayNavigation|section|stripe.today.weather|WeatherTodayMiniModule\"  data-id=\"69\" data-m='{\"i\":69,\"p\":67,\"n\":\"weatherTodayMiniModule\",\"y\":4,\"o\":2}'>\n" +
"<a  href=\"/zh-tw/weather/today/%e8%87%ba%e5%8c%97%e5%b8%82,%e8%87%ba%e7%9d%a3/we-city?iso=TW&amp;el=88BvMEEFglY1eFnLmpENHA%3D%3D\" class=\"location\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\" aria-label=\"臺北市的天氣是多雲時陰，溫度是 19 度。\">\n" +
" <img class=\"image\" src=\"//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB1kKVy.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=30&amp;h=30\"\n" +
"\n" +
"data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB1kKVy.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=30&amp;h=30&quot;}\"\n" +
"alt=\"多雲時陰\" title=\"多雲時陰\" data-icon=\"30\" />\n" +
"<div class=\"loc\">\n" +
"臺北市 / <span>19&#176;C</span>\n" +
"\n" +
"</div>\n" +
"</a>\n" +
"\n" +
" <div class=\"edit\"  data-aop=\"change\">\n" +
"<a class=\"edithome\" href=\"#\" aria-label=\"變更位置或溫度單位\" data-degreetype=\"C\"  data-id=\"70\" data-m='{\"i\":70,\"p\":67,\"n\":\"weathereditbtn\",\"y\":12,\"o\":3}'\n" +
"data-home=\"搜尋地點/城市\" title=\"變更\">變更</a>\n" +
"</div>\n" +
"<div class=\"weapopup\" role=\"dialog\" aria-labelledby=\"weaaddlocation-label\"  data-aop=\"editweatherflyout\"  data-region=\"editweatherflyout\">\n" +
"<div class=\"weaddn wpopbg\"></div>\n" +
"<div class=\"weaddn wpopctn\">\n" +
"<a class=\"close\"  data-id=\"71\" data-m='{\"i\":71,\"p\":67,\"n\":\"weatherTodayMiniClose\",\"t\":\"CloseBtn\",\"o\":4}' role=\"button\" href=\"#\" title=\"關閉\">關閉</a>\n" +
" \n" +
"\n" +
"<div class=\"weaaddlocation\">\n" +
"\n" +
"<form  data-id=\"72\" data-m='{\"i\":72,\"p\":67,\"n\":\"weasearchlocation\",\"y\":8,\"o\":5}' action=\"/zh-tw/weather/search\" data-action=\"/zh-tw/weather/ajax/places/search/\" method=\"get\"  class=\"nogps\">\n" +
" \n" +
"<p class=\"label\" id=\"weaaddlocation-label\">設定預設位置</p>\n" +
"<div class=\"add-loc-as-container\">\n" +
"<input name=\"q\" class=\"query\" accesskey=\"L\" autocomplete=\"off\" type=\"search\" aria-autocomplete=\"list\"\n" +
"value=\"\" maxlength=\"250\" data-auto-suggest-settings='{&quot;market&quot;:&quot;zh-tw&quot;,&quot;mode&quot;:&quot;AS&quot;,&quot;baseurl&quot;:&quot;/zh-tw/weather/today&quot;,&quot;action&quot;:&quot;sethome&quot;,&quot;method&quot;:&quot;custom&quot;,&quot;selector&quot;:&quot;.weaaddlocation&quot;,&quot;urltype&quot;:&quot;GeoLocation&quot;,&quot;formcode&quot;:&quot;&quot;,&quot;lat&quot;:22.9944,&quot;lon&quot;:120.199}'\n" +
"                   placeholder=\"搜尋地點/城市\" data-seemoretext=\"按下 &lt;Enter&gt; 以查看更多內容\" data-autosuggestdelay=\"100\"\n" +
"                   aria-label=\"搜尋地點/城市\"  data-id=\"73\" data-m='{\"i\":73,\"p\":72,\"n\":\"weaautosuggest\",\"y\":10,\"o\":1}' />\n" +
"<button type=\"submit\" title =\"搜尋\" class=\"searchbtn\"  data-id=\"74\" data-m='{\"i\":74,\"p\":72,\"n\":\"wealocationsearch\",\"y\":11,\"o\":2}'\n" +
"  aria-label=\"搜尋\">\n" +
"<span class=\"x-screen-reader\">搜尋</span>               \n" +
"            </button>\n" +
"        </div>\n" +
"        <div class=\"nolocerr\" aria-live=\"assertive\" data-message=\"找不到「{0}」的搜尋結果\"></div>\n" +
"<div class=\"errmsg\" aria-hidden=\"true\" data-error-in-service-message=\"發生意外的錯誤，請再試一次。\"></div>\n" +
"<div class=\"suggestmsg\"></div>\n" +
"<div class=\"autosuggestresults\"  data-id=\"75\" data-m='{\"i\":75,\"p\":72,\"n\":\"weaautosuggestresults\",\"y\":5,\"o\":3}'></div>\n" +
" \n" +
"</form>\n" +
"</div>\n" +
"\n" +
" \n" +
"\n" +
"\n" +
"<div  role=\"radiogroup\">\n" +
"<p>溫度顯示單位</p>\n" +
"<form id=\"id0ec343ae6f874e55adddd937501339a7\" class=\"setdegree\"  data-id=\"76\" data-m='{\"i\":76,\"p\":67,\"n\":\"degreetype\",\"y\":12,\"o\":6}' action=\"/zh-tw/weather/ajax/places/savedegree/\" method=\"post\">\n" +
" \n" +
"<div>\n" +
"<button name=\"weaDegreeType\" id=\"id0ec343ae6f874e55adddd937501339a7_fahrenheit\" value=\"F\"\n" +
"                        class=\"\"\n" +
" role=\"radio\"\n" +
"  data-id=\"77\" data-m='{\"i\":77,\"p\":76,\"n\":\"weafahrenheit\",\"y\":11,\"o\":1}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id0ec343ae6f874e55adddd937501339a7_fahrenheit\" form=\"id0ec343ae6f874e55adddd937501339a7\">華氏</label>\n" +
"            </div>\n" +
"            <div>\n" +
"                <button name=\"weaDegreeType\" id=\"id0ec343ae6f874e55adddd937501339a7_celsius\" value=\"C\"\n" +
"                        class=\"selected\"\n" +
" role=\"radio\"\n" +
"  data-id=\"78\" data-m='{\"i\":78,\"p\":76,\"n\":\"weacelsius\",\"y\":11,\"o\":2}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id0ec343ae6f874e55adddd937501339a7_celsius\" form=\"id0ec343ae6f874e55adddd937501339a7\">攝氏</label>\n" +
"</div>\n" +
" \n" +
"</form>\n" +
"</div>\n" +
"\n";
String S7="<button  data-id=\"79\" data-m='{\"i\":79,\"p\":67,\"n\":\"weatherTodayMiniDone\",\"t\":\"DoneBtn\",\"o\":7}' class=\"donebutton disabled\" disabled=\"disabled\" title=\"完成\">完成</button>\n" +
"</div>\n" +
"</div> </div>\n" +
" <div class=\"stripenav\"  data-aop=\"stripe.today.navigation_todaystripenavigation\"  data-id=\"80\" data-m='{\"i\":80,\"p\":67,\"n\":\"stripe.today.navigation\",\"t\":\"todayStripeNavigation\",\"o\":8}'>\n" +
" \n" +
"<ul>\n" +
" <li class=\"makehomepage\"  data-id=\"81\" data-m='{\"i\":81,\"p\":80,\"n\":\"make_homepage_text\",\"y\":4,\"o\":1}'><h2><a href=\"https://chrome.google.com/webstore/detail/msn-homepage-bing-search/aodojjhnfnfhaplflfohfddffmjkdjak\" target=\"_blank\"  data-id=\"82\" data-m='{\"i\":82,\"p\":80,\"n\":\"make_homepage_text\",\"y\":4,\"o\":2}'>將 MSN 設定為我的首頁</a></h2></li>\n" +
"\n" +
"\n" +
" <li  class=\"weatoday weather\"  data-id=\"83\" data-m='{\"i\":83,\"p\":80,\"n\":\"weather\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/weather\">天氣</a></li>\n" +
" <li  class=\"news\"  data-id=\"84\" data-m='{\"i\":84,\"p\":80,\"n\":\"news\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/news\">新聞</a></li>\n" +
" <li  class=\"entertainment\"  data-id=\"85\" data-m='{\"i\":85,\"p\":80,\"n\":\"entertainment\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/entertainment\">娛樂</a></li>\n" +
" <li  class=\"lifestyle\"  data-id=\"86\" data-m='{\"i\":86,\"p\":80,\"n\":\"lifestyle\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/lifestyle\">生活</a></li>\n" +
" <li  class=\"sports\"  data-id=\"87\" data-m='{\"i\":87,\"p\":80,\"n\":\"sports\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/sports\">運動</a></li>\n" +
" <li  class=\"finance\"  data-id=\"88\" data-m='{\"i\":88,\"p\":80,\"n\":\"finance\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/money\">財經</a></li>\n" +
" <li  class=\"healthfitness\"  data-id=\"89\" data-m='{\"i\":89,\"p\":80,\"n\":\"health\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/health\">健康</a></li>\n" +
" <li  class=\"fooddrink\"  data-id=\"90\" data-m='{\"i\":90,\"p\":80,\"n\":\"foodanddrink\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/foodanddrink\">美食</a></li>\n" +
" <li  class=\"travel\"  data-id=\"91\" data-m='{\"i\":91,\"p\":80,\"n\":\"travel\",\"y\":4,\"o\":11}'><a href=\"/zh-tw/travel\">旅遊</a></li>\n" +
" <li  class=\"autos\"  data-id=\"92\" data-m='{\"i\":92,\"p\":80,\"n\":\"autos\",\"y\":4,\"o\":12}'><a href=\"/zh-tw/autos\">汽車</a></li>\n" +
" <li  class=\"video\"  data-id=\"93\" data-m='{\"i\":93,\"p\":80,\"n\":\"video\",\"y\":4,\"o\":13}'><a href=\"/zh-tw/video\">影音</a></li>\n" +
"  </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"            </div>\n" +
"            <button tabindex=\"-1\" class=\"stripearrow\"  data-aop=\"rightarrow\"  data-id=\"94\" data-m='{\"i\":94,\"p\":67,\"n\":\"rightarrow\",\"y\":12,\"o\":9}'  title=\"下一頁\"></button>\n" +
"        </div>\n" +
"        \n" +
"    </div>\n" +
"        <div class=\"msbrand\">\n" +
"            <span class=\"poweredby\">powered by</span> <span class=\"msnews\">Microsoft News</span>\n" +
"        </div>\n" +
"<div class='normalsection' role='region'  data-section-id=\"outlooklogout\"><div class='full-width'><div class='sectioncontent'  data-region=\"outlooklogout_section\">\n" +
" <div id=\"outlooklogout\"  data-aop=\"outlooklogout\"  data-id=\"95\" data-m='{\"i\":95,\"p\":19,\"n\":\"outlookLogoutModule\",\"t\":\"outlookLogoutModule\",\"o\":4}'  data-outlook-url=\"http://www.outlook.com\">\n" +
"<span>Outlook</span>\n" +
"<a class=\"outlookcontent\" href=\"http://www.outlook.com\" target=\"_blank\">已將您登出。重新登入?</a>\n" +
"<a class=\"signintext\" href=\"http://www.outlook.com\" target=\"_blank\">登入</a>\n" +
"</div>\n" +
"</div></div></div>\n" +
" <div  class=\"todaystripe grid layout-large\"  data-section-id=\"today\"  data-module-id=\"startpage|today|todaystripe|today.Hero|todayStripeHeadlines\"  data-aop=\"today.hero_todaystripeheadlines\"  data-id=\"96\" data-m='{\"i\":96,\"p\":19,\"n\":\"today.Hero\",\"t\":\"todayStripeHeadlines\",\"o\":5}'>\n" +
" \n" +
" <h2 class=\"hide\">最新報導</h2>\n" +
" <ul>\n" +
"<li class=\"infopane-placeholder\">\n" +
" \n" +
" <div class=\"ip infopanestripe slideshow \"\n" +
" data-placements=\"infopane-headtohead-1:2;infopane-headtohead-2:2;infopane-headtohead-3:2\" data-positions=\"4,10,16\" data-section-id=\"infopane\"\n" +
"  data-module-id=\"startpage|infopane|infopanestripe|infopane_a|infopaneStripeHeadlines\" data-param=\"{&quot;text&quot;:&quot;馬上預約&quot;,&quot;url&quot;:&quot;ms-gwx:launch&quot;,&quot;track&quot;:&quot;msn&quot;}\"  data-aop=\"infopane_a_infopanestripeheadlines\"  data-id=\"97\" data-m='{\"i\":97,\"p\":96,\"n\":\"infopane_a\",\"t\":\"infopaneStripeHeadlines\",\"o\":1}'\n" +
">\n" +
" \n" +
"<ul class=\"swipenav\"\n" +
">\n" +
"    <li tabindex=\"0\" class=\" triptych   hasimage  selected \"  data-aop=\"slide1>triptych \"  data-id=\"98\" data-m='{\"i\":98,\"p\":97,\"n\":\"tryptic\",\"y\":8,\"o\":1}' >\n" +
"        \n" +
"\n" +
"\n" +
"		    <h3>今日最注目</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/national/%e6%88%91%e5%9c%8b%e7%8d%84%e6%94%bf%e5%8f%b2%e9%a6%96%e4%be%8b%ef%bc%81%e6%ad%bb%e5%9b%9a%e8%87%aa%e6%ae%ba%e4%ba%a1/ar-BBSqXDl?li=BBqiNIb\"\n" +
"         data-id=\"99\" data-m='{\"i\":99,\"p\":98,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqXDl\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"我國獄政史首例！死囚自殺亡\" onerror=\"this.className=&#39;err&#39;\" onload=\"this.className=&#39;loaded&#39;\" src=\"https://static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqXDi.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=469&amp;y=164\" title=\"我國獄政史首例！死囚自殺亡 - Copyright? 中時電子報\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"我國獄政史首例！死囚橡皮筋環頸亡-文章\">我國獄政史首例！死囚橡皮筋環頸亡</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/news/national/%e6%9a%97%e5%96%bb%e8%94%a1%e8%a6%aa%e7%be%8e%e3%80%8c%e5%bc%b7%e7%9b%9c%e6%90%b6%e9%8c%a2%e6%b2%92%e7%9c%8b%e5%88%b0%e8%ad%a6%e5%af%9f%e3%80%8d/ar-BBSr2qh?li=BBqiNIb\"\n" +
"         data-id=\"100\" data-m='{\"i\":100,\"p\":98,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr2qh\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"暗喻蔡親美「強盜搶錢沒看到警察」\" onerror=\"this.className=&#39;err&#39;\" onload=\"this.className=&#39;loaded&#39;\" src=\"https://static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqPQv.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=347&amp;y=193\" title=\"暗喻蔡親美「強盜搶錢沒看到警察」 - Copyright? 中時電子報\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"柯暗喻蔡親美「強盜搶錢沒看到警察」-文章\">柯暗喻蔡親美「強盜搶錢沒看到警察」</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"    <a   href=\"/zh-tw/news/national/%e7%a7%98%e6%9b%b8%e6%92%9e%e8%87%89%e5%a5%b3%e6%98%9f-%e8%bf%bd%e5%b0%8f%e8%8b%b1%e9%80%9b%e8%a5%bf%e9%96%80%e5%8f%a6%e9%a1%9e%e5%ac%8c%e9%bb%9e/ar-BBSpEPe?li=BBqiNIb\"\n" +
"         data-id=\"101\" data-m='{\"i\":101,\"p\":98,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpEPe\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" onerror=\"this.className=&#39;err&#39;\" onload=\"this.className=&#39;loaded&#39;\" src=\"https://static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpT7V.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=206&amp;y=111\" title=\"秘書撞臉女星 追小英逛西門另類嬌點 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"秘書撞臉女星 追小英逛西門另類嬌點-文章\">秘書撞臉女星 追小英逛西門另類嬌點</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide2>mosaic \"  data-id=\"102\" data-m='{\"i\":102,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":2}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>時事焦點</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/national/%e8%ba%ab%e5%bd%a2%e5%a4%a7%e8%ae%8a-%e9%a8%99%e6%89%81%e5%b0%8f%e5%ad%90%e8%81%b2%e8%ab%8b%e5%81%9c%e5%af%a9%e8%a2%ab%e9%a7%81/ar-BBSqUW0?li=BBqiNIb\"\n" +
"         data-id=\"103\" data-m='{\"i\":103,\"p\":102,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqUW0\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"身形大變 騙扁小子聲請停審被駁\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqXG3.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=256&amp;y=288&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"身形大變 騙扁小子聲請停審被駁 - Copyright? 中時電子報\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"身形大變 騙扁小子聲請停審被駁-文章\">身形大變 騙扁小子聲請停審被駁</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/news/world/%e6%b2%bb%e5%ae%89%e5%a4%aa%e5%a5%bd%ef%bc%9f%e6%97%a5%e8%bb%8a%e7%ab%99%e9%a9%9a%e7%8f%be%e5%a4%a7%e6%89%b9%e8%a1%8c%e6%9d%8e%e4%ba%82%e4%b8%9f/ar-BBSqgI6?li=BBqiNIb\"\n" +
"         data-id=\"104\" data-m='{\"i\":104,\"p\":102,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqgI6\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSq2o4.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"治安太好？日車站驚現大批行李亂丟 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"治安太好？日車站驚現大批行李亂丟-文章\">治安太好？日車站驚現大批行李亂丟</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/news/living/%e7%b8%bd%e7%b6%93%e7%90%86%e9%9d%a2%e8%a9%a6%e2%80%a6%e8%b3%87%e5%84%aa%e7%94%9f%e4%b8%80%e5%8f%a5%e8%a9%b1%e5%b7%a5%e4%bd%9c%e9%a3%9b%e4%ba%86/ar-BBSrpGr?li=BBqiNIb\"\n" +
"         data-id=\"105\" data-m='{\"i\":105,\"p\":102,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpGr\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrfXq.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=406&amp;y=118&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"總經理面試…資優生一句話工作飛了 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"總經理面試…資優生一句話工作飛了-文章\">總經理面試…資優生一句話工作飛了</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n";
String S8="    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide3>mosaic \"  data-id=\"106\" data-m='{\"i\":106,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":3}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>娛樂新聞</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/news/%e4%bd%99%e5%a4%a9%e9%81%b8%e8%88%89%e8%b3%a0%e5%85%895%e9%96%93%e6%88%bf-%e9%99%b3%e6%8f%ae%e6%96%87%e8%b3%a3%e5%81%87%e5%95%a6%ef%bc%81%e6%8f%ad%e7%ab%8b%e5%a7%94%e5%a4%9a%e5%a5%bd%e8%b3%ba/ar-BBSpX1N?li=BBqiNIb\"\n" +
"         data-id=\"107\" data-m='{\"i\":107,\"p\":106,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpX1N\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"余天選舉賠光5間房 陳揮文：賣假啦！揭立委多好賺\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrqad.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=129&amp;y=132&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"余天選舉賠光5間房 他打臉揭立委多好賺 - 中時電子報\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"余天選舉賠光5間房 他打臉揭立委多好賺-文章\">余天選舉賠光5間房 他打臉揭立委多好賺</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/entertainment/news/%e5%90%b3%e7%a7%80%e6%b3%a2%e7%9a%84%e5%b0%8f%e4%b8%89%e8%a2%ab%e6%8d%95-%e7%8e%8b%e6%80%9d%e8%81%b0%e6%80%92%e7%82%b8%e6%af%94%e6%b8%a3%e9%82%84%e6%b8%a3/ar-BBSrunu?li=BBqiNIb\"\n" +
"         data-id=\"108\" data-m='{\"i\":108,\"p\":106,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrunu\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrBuB.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=186&amp;y=234&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"吳秀波的小三被捕 王思聰怒炸：比渣還渣 - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"吳秀波的小三被捕 王思聰怒炸：比渣還渣-文章\">吳秀波的小三被捕 王思聰怒炸：比渣還渣</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/entertainment/news/%e6%94%b6%e6%ad%bb%e4%ba%a1%e5%a8%81%e8%84%85%e9%a6%96%e7%8f%be%e8%ba%ab%ef%bc%81%e5%ad%90%e7%91%9c%e9%80%99%e8%a1%a8%e6%83%85%e6%83%b9%e5%bf%83%e7%96%bc/ar-BBSq5dg?li=BBqiNIb\"\n" +
"         data-id=\"109\" data-m='{\"i\":109,\"p\":106,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq5dg\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"周子瑜,TWICE/翻攝自TWICE IG\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrBv8.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=117&amp;y=150&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"收死亡威脅首現身！子瑜這表情惹心疼 - 三立新聞網\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"收死亡威脅首現身！子瑜這表情惹心疼-文章\">收死亡威脅首現身！子瑜這表情惹心疼</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" head-to-head   hasimage \"  data-aop=\"slide4>head-to-head \"  data-id=\"110\" data-m='{\"i\":110,\"p\":97,\"n\":\"headtohead\",\"y\":8,\"o\":4}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>娛樂星鮮事</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/news/%e4%bd%99%e5%a4%a9%e5%93%ad%e4%ba%86%ef%bc%9f%e5%a5%b3%e5%85%92%e5%a9%9a%e5%ae%b4%e6%9d%8e%e4%ba%9e%e8%90%8d%e5%98%b2%e5%83%8f%e7%b4%85%e5%8c%85%e5%a0%b4/ar-BBSfL0v?li=BBqiNIb\"\n" +
"         data-id=\"111\" data-m='{\"i\":111,\"p\":110,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfL0v\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"李亞萍,小明星大跟班,／中天提供\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfUvm.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=315&amp;y=191&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"李亞萍,小明星大跟班,／中天提供 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"余天哭了？女兒婚宴李亞萍嘲像紅包場-文章\">余天哭了？女兒婚宴李亞萍嘲像紅包場</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/entertainment/news/%e9%bb%83%e5%98%89%e5%8d%83%e5%92%8c%e5%a4%8f%e5%85%8b%e7%ab%8b%e6%93%94%e5%bf%83%e5%ae%b6%e5%ba%ad%e6%88%b0%e7%88%ad-%e5%af%ab%e9%81%ba%e5%9b%91%e3%80%8c%e4%ba%a4%e4%bb%a3%e5%a5%bd%e5%a4%8f%e5%a4%a9%e5%8e%bb%e5%90%91%e3%80%8d/ar-BBSgQAy?li=BBqiNIb\"\n" +
"         data-id=\"112\" data-m='{\"i\":112,\"p\":110,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgQAy\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"黃嘉千和夏克立擔心家庭戰爭 寫遺囑「交代好夏天去向」\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSh7iz.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=284&amp;y=156&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"黃嘉千和夏克立擔心家庭戰爭 寫遺囑「交代好夏天去向」 - Copyright? 中時電子報\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"黃嘉千和夏克立擔心家庭戰爭 寫遺囑「交代好夏天去向」-文章\">黃嘉千和夏克立擔心家庭戰爭 寫遺囑「交代好夏天去向」</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide5>mosaic \"  data-id=\"113\" data-m='{\"i\":113,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":5}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>健康新知</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/health/topic/%e4%ba%ba%e7%94%9f%e7%b5%82%e9%9c%80%e4%b8%80%e5%88%a5-%e9%80%99%e6%a8%a3%e5%81%9a%e5%ad%b8%e6%9c%83%e9%9d%a2%e5%b0%8d%e6%ad%bb%e4%ba%a1%e3%80%81%e4%b8%8d%e5%86%8d%e6%81%90%e6%87%bc/ar-BBSdt76?li=BBqiNIb\"\n" +
"         data-id=\"114\" data-m='{\"i\":114,\"p\":113,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdt76\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"人生終需一別 這樣做學會面對死亡、不再恐懼\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdt70.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=207&amp;y=244&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"人生終需一別 這樣做學會面對死亡、不再恐懼 - 由 PIN NETWORK CO LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"人生終需一別 這樣做學會面對死亡、不再恐懼-文章\">人生終需一別 這樣做學會面對死亡、不再恐懼</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />華人健康網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/health/topic/%e7%9c%bc%e7%9a%ae%e8%b7%b3%e6%98%af%e5%bf%ab%e4%b8%ad%e9%a2%a8%ef%bc%9f%e9%86%ab%e8%ad%a6%e5%91%8a5%e6%83%85%e5%bd%a2%e9%80%9f%e5%b0%b1%e9%86%ab/ar-BBSgESD?li=BBqiNIb\"\n" +
"         data-id=\"115\" data-m='{\"i\":115,\"p\":113,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgESD\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgESv.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=299&amp;y=176&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"眼皮跳是快中風？醫警告5情形速就醫 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"眼皮跳是快中風？醫警告5情形速就醫-文章\">眼皮跳是快中風？醫警告5情形速就醫</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/health/topic/%e7%bd%b9%e7%99%8c%e5%be%8c%e5%a5%b9%e6%9c%80%e6%83%b3%e8%aa%aa%e6%bf%95%e7%96%b9%ef%bc%8d%e6%88%91%e7%9a%84%e8%80%81%e6%9c%8b%e5%8f%8b%ef%bc%8c%e8%ac%9d%e8%ac%9d%e4%bd%a0/ar-BBSjsJO?li=BBqiNIb\"\n" +
"         data-id=\"116\" data-m='{\"i\":116,\"p\":113,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjsJO\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"罹癌後她最想說：濕疹－我的老朋友，謝謝你\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjrkW.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=266&amp;y=140&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"罹癌後她最想說：濕疹－我的老朋友，謝謝你 - 由 Common Wealth Magazine Group 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"罹癌後她最想說：濕疹－我的老朋友，謝謝你-文章\">罹癌後她最想說：濕疹－我的老朋友，謝謝你</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"康健雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />康健雜誌        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide6>mosaic \"  data-id=\"117\" data-m='{\"i\":117,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":6}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>體壇動態</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/sports/sports-badminton/%e5%b0%8f%e6%88%b4%e4%b8%8d%e6%95%b5%e6%b3%b0%e5%9c%8b%e4%b8%80%e5%a7%90-%e9%96%8b%e5%ad%a3%e9%a6%96%e7%ab%99%e6%ad%a2%e6%ad%a58%e5%bc%b7/ar-BBSpn66?li=BBqiNIb\"\n" +
"         data-id=\"118\" data-m='{\"i\":118,\"p\":117,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpn66\",\"h\":0,\"v\":\"sports\",\"c\":\"sports-badminton\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"小戴不敵泰國一姐　開季首站止步8強\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBO3dlj.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=397&amp;y=128&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"戴資穎。（張哲郢／攝） - TSNA\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"小戴不敵泰國一姐 開季首站止步8強-文章\">小戴不敵泰國一姐 開季首站止步8強</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"TSNA 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />TSNA        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n";
String S9="        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/sports/tennis/%e7%b6%b2%e7%90%83%ef%bc%8f%e5%85%88%e7%9b%9b%e5%be%8c%e8%a1%b0-%e8%ac%9d%e6%b7%91%e8%96%87%e7%84%a1%e7%b7%a316%e5%bc%b7/ar-BBSro6f?li=BBqiNIb\"\n" +
"         data-id=\"119\" data-m='{\"i\":119,\"p\":117,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSro6f\",\"h\":0,\"v\":\"sports\",\"c\":\"tennis\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"▲謝淑薇。（圖／翻攝自澳網 Twitter）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrgkc.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=240&amp;y=145&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"▲謝淑薇。（圖／翻攝自澳網 Twitter） - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"網球／先盛後衰 謝淑薇無緣16強-文章\">網球／先盛後衰 謝淑薇無緣16強</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/sports/cpbl/%e4%b8%ad%e8%81%b7%e3%80%8b%e6%9e%97%e6%99%ba%e5%8b%9d%e6%81%90%e9%81%ad%e5%a4%a7%e7%a0%8d%e8%96%aa-21%e6%97%a5%e9%9a%a8%e4%b8%ad%e4%bf%a1%e6%98%a5%e8%a8%93/ar-BBSpDwB?li=BBqiNIb\"\n" +
"         data-id=\"120\" data-m='{\"i\":120,\"p\":117,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpDwB\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball_cpbl\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"中職》林智勝恐遭大砍薪 21日隨中信春訓\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpBra.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=318&amp;y=111&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"中職》林智勝恐遭大砍薪 21日隨中信春訓 - Copyright? 中時電子報\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"林智勝恐遭大砍薪 21日隨中信春訓-文章\">林智勝恐遭大砍薪 21日隨中信春訓</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide7>mosaic \"  data-id=\"121\" data-m='{\"i\":121,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":7}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>財經焦點</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/money/topstories/%e8%98%8b%e6%9e%9c%e7%a0%8d%e5%96%ae%e6%8e%83%e5%88%b0%e9%b4%bb%e6%b5%b7-%e5%af%8c%e5%a3%ab%e5%ba%b7%e9%84%ad%e5%b7%9e%e5%bb%a0%e7%b4%af%e8%a8%88%e8%a3%81%e6%92%a45%e8%90%ac%e4%ba%ba%e5%8a%9b%ef%bc%9f/ar-BBSruXG?li=BBqiNIb\"\n" +
"         data-id=\"122\" data-m='{\"i\":122,\"p\":121,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSruXG\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"▲有日媒報導，自去（2018）年以來，因iPhone需求放緩，富士康河南鄭州廠已累計裁撤5萬名人力。 (圖／NOWnews資料照片)\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrH00.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2141&amp;y=793&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"▲有日媒報導，自去（2018）年以來，因iPhone需求放緩，富士康河南鄭州廠已累計裁撤5萬名人力。 (圖／NOWnews資料照片) - 由 NOWnews Network Co.,Ltd 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"蘋果砍單掃到鴻海 富士康鄭州廠累計裁撤5萬人力？-文章\">蘋果砍單掃到鴻海 富士康鄭州廠累計裁撤5萬人力？</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />NOWnews        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/money/topstories/60%e5%84%84%e6%89%93%e9%80%a0%e8%b1%aa%e8%8f%af%e5%9f%8e%e5%a0%a1%e9%a3%af%e5%ba%97-%e8%8a%b1%e8%93%ae%e9%96%8b%e5%bc%b5%e6%8c%91%e6%88%b0%e5%a4%9a%e5%80%8b%e5%85%a8%e5%8f%b0%e7%ac%ac%e4%b8%80/ar-BBS9Z27?li=BBqiNIb\"\n" +
"         data-id=\"123\" data-m='{\"i\":123,\"p\":121,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS9Z27\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"占地2萬坪、多達40棟建築物的「瑞穗春天國際觀光酒店」已經開始試營運。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS9T5V.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"占地2萬坪、多達40棟建築物的「瑞穗春天國際觀光酒店」已經開始試營運。 - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"60億打造豪華城堡飯店 花蓮開張挑戰多個全台第一-文章\">60億打造豪華城堡飯店 花蓮開張挑戰多個全台第一</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/money/topstories/%e6%87%b8%e5%b4%96%e4%b8%8a%e7%9a%84%e5%8f%b0%e7%81%a3%e5%a5%87%e8%b9%9f-%e5%bc%95%e7%88%86%e5%a3%bd%e9%9a%aa%e6%a5%ad2200%e5%84%84%e5%8c%af%e6%90%8d/ar-BBSjymf?li=BBqiNIb\"\n" +
"         data-id=\"124\" data-m='{\"i\":124,\"p\":121,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjymf\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjymb.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=432&amp;y=296&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"懸崖上的台灣奇蹟 引爆壽險業2,200億匯損 - 由 Home Media Group LTD., Cite Branch 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"保戶夢魘！懸崖上的台灣奇蹟 引爆壽險業2200億匯損-文章\">保戶夢魘！懸崖上的台灣奇蹟 引爆壽險業2200億匯損</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"商業周刊  標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3igyX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />商業周刊         </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide8>mosaic \"  data-id=\"125\" data-m='{\"i\":125,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":8}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>丈夫消失了</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/national/%e3%80%90%e4%b8%88%e5%a4%ab%e6%b6%88%e5%a4%b1%e4%ba%86%e4%b8%80%e3%80%91%e5%8c%96%e5%90%8d%e5%90%b3%e5%b0%8f%e5%a7%90%e7%99%bb%e5%a0%b1%e5%be%b5%e5%a9%9a-%e5%a9%9a%e5%89%8d%e5%b0%8b%e6%84%9b%e5%a9%9a%e5%be%8c%e5%8d%bb%e6%83%b3%e8%91%97%e4%b8%88%e5%a4%ab%e4%b8%8d%e8%a6%8b%e4%ba%86/ar-BBSfFtP?li=BBqiNIb\"\n" +
"         data-id=\"126\" data-m='{\"i\":126,\"p\":125,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfFtP\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"近年陳玉慧（中）因拍攝電影， 有較長的時間住在台灣， 由於長期住在德國、法國， 台灣對她來說有一股異域感。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfK9H.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=415&amp;y=185&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"近年陳玉慧（中）因拍攝電影， 有較長的時間住在台灣， 由於長期住在德國、法國， 台灣對她來說有一股異域感。 - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"化名吳小姐登報徵婚 婚後卻想著丈夫不見了-文章\">化名吳小姐登報徵婚 婚後卻想著丈夫不見了</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/news/national/%e3%80%90%e4%b8%88%e5%a4%ab%e6%b6%88%e5%a4%b1%e4%ba%86%e5%9b%9b%e3%80%91%e5%8f%ab%e4%b8%88%e5%a4%ab%e3%80%8c%e8%b5%b0%e9%96%8b%e3%80%8d%e5%a6%82%e5%96%8a%e8%b2%93%e7%8b%97-%e5%88%86%e6%89%8b%e5%be%8c%e5%89%8d%e5%a4%ab%e8%aa%aa%e6%88%91%e7%8f%be%e5%9c%a8%e8%b5%b0%e9%96%8b%e4%ba%86/ar-BBSfRdX?li=BBqiNIb\"\n" +
"         data-id=\"127\" data-m='{\"i\":127,\"p\":125,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfRdX\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"陳玉慧的前夫明夏．科內留斯。（陳玉慧提供）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfFut.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=377&amp;y=196&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"陳玉慧的前夫明夏．科內留斯。（陳玉慧提供） - 由 Mirror Media Inc 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"叫丈夫「走開」如喊貓狗 她曝婚姻破裂主因-文章\">叫丈夫「走開」如喊貓狗 她曝婚姻破裂主因</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/news/national/%e3%80%90%e4%b8%88%e5%a4%ab%e6%b6%88%e5%a4%b1%e4%ba%86%e4%ba%8c%e3%80%91%e9%81%ad%e5%bf%83%e7%90%86%e5%b8%ab%e8%ad%a6%e5%91%8a%e8%b5%b0%e4%b8%8d%e5%87%ba%e6%80%a7%e4%be%b5%e9%99%b0%e5%bd%b1-%e9%99%b3%e7%8e%89%e6%85%a7%e5%a5%bd%e5%a4%a7%e7%9a%84%e6%81%90%e5%9a%87%ef%bc%81/ar-BBSfMbp?li=BBqiNIb\"\n" +
"         data-id=\"128\" data-m='{\"i\":128,\"p\":125,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfMbp\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"陳玉慧成長於新北市中和區， 20歲便到法國學戲劇，從此旅居國外， 本次採訪是她第一次回到童年故居。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfFui.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=393&amp;y=294&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"陳玉慧成長於新北市中和區， 20歲便到法國學戲劇，從此旅居國外， 本次採訪是她第一次回到童年故居。 - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"兩度遭性侵 她竟被心理師警告恐走不出陰影-文章\">兩度遭性侵 她竟被心理師警告恐走不出陰影</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide9>mosaic \"  data-id=\"129\" data-m='{\"i\":129,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":9}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>車壇動態</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/autos/news/%e8%b2%b7%e8%bb%8a%e8%ad%b0%e5%83%b9%e6%9c%89%e7%9c%89%e8%a7%92-5%e5%a4%a7%e5%9c%b0%e9%9b%b7%e6%9c%80%e5%a5%bd%e5%88%a5%e5%87%ba%e5%8f%a3/ar-BBSaXVN?li=BBqiNIb\"\n" +
"         data-id=\"130\" data-m='{\"i\":130,\"p\":129,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSaXVN\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"握手,合作,交易,談判,商談,職場（圖／Pixabay）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBScWtD.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2933&amp;y=1566&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"購車，交車，買車 - Catalyst Images\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"買車議價有眉角 5大地雷最好別出口-文章\">買車議價有眉角 5大地雷最好別出口</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/autos/news/%e3%80%90%e5%bf%85%e9%a4%8a%e8%a7%80%e5%bf%b5%e3%80%91abs%e9%80%99%e4%bd%8d%e5%a5%bd%e6%9c%8b%e5%8f%8b%e9%83%bd40%e6%ad%b2%e4%ba%86%ef%bc%8c%e5%a4%a7%e5%ae%b6%e9%82%84%e4%b8%8d%e5%a4%aa%e7%86%9f%e2%80%a6/ar-BBSg4D7?li=BBqiNIb\"\n" +
"         data-id=\"131\" data-m='{\"i\":131,\"p\":129,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSg4D7\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"四個輪子的汽車ABS都不可或缺了，兩個輪子呢?\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSg39R.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"四個輪子的汽車ABS都不可或缺了，兩個輪子呢? - 由 Mirror Media Inc 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"abs這位好朋友都40歲了，大家還不太熟…-文章\">ABS這位好朋友都40歲了，大家還不太熟…</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/autos/news/%e6%a9%9f%e8%bb%8a%e5%81%b4%e6%9f%b1%e6%98%af%e5%90%a6%e5%8f%af%e4%bb%a5%e7%a7%bb%e9%99%a4%ef%bc%9f-%e7%b6%b2%e5%8f%8b%e6%88%b0%e7%bf%bb%e4%ba%86/ar-BBS9tUy?li=BBqiNIb\"\n" +
"         data-id=\"132\" data-m='{\"i\":132,\"p\":129,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS9tUy\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"機車被立中柱PO文罵　反被噓「側停擋路」\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQBsCu.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"機車，停車 - Catalyst Images\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"機車側柱是否可以移除？網友戰翻了-文章\">機車側柱是否可以移除？網友戰翻了</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" single   hasimage \"  data-aop=\"slide10>single \"  data-id=\"133\" data-m='{\"i\":133,\"p\":97,\"n\":\"single\",\"y\":8,\"o\":10}' >\n" +
"				<h3>?一起去旅行</h3>\n" +
"            <a \n" +
"       \n" +
"       href=\"/zh-tw/lifestyle/travel/%e6%9f%8f%e6%9e%97-%e5%be%b7%e5%9c%8b%e5%89%8d%e4%b8%96%e4%bb%8a%e7%94%9f%e7%9a%84%e7%b8%ae%e5%bd%b1/ar-BBSgsEz?li=BBqiNIb\"\n" +
"        data-id=\"134\" data-m='{\"i\":134,\"p\":133,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgsEz\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":1}'  >\n" +
"\n" +
"        \n" +
"\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgsEn.img?h=515&amp;w=871&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=319&amp;y=226&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 Yu Ho Corporation 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"柏林：德國前世今生的縮影-文章\">柏林：德國前世今生的縮影</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"背包客棧 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAvVD2u.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />背包客棧        </span>\n" +
"    </div>\n" +
"        \n" +
"    </a>\n" +
"\n" +
"        \n" +
"    </li>\n";
    public StringBuffer bufX01;    
    public X01() {
        bufX01=new StringBuffer(S1);
        bufX01.append(S2);
        //bufX01.append(S3);
        //bufX01.append(S4);
        //bufX01.append(S5);
        //bufX01.append(S6);
        //bufX01.append(S7);
        //bufX01.append(S8);
        //bufX01.append(S9);
	
    }
	@Test
	public void hello()  {
		HTML that=new HTML(bufX01);
		that.go();
	        that.PrintIssues();
	        TestHTM1.ReportInTest(that);
	        assertTrue(that.Left.size() == that.Right.size());
	        assertTrue(that.LeftOrRight.size() == that.Left.size() * 2);

	}
        @Test
        public void hello2() {
                //BUG的成因:  <style>裡面可以直接放CSS內容.....
                String err="<link rel=\"shortcut icon\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/a5ea21.ico\" /><style>@media screen and (max-width:78.99em) and (min-width:58.875em){.layout-none:not(.mod1) .pos2{left:0}}.ie8 .grid .pick4~li.pick{display:none}.todaystripe .todayshowcasead:hover{opacity:1}.spartan #main .paging-container.snap{overflow-x:hidden}#addRemoveSectionsModalContainer #addRemoveSectionsModal{display:block}.tmx.mobile .superbowl .matchupstripe{margin:0 auto}.stripecontainer .stripeouter.noborder{height:33.7rem}html[dir='rtl'] .ie8 .mip>ul>li.triptych h3+a{border-right:0}html[dir='ltr'] .ie8 .mip>ul>li.triptych h3+a{border-left:0}.meflyouts .integratedskype .signin>ul li:first-child{display:none}.tmx.pc.webkit.chrome .stripecontent ul{overflow-x:hidden}.meflyouts .bingrewards{display:none}.mobile .galleryinfo .img-divider{display:none}.homepage.tmx.pc.chrome #main .one-col,.homepage.tmx.pc.chrome #main .two-col,.homepage.tmx.pc.chrome #main .three-col{margin-right:-.016rem;margin-left:-.016rem}.homepage.midlevel .pagingsection>button.show,.channelplayerpage.midlevel .pagingsection>button.show{display:none}.settings.start.tmx.pc .globalsettings .social.twitter{display:none}</style>\n";
                HTML that=new HTML(new StringBuffer(err));
                that.go();
                that.PrintIssues();
                TestHTM1.ReportInTest(that);
	        assertTrue(that.Left.size() == that.Right.size());
	        assertTrue(that.LeftOrRight.size() == that.Left.size() * 2);
                
        }
    
}
