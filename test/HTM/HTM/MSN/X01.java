/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTM.HTM.MSN;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class X01 {
    String JSP="<!DOCTYPE html><html prefix=\"og: http://ogp.me/ns# fb: http://ogp.me/ns/fb#\"  lang=\"zh-TW\"  style=\"font-size:62.5%\"  class=\"hiperf\"  dir=\"ltr\" >\n" +
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
"\n" +
"            <link rel=\"preload\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/25d540.woff2\" as=\"font\" type=\"font/woff2\" crossorigin=\"anonymous\"/>\n" +
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
"\n" +
"  </div>\n" +
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
"\n" +
"     <div class=\"stripeouter mestripeouter\"  data-aop=\"mestripe_mestripe\"  data-id=\"20\" data-m='{\"i\":20,\"p\":19,\"n\":\"meStripe\",\"t\":\"meStripe\",\"o\":1}'\n" +
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
"</section>\n" +
"<h3>使用任何 Microsoft 帳戶登入: Outlook、Hotmail、MSN、Live</h3>\n" +
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
"<div  data-module-id=\"startpage|meStripe|meStripe|meStripe.onenote|meOneNote\" data-sso-dependent=\"true\"  data-cache-duration=\"300000\"  data-module-deferred=\"true\">\n" +
"</div>                        </div>\n" +
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
"\n" +
"<button  data-id=\"79\" data-m='{\"i\":79,\"p\":67,\"n\":\"weatherTodayMiniDone\",\"t\":\"DoneBtn\",\"o\":7}' class=\"donebutton disabled\" disabled=\"disabled\" title=\"完成\">完成</button>\n" +
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
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage \"  data-aop=\"slide3>mosaic \"  data-id=\"106\" data-m='{\"i\":106,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":3}' >\n" +
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
"\n" +
"        <ul>\n" +
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
"    </li>\n" +
"    <li tabindex=\"0\" class=\" head-to-head   hasimage \"  data-aop=\"slide11>head-to-head \"  data-id=\"135\" data-m='{\"i\":135,\"p\":97,\"n\":\"headtohead\",\"y\":8,\"o\":11}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>?2019年運大公開</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/zodiac-signs/%e5%95%8f%e7%a5%9e%e9%81%94%e4%ba%ba%ef%bc%8f12%e7%94%9f%e8%82%96%e5%b7%a5%e4%bd%9c%e9%81%8b%e5%8b%a2%ef%bc%88%e4%b8%8a%ef%bc%89/ar-BBSdaGe?li=BBqiNIb\"\n" +
"         data-id=\"136\" data-m='{\"i\":136,\"p\":135,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdaGe\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"zodiac-signs\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdaGc.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=352&amp;y=107&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"問神達人／12生肖工作運勢（上） - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"2019春季12生肖工作運勢（上）-文章\">2019春季12生肖工作運勢（上）</span>\n" +
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
"    <a   href=\"/zh-tw/lifestyle/zodiac-signs/%e5%95%8f%e7%a5%9e%e9%81%94%e4%ba%ba%ef%bc%8f12%e7%94%9f%e8%82%96%e5%b7%a5%e4%bd%9c%e9%81%8b%e5%8b%a2-%e4%b8%8b/ar-BBSd5FZ?li=BBqiNIb\"\n" +
"         data-id=\"137\" data-m='{\"i\":137,\"p\":135,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd5FZ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"zodiac-signs\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdd9c.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=155&amp;y=102&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"問神達人／12生肖工作運勢(下) - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"2019春季12生肖工作運勢（下）-文章\">2019春季12生肖工作運勢（下）</span>\n" +
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
"    <li tabindex=\"0\" class=\" triptych   hasimage  media photo\"  data-aop=\"slide12>triptych \"  data-id=\"138\" data-m='{\"i\":138,\"p\":97,\"n\":\"tryptic\",\"y\":8,\"o\":12}' >\n" +
"        \n" +
"\n" +
"\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e5%8f%8d%e6%8c%87%e6%a8%99%ef%bc%9f%e7%88%9b%e7%95%aa%e8%8c%84%e8%a9%95%e5%83%b9%e8%b6%85%e4%bd%8e%e7%9a%84%e9%9b%bb%e5%bd%b1%e5%8d%bb%e8%b6%85%e8%b3%a3%e5%ba%a7/ss-BBSdmIS?li=BBqiNIb\"\n" +
"         data-id=\"139\" data-m='{\"i\":139,\"p\":138,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdmIS\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRXnzJ.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"&quot;The Fate Of The Furious&quot; Film - 2017 Vin Diesel - Universal/Kobal/Shutterstock\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】爛番茄評價超低 這些電影卻大賣-圖片集\">【圖】爛番茄評價超低 這些電影卻大賣</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/lifestyle/photos/%e3%80%90%e5%9c%96%e3%80%91%e9%ac%bc%e6%96%a7%e7%a5%9e%e5%b7%a5%ef%bc%81%e5%85%a8%e4%b8%96%e7%95%8c%e3%80%8c%e9%b9%bd%e6%b9%96%e3%80%8d%e5%a5%87%e6%99%af%e5%a4%a7%e5%85%ac%e9%96%8b/ss-BBSfY37?li=BBqiNIb\"\n" +
"         data-id=\"140\" data-m='{\"i\":140,\"p\":138,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfY37\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"photos\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRYwc7.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"An Aerial view of the Australian outback in flood around Lake Eyre, showing the ... - southern lightscapes\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】鬼斧神工!盤點全球「鹽湖」奇景-圖片集\">【圖】鬼斧神工!盤點全球「鹽湖」奇景</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"    <a   href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e6%97%a5%e7%b6%b2%e8%a9%95%e5%8f%b0%e7%81%a3%e6%9c%80%e7%be%8e%e8%97%9d%e4%ba%ba-%e6%9e%97%e5%bf%97%e7%8e%b2%e9%80%a3%e5%89%8d10%e9%83%bd%e9%80%b2%e4%b8%8d%e4%ba%86%ef%bc%81/ss-BBSiIyB?li=BBqiNIb\"\n" +
"         data-id=\"141\" data-m='{\"i\":141,\"p\":138,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSiIyB\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSiSvd.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1234&amp;y=1356&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林志玲 - Getty\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】日網評台灣美女 林志玲竟比輸？-圖片集\">【圖】日網評台灣美女 林志玲竟比輸？</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage  media video\"  data-aop=\"slide13>mosaic \"  data-id=\"142\" data-m='{\"i\":142,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":13}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>精選影音</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/video/viral/%e8%a2%ab%e7%8d%b5%e4%ba%ba%e6%94%be%e7%94%9f%e5%be%8c%e6%9a%b4%e6%80%92-%e9%80%b2%e6%93%8a%e7%9a%84%e8%b1%ac%e5%a4%a7%e5%8f%8d%e6%8a%97%ef%bc%81/vi-BBS5o7x\"\n" +
"         data-id=\"143\" data-m='{\"i\":143,\"p\":142,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS5o7x\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdlhx.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2734&amp;y=1823&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Marcassin, Sanglier (Sus scrofa) - Getty\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"被獵人放生後暴怒 進擊的豬大反抗！-影音\">被獵人放生後暴怒 進擊的豬大反抗！</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />BuzzVideos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/video/viral/%e8%83%a1%e6%a4%92%e7%b2%89%e6%92%92%e4%b8%8d%e5%87%ba%e4%be%86%ef%bc%9f%e7%94%9f%e6%b4%bb%e5%a6%99%e6%8b%9b%e5%86%8d%e4%b8%80%e7%99%bc/vi-BBS5HKF\"\n" +
"         data-id=\"144\" data-m='{\"i\":144,\"p\":142,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS5HKF\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"胡椒粉撒不出來？生活妙招再一發\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdfjp.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=538&amp;y=447&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"胡椒粉撒不出來？生活妙招再一發 - buzzvideos\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"胡椒粉撒不出來？生活妙招再一發-影音\">胡椒粉撒不出來？生活妙招再一發</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />BuzzVideos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/video/viral/%e7%b5%82%e6%96%bc%e5%a8%b6%e5%88%b0%e6%b0%b4%e6%9f%90%e6%96%b0%e9%83%8e%e7%b7%8a%e5%bc%b5%e5%88%b0%e6%9a%88%e5%80%92%ef%bc%81/vi-BBS5eq0\"\n" +
"         data-id=\"145\" data-m='{\"i\":145,\"p\":142,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS5eq0\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS5JSi.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"終於娶到水某...新郎緊張到暈倒！ - BUZZVIDEOS\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"終於娶到水某...新郎緊張到暈倒！-影音\">終於娶到水某...新郎緊張到暈倒！</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />BuzzVideos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" head-to-head   hasimage \"  data-aop=\"slide14>head-to-head \"  data-id=\"146\" data-m='{\"i\":146,\"p\":97,\"n\":\"headtohead\",\"y\":8,\"o\":14}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>探索生活</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/lifestyleliving/%e4%bd%a0%e4%b9%9f%e6%9c%89%ef%bc%9f%e9%80%99%e4%b8%89%e5%80%8b%e5%b9%b4%e7%b4%80%e6%98%af%e4%ba%ba%e7%94%9f%e5%ad%a4%e7%8d%a8%e6%84%9f%e9%ab%98%e5%b3%b0/ar-BBSfNjl?li=BBqiNIb\"\n" +
"         data-id=\"147\" data-m='{\"i\":147,\"p\":146,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfNjl\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQooCN.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=152&amp;y=163&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"單身注意！ 研究：這恐比抽菸更早死 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"你也有？這三個年紀是人生孤獨感高峰-文章\">你也有？這三個年紀是人生孤獨感高峰</span>\n" +
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
"    <a   href=\"/zh-tw/lifestyle/decor/%e7%85%ae%e8%8f%9c%e5%8b%95%e7%b7%9a%e5%a5%bd%e6%b5%81%e6%9a%a2%ef%bc%8112-%e6%ac%be%e4%ba%8c%e5%ad%97%e5%bd%a2%e5%bb%9a%e6%88%bf%e7%9a%84%e8%a8%ad%e8%a8%88%e5%af%a6%e4%be%8b/ss-BBSef8T?li=BBqiNIb\"\n" +
"         data-id=\"148\" data-m='{\"i\":148,\"p\":146,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSef8T\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyledecor\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"以白色系提升明亮度，深灰地板則營造出沈穩氣息，一邊的櫃體有轉角設計，看起來更為柔和外使用上也更便利。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSef8v.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=545&amp;y=417&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"以白色系提升明亮度，深灰地板則營造出沈穩氣息，一邊的櫃體有轉角設計，看起來更為柔和外使用上也更便利。 - homify / 錠揚設計有限公司\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"煮菜動線好流暢！12款二字形廚房的設計實例-圖片集\">煮菜動線好流暢！12款二字形廚房的設計實例</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Homify 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAuTnto.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Homify        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" mosaic   hasimage  media photo\"  data-aop=\"slide15>mosaic \"  data-id=\"149\" data-m='{\"i\":149,\"p\":97,\"n\":\"mosaic\",\"y\":8,\"o\":15}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>2018回顧</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/yearinreview2018/%e3%80%90%e5%9c%96%e3%80%912018%e3%80%8a%e5%af%8c%e6%af%94%e5%a3%ab%e3%80%8b%e5%8f%b0%e7%81%a3%e5%af%8c%e8%b1%aa%e6%a6%9c%e5%87%ba%e7%88%90-%e4%ba%ae%e9%bb%9e%e6%98%af%ef%bc%9f/ss-BBPIQG6?li=BBqiNIb\"\n" +
"         data-id=\"150\" data-m='{\"i\":150,\"p\":149,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPIQG6\",\"h\":0,\"v\":\"news\",\"c\":\"yearinreview2018\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"蔡衍明、郭台銘\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPJ0wE.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=257&amp;y=93&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"蔡衍明、郭台銘 - 東方IC、Reuters\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】2018《富比士》台灣富豪榜「他」重返首富-圖片集\">【圖】2018《富比士》台灣富豪榜「他」重返首富</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"        <ul>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/news/yearinreview2018/%e3%80%90%e5%9c%96%e3%80%9130%e9%83%a8%e5%a4%aa%e7%a9%ba%e9%9b%bb%e5%bd%b1-%e6%8c%91%e6%88%b0%e4%bd%a0%e7%9a%84%e6%83%b3%e5%83%8f%e5%8a%9b%e6%a5%b5%e9%99%90%ef%bc%81/ss-BBOdzgS?li=BBqiNIb\"\n" +
"         data-id=\"151\" data-m='{\"i\":151,\"p\":149,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBOdzgS\",\"h\":0,\"v\":\"news\",\"c\":\"yearinreview2018\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBO60PY.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1587&amp;y=951&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"First Man (2018) - 2018 Universal Studios and Storyteller Distribution Co. LLC\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】30部太空電影 挑戰你的想像力極限！-圖片集\">【圖】30部太空電影 挑戰你的想像力極限！</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"                <li>\n" +
"                        <a   href=\"/zh-tw/news/yearinreview2018/%e6%b8%9b%e8%82%a5%e6%98%af%e4%b8%80%e8%bc%a9%e5%ad%90%e7%9a%84%e5%a4%a7%e6%a5%ad%ef%bc%81%e4%bf%9d%e9%a4%8a%e7%98%a6%e8%ba%ab%e6%94%bb%e7%95%a5%e7%9c%8b%e5%ae%8c%e5%8b%95%e8%b5%b7%e4%be%86/ss-BBPYtWq?li=BBqiNIb\"\n" +
"         data-id=\"152\" data-m='{\"i\":152,\"p\":149,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPYtWq\",\"h\":0,\"v\":\"news\",\"c\":\"yearinreview2018\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"不敢相信李冰冰已經44歲了！月減10kg以上的瘦子體質全靠「這4招」\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPYHBs.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1015&amp;y=189&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"不敢相信李冰冰已經44歲了！月減10kg以上的瘦子體質全靠「這4招」 - bella\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】減肥是一輩子的大業！保養瘦身攻略看完動起來-圖片集\">【圖】減肥是一輩子的大業！保養瘦身攻略看完動起來</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"                </li>\n" +
"        </ul>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" single   hasimage \"  data-aop=\"slide16>single \"  data-id=\"153\" data-m='{\"i\":153,\"p\":97,\"n\":\"single\",\"y\":8,\"o\":16}' >\n" +
"            <a \n" +
"       \n" +
"       href=\"/zh-tw/news/techandscience/%e8%98%8b%e6%9e%9c%e5%8e%bb%e5%b9%b4%e7%9a%84%e9%9b%bb%e6%b1%a0%e6%9b%b4%e6%8f%9b%e8%a8%88%e7%95%ab%e5%b9%ab%e7%94%a8%e6%88%b6%e6%8f%9b%e4%ba%86%e5%a4%9a%e5%b0%91%e5%a1%8a%e9%9b%bb%e6%b1%a0%ef%bc%9f%e7%ad%94%e6%a1%88%e6%98%af-1100-%e8%90%ac/ar-BBSoVPb?li=BBqiNIb\"\n" +
"        data-id=\"154\" data-m='{\"i\":154,\"p\":153,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoVPb\",\"h\":0,\"v\":\"news\",\"c\":\"newsscienceandtechnology\",\"o\":1}'  >\n" +
"\n" +
"        \n" +
"\n" +
"<img alt=\"蘋果去年的電池更換計畫幫用戶換了多少塊電池？答案是 1100 萬\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoVP3.img?h=515&amp;w=871&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"蘋果去年的電池更換計畫幫用戶換了多少塊電池？答案是 1100 萬 - 由 Home Media Group (II) 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"蘋果去年的電池更換計畫幫用戶換了多少塊電池？答案揭曉-文章\">蘋果去年的電池更換計畫幫用戶換了多少塊電池？答案揭曉</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"T客邦 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBjPbZW.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />T客邦        </span>\n" +
"    </div>\n" +
"        \n" +
"    </a>\n" +
"\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" head-to-head   hasimage \"  data-aop=\"slide17>head-to-head \"  data-id=\"155\" data-m='{\"i\":155,\"p\":97,\"n\":\"headtohead\",\"y\":8,\"o\":17}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>國際要聞</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/world/%e9%99%b8%e5%81%89%e8%81%b0%e8%a7%80%e9%bb%9e%e7%bf%92%e8%bf%91%e5%b9%b3%e7%a9%bf%e4%b8%8a%e4%ba%86%e3%80%8c%e7%9a%87%e5%b8%9d%e7%9a%84%e6%96%b0%e8%a1%a3%e3%80%8d/ar-BBSoDTW?li=BBqiNIb\"\n" +
"         data-id=\"156\" data-m='{\"i\":156,\"p\":155,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoDTW\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"陸偉聰觀點：習近平穿上了「皇帝的新衣」\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRJodk.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=295&amp;y=148&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"趙春山觀點：中共發表《告臺灣同胞書》四十年，兩岸關係陷入「冷對抗」 - 由 Storm Media Group 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"陸偉聰觀點：習近平穿上了「皇帝的新衣」-文章\">陸偉聰觀點：習近平穿上了「皇帝的新衣」</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />風傳媒        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/news/world/%e5%a2%a8%e8%a5%bf%e5%93%a5%e9%a0%ad%e8%99%9f%e6%af%92%e6%a2%9f%e7%9a%84%e4%b8%96%e7%b4%80%e5%af%a9%e5%88%a4%e3%80%8b%e3%80%8c%e7%9f%ae%e5%ad%90%e3%80%8d%e5%8f%a4%e8%8c%b2%e6%9b%bc%e6%89%8b%e4%b8%8b%e4%be%9b%e7%a8%b1%e5%89%8d%e7%b8%bd%e7%b5%b1%e6%94%b6%e5%8f%971%e5%84%84%e8%b3%84%e8%b3%82%ef%bc%8c%e5%8d%94%e5%8a%a9%e8%b6%8a%e7%8d%84%e9%80%83%e4%ba%a1/ar-BBSmPO0?li=BBqiNIb\"\n" +
"         data-id=\"157\" data-m='{\"i\":157,\"p\":155,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmPO0\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"墨西哥頭號毒梟的世紀審判》「矮子」古茲曼手下供稱：前總統收受1億賄賂，協助越獄逃亡\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmLdN.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=275&amp;y=185&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"墨西哥頭號毒梟的世紀審判》「矮子」古茲曼手下供稱：前總統收受1億賄賂，協助越獄逃亡 - 由 Storm Media Group 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"「矮子」古茲曼手下供稱：前總統收受1億賄賂-文章\">「矮子」古茲曼手下供稱：前總統收受1億賄賂</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />風傳媒        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" head-to-head   hasimage \"  data-aop=\"slide18>head-to-head \"  data-id=\"158\" data-m='{\"i\":158,\"p\":97,\"n\":\"headtohead\",\"y\":8,\"o\":18}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>&#127909;一起看電影</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/news/%e3%80%8a%e9%8e%96%e5%91%bd%e5%8d%b1%e6%a9%9f%e3%80%8b%e4%b9%9f%e8%a8%b1%ef%bc%8c%e5%a6%b3%e6%a0%b9%e6%9c%ac%e4%b8%8d%e6%98%af%e4%b8%80%e5%80%8b%e4%ba%ba%e4%bd%8f/ar-BBSpeo0?li=BBqiNIb\"\n" +
"         data-id=\"159\" data-m='{\"i\":159,\"p\":158,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpeo0\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpbRr.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=322&amp;y=173&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"《鎖命危機》：也許，妳根本不是一個人住 - 由 Global Views Commonwealth 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"《鎖命危機》：也許，妳根本不是一個人住-文章\">《鎖命危機》：也許，妳根本不是一個人住</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"遠見雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />遠見雜誌        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/entertainment/news/%e3%80%90%e5%bd%b1%e8%a9%95%e3%80%91%e3%80%8a%e8%b3%ad%e5%91%bd%e9%81%8b%e8%bd%89%e6%89%8b%e3%80%8b-%e9%81%8b%e6%af%92%e4%b8%80%e5%93%a5%e7%9a%84%e7%86%9f%e9%bd%a1%e6%a8%82%e6%b4%bb/ar-BBSdzdX?li=BBqiNIb\"\n" +
"         data-id=\"160\" data-m='{\"i\":160,\"p\":158,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdzdX\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"克林伊斯威特自導自演，總是演出頑固老頭的他，再度為《賭命運轉手》帶來練達的滄桑與釋然。（華納提供）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdIK0.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=517&amp;y=173&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"克林伊斯威特自導自演，總是演出頑固老頭的他，再度為《賭命運轉手》帶來練達的滄桑與釋然。（華納提供） - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【影評】《賭命運轉手》 運毒一哥的熟齡樂活-文章\">【影評】《賭命運轉手》 運毒一哥的熟齡樂活</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" head-to-head   hasimage \"  data-aop=\"slide19>head-to-head \"  data-id=\"161\" data-m='{\"i\":161,\"p\":97,\"n\":\"headtohead\",\"y\":8,\"o\":19}' >\n" +
"        \n" +
"\n" +
"\n" +
"            <h3>健身這條路&#128170;</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e3%80%8a%e5%bb%b6%e7%a6%a7%e6%94%bb%e7%95%a5%e3%80%8b%e5%a8%98%e5%a8%98%e5%80%91%e3%80%8c%e4%b8%80%e5%ad%97%e9%8e%96%e9%aa%a8%e3%80%8d%e8%b6%85%e9%a1%af%e7%98%a6%ef%bc%81%e7%88%be%e6%99%b4%e8%a6%aa%e8%87%aa%e7%a4%ba%e7%af%84%e9%8e%96%e9%aa%a8%e6%93%8d%ef%bc%8c%e5%8a%a0%e7%a2%bc4%e6%8b%9b%e8%ae%93%e9%8e%96%e9%aa%a8%e7%8f%be%e5%bd%a2/ar-BBSaMXp?li=BBqiNIb\"\n" +
"         data-id=\"162\" data-m='{\"i\":162,\"p\":161,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSaMXp\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"《延禧攻略》娘娘們「一字鎖骨」超顯瘦！爾晴親自示範鎖骨操，加碼4招讓鎖骨現形\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfZIg.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=282&amp;y=194&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"《延禧攻略》娘娘們「一字鎖骨」超顯瘦！爾晴親自示範鎖骨操，加碼4招讓鎖骨現形 - Beauty321\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"《延禧攻略》娘娘們「一字鎖骨」超顯瘦！爾晴親自示範鎖骨操-文章\">《延禧攻略》娘娘們「一字鎖骨」超顯瘦！爾晴親自示範鎖骨操</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />beauty321        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/lifestyle/lifestylefashionbeauty/krystal%e7%b2%89%e7%b5%b2%e6%8a%93%e6%8b%8d%e7%85%a7%e8%a2%ab%e7%98%8b%e5%82%b35%e8%90%ac%e6%ac%a1%e5%88%86%e4%ba%ab%ef%bc%81%e3%80%8c%e6%b0%b4%e7%85%ae%e8%9b%8b%e6%b8%9b%e8%82%a5%e9%a3%9f%e8%ad%9c%e3%80%8d%e5%85%a9%e9%80%b1%e5%9c%93%e8%87%89%e7%98%a6%e5%9b%9e%e5%ae%8c%e7%be%8e%e5%81%b4%e9%a1%8f/ar-BBS6eaJ?li=BBqiNIb\"\n" +
"         data-id=\"163\" data-m='{\"i\":163,\"p\":161,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS6eaJ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"Krystal粉絲抓拍照被瘋傳5萬次分享！「水煮蛋減肥食譜」兩週圓臉瘦回完美側顏\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm97a.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=211&amp;y=123&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Krystal粉絲抓拍照被瘋傳5萬次分享！「水煮蛋減肥食譜」兩週圓臉瘦回完美側顏 - Beauty321\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"「水煮蛋減肥食譜」兩週圓臉變krystal完美側顏-文章\">「水煮蛋減肥食譜」兩週圓臉變Krystal完美側顏</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />beauty321        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
"    <li tabindex=\"0\" class=\" triptych   hasimage \"  data-aop=\"slide20>triptych \"  data-id=\"164\" data-m='{\"i\":164,\"p\":97,\"n\":\"tryptic\",\"y\":8,\"o\":20}' >\n" +
"        \n" +
"\n" +
"\n" +
"		    <h3>美食攻略一把罩&#128523;</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/food/%e5%bd%b0%e5%8c%96%e8%b6%85%e4%ba%ba%e6%b0%a3%e8%82%89%e5%9c%93-%e5%a4%96%e5%b8%b6%e7%9c%9f%e7%9a%84%e8%a6%81%e8%a8%98%e5%be%97%e8%ab%8b%e8%80%81%e9%97%86%e5%8a%a0%e8%be%a3%e6%89%8d%e5%a4%a0%e5%91%b3/ar-BBSd7jU?li=BBqiNIb\"\n" +
"         data-id=\"165\" data-m='{\"i\":165,\"p\":164,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd7jU\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefood\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"彰化肉圓配辣椒醬，確實是人間美味。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdcc4.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=586&amp;y=818&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"「小肉圓」包著肉塊、鴨蛋、香菇。（40元／份） - 由 Mirror Media Inc 提供\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"彰化超人氣肉圓 外帶記得加辣才夠味-文章\">彰化超人氣肉圓 外帶記得加辣才夠味</span>\n" +
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
"    <a   href=\"/zh-tw/lifestyle/food/%e5%b9%b4%e8%8f%9c%e6%90%ad%e9%85%92%e9%87%8d%e9%bb%9e%e7%ad%86%e8%a8%98-%e9%9b%9e%e6%b9%af%e7%81%ab%e9%8d%8b%e8%a6%81%e9%85%8d%e8%82%a5%e8%85%b4%e6%9c%89%e9%87%8d%e9%87%8f%e7%9a%84%e7%99%bd%e9%85%92/ar-BBSdIcf?li=BBqiNIb\"\n" +
"         data-id=\"166\" data-m='{\"i\":166,\"p\":164,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdIcf\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefood\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"熱騰騰的雞湯火鍋搭配肥腴有重量的白酒，這樣的年菜搭酒安全過關。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdDre.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=400&amp;y=228&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"熱騰騰的雞湯火鍋搭配肥腴有重量的白酒，這樣的年菜搭酒安全過關。 - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"年菜搭酒重點筆記 雞湯火鍋要配白酒-文章\">年菜搭酒重點筆記 雞湯火鍋要配白酒</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"    <a   href=\"/zh-tw/lifestyle/food/%e7%b1%b3%e5%85%b6%e6%9e%972%e6%98%9f%e5%b9%b4%e5%a4%9c%e9%a3%af-%e7%83%8f%e9%ad%9a%e5%ad%90%e5%8a%a0%e3%80%8c%e9%87%91%e7%b2%89%e3%80%8d%e5%a4%a7%e6%b0%a3%e5%8f%88%e9%96%8b%e8%83%83/ar-BBSd5QB?li=BBqiNIb\"\n" +
"         data-id=\"167\" data-m='{\"i\":167,\"p\":164,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd5QB\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefood\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"「焦糖烏魚子」過年升級，撒上金粉與砂糖炙燒，鹹香心軟，如軟糖。（1,900元起／份，需3天前預訂）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBScWwS.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=390&amp;y=231&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"「焦糖烏魚子」過年升級，撒上金粉與砂糖炙燒，鹹香心軟，如軟糖。（1,900元起／份，需3天前預訂） - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"米其林2星年夜飯 烏魚子加「金粉」-文章\">米其林2星年夜飯 烏魚子加「金粉」</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"        \n" +
"    </li>\n" +
" </ul>\n" +
"\n" +
" <div class=\"slidecount fade\">\n" +
" <span class=\"selected\"></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" <span></span>\n" +
" </div>\n" +
" <button class=\"leftarrow fade\" title=\"上一張投影片\"  data-id=\"168\" data-m='{\"i\":168,\"p\":97,\"n\":\"previousSlideArrow\",\"o\":21}'>上一張投影片</button>\n" +
" <button class=\"rightarrow fade\" title=\"下一張投影片\"  data-id=\"169\" data-m='{\"i\":169,\"p\":97,\"n\":\"nextSlideArrow\",\"o\":22}'>下一張投影片</button>\n" +
"\n" +
" \n" +
"</div>\n" +
"\n" +
"</li>\n" +
"\n" +
"    <li  class=\"pos1 replacead23 smalla smalla-twoimages \"  data-id=\"170\" data-m='{\"i\":170,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgiJO\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  data-aop=\"river>1\">\n" +
"        <a href=\"/zh-tw/entertainment/news/%e5%a5%b3%e5%85%92%e5%87%ba%e7%94%9f%e8%a2%ab%e8%a8%ba%e6%96%b7%e5%a4%b1%e8%81%b0-%e5%b0%8f%e7%a6%8e%e6%84%a7%e7%96%9a%e3%80%8c%e6%98%af%e6%88%91%e5%93%aa%e8%a3%a1%e6%b2%92%e5%81%9a%e5%a5%bd%ef%bc%9f%e3%80%8d/ar-BBSgiJO?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"小禎今天出席喜憨兒公益記者會，看到喜憨兒的紀錄影片，忍不住哽咽落淚。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgyau.img?h=350&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=373&amp;y=219&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"小禎今天出席喜憨兒公益記者會，看到喜憨兒的紀錄影片，忍不住哽咽落淚。 - Mirror Media\" /><img alt=\"小禎今天出席喜憨兒公益記者會，看到喜憨兒的紀錄影片，忍不住哽咽落淚。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgyau.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=373&amp;y=219&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"小禎今天出席喜憨兒公益記者會，看到喜憨兒的紀錄影片，忍不住哽咽落淚。 - Mirror Media\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"女兒出生被診斷失聰 小禎愧疚「是我哪裡沒做好？」-文章\">女兒出生被診斷失聰 小禎愧疚「是我哪裡沒做好？」</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />鏡週刊            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos2 smalla \"  data-id=\"171\" data-m='{\"i\":171,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSg05E\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"livingsocial\",\"o\":3}'  data-aop=\"river>2\">\n" +
"        <a href=\"/zh-tw/lifestyle/livingsocial/%e8%b6%85%e7%9e%8e%e5%88%86%e6%89%8b%e7%90%86%e7%94%b1%ef%bc%81%e7%94%b7%e3%80%8c%e4%b8%8d%e8%b2%a0%e8%b2%ac%e4%bb%bb%e3%80%8d%e6%88%90%e5%89%8d%e4%bb%bb/ar-BBSg05E?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSg1WI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=267&amp;y=122&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"超瞎分手理由！男「不負責任」成前任 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"超瞎理由！男因「這件事」被分手-文章\">超瞎理由！男因「這件事」被分手</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos3 smalla \"  data-id=\"172\" data-m='{\"i\":172,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSh9WI\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":4}'  data-aop=\"river>3\">\n" +
"        <a href=\"/zh-tw/entertainment/news/%e6%97%a5%e7%b6%b2%e8%a9%95%e9%81%b8%e5%8f%b0%e6%9c%80%e7%be%8e%e5%a5%b3%e6%98%9f-%e4%b8%8d%e6%98%af%e6%9e%97%e5%bf%97%e7%8e%b2%e3%80%81%e9%83%ad%e9%9b%aa%e8%8a%99%e6%98%af%e3%80%8c%e5%a5%b9%e3%80%8d%e5%a5%aa%e5%86%a0%ef%bc%81/ar-BBSh9WI?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"FotoJet\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSiB4d.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1328&amp;y=1468&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林志玲 - Getty\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"日網評選台最美女星 林志玲、徐若瑄都出局！-文章\">日網評選台最美女星 林志玲、徐若瑄都出局！</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />NOWnews            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos4 smalla \"  data-id=\"173\" data-m='{\"i\":173,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfFcx\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"livingsocial\",\"o\":5}'  data-aop=\"river>4\">\n" +
"        <a href=\"/zh-tw/lifestyle/livingsocial/%e9%ab%98%e8%81%b7%e5%a6%b9%e9%85%b8%e7%84%a1%e8%85%a6%e5%8f%88%e9%ab%92-%e6%8a%80%e5%b8%abpo%e6%96%87%e5%98%86%e3%80%8c%e5%a5%b9%e6%b2%92%e8%aa%aa%e9%8c%af%e3%80%8d%e6%83%b9%e5%93%ad%e7%b6%b2%e5%8f%8b/ar-BBSfFcx?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"高職妹酸無腦又髒　技師PO文嘆「她沒說錯...」惹哭網友\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfJPQ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=522&amp;y=268&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"高職妹酸無腦又髒 技師PO文嘆「她沒說錯...」惹哭網友 - 由 NOWnews Network Co.,Ltd 提供\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"高職妹酸無腦又髒 技師po文嘆「她沒說錯...」惹哭網友-文章\">高職妹酸無腦又髒 技師PO文嘆「她沒說錯...」惹哭網友</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />NOWnews            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\" mediuma \"  data-id=\"174\" data-m='{\"i\":174,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpRH\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":6,\"a\":\"mediuma Unknown\"}'  data-aop=\"river>5\">\n" +
"        <a href=\"/zh-tw/entertainment/news/%e7%8b%82%e6%af%86%e5%a5%b3%e5%8f%8b%e5%ae%b3%e6%b5%81%e7%94%a2%ef%bc%81%e7%94%b7%e6%98%9f%e5%82%b3%e8%bd%89%e7%95%b6%e7%89%9b%e9%83%8e%e6%b1%82%e7%94%9f/ar-BBSrpRH?li=BBRN0RL\" >\n" +
"<img alt=\"友井雄亮\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3kPi.img?h=350&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=248&amp;y=163&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"友井雄亮 - 由 Sanlih E-television Co., LTD 提供\" /><img alt=\"友井雄亮\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3kPi.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=248&amp;y=163&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"友井雄亮 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"狂毆女友害流產！男星傳轉當牛郎求生-文章\">狂毆女友害流產！男星傳轉當牛郎求生</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos6 smalla \"  data-id=\"175\" data-m='{\"i\":175,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdcCV\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":7}'  data-aop=\"river>6\">\n" +
"        <a href=\"/zh-tw/news/national/%e5%85%a5%e5%a2%83%e6%b8%af%e6%be%b3%e5%b8%b6%e3%80%8c%e9%80%99%e5%80%8b%e3%80%8d-%e6%81%90%e7%bd%b040%e8%90%ac%ef%bc%81/ar-BBSdcCV?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS2Z6G.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=204&amp;y=134&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"空姐曝行李打包術 3招創造大空間 - 由 Sanlih E-television Co., LTD 提供\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"入境港澳帶「這個」 恐罰40萬！-文章\">入境港澳帶「這個」 恐罰40萬！</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />三立新聞網            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos7 smalla \"  data-id=\"176\" data-m='{\"i\":176,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSg7rU\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":8}'  data-aop=\"river>7\">\n" +
"        <a href=\"/zh-tw/news/world/%e5%a5%bd%e5%b8%82%e5%a4%9a%e4%b8%80%e4%b8%8a%e5%b8%82%e5%b0%b1%e8%b3%a3%e5%88%b0%e7%bc%ba%e8%b2%a8-%e7%ab%9f%e6%98%af%e5%8f%af%e4%bf%9d%e5%ad%9820%e5%b9%b4%e7%9a%84%e9%80%99%e9%a3%9f%e7%89%a9/ar-BBSg7rU?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"File photo of a Costco store in Teterboro, N.J. on Aug. 5, 2018.\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAAwF1q.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1380&amp;y=1075&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"File photo of a Costco store in Teterboro, N.J. on Aug. 5, 2018. - Michael Brochstein/SOPA Images/LightRocket/Getty Images\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"好市多賣到缺貨！這食物可保存20年-文章\">好市多賣到缺貨！這食物可保存20年</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />中時電子報            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos8 smalla \"  data-id=\"177\" data-m='{\"i\":177,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdyTc\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":9}'  data-aop=\"river>8\">\n" +
"        <a href=\"/zh-tw/money/topstories/40percent-%e5%93%a1%e5%b7%a5%e5%87%ba%e8%b5%b0%ef%bc%8c%e9%83%bd%e6%98%af%e5%a3%9e%e4%b8%bb%e7%ae%a1%e5%ae%b3%e7%9a%84%ef%bc%81%e6%b2%92%e5%81%9a%e5%88%b0-5-%e4%bb%b6%e4%ba%8b%ef%bc%8c%e5%b0%8f%e5%bf%83%e5%88%a5%e8%b5%b0%e9%80%bc%e8%b5%b0%e9%83%a8%e5%b1%ac/ar-BBSdyTc?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBgNdfI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2020&amp;y=707&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"陸上市公司主管 能力水平偏低 - Bloomberg\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"40%員工出走 都是壞主管害的！-文章\">40%員工出走 都是壞主管害的！</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"經理人月刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />經理人月刊            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos9 smalla smalla-twoimages media photo\"  data-id=\"178\" data-m='{\"i\":178,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS8teW\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":10}'  data-aop=\"river>9\">\n" +
"        <a href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e5%a5%b3%e7%a5%9e%e3%80%81%e5%a5%b3%e8%8b%b1%e9%9b%84%e6%8e%9b%e5%b8%a5-%e6%9c%89%e5%a5%b9%e5%80%91%e5%b0%b1%e6%98%af%e7%a5%a8%e6%88%bf%e4%bf%9d%e8%ad%89%ef%bc%81/ss-BBS8teW?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8k6Y.img?h=350&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=353&amp;y=139&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"「黑寡婦」斯嘉麗‧約翰遜 - picture alliance/dpa/Jay Maidment/Marvel\" /><img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8k6Y.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=353&amp;y=139&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"「黑寡婦」斯嘉麗‧約翰遜 - picture alliance/dpa/Jay Maidment/Marvel\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】女神、女英雄掛帥 有她們就是票房保證！-圖片集\">【圖】女神、女英雄掛帥 有她們就是票房保證！</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"dw.com 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBMQmHU.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />dw.com            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos10 smalla media photo\"  data-id=\"179\" data-m='{\"i\":179,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgn7v\",\"h\":0,\"v\":\"weather\",\"c\":\"photos\",\"o\":11}'  data-aop=\"river>10\">\n" +
"        <a href=\"/zh-tw/weather/photos/%e3%80%90%e5%9c%96%e3%80%91%e4%be%86%e5%8e%bb%e8%b3%9e%e9%9b%aa%e5%9b%89%ef%bc%81%e5%9c%a8%e5%ae%b6%e4%b9%9f%e8%83%bd%e7%9c%8b%e9%81%8d%e4%b8%96%e7%95%8c%e5%90%84%e5%9c%b0%e9%9b%aa%e5%ad%a3%e5%8d%b3%e6%99%af/ss-BBSgn7v?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"BOWLING GREEN, NEW YORK, UNITED STATES - 2018/11/15: Fearless Girl statue covere...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRtUVT.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"New York City, New York, U.S. - Erik McGregor/Pacific Press/LightRocket via Getty Images\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】來去賞雪囉！在家也能看遍世界各地雪季即景-圖片集\">【圖】來去賞雪囉！在家也能看遍世界各地雪季即景</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos11 smalla media photo\"  data-id=\"180\" data-m='{\"i\":180,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdmJU\",\"h\":0,\"v\":\"sports\",\"c\":\"sportsphotos\",\"o\":12}'  data-aop=\"river>11\">\n" +
"        <a href=\"/zh-tw/sports/sportsphotos/%e3%80%90%e5%9c%96%e3%80%91%e6%88%b0%e8%a2%8d%e4%b8%8b%e7%9a%84%e5%8f%a6%e4%b8%80%e9%9d%a2%ef%bc%81%e4%bd%a0%e6%b2%92%e7%9c%8b%e9%81%8e%e7%9a%84%e7%b6%b2%e7%90%83%e5%90%8d%e5%b0%87/ss-BBSdmJU?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"At the WTA Pre-Wimbledon Party at The Roof Gardens, Kensington High Street, Lond...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBzT6PO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=835&amp;y=295&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Maria Sharapova, 2017 - Gregg DeGuire/Getty Images\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】戰袍下的另一面！你沒看過「穿這樣」的網球名將-圖片集\">【圖】戰袍下的另一面！你沒看過「穿這樣」的網球名將</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos12 smalla media photo\"  data-id=\"181\" data-m='{\"i\":181,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd2Pk\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":13}'  data-aop=\"river>12\">\n" +
"        <a href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e5%af%8c%e5%af%9f%e7%9a%87%e5%90%8e%e8%b7%9f%e5%ab%bb%e5%a6%83%e9%83%bd%e6%b2%92%e4%bb%bd%ef%bc%81%e8%81%b6%e9%81%a0%e5%b8%b6%e6%ad%a3%e5%ae%ae%e6%94%be%e9%96%83/ss-BBSd2Pk?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBScTtC.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1280&amp;y=722&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林志玲 - Getty\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"【圖】眾女星爭艷 林志玲辣翻微博之夜-圖片集\">【圖】眾女星爭艷 林志玲辣翻微博之夜</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"     <li  class=\"todayshowcasead size234column\">\n" +
"        \n" +
" <div tabindex=\"-1\"  id=\"rectangle1_homepage_cbc50ea6-12c1-4947-8dd5-46e93fc74c0f\"  class=\"ad\"   data-aop=\"todayshowcasead_ad\"  data-id=\"182\" data-m='{\"i\":182,\"p\":96,\"n\":\"todayshowcasead\",\"t\":\"ad\",\"o\":14}'   aria-hidden=\"true\">\n" +
" \n" +
" \n" +
"<div class=\"outeradcontainer\">\n" +
" \n" +
"<div  id=\"rectangle1_homepage_container_cbc50ea6-12c1-4947-8dd5-46e93fc74c0f\" class=\"adcontainer\" data-adjs='{\"allowedViews\":\"SIZE234COLUMN\"}' tabindex=\"-1\">\n" +
" <script class=\"sdkdapscript\">\n" +
"require([\"dap\"], function (dap)\n" +
"{\n" +
" dap(\"&amp;AP=1089&amp;PG=MSNTWZH11&amp;PVGUID=5ccff976c56c4a539087c2a9ffe97c17&amp;PROVIDERID=7HD66FC\", 300, 600, \"rectangle1_homepage_container_cbc50ea6-12c1-4947-8dd5-46e93fc74c0f\", {\"isEnabled\":0, \"isDarkTheme\":0}, {\"scrollInit\":true,\"forcefulVisibility\":true,\"enableAdRefresh\":true,\"adaptiveRefresh\":true,\"adaptiveRefreshInterval\":3000,\"adCallAutoRefreshInterval\":30000,\"adCallAutoRefreshMaxCount\":3,\"prid\":\"7HD66FC\",\"adsVNextHeight\":\"RR\",\"adsVNextWidth\":\"RR\",\"rid\":\"5ccff976c56c4a539087c2a9ffe97c17\",\"adtext\":\"Ad\",\"showmute\":true,\"showvolume\":true,\"nonviewablebehavior\":\"mute\",\"showprogressbar\":true,\"allowfullscreen\":true,\"videothreshold\":1,\"videooffset\":5,\"skiplocation\":\"top-left\",\"skiptext\":\"Video can be skipped in %%TIME%% seconds\",\"skipbuttontext\":\"SKIP\",\"playOnMouseover\":false,\"audioOnMouseover\":\"false\",\"playVideoVisibleThreshold\":50,\"disableTopBar\":false,\"preShowType\":\"none\",\"preShowUrl\":\"\",\"postShowType\":\"image\",\"postShowUrl\":\"https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AAA8wNc.img\",\"postShowClickUrl\":\"https://www.msn.com/zh-tw/news/photos/%E3%80%90%E5%9C%96%E3%80%91%E5%85%A8%E7%90%83%E7%9C%8B%E8%91%97%E4%BB%96%E9%95%B7%E5%A4%A7-%E8%8B%B1%E5%9C%8B%E5%93%88%E5%88%A9%E7%8E%8B%E5%AD%90%E6%88%90%E9%95%B7%E5%8F%B2/ss-AAyQdMI\",\"fallbackType\":\"image\",\"fallbackUrl\":\"https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AAA88Xg.img\",\"fallbackClickUrl\":\"https://www.msn.com/zh-tw/news/photos/%E3%80%90%E5%9C%96%E3%80%91%E4%B8%8D%E6%98%AF%E9%9B%BB%E5%BD%B1%E6%89%8D%E6%9C%89-%E7%8F%BE%E4%BB%A3%E6%9C%80%E5%8D%B1%E9%9A%AA%E7%9A%84%E4%BA%94%E5%A4%A7%E7%81%AB%E5%B1%B1/ss-AAzkDYj\",\"vpaidTimeout\":5000,\"terminateUnresponsiveVPAIDCreative\":false,\"enableInlineVideoForIos\":true,\"delayExpandUntilVPAIDInit\":true,\"delayExpandUntilVPAIDImpression\":false,\"apnId\":280});\n" +
" });\n" +
"</script>\n" +
" </div>\n" +
" \n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"    </li>\n" +
"\n" +
" \n" +
"</ul>\n" +
" \n" +
"</div>\n" +
"\n" +
" \n" +
"\n" +
" <div class='normalsection bannersectionad' role='region'  data-section-id=\"bannerad1\"><div class='full-width'><div class='sectioncontent'  data-region=\"bannerad1_section\">\n" +
" <div tabindex=\"-1\"  id=\"banner4_homepage_b3fb728a-32dc-4cc3-a0db-dd6eb05e0cca\"  class=\"widead\"   data-aop=\"bannerad1.ad_ad\"  data-id=\"183\" data-m='{\"i\":183,\"p\":19,\"n\":\"BannerAd1.Ad\",\"t\":\"ad\",\"o\":6}'   aria-hidden=\"true\">\n" +
" \n" +
" \n" +
"<div class=\"outeradcontainer\">\n" +
" \n" +
"<div  id=\"banner4_homepage_container_b3fb728a-32dc-4cc3-a0db-dd6eb05e0cca\" class=\"adcontainer\" data-adjs='{\"allowedViews\":\"SIZE234COLUMN\"}' tabindex=\"-1\">\n" +
" <script class=\"sdkdapscript\">\n" +
"require([\"dap\"], function (dap)\n" +
"{\n" +
" dap(\"&amp;AP=1390&amp;PG=MSNTWZH14&amp;PVGUID=5ccff976c56c4a539087c2a9ffe97c17&amp;PROVIDERID=7HD66FC\", 728, 90, \"banner4_homepage_container_b3fb728a-32dc-4cc3-a0db-dd6eb05e0cca\", {\"isEnabled\":0, \"isDarkTheme\":0}, {\"scrollInit\":true,\"enableAdRefresh\":true,\"adaptiveRefresh\":true,\"adaptiveRefreshInterval\":3000,\"adCallAutoRefreshInterval\":30000,\"adCallAutoRefreshMaxCount\":3,\"prid\":\"7HD66FC\",\"adsVNextHeight\":\"90\",\"adsVNextWidth\":\"728\",\"rid\":\"5ccff976c56c4a539087c2a9ffe97c17\",\"adtext\":\"\",\"showmute\":false,\"showvolume\":false,\"nonviewablebehavior\":\"\",\"showprogressbar\":false,\"allowfullscreen\":false,\"videothreshold\":1,\"videooffset\":5,\"skiplocation\":\"\",\"skiptext\":\"\",\"skipbuttontext\":\"\",\"playOnMouseover\":false,\"audioOnMouseover\":\"false\",\"playVideoVisibleThreshold\":50,\"disableTopBar\":false,\"preShowType\":\"none\",\"preShowUrl\":\"\",\"postShowType\":\"\",\"postShowUrl\":\"\",\"postShowClickUrl\":\"\",\"fallbackType\":\"\",\"fallbackUrl\":\"\",\"fallbackClickUrl\":\"\",\"vpaidTimeout\":5000,\"terminateUnresponsiveVPAIDCreative\":false,\"enableInlineVideoForIos\":false,\"delayExpandUntilVPAIDInit\":false,\"delayExpandUntilVPAIDImpression\":false,\"apnId\":280});\n" +
" });\n" +
"</script>\n" +
" </div>\n" +
" \n" +
"</div>\n" +
" \n" +
"</div>\n" +
"</div></div></div>    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"焦點\"\n" +
"          data-section-id=\"stripe.photos\"\n" +
"          data-section-id=\"stripe.photos\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.photos_stripe\"  data-id=\"184\" data-m='{\"i\":184,\"p\":19,\"n\":\"stripe.photos\",\"t\":\"stripe\",\"o\":7}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"185\" data-m='{\"i\":185,\"p\":184,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.photos.navigation_stripenavigation\"  data-id=\"186\" data-m='{\"i\":186,\"p\":184,\"n\":\"stripe.photos.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"187\" data-m='{\"i\":187,\"p\":186,\"n\":\"焦點\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"https://www.msn.com/zh-tw/news\"  data-id=\"188\" data-m='{\"i\":188,\"p\":186,\"n\":\"焦點\",\"y\":4,\"o\":2}'>焦點</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"189\" data-m='{\"i\":189,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"?邁向2019！去年大事你還記得？?\",\"o\":3}'><a href=\"https://www.msn.com/zh-tw/news/yearinreview2018\">?邁向2019！去年大事你還記得？?</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"190\" data-m='{\"i\":190,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"「十年挑戰」正夯　女星目睹廖峻中風\",\"o\":4}'><a href=\"/zh-tw/news/trendingnews\">「十年挑戰」正夯　女星目睹廖峻中風</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"191\" data-m='{\"i\":191,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"??天氣預報\",\"o\":5}'><a href=\"https://www.msn.com/zh-tw/weather\">??天氣預報</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"192\" data-m='{\"i\":192,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"? 匯率換算\",\"o\":6}'><a href=\"/zh-tw/money/currencyconverter\">&#128181; 匯率換算</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"193\" data-m='{\"i\":193,\"p\":186,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":7}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"194\" data-m='{\"i\":194,\"p\":186,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":8}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"195\" data-m='{\"i\":195,\"p\":186,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":9}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"196\" data-m='{\"i\":196,\"p\":186,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":10}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"197\" data-m='{\"i\":197,\"p\":186,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":11}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.photos|stripe|stripe.photos.hero.1|headlines\"  data-aop=\"1_hero\"  data-id=\"198\" data-m='{\"i\":198,\"p\":184,\"n\":\"stripe.photos.hero.1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"199\" data-m='{\"i\":199,\"p\":198,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"200\" data-m='{\"i\":200,\"p\":199,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpy9D\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e6%9f%af%e5%aa%bd%e5%8f%8d%e5%b0%8d%e7%b5%84%e9%bb%a8-%e6%9f%af%e6%96%87%e5%93%b2%e7%88%b6%e6%af%8d%e9%83%bd%e9%80%99%e6%a8%a3/ar-BBSpy9D?li=BBqj0iS\"  >\n" +
"<img alt=\"台北市長柯文哲（右1）今天在市府接見韓國儒學團體代表。（台北市政府提供）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpujs.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=431&amp;y=130&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"台北市長柯文哲（右1）今天在市府接見韓國儒學團體代表。（台北市政府提供） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"柯媽反對組黨 柯文哲：父母都這樣-文章\">柯媽反對組黨 柯文哲：父母都這樣</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.photos|stripe|stripe.photos.hero.2|headlines\"  data-aop=\"2_hero\"  data-id=\"201\" data-m='{\"i\":201,\"p\":184,\"n\":\"stripe.photos.hero.2\",\"t\":\"headlines\",\"o\":4}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"202\" data-m='{\"i\":202,\"p\":201,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"203\" data-m='{\"i\":203,\"p\":202,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSroWJ\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e9%80%992%e4%ba%ba%e8%8b%a5%e5%87%ba%e6%88%b02020%e2%80%a6%e6%9f%afp%e6%81%90%e4%b8%8d%e5%8f%83%e9%81%b8/ar-BBSroWJ?li=BBqj0iS\"  >\n" +
"<img alt=\"賴清德,柯文哲,朱立倫　合成圖／資料照\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRcXjy.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=347&amp;y=96&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"賴清德,柯文哲,朱立倫　合成圖／資料照 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"這2人若出戰2020…柯p恐不參選-文章\">這2人若出戰2020…柯P恐不參選</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.photos|stripe|stripe.photos.HD1|headlineLinkList\"   data-id=\"204\" data-m='{\"i\":204,\"p\":184,\"n\":\"stripe.photos.HD1\",\"t\":\"headlineLinkList\",\"o\":5}'   \n" +
"  aria-label=\"焦點\" >\n" +
" \n" +
" <h2><a href=\"https://www.msn.com/zh-tw/news\" >焦點</a></h2>\n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"206\" data-m='{\"i\":206,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr6GK\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e8%be%9c%e5%af%ac%e6%95%8f%e7%b1%b2%e8%94%a1-%e8%ab%8b%e8%b3%b4%e5%87%ba%e4%be%86%e9%81%b8%e7%b8%bd%e7%b5%b1/ar-BBSr6GK?li=BBqj0iS\"   aria-label=\"辜寬敏籲蔡 請賴出來選總統-文章\">\n" +
"\n" +
"                    <h3>辜寬敏籲蔡 請賴出來選總統</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"207\" data-m='{\"i\":207,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrfPh\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%8d%81%e5%b9%b4%e5%a6%82%e4%b8%80%e6%97%a5-%e6%9f%afp%e5%85%a9%e5%b2%b8%e7%ab%8b%e5%a0%b4%e4%b8%95%e8%ae%8a%e8%a2%ab%e9%85%b8%e7%88%86/ar-BBSrfPh?li=BBqj0iS\"   aria-label=\"十年如一日 柯p兩岸立場丕變被酸爆-文章\">\n" +
"\n" +
"                    <h3>十年如一日 柯P兩岸立場丕變被酸爆</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"208\" data-m='{\"i\":208,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq7kj\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e8%b7%af%e4%b8%8d%e5%b9%b3%e7%ab%9f%e6%80%aa%e9%9f%93%e5%9c%8b%e7%91%9c-%e6%b8%b8%e6%b7%91%e6%85%a7%e6%8f%ad%e6%b0%91%e9%80%b2%e9%bb%a8%e5%bf%83%e4%b8%ad%e5%8f%aa%e4%b8%80%e5%80%8b%e5%ad%97/ar-BBSq7kj?li=BBqj0iS\"   aria-label=\"路不平竟怪韓國瑜 游淑慧揭民進黨心中只一個字-文章\">\n" +
"\n" +
"                    <h3>路不平竟怪韓國瑜 游淑慧揭民進黨心中只一個字</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"209\" data-m='{\"i\":209,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr6Gm\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e6%87%bc%e6%80%95%e9%80%86%e5%ad%90-%e6%af%8d%e6%b1%82%e6%b3%95%e5%ae%98%e7%82%ba%e6%b0%91%e9%99%a4%e5%ae%b3%e5%88%a4%e6%ad%bb/ar-BBSr6Gm?li=BBqj0iS\"   aria-label=\"懼怕逆子 母求法官為民除害判死-文章\">\n" +
"\n" +
"                    <h3>懼怕逆子 母求法官為民除害判死</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"210\" data-m='{\"i\":210,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpGs\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e5%b8%b6%e7%81%ab%e8%85%bf%e5%85%a5%e5%a2%83%e8%a2%ab%e9%80%ae-%e5%8f%b0%e7%94%b7%e6%80%92%e9%a8%99%e9%8c%a2%e7%9a%84%e6%94%bf%e5%ba%9c/ar-BBSrpGs?li=BBqj0iS\"   aria-label=\"帶火腿入境被逮 台男怒：騙錢的政府-文章\">\n" +
"\n" +
"                    <h3>帶火腿入境被逮 台男怒：騙錢的政府</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"211\" data-m='{\"i\":211,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr6Gc\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e4%b8%8d%e7%9f%a5%e8%83%bd%e4%b8%8d%e8%83%bd%e7%9c%8b%e5%88%b0%e6%98%8e%e5%a4%a9%e7%9a%84%e5%a4%aa%e9%99%bd%ef%bc%81%e6%ad%bb%e5%88%91%e5%ae%9a%e8%ae%9e%e4%b8%8d%e6%a7%8d%e6%b1%ba-%e8%a6%81%e5%91%bd%e7%9a%84%e7%85%8e%e7%86%ac/ar-BBSr6Gc?li=BBqj0iS\"   aria-label=\"不知能不能看到明天的太陽！死刑定讞不槍決 要命的煎熬-文章\">\n" +
"\n" +
"                    <h3>不知能不能看到明天的太陽！死刑定讞不槍決 要命的煎熬</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"212\" data-m='{\"i\":212,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrtHE\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e8%b6%85%e7%8b%82%ef%bc%81%e8%80%81%e5%a4%96%e6%8c%87%e4%ba%94%e6%98%9f%e6%97%97%e9%ab%98%e5%96%8a%e3%80%8c%e6%88%91%e6%84%9b%e5%8f%b0%e7%81%a3%e3%80%8d/ar-BBSrtHE?li=BBqj0iS\"   aria-label=\"超狂！老外指五星旗高喊「我愛台灣」-文章\">\n" +
"\n" +
"                    <h3>超狂！老外指五星旗高喊「我愛台灣」</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"213\" data-m='{\"i\":213,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpb6\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":9}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e4%ba%8c%e6%ac%a1%e3%80%8c%e5%b7%9d%e9%87%91%e6%9c%83%e3%80%8d%e8%ac%9b%e5%ae%9a%e4%ba%86%ef%bc%81%e5%b7%9d%e6%99%ae%e8%88%87%e9%87%91%e6%ad%a3%e6%81%a92%e6%9c%88%e5%ba%95%e5%86%8d%e5%ba%a6%e6%9c%83%e9%9d%a2-%e5%9c%b0%e9%bb%9e%ef%bc%9f%e8%b6%8a%e5%8d%97%e3%80%81%e6%b3%b0%e5%9c%8b%e3%80%81%e5%a4%8f%e5%a8%81%e5%a4%b7%e9%83%bd%e6%9c%89%e5%8f%af%e8%83%bd/ar-BBSrpb6?li=BBqj0iS\"   aria-label=\"二次「川金會」講定了！川普與金正恩2月底再度會面 地點？越南、泰國、夏威夷都有可能-文章\">\n" +
"\n" +
"                    <h3>二次「川金會」講定了！川普與金正恩2月底再度會面 地點？越南、泰國、夏威夷都有可能</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.photos|stripe|stripe.photos.hero.4|headlines\"  data-aop=\"4_hero\"  data-id=\"214\" data-m='{\"i\":214,\"p\":184,\"n\":\"stripe.photos.hero.4\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"215\" data-m='{\"i\":215,\"p\":214,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"216\" data-m='{\"i\":216,\"p\":215,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqhbu\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/world/%e5%8a%a0%e5%b7%9e%e8%b6%8a%e7%8d%84%e9%a2%a8%e9%9b%b2%e5%82%b3%e5%a5%87-%e7%8a%af%e4%ba%ba%e9%9b%a2%e5%a5%87%e5%a4%b1%e8%b9%a4/ar-BBSqhbu?li=AA4REf\"  >\n" +
"<img alt=\"監獄示意圖_pixabay\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSq6R6.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"監獄示意圖_pixabay - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"加州越獄風雲傳奇 犯人離奇失蹤-文章\">加州越獄風雲傳奇 犯人離奇失蹤</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"217\" data-m='{\"i\":217,\"p\":184,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"娛樂\"\n" +
"          data-positions=\".entertainment .stripecontent .tertiary li:nth-child(3)\" data-section-id=\"stripe.entertainment\"\n" +
"          data-section-id=\"stripe.entertainment\">\n" +
"        <div class=\"entertainment stripeouter\"  data-aop=\"stripe.entertainment_stripe\"  data-id=\"218\" data-m='{\"i\":218,\"p\":19,\"n\":\"stripe.entertainment\",\"t\":\"stripe\",\"o\":8}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"219\" data-m='{\"i\":219,\"p\":218,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.entertainment.navigation_stripenavigation\"  data-id=\"220\" data-m='{\"i\":220,\"p\":218,\"n\":\"stripe.entertainment.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"221\" data-m='{\"i\":221,\"p\":220,\"n\":\"entertainment\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/entertainment\"  data-id=\"222\" data-m='{\"i\":222,\"p\":220,\"n\":\"entertainment\",\"y\":4,\"o\":2}'>娛樂</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"223\" data-m='{\"i\":223,\"p\":220,\"n\":\"tv\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/entertainment/tv\">&#128293;追劇熱點</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"224\" data-m='{\"i\":224,\"p\":220,\"n\":\"news\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/entertainment/news\">新聞總覽</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"225\" data-m='{\"i\":225,\"p\":220,\"n\":\"entertainment-gallery\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/entertainment/gallery\">圖輯總覽</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"226\" data-m='{\"i\":226,\"p\":220,\"n\":\"movies\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/entertainment/movies\">電影</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"227\" data-m='{\"i\":227,\"p\":220,\"n\":\"video\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/entertainment/video\">話題影音</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"228\" data-m='{\"i\":228,\"p\":220,\"n\":\"music\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/entertainment/music\">音樂新聞</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"229\" data-m='{\"i\":229,\"p\":220,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":9}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"230\" data-m='{\"i\":230,\"p\":220,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":10}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"231\" data-m='{\"i\":231,\"p\":220,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":11}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"232\" data-m='{\"i\":232,\"p\":220,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":12}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"233\" data-m='{\"i\":233,\"p\":220,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":13}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|stripe.entertainment|stripe|stripe.entertainment.topstories|headlines\"  data-aop=\"top stories\"  data-id=\"234\" data-m='{\"i\":234,\"p\":218,\"n\":\"stripe.entertainment.topstories\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"235\" data-m='{\"i\":235,\"p\":234,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"236\" data-m='{\"i\":236,\"p\":235,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrfTS\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%be%8e%e5%93%a53%e5%8d%836%e8%a2%ab%e5%ab%8c%e5%b0%91%ef%bc%81%e5%a5%b9%e6%9b%9d%e7%a6%81%e5%bf%8c%e6%95%b8%e5%ad%97%e5%88%a5%e5%8c%85/ar-BBSrfTS?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpo3R.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=240&amp;y=93&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"澎恰恰3600失禮？一張圖「懂包」 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"澎哥3千6被嫌少！她曝禁忌數字別包-文章\">澎哥3千6被嫌少！她曝禁忌數字別包</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.entertainment|stripe|stripe.entertainment.HD1|headlineLinkList\"   data-id=\"237\" data-m='{\"i\":237,\"p\":218,\"n\":\"stripe.entertainment.HD1\",\"t\":\"headlineLinkList\",\"o\":4}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"238\" data-m='{\"i\":238,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpKTq\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%89%8d%e7%94%b7%e5%8f%8b%e6%81%90%e5%9a%87%e5%ae%98%e5%8f%b8%e8%90%bd%e5%b9%95-%e6%a5%8a%e9%ba%97%e8%8f%81%e5%93%bd%e5%92%bd%e7%b5%82%e6%96%bc%e9%82%84%e6%88%91%e5%85%ac%e9%81%93/ar-BBSpKTq?li=BBqiNIf\"   aria-label=\"前男友恐嚇官司落幕 楊麗菁哽咽：終於還我公道-文章\">\n" +
"\n" +
"                    <h3>前男友恐嚇官司落幕 楊麗菁哽咽：終於還我公道</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"239\" data-m='{\"i\":239,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqd4Y\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%b0%8f%e4%b8%89%e6%80%92%e6%8f%ad%e3%80%8a%e8%bb%8d%e5%b8%ab%e8%81%af%e7%9b%9f%e3%80%8b%e5%90%b3%e7%a7%80%e6%b3%a2%e5%a4%9ap%e4%b8%8d%e5%80%ab-%e7%b5%90%e6%9e%9c%e7%ab%9f%e7%84%b6%e8%a2%ab%e6%8d%95%e4%ba%86/ar-BBSqd4Y?li=BBqiNIf\"   aria-label=\"小三怒揭《軍師聯盟》吳秀波多p不倫 結果竟然被捕了-文章\">\n" +
"\n" +
"                    <h3>小三怒揭《軍師聯盟》吳秀波多P不倫 結果竟然被捕了</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"240\" data-m='{\"i\":240,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrdtR\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%85%a8%e6%b0%91%e7%98%8b%e3%80%8c10%e5%b9%b4%e6%8c%91%e6%88%b0%e3%80%8d%e7%b6%b2%e8%ae%9a%e5%b0%b1%e4%bb%96%e6%b2%92%e8%ae%8a/ar-BBSrdtR?li=BBqiNIf\"   aria-label=\"全民瘋「10年挑戰」網讚：就他沒變-文章\">\n" +
"\n" +
"                    <h3>全民瘋「10年挑戰」網讚：就他沒變</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"241\" data-m='{\"i\":241,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpcBL\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e6%be%8e%e6%81%b0%e6%81%b0%e5%8c%853600%e8%a2%ab%e9%80%80%e7%b4%85%e5%8c%85-%e6%9d%8e%e4%ba%9e%e8%90%8d%e8%aa%8d%e9%8c%af%e8%87%aa%e6%89%b9%e3%80%8c%e5%a4%a7%e5%98%b4%e5%b7%b4%e3%80%8d/ar-BBSpcBL?li=BBqiNIf\"   aria-label=\"澎恰恰包3600被退紅包 李亞萍認錯自批「大嘴巴」-文章\">\n" +
"\n" +
"                    <h3>澎恰恰包3600被退紅包 李亞萍認錯自批「大嘴巴」</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"242\" data-m='{\"i\":242,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpxw5\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e7%89%bd%e6%89%8b%e9%83%ad%e7%a2%a7%e5%a9%b7%e9%80%9b%e5%b1%95-%e5%90%91%e8%8f%af%e5%bc%b7%e4%b9%8b%e5%ad%90%e5%90%91%e4%bd%90%e9%bb%98%e8%aa%8d%e6%88%80%e6%83%85/ar-BBSpxw5?li=BBqiNIf\"   aria-label=\"牽手郭碧婷逛展 向華強之子向佐默認戀情-文章\">\n" +
"\n" +
"                    <h3>牽手郭碧婷逛展 向華強之子向佐默認戀情</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"243\" data-m='{\"i\":243,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrlrO\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e8%a2%ab%e9%85%b8%e5%9c%8b%e9%9a%9b%e4%b9%9e%e4%b8%90%ef%bc%81%e9%85%92%e4%ba%95%e6%b3%95%e5%ad%90%e9%9b%99%e6%96%87%e6%b1%82%e5%8e%9f%e8%ab%92%e2%80%a6/ar-BBSrlrO?li=BBqiNIf\"   aria-label=\"被酸國際乞丐！酒井法子雙文求原諒…-文章\">\n" +
"\n" +
"                    <h3>被酸國際乞丐！酒井法子雙文求原諒…</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"244\" data-m='{\"i\":244,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrrQ4\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e8%80%81%e5%a9%86%e6%87%b7%e4%ba%86%e5%80%8b%e7%94%b7%e5%af%b6%e5%af%b6%ef%bc%81-%e5%89%8d%e5%81%b6%e5%83%8f%e5%9c%98%e9%ab%94%e6%88%90%e5%93%a1%e6%ad%a1%e5%96%9c%e7%a7%80%e5%96%9c%e8%a8%8a/ar-BBSrrQ4?li=BBqiNIf\"   aria-label=\"老婆懷了個男寶寶！ 前偶像團體成員歡喜秀喜訊-文章\">\n" +
"\n" +
"                    <h3>老婆懷了個男寶寶！ 前偶像團體成員歡喜秀喜訊</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"245\" data-m='{\"i\":245,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq6o4\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%8f%88%e5%82%b3%e6%80%a7%e9%a8%b7%ef%bc%81%e5%a5%b3%e6%98%9f%e8%87%aa%e7%88%86%e8%a2%ab%e7%94%b7%e6%bc%94%e5%93%a1%e5%90%83%e8%b1%86%e8%85%90/ar-BBSq6o4?li=BBqiNIf\"   aria-label=\"又傳性騷！女星自爆被男演員吃豆腐-文章\">\n" +
"\n" +
"                    <h3>又傳性騷！女星自爆被男演員吃豆腐</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|stripe.entertainment|stripe|stripe.entertainment.topstories1|headlines\"  data-aop=\"top stories 1\"  data-id=\"246\" data-m='{\"i\":246,\"p\":218,\"n\":\"stripe.entertainment.topstories1\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"247\" data-m='{\"i\":247,\"p\":246,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"248\" data-m='{\"i\":248,\"p\":247,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrtp5\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e3%80%90%e6%90%b6%e9%8f%a1%e9%a0%ad%e3%80%91elva%e6%96%b0%e8%88%8a%e9%96%a8%e5%af%86%e5%bc%b7%e7%a2%b0-%e6%a5%8a%e8%ac%b9%e8%8f%af%e3%80%81%e5%ad%ab%e8%8a%b8%e8%8a%b8%e8%87%89%e5%b0%b7%e5%b0%ac/ar-BBSrtp5?li=BBqiNIf\"  >\n" +
"<img alt=\"楊謹華（左一）跟孫芸芸（左二）的聯結，大概只有ELVA了吧！不過ELVA已人間蒸發，之前又傳ELVA跟楊謹華閨密情淡，乍看楊謹華跟孫芸芸也沒好到哪去。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrkL8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=411&amp;y=145&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"楊謹華（左一）跟孫芸芸（左二）的聯結，大概只有ELVA了吧！不過ELVA已人間蒸發，之前又傳ELVA跟楊謹華閨密情淡，乍看楊謹華跟孫芸芸也沒好到哪去。 - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"【搶鏡頭】elva新舊閨密強碰 楊謹華、孫芸芸臉尷尬-文章\">【搶鏡頭】ELVA新舊閨密強碰 楊謹華、孫芸芸臉尷尬</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"249\" data-m='{\"i\":249,\"p\":247,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrtXo\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%a5%b3%e6%98%9f%e9%81%87%e6%81%90%e6%80%96%e6%83%85%e4%ba%ba%e2%80%a6%e6%83%a1%e7%94%b7%e6%8b%bf%e5%88%80%e6%8a%b5%e8%84%96%e5%ad%90%e9%a3%86%e7%bd%b5/ar-BBSrtXo?li=BBqiNIf\"  >\n" +
"<img alt=\"劉雨柔\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrwp9.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=301&amp;y=284&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"劉雨柔 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"女星遇恐怖情人…惡男拿刀抵脖子飆罵-文章\">女星遇恐怖情人…惡男拿刀抵脖子飆罵</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"250\" data-m='{\"i\":250,\"p\":247,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZAj\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%8c%853600%e8%a2%ab%e6%9d%8e%e4%ba%9e%e8%90%8d%e9%80%80%e7%b4%85%e5%8c%85-%e6%be%8e%e6%81%b0%e6%81%b0%e3%80%8c%e5%ab%8c%e5%b0%91-%e9%82%a3%e5%b0%b1%e5%b0%8d%e4%b8%8d%e8%b5%b7%e3%80%8d%e5%be%8c%e5%88%aa%e6%96%87/ar-BBSoZAj?li=BBqiNIf\"  >\n" +
"<img alt=\"包3600被李亞萍退紅包 澎恰恰「嫌少 那就對不起」後刪文\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp8UV.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=142&amp;y=97&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"澎恰恰 - 中時電子報\" /> <div>\n" +
"<h3   aria-label=\"包3600被李亞萍退紅包 澎恰恰「嫌少 那就對不起」後刪文-文章\">包3600被李亞萍退紅包 澎恰恰「嫌少 那就對不起」後刪文</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|stripe.entertainment|stripe|stripe.entertainment.topstories2|headlines\"  data-aop=\"top stories 2\"  data-id=\"251\" data-m='{\"i\":251,\"p\":218,\"n\":\"stripe.entertainment.topstories2\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"252\" data-m='{\"i\":252,\"p\":251,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"253\" data-m='{\"i\":253,\"p\":252,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpe43\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%be%8e%e6%81%b0%e6%81%b0%e5%88%aa%e6%96%87%e3%80%8c5%e5%ad%97%e4%ba%86%e7%b5%90%e3%80%8d3600%e4%b9%8b%e4%ba%82/ar-BBSpe43?li=BBqiNIf\"  >\n" +
"<img alt=\"李亞萍、王彩樺、翁立友、曹雅雯《黃金年代》、澎恰恰 圖／華視提供、資料照\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmlVw.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=261&amp;y=161&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"李亞萍、王彩樺、翁立友、曹雅雯《黃金年代》、澎恰恰 圖／華視提供、資料照 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"澎恰恰刪文「5字了結」3600之亂-文章\">澎恰恰刪文「5字了結」3600之亂</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"254\" data-m='{\"i\":254,\"p\":252,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoORg\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%bc%b5%e6%9f%8f%e8%8a%9d%e7%a7%81%e4%b8%8b%e5%8c%96%e5%a6%9d%e5%8f%aa%e6%9c%894%e6%ad%a5%e9%a9%9f-%e7%9c%8b%e5%ae%8c%e8%ae%93%e4%ba%ba%e5%bf%83%e7%a2%8e%ef%bc%81/ar-BBSoORg?li=BBqiNIf\"  >\n" +
"<img alt=\"張柏芝\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqgOJ8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=790&amp;y=920&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"張柏芝 - Getty Images\" /> <div>\n" +
"<h3   aria-label=\"張柏芝私下化妝只有4步驟 看完讓人心碎！-文章\">張柏芝私下化妝只有4步驟 看完讓人心碎！</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"255\" data-m='{\"i\":255,\"p\":252,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp8Lj\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e3%80%8c%e9%be%8d%e4%ba%94%e3%80%8d%e4%b9%8b%e5%ad%90%e8%aa%8d%e6%88%80%e9%83%ad%e7%a2%a7%e5%a9%b7%e8%ac%9d%e5%a4%a7%e5%ae%b6%e7%a5%9d%e7%a6%8f/ar-BBSp8Lj?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpbk3.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=251&amp;y=172&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"「龍五」之子認戀郭碧婷：謝大家祝福 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"「龍五」之子認戀郭碧婷：謝大家祝福-文章\">「龍五」之子認戀郭碧婷：謝大家祝福</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"256\" data-m='{\"i\":256,\"p\":251,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"257\" data-m='{\"i\":257,\"p\":256,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZcM\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e9%87%91%e7%a7%80%e8%b3%a2%e6%9c%80%e6%96%b0%e8%bb%8d%e4%b8%ad%e7%85%a7%e6%9b%9d%e5%85%89-%e7%b6%b2%e5%8f%8b%e7%ac%91%e5%99%b4%e6%89%be%e5%be%97%e5%88%b0%e6%98%af%e7%9c%9f%e6%84%9b/ar-BBSoZcM?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1vl.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=298&amp;y=175&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"金秀賢最新軍中照曝光 網友笑噴：找得到是真愛 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"金秀賢最新軍中照曝光 網友笑噴：找得到是真愛-文章\">金秀賢最新軍中照曝光 網友笑噴：找得到是真愛</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"258\" data-m='{\"i\":258,\"p\":256,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoVvp\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e9%80%a310%e6%ac%a1%e9%81%93%e6%ad%89%ef%bc%81%e7%94%b7%e6%98%9f%e8%aa%8d%e6%af%80%e7%b4%84%e2%80%a6%e7%b5%90%e5%b1%80%e9%80%86%e8%bd%89/ar-BBSoVvp?li=BBqiNIf\"  >\n" +
"<img alt=\"王嘉爾。（圖／翻攝自王嘉爾微博）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp06e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=264&amp;y=127&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"王嘉爾。（圖／翻攝自王嘉爾微博） - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"連10次道歉！男星認毀約…結局逆轉-文章\">連10次道歉！男星認毀約…結局逆轉</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"259\" data-m='{\"i\":259,\"p\":256,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGiV\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%af%94%e4%be%8b%e8%b6%85%e7%8b%82%ef%bc%81%e9%a4%a8%e9%95%b7%e6%90%ad%e3%80%8c%e6%ad%a3%e5%a6%b9%e5%a5%b3%e8%ad%a6%e3%80%8d-%e7%b2%89%e7%b5%b2%e9%a9%9a%e5%91%86%e6%89%8b%e8%87%82%e5%aa%b2%e7%be%8e%e9%a0%ad%e5%9c%8d/ar-BBSoGiV?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoURK.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=658&amp;y=235&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"比例超狂！館長搭「正妹女警」 粉絲驚呆：手臂媲美頭圍 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"比例超狂！館長搭「正妹女警」 粉絲驚呆：手臂媲美頭圍-文章\">比例超狂！館長搭「正妹女警」 粉絲驚呆：手臂媲美頭圍</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"260\" data-m='{\"i\":260,\"p\":251,\"n\":\"secondary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"261\" data-m='{\"i\":261,\"p\":260,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoXz5\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%bb%96%e5%b3%bb%e4%bd%8f%e9%99%a2%e7%ab%9f%e9%81%ad%e5%81%b7%e6%8b%8d%e5%a4%96%e6%b5%81%ef%bc%81%e5%85%92%e7%99%bc%e8%81%b2%e6%98%8e%e7%97%9b%e6%96%a5/ar-BBSoXz5?li=BBqiNIf\"  >\n" +
"<img alt=\"廖峻（圖／臉書）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoV5G.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=266&amp;y=155&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"廖峻（圖／臉書） - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"廖峻住院竟遭偷拍還外流！兒怒斥「打擊病人」-文章\">廖峻住院竟遭偷拍還外流！兒怒斥「打擊病人」</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"262\" data-m='{\"i\":262,\"p\":251,\"n\":\"tertiary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"263\" data-m='{\"i\":263,\"p\":262,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGyK\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e7%94%b7%e6%98%9f%e5%a5%97%e7%89%a2175%e5%84%84%e5%af%8c%e5%ae%b6%e5%8d%83%e9%87%91-13%e5%b9%b4%e8%b1%aa%e9%96%80%e7%9c%9f%e5%af%a6%e7%94%9f%e6%b4%bb%e6%9b%9d%e5%85%89/ar-BBSoGyK?li=BBqiNIf\"  >\n" +
"<img alt=\"FotoJet (13)\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoVhK.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"FotoJet (13) - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"男星套牢175億富家千金 13年豪門真實生活曝光-文章\">男星套牢175億富家千金 13年豪門真實生活曝光</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"264\" data-m='{\"i\":264,\"p\":262,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmLrZ\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%bb%96%e5%b3%bb%e7%88%86%e5%b0%8f%e4%b8%ad%e9%a2%a8%ef%bc%81%e5%85%92%e5%ad%90%e8%a6%aa%e6%9b%9d%e9%9a%b1%e8%97%8f%e7%97%85%e6%83%85%e5%8e%9f%e5%9b%a0/ar-BBSmLrZ?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmX7W.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=268&amp;y=214&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"廖峻爆小中風！兒子親曝隱藏病情原因 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"廖峻爆小中風！兒子親曝隱藏病情原因-文章\">廖峻爆小中風！兒子親曝隱藏病情原因</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"265\" data-m='{\"i\":265,\"p\":262,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSolwV\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/3%e6%ad%b2%e5%85%92%e5%96%8a%e8%a6%81%e5%bc%9f%e5%bc%9f-%e9%bb%83%e5%a6%83%e5%98%86%e4%b8%8d%e6%83%b3%e5%86%8d%e7%94%9f/ar-BBSolwV?li=BBqiNIf\"  >\n" +
"<img alt=\"3歲兒喊要弟弟 黃妃嘆：不想再生\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoq5e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=416&amp;y=110&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"3歲兒喊要弟弟 黃妃嘆：不想再生 - Copyright? 中時電子報\" /> <div>\n" +
"<h3   aria-label=\"3歲兒喊要弟弟 黃妃嘆：不想再生-文章\">3歲兒喊要弟弟 黃妃嘆：不想再生</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"266\" data-m='{\"i\":266,\"p\":251,\"n\":\"tertiary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"267\" data-m='{\"i\":267,\"p\":266,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoES4\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%b0%88%e8%a8%aa%ef%bc%8f%e7%8e%84%e5%bd%ac%e7%b7%b4%e7%ad%89%e7%b7%b4%e5%88%b0%e6%87%b7%e7%96%91%e4%ba%ba%e7%94%9f-%e6%9c%b4%e4%bf%a1%e6%83%a0%e6%b1%82%e7%94%9f%e5%ad%98%e5%8a%a0%e5%85%a5%e6%89%93%e6%80%aa/ar-BBSoES4?li=BBqiNIf\"  >\n" +
"<img alt=\"collage\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoLBD.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=769&amp;y=324&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"collage - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"專訪／玄彬練等練到懷疑人生 朴信惠求生存加入打怪-文章\">專訪／玄彬練等練到懷疑人生 朴信惠求生存加入打怪</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"268\" data-m='{\"i\":268,\"p\":266,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm8nd\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e4%b8%8a%e7%b7%9a%e4%ba%86%ef%bc%81%e6%ad%90%e9%99%bd%e5%a8%9c%e5%a8%9c%e7%b6%b2%e5%90%8d%e6%9b%9d%e5%85%89-%e7%b6%b2%e5%8f%8b%e6%9a%b4%e5%8b%95/ar-BBSm8nd?li=BBqiNIf\"  >\n" +
"<img alt=\" 歐陽娜娜,泡麵,香腸嘴/翻攝自歐陽娜娜微博\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3j2e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=178&amp;y=105&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"歐陽娜娜,泡麵,香腸嘴/翻攝自歐陽娜娜微博 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"上線了！歐陽娜娜網名曝光 網友暴動-文章\">上線了！歐陽娜娜網名曝光 網友暴動</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"269\" data-m='{\"i\":269,\"p\":266,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmQwG\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%9e%97%e6%9b%b4%e6%96%b0%e5%86%8d%e8%a2%ab%e6%8a%93%e7%b4%84%e6%9c%83%e3%80%8a%e7%be%8e%e4%ba%ba%e5%bf%83%e8%a8%88%e3%80%8b%e7%9a%84%e5%a5%b9-%e7%a0%b4%e9%99%a4%e5%8a%88%e8%85%bf%e5%88%86%e6%89%8b%e8%ac%a0%e8%a8%80%ef%bc%81/ar-BBSmQwG?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoIEZ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=663&amp;y=488&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林更新 - Getty\" /> <div>\n" +
"<h3   aria-label=\"林更新再被抓約會《美人心計》的她 破除劈腿分手謠言！-文章\">林更新再被抓約會《美人心計》的她 破除劈腿分手謠言！</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"270\" data-m='{\"i\":270,\"p\":251,\"n\":\"secondary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"271\" data-m='{\"i\":271,\"p\":270,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnaC2\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/10%e5%b9%b4%e6%8c%91%e6%88%b0%ef%bc%81%e5%b0%8f%e7%a6%8e%e8%b6%85v%e7%93%9c%e5%ad%90%e8%87%89%e6%9b%9d%e5%85%89-%e6%a5%8a%e4%b8%9e%e7%90%b3%e6%a0%b9%e6%9c%ac%e6%b2%92%e8%ae%8a/ar-BBSnaC2?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSnfAJ.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=538&amp;y=486&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"10年挑戰！小禎超V瓜子臉曝光 楊丞琳根本沒變 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"10年挑戰！小禎超v瓜子臉曝光 楊丞琳根本沒變-文章\">10年挑戰！小禎超V瓜子臉曝光 楊丞琳根本沒變</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"272\" data-m='{\"i\":272,\"p\":251,\"n\":\"tertiary\",\"y\":8,\"o\":7}'>\n" +
" <li  data-id=\"273\" data-m='{\"i\":273,\"p\":272,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoNtA\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e9%9a%8b%e6%a3%a0%e6%94%be%e6%89%8b%e7%82%ba%e5%85%92%e9%80%81%e6%a9%9f%e5%bf%ab%e5%93%ad%e5%87%ba%e4%be%86-max%e8%bd%89%e8%ba%ab%e6%9c%89%e4%b8%80%e5%b0%8a%e3%80%8c%e4%bd%9b%e7%a5%96%e3%80%8d/ar-BBSoNtA?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp0vI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=1328&amp;y=1496&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"隋棠 - Getty\" /> <div>\n" +
"<h3   aria-label=\"含淚放手讓兒跟尪出國 隋棠：真捨不得-文章\">含淚放手讓兒跟尪出國 隋棠：真捨不得</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"274\" data-m='{\"i\":274,\"p\":272,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmH9j\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e3%80%8a%e5%b0%8f%e5%a5%b3%e8%8a%b1%e4%b8%8d%e6%a3%84%e3%80%8b%e8%b4%8f%e9%81%8e%e5%bb%b6%e7%a6%a7%ef%bc%81%e9%99%b8%e5%8a%87%e3%80%8c%e7%a0%b4%e7%99%be%e8%90%ac%e6%b5%81%e9%87%8f%e6%8e%92%e8%a1%8c%e3%80%8d%e9%80%9f%e5%ba%a6%ef%bc%8c%e6%99%a8%e7%a5%9e%e5%88%b7%e6%96%b0%e5%80%8b%e4%ba%ba%e7%b4%80%e9%8c%84/ar-BBSmH9j?li=BBqiNIf\"  >\n" +
"<img alt=\"《小女花不棄》贏過延禧！陸劇「破百萬流量排行」速度，晨神刷新個人紀錄\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoCog.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=152&amp;y=185&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林依晨 - beauty321\" /> <div>\n" +
"<h3   aria-label=\"《小女花不棄》流量狂飆！晨神刷新個人紀錄-文章\">《小女花不棄》流量狂飆！晨神刷新個人紀錄</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"275\" data-m='{\"i\":275,\"p\":272,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSndOy\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%8c%ba%e9%81%8e%e5%a4%a7%e8%85%b8%e7%99%8c%ef%bc%81%e3%80%8c%e5%b0%8f%e8%99%8e%e9%9a%8a%e3%80%8d%e6%88%90%e5%93%a1%e7%b5%82%e6%96%bc%e6%88%80%e6%84%9b/ar-BBSndOy?li=BBqiNIf\"  >\n" +
"<img alt=\"林利（圖／臉書）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSnf4M.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=331&amp;y=209&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林利（圖／臉書） - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"挺過婚變跟大腸癌！林立洋終於戀愛-文章\">挺過婚變跟大腸癌！林立洋終於戀愛</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"276\" data-m='{\"i\":276,\"p\":251,\"n\":\"secondary\",\"y\":8,\"o\":8}'>\n" +
" <li  data-id=\"277\" data-m='{\"i\":277,\"p\":276,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmB89\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e9%a6%99%e6%b8%af%e5%90%8d%e5%b0%8e%e6%89%bea%e5%92%96%e5%a5%b3%e6%98%9f%e6%bc%94%e5%89%8d%e5%a5%b3%e5%8f%8b-%e9%81%ad%e5%97%86%e5%85%a8%e7%82%ba%e3%80%8c%e6%bb%bf%e8%b6%b3%e7%a7%81%e6%85%be%e3%80%8d%ef%bc%81/ar-BBSmB89?li=BBqiNIf\"  >\n" +
"<img alt=\"香港名導找A咖女星演前女友 遭嗆全為「滿足私慾」！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmOQ9.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=378&amp;y=140&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"香港名導找A咖女星演前女友 遭嗆全為「滿足私慾」！ - Copyright? 中時電子報\" /> <div>\n" +
"<h3   aria-label=\"香港名導找a咖女星演前女友 遭嗆全為「滿足私慾」！-文章\">香港名導找A咖女星演前女友 遭嗆全為「滿足私慾」！</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"278\" data-m='{\"i\":278,\"p\":218,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"財經\"\n" +
"          data-section-id=\"stripe.finance\"\n" +
"          data-section-id=\"stripe.finance\">\n" +
"        <div class=\"finance stripeouter\"  data-aop=\"stripe.finance_stripe\"  data-id=\"279\" data-m='{\"i\":279,\"p\":19,\"n\":\"stripe.finance\",\"t\":\"stripe\",\"o\":9}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"280\" data-m='{\"i\":280,\"p\":279,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.finance.navigation_stripenavigation\"  data-id=\"281\" data-m='{\"i\":281,\"p\":279,\"n\":\"stripe.finance.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"282\" data-m='{\"i\":282,\"p\":281,\"n\":\"finance\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/money\"  data-id=\"283\" data-m='{\"i\":283,\"p\":281,\"n\":\"finance\",\"y\":4,\"o\":2}'>財經</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"284\" data-m='{\"i\":284,\"p\":281,\"n\":\"即時新聞總覽\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/money/moneyrealtime\">即時新聞總覽</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"285\" data-m='{\"i\":285,\"p\":281,\"n\":\"Markets\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/money/markets\">市場</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"286\" data-m='{\"i\":286,\"p\":281,\"n\":\"PersonalFinance\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/money/personalfinance\">個人理財</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"287\" data-m='{\"i\":287,\"p\":281,\"n\":\"finance-real-estate\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/money/realestate\">房地產</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"288\" data-m='{\"i\":288,\"p\":281,\"n\":\"CareerAndEducation\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/money/careerandeducation\">職場焦點</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"289\" data-m='{\"i\":289,\"p\":281,\"n\":\"FinanceCurrencyConverter\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/money/currencyconverter\">匯率換算</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"290\" data-m='{\"i\":290,\"p\":281,\"n\":\"stockscreener\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/money/stockscreener\">股票篩選</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"291\" data-m='{\"i\":291,\"p\":281,\"n\":\"FinanceTools\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/money/tools\">工具</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"292\" data-m='{\"i\":292,\"p\":281,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"293\" data-m='{\"i\":293,\"p\":281,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"294\" data-m='{\"i\":294,\"p\":281,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"295\" data-m='{\"i\":295,\"p\":281,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"296\" data-m='{\"i\":296,\"p\":281,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.finance|stripe|stripe.finance.topstories1|headlines\"  data-aop=\"top stories1\"  data-id=\"297\" data-m='{\"i\":297,\"p\":279,\"n\":\"stripe.finance.topstories1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"298\" data-m='{\"i\":298,\"p\":297,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"299\" data-m='{\"i\":299,\"p\":298,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqPVf\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e6%98%94%e5%8c%97%e9%83%a8%e5%8d%a08%e6%88%90-%e4%bb%8a%e5%b9%b4%e5%8d%97%e9%83%a8%e6%9c%80%e6%95%a2%e8%8a%b1%ef%bc%81%e8%a6%8f%e6%a8%a1%e5%a4%a7%e7%b8%ae%e6%b0%b4-%e5%b0%be%e7%89%99%e3%80%8c%e5%8c%97%e5%86%b7%e5%8d%97%e7%86%b1%e3%80%8d/ar-BBSqPVf?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqSk1.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=469&amp;y=227&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"規模大縮水 尾牙北冷南熱 - Copyright? 中時電子報\" /> <div>\n" +
"<h3   aria-label=\"昔北部占8成 今年南部最敢花！規模大縮水 尾牙「北冷南熱」-文章\">昔北部占8成 今年南部最敢花！規模大縮水 尾牙「北冷南熱」</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"300\" data-m='{\"i\":300,\"p\":298,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphH4\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e6%93%84%e7%8d%b2%e6%96%87%e9%9d%92%e9%ad%82-%e6%9e%97%e5%8f%a3%e9%80%99%e8%a3%a1%e4%ba%a4%e6%98%93%e9%87%8f%e5%85%a8%e5%b9%b4%e4%bd%8d%e5%b1%85%e7%ac%ac%e4%ba%8c/ar-BBSphH4?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp6Bq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 好房網 提供\" /> <div>\n" +
"<h3   aria-label=\"擄獲文青魂 林口這裡交易量全年位居第二-文章\">擄獲文青魂 林口這裡交易量全年位居第二</h3>\n" +
"\n" +
"<img alt=\"好房網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>好房網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"301\" data-m='{\"i\":301,\"p\":298,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr3JW\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e4%bd%a0%e6%98%af%e3%80%8c%e6%bd%9b%e5%9c%a8-ceo-%e4%ba%ba%e9%81%b8%e3%80%8d%e5%97%8e%ef%bc%9flinkedin-%e7%a0%94%e7%a9%b6%e4%b8%80%e8%90%ac%e5%90%8d%e5%9f%b7%e8%a1%8c%e9%95%b7%e5%be%8c%ef%bc%8c%e5%be%97%e5%87%ba-3-%e5%a4%a7%e8%a6%81%e9%bb%9e/ar-BBSr3JW?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqNJe.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=479&amp;y=249&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 Business Next Publishing Corp 提供\" /> <div>\n" +
"<h3   aria-label=\"你是「潛在 ceo 人選」嗎？linkedin 研究一萬名執行長後，得出 3 大要點-文章\">你是「潛在 CEO 人選」嗎？LinkedIn 研究一萬名執行長後，得出 3 大要點</h3>\n" +
"\n" +
"<img alt=\"經理人月刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>經理人月刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.finance|stripe|stripe.finance.HD1|headlineLinkList\"   data-id=\"302\" data-m='{\"i\":302,\"p\":279,\"n\":\"stripe.finance.HD1\",\"t\":\"headlineLinkList\",\"o\":4}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"303\" data-m='{\"i\":303,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp6Bo\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e8%b1%90%e5%8e%9f%e9%96%8b%e5%83%b9%e8%b5%b0%e9%ab%98%ef%bc%8111%e6%96%b0%e6%a1%88%e5%b0%87%e5%80%92%e5%85%a5%e5%8d%83%e6%88%b6-%e3%80%8c%e4%b8%8b%e4%bf%ae%e6%bd%ae%e3%80%8d%e7%b7%8a%e8%b7%9f%e5%9c%a8%e5%be%8c/ar-BBSp6Bo?li=BBqiQ9P\"   aria-label=\"豐原開價走高！11新案將倒入千戶 「下修潮」緊跟在後-文章\">\n" +
"\n" +
"                    <h3>豐原開價走高！11新案將倒入千戶 「下修潮」緊跟在後</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"好房網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"304\" data-m='{\"i\":304,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr3BQ\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e9%a0%98%e5%ae%8c%e5%b9%b4%e7%b5%82%e6%83%b3%e8%b7%b3%e6%a7%bd%ef%bc%9f%e9%9d%a2%e8%a9%a6%e5%89%8d%e6%ba%96%e5%82%99%e5%a5%bd%e9%80%99-9-%e9%a1%8c%ef%bc%8c%e6%9c%83%e5%a4%a7%e5%b9%85%e6%8f%90%e9%ab%98%e9%8c%84%e5%8f%96%e7%8e%87/ar-BBSr3BQ?li=BBqiQ9P\"   aria-label=\"領完年終想跳槽？面試前準備好這 9 題，會大幅提高錄取率-文章\">\n" +
"\n" +
"                    <h3>領完年終想跳槽？面試前準備好這 9 題，會大幅提高錄取率</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"經理人月刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"305\" data-m='{\"i\":305,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpnkM\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e6%88%bf%e5%b1%8b%e7%a8%85%e6%93%ac%e5%86%8d%e9%99%8d%ef%bc%81%e8%87%aa%e4%bd%8f%e8%80%85%e8%a6%81%e7%9c%81%e7%a8%852%e9%bb%9e%e9%a0%88%e7%9f%a5/ar-BBSpnkM?li=BBqiQ9P\"   aria-label=\"房屋稅擬再降！自住者要省稅2點須知-文章\">\n" +
"\n" +
"                    <h3>房屋稅擬再降！自住者要省稅2點須知</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"好房網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"306\" data-m='{\"i\":306,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpnkD\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e7%88%9b%e5%b0%be%e6%a8%93%e4%b9%9f%e8%83%bd%e6%8b%89%e6%8a%ac%e5%9c%b0%e5%8d%80%e8%a1%8c%e6%83%85-%e6%88%bf%e4%bb%b2%e5%96%ae%e5%9d%aa%e4%b8%8a%e6%bc%b23%ef%bd%9e5%e8%90%ac/ar-BBSpnkD?li=BBqiQ9P\"   aria-label=\"爛尾樓也能拉抬地區行情 房仲：單坪上漲3～5萬-文章\">\n" +
"\n" +
"                    <h3>爛尾樓也能拉抬地區行情 房仲：單坪上漲3～5萬</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"好房網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"307\" data-m='{\"i\":307,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpvly\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e6%83%b3%e5%8d%87%e9%81%b7%e3%80%81%e5%8a%a0%e8%96%aa%ef%bc%8c%e6%80%8e%e9%ba%bc%e6%8f%90%e6%89%8d%e6%9c%83%e6%88%90%e5%8a%9f%ef%bc%9f%e7%b8%be%e6%95%88%e9%9d%a2%e8%ab%87%e5%89%8d%e8%a6%81%e5%81%9a%e7%9a%84-5-%e9%a0%85%e6%ba%96%e5%82%99/ar-BBSpvly?li=BBqiQ9P\"   aria-label=\"想升遷、加薪，怎麼提才會成功？績效面談前要做的 5 項準備-文章\">\n" +
"\n" +
"                    <h3>想升遷、加薪，怎麼提才會成功？績效面談前要做的 5 項準備</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"經理人月刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"308\" data-m='{\"i\":308,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpDrC\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e5%85%a8%e7%90%83%e6%88%90%e9%95%b7%e8%b6%a8%e7%b7%a9%e9%83%bd%e6%80%aa%e4%b8%89d%e4%ba%ba%e5%8f%a3%e6%b8%9b%e5%b0%91%e3%80%81%e5%8e%bb%e6%a7%93%e6%a1%bf%e5%8c%96%e3%80%81%e5%8e%bb%e5%85%a8%e7%90%83%e5%8c%96/ar-BBSpDrC?li=BBqiQ9P\"   aria-label=\"全球成長趨緩都怪三d：人口減少、去槓桿化、去全球化-文章\">\n" +
"\n" +
"                    <h3>全球成長趨緩都怪三D：人口減少、去槓桿化、去全球化</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"309\" data-m='{\"i\":309,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqXAP\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e7%92%b0%e7%8b%80%e7%b7%9a6%e6%9c%88%e9%96%8b%e9%80%9a-%e6%88%bf%e5%b8%82%e8%b2%b7%e6%b0%a3%e6%97%ba/ar-BBSqXAP?li=BBqiQ9P\"   aria-label=\"環狀線6月開通 房市買氣旺-文章\">\n" +
"\n" +
"                    <h3>環狀線6月開通 房市買氣旺</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"310\" data-m='{\"i\":310,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpC6t\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e7%9c%8b%e5%9c%96%e8%ab%96%e5%b8%82%e8%b2%bf%e6%98%93%e6%88%b0%e7%9a%84%e8%b2%a0%e9%9d%a2%e6%b2%96%e6%93%8a%e5%b7%b2%e7%b6%93%e5%9c%a8%e7%be%8e%e5%9c%8b%e8%82%a1%e5%b8%82%e4%b8%ad%e9%a1%af%e7%8f%be/ar-BBSpC6t?li=BBqiQ9P\"   aria-label=\"看圖論市：貿易戰的負面沖擊已經在美國股市中顯現-文章\">\n" +
"\n" +
"                    <h3>看圖論市：貿易戰的負面沖擊已經在美國股市中顯現</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"Bloomberg 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3lldo.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div tabindex=\"-1\"  id=\"rectangle2_homepage_1e13290a-0b07-486b-87c8-27dc2bd75dbc\"  class=\"ad\"   data-aop=\"ad_ad\"  data-id=\"311\" data-m='{\"i\":311,\"p\":279,\"n\":\"Ad\",\"t\":\"ad\",\"o\":5}'   aria-hidden=\"true\">\n" +
" \n" +
" \n" +
"<div class=\"outeradcontainer\">\n" +
" \n" +
"<div  id=\"rectangle2_homepage_container_1e13290a-0b07-486b-87c8-27dc2bd75dbc\" class=\"adcontainer\" data-adjs='{\"allowedViews\":\"SIZE234COLUMN\"}' tabindex=\"-1\">\n" +
" <script class=\"sdkdapscript\">\n" +
"require([\"dap\"], function (dap)\n" +
"{\n" +
" dap(\"&amp;AP=1089&amp;PG=MSNTWZH16&amp;PVGUID=5ccff976c56c4a539087c2a9ffe97c17&amp;PROVIDERID=7HD66FC\", 300, 250, \"rectangle2_homepage_container_1e13290a-0b07-486b-87c8-27dc2bd75dbc\", {\"isEnabled\":0, \"isDarkTheme\":0}, {\"scrollInit\":true,\"enableAdRefresh\":true,\"adaptiveRefresh\":true,\"adaptiveRefreshInterval\":3000,\"prid\":\"7HD66FC\",\"adsVNextHeight\":\"250\",\"adsVNextWidth\":\"300\",\"rid\":\"5ccff976c56c4a539087c2a9ffe97c17\",\"adtext\":\"\",\"showmute\":false,\"showvolume\":false,\"nonviewablebehavior\":\"\",\"showprogressbar\":false,\"allowfullscreen\":false,\"videothreshold\":1,\"videooffset\":5,\"skiplocation\":\"\",\"skiptext\":\"\",\"skipbuttontext\":\"\",\"playOnMouseover\":false,\"audioOnMouseover\":\"false\",\"playVideoVisibleThreshold\":50,\"disableTopBar\":false,\"preShowType\":\"none\",\"preShowUrl\":\"\",\"postShowType\":\"\",\"postShowUrl\":\"\",\"postShowClickUrl\":\"\",\"fallbackType\":\"\",\"fallbackUrl\":\"\",\"fallbackClickUrl\":\"\",\"vpaidTimeout\":5000,\"terminateUnresponsiveVPAIDCreative\":false,\"enableInlineVideoForIos\":false,\"delayExpandUntilVPAIDInit\":false,\"delayExpandUntilVPAIDImpression\":false,\"apnId\":280});\n" +
" });\n" +
"</script>\n" +
" </div>\n" +
" \n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.finance|stripe|stripe.finance.HD2|headlineLinkList\"   data-id=\"312\" data-m='{\"i\":312,\"p\":279,\"n\":\"stripe.finance.HD2\",\"t\":\"headlineLinkList\",\"o\":6}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"313\" data-m='{\"i\":313,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrrXm\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e4%b8%ad%e9%bc%8e%e5%8e%bb%e5%b9%b4%e5%9c%a8%e5%bb%ba%e5%8f%8a%e6%96%b0%e6%8e%a5%e6%a1%88%e9%87%91%e9%a1%8d%e9%9b%99%e5%89%b5%e6%ad%b7%e5%8f%b2%e6%96%b0%e9%ab%98%ef%bc%8c%e4%bb%8a%e5%b9%b4%e5%8a%9b%e6%8b%bc%e7%ba%8c%e6%94%80%e5%b3%b0/ar-BBSrrXm?li=BBqiQ9P\"   aria-label=\"中鼎去年在建及新接案金額雙創歷史新高，今年力拼續攀峰-文章\">\n" +
"\n" +
"                    <h3>中鼎去年在建及新接案金額雙創歷史新高，今年力拼續攀峰</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"財訊快報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AApH8da.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"314\" data-m='{\"i\":314,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr018\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e5%82%b3%e7%94%a2%e6%a5%ad-%e4%b8%ad%e8%a6%8f%e4%b8%ad%e7%9f%a9%e4%b8%8d%e8%8a%b1%e4%bf%8f%ef%bc%81%e6%b2%92%e4%ba%86%e5%9a%b4%e5%87%b1%e6%b3%b0-%e8%a3%95%e9%9a%86%e5%b0%be%e7%89%99%e5%8f%96%e6%b6%88%e6%8a%bd%e6%b1%bd%e8%bb%8a/ar-BBSr018?li=BBqiQ9P\"   aria-label=\"傳產業 中規中矩不花俏！沒了嚴凱泰 裕隆尾牙取消抽汽車-文章\">\n" +
"\n" +
"                    <h3>傳產業 中規中矩不花俏！沒了嚴凱泰 裕隆尾牙取消抽汽車</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"315\" data-m='{\"i\":315,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrEwm\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e4%b8%8a%e9%8a%80%e4%bb%8a%e5%b9%b4%e6%a5%ad%e7%b8%be%e5%8a%9b%e6%8b%9a%e5%85%a9%e4%bd%8d%e6%95%b8%e6%88%90%e9%95%b7%ef%bc%8c%e6%9c%9d%e5%85%a8%e7%90%83%e5%8c%96%e4%bd%88%e5%b1%80/ar-BBSrEwm?li=BBqiQ9P\"   aria-label=\"上銀今年業績力拚兩位數成長，朝全球化佈局-文章\">\n" +
"\n" +
"                    <h3>上銀今年業績力拚兩位數成長，朝全球化佈局</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"財訊快報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AApH8da.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"316\" data-m='{\"i\":316,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpbAY\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e8%97%8d%e6%b5%b7%e7%ad%96%e7%95%a5%e7%99%bc%e8%a1%a8%e4%ba%8614%e5%b9%b4%ef%bc%8c%e7%82%ba%e4%bd%95%e9%82%84%e9%80%99%e9%ba%bc%e5%a4%9a%e4%bc%81%e6%a5%ad%e8%b5%b0%e4%b8%8d%e5%87%ba%e7%b4%85%e6%b5%b7%ef%bc%9f%e5%b0%88%e8%a8%aa%e4%bd%9c%e8%80%85%e8%ab%87%e3%80%8c%e8%88%aa%e5%90%91%e8%97%8d%e6%b5%b7%e3%80%8d%e7%9a%84%e6%8a%80%e8%a1%93/ar-BBSpbAY?li=BBqiQ9P\"   aria-label=\"藍海策略發表了14年，為何還這麼多企業走不出紅海？專訪作者談「航向藍海」的技術-文章\">\n" +
"\n" +
"                    <h3>藍海策略發表了14年，為何還這麼多企業走不出紅海？專訪作者談「航向藍海」的技術</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"經理人月刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"317\" data-m='{\"i\":317,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HV\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e9%80%99%e5%ae%b6%e5%85%a8%e5%8f%b0%e5%8c%96%e5%a6%9d%e5%93%81%e5%9d%aa%e6%95%88%e7%8e%8b-%e9%9d%a0%e5%93%81%e7%89%8c%e3%80%8c%e8%b5%b7%e5%ae%b6%e5%8e%9d%e3%80%8d%e6%a8%a1%e5%bc%8f%e7%a9%a9%e5%9d%90%e7%ac%ac%e4%b8%80/ar-BBSp1HV?li=BBqiQ9P\"   aria-label=\"這家全台化妝品坪效王 靠品牌「起家厝」模式穩坐第一-文章\">\n" +
"\n" +
"                    <h3>這家全台化妝品坪效王 靠品牌「起家厝」模式穩坐第一</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"318\" data-m='{\"i\":318,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpbHs\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e9%99%b8%e4%bc%81%e9%81%95%e7%b4%84%e5%82%b5%e5%bd%88%e9%a0%bb%e7%88%86%ef%bc%81%e7%ab%84%e6%94%b9%e8%b2%a1%e5%a0%b1%e5%a4%b1%e4%bf%a1%e6%8a%95%e8%b3%87%e4%ba%ba%e3%80%81%e5%89%8d%e6%99%af%e5%a0%aa%e6%86%82%ef%bc%9f/ar-BBSpbHs?li=BBqiQ9P\"   aria-label=\"陸企違約債彈頻爆！竄改財報失信投資人、前景堪憂？-文章\">\n" +
"\n" +
"                    <h3>陸企違約債彈頻爆！竄改財報失信投資人、前景堪憂？</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"319\" data-m='{\"i\":319,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpbhC\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e5%a4%8f%e6%99%ae%e9%a3%868percent%ef%bc%81pc%e4%ba%8b%e6%a5%ad%e5%ad%90%e5%85%ac%e5%8f%b8dynabook%e7%99%bc%e8%a1%a8%e3%80%8c%e9%a6%96%e6%ac%be%e3%80%8d%e6%96%b0%e6%a9%9f/ar-BBSpbhC?li=BBqiQ9P\"   aria-label=\"夏普飆8%！pc事業子公司dynabook發表「首款」新機-文章\">\n" +
"\n" +
"                    <h3>夏普飆8%！PC事業子公司Dynabook發表「首款」新機</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"320\" data-m='{\"i\":320,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2nb\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e6%98%af%e8%97%95%e6%96%b7%e7%b5%b2%e9%80%a3%e9%82%84%e6%98%af%e4%b8%80%e5%88%80%e5%85%a9%e6%96%b7%ef%bc%9f%e8%8b%b1%e5%9c%8b%e8%84%ab%e6%ad%90%e5%85%ad%e7%a8%ae%e7%b5%90%e5%b1%80%e7%8c%9c%e6%83%b3/ar-BBSp2nb?li=BBqiQ9P\"   aria-label=\"是藕斷絲連還是一刀兩斷？英國脫歐六種結局猜想-文章\">\n" +
"\n" +
"                    <h3>是藕斷絲連還是一刀兩斷？英國脫歐六種結局猜想</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"Bloomberg 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3lldo.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.finance|stripe|stripe.finance.topstories2|headlines\"  data-aop=\"top stories2\"  data-id=\"321\" data-m='{\"i\":321,\"p\":279,\"n\":\"stripe.finance.topstories2\",\"t\":\"headlines\",\"o\":7}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"322\" data-m='{\"i\":322,\"p\":321,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"323\" data-m='{\"i\":323,\"p\":322,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoOZS\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%8f%b0%e8%82%a1%e5%b0%81%e9%97%9c%e5%80%92%e6%95%b8-%e9%ab%98%e6%aa%94%e9%9c%87%e7%9b%aa%e6%94%bb%e4%b8%8a9800%e9%bb%9e/ar-BBSoOZS?li=BBqiQ9P\"  >\n" +
" <div>\n" +
"<h3   aria-label=\"台股封關倒數 高檔震盪攻上9800點-文章\">台股封關倒數 高檔震盪攻上9800點</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5I03M.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"324\" data-m='{\"i\":324,\"p\":322,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HW\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%8c%af%e6%90%8d%e9%87%8d%e5%82%b7%e4%bf%9d%e9%9a%aa%e6%a5%ad%e7%8d%b2%e5%88%a9-%e4%bf%a1%e8%a9%95%e9%80%99%e9%ba%bc%e7%9c%8b-%e8%bf%8e%e6%8c%91%e6%88%b0%e9%9d%a0%e9%80%993%e5%8a%a9%e5%8a%9b/ar-BBSp1HW?li=BBqiQ9P\"  >\n" +
"<img alt=\"coins-1726618_1280\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZnW.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"coins-1726618_1280 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"匯損重傷保險業獲利 信評這麼看 迎挑戰靠這3助力-文章\">匯損重傷保險業獲利 信評這麼看 迎挑戰靠這3助力</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"325\" data-m='{\"i\":325,\"p\":322,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp3i0\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e9%a2%a8%e9%9a%aa%e8%83%83%e7%b4%8d%e9%96%8b%ef%bc%81%e5%9e%83%e5%9c%be%e5%82%b5%e5%89%b52%e5%b9%b4%e6%9c%80%e5%a4%a7%e5%90%b8%e9%87%91%e9%a1%8d%e3%80%81%e6%96%b0%e8%88%88%e5%b8%82%e5%a0%b4%e9%8c%a2%e6%bd%ae%e6%97%ba/ar-BBSp3i0?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpdrq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 MoneyDJ 提供\" /> <div>\n" +
"<h3   aria-label=\"風險胃納開！垃圾債創2年最大吸金額、新興市場錢潮旺-文章\">風險胃納開！垃圾債創2年最大吸金額、新興市場錢潮旺</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ理財網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"326\" data-m='{\"i\":326,\"p\":321,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"327\" data-m='{\"i\":327,\"p\":326,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpgyS\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%b8%b3%e8%99%9f%e8%80%81%e6%98%af%e5%bf%98%e8%a8%98%ef%bc%9f%e5%af%86%e7%a2%bc%e4%b8%8d%e6%95%a2%e6%9b%b4%e6%96%b0%ef%bc%9f%e6%97%a5%e6%9c%ac%e6%95%b4%e7%90%86%e9%a1%a7%e5%95%8f%e7%9a%84%e3%80%8c%e5%b8%b3%e6%88%b6%e6%b8%85%e5%96%ae%e3%80%8d%e5%92%8c%e3%80%8c%e5%af%86%e7%a2%bc%e8%a6%8f%e5%89%87%e3%80%8d%ef%bc%8c%e5%a5%bd%e8%a8%98%e5%8f%88%e5%a5%bd%e7%94%a8/ar-BBSpgyS?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoOZV.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 Business Next Publishing Corp 提供\" /> <div>\n" +
"<h3   aria-label=\"帳號老是忘記？密碼不敢更新？日本整理顧問的「帳戶清單」和「密碼規則」，好記又好用-文章\">帳號老是忘記？密碼不敢更新？日本整理顧問的「帳戶清單」和「密碼規則」，好記又好用</h3>\n" +
"\n" +
"<img alt=\"經理人月刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>經理人月刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"328\" data-m='{\"i\":328,\"p\":326,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoX2B\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e6%9b%b4%e5%a4%a7%e7%9a%84%e9%81%95%e7%b4%84%e5%b7%a8%e6%b5%aa%e5%b0%87%e6%92%b2%e5%90%91%e6%b0%91%e4%bc%81%ef%bc%9f%e9%99%b8%e4%bb%8a%e5%b9%b4%e5%88%b0%e6%9c%9f%e5%85%ac%e5%8f%b8%e5%82%b5%e9%a3%86%e6%ad%b7%e5%8f%b2%e9%ab%98/ar-BBSoX2B?li=BBqiQ9P\"  >\n" +
"<img alt=\"FILE - In this Nov. 9, 2017, file photo, a member of the Chinese military marche...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjCwJ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=2421&amp;y=838&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"FILE - In this Nov. 9, 2017, file photo, a member of the Chinese military marche... - The Associated Press\" /> <div>\n" +
"<h3   aria-label=\"更大的違約巨浪將撲向民企？陸今年到期公司債飆歷史高-文章\">更大的違約巨浪將撲向民企？陸今年到期公司債飆歷史高</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ理財網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"329\" data-m='{\"i\":329,\"p\":326,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGPD\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%a1%8c%e5%8b%95%e9%9b%bb%e6%ba%90%e6%8e%b0%e4%ba%86-%e8%98%8b%e6%9e%9c%e9%96%8b%e8%b3%a3%e4%b8%89%e6%ac%be%e6%96%b0iphone-%e6%99%ba%e6%85%a7%e9%9b%bb%e6%b1%a0%e8%ad%b7%e6%ae%bc/ar-BBSoGPD?li=BBqiQ9P\"  >\n" +
"<img alt=\"行動電源掰了　蘋果開賣三款新iPhone智慧電池護殼\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoYgm.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"行動電源掰了 蘋果開賣三款新iPhone智慧電池護殼 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"行動電源掰了 蘋果開賣三款新iphone 智慧電池護殼-文章\">行動電源掰了 蘋果開賣三款新iPhone 智慧電池護殼</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"330\" data-m='{\"i\":330,\"p\":321,\"n\":\"secondary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"331\" data-m='{\"i\":331,\"p\":330,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1ag\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e9%8a%b7%e5%94%ae%e4%b8%8d%e6%8c%af%ef%bc%81%e6%97%a5%e7%94%a2%e7%be%8e%e5%9c%8b%e4%b8%80%e5%ba%a7%e7%b5%84%e8%a3%9d%e5%bb%a0%e6%9c%80%e9%ab%98%e8%a3%81%e5%93%a1700%e4%ba%ba/ar-BBSp1ag?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1ad.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 MoneyDJ 提供\" /> <div>\n" +
"<h3   aria-label=\"銷售不振！日產美國一座組裝廠最高裁員700人-文章\">銷售不振！日產美國一座組裝廠最高裁員700人</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ理財網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"332\" data-m='{\"i\":332,\"p\":321,\"n\":\"tertiary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"333\" data-m='{\"i\":333,\"p\":332,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjFAe\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e9%a2%a8%e9%9a%aa%e5%a4%a7%e5%b8%ab%e9%a6%ac%e5%85%8b%e6%96%af%e9%a2%a8%e6%9a%b4%e7%99%bc%e7%94%9f%ef%bc%8c%e9%80%99%e6%99%82%e8%b3%ba%e9%8c%a2%e6%9c%80%e5%ae%b9%e6%98%93/ar-BBSjFAe?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjymc.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=296&amp;y=177&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"風險大師馬克斯：風暴發生，這時賺錢最容易 - 由 Home Media Group LTD., Cite Branch 提供\" /> <div>\n" +
"<h3   aria-label=\"風險大師馬克斯：風暴發生，這時賺錢最容易-文章\">風險大師馬克斯：風暴發生，這時賺錢最容易</h3>\n" +
"\n" +
"<img alt=\"商業周刊  標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3igyX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>商業周刊 </span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"334\" data-m='{\"i\":334,\"p\":332,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTi0\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%8f%b0%e7%a9%8d%e9%9b%bb%e6%8b%8b%e9%87%8d%e6%96%b0%e8%ad%b0%e5%83%b9%e9%9c%87%e6%92%bc%e5%bd%88-%e7%9f%bd%e6%99%b6%e5%9c%93%e6%97%8f%e7%be%a4%e8%82%a1%e5%83%b9%e6%8c%ab/ar-BBSoTi0?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA8eqYY.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"台積電領漲 台股仍跌26.8點 - AP\" /> <div>\n" +
"<h3   aria-label=\"台積電拋重新議價震撼彈 矽晶圓族群股價挫-文章\">台積電拋重新議價震撼彈 矽晶圓族群股價挫</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5I03M.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"335\" data-m='{\"i\":335,\"p\":332,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSowCX\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%b2%bf%e6%98%93%e6%88%b0%e8%a1%9d%e6%93%8a%e3%80%81nidec%e7%a0%8d%e8%b2%a1%e6%b8%ac%ef%bc%9b%e6%9c%83%e9%95%b7%e4%b8%8b%e6%bb%91%e6%83%85%e6%b3%81%e5%89%8d%e6%89%80%e6%9c%aa%e8%a6%8b/ar-BBSowCX?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoSDg.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"貿易戰衝擊、Nidec砍財測；會長：下滑情況前所未見 - 由 SysJust Co. Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"貿易戰衝擊、nidec砍財測；會長：下滑情況前所未見-文章\">貿易戰衝擊、Nidec砍財測；會長：下滑情況前所未見</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ理財網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ理財網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"336\" data-m='{\"i\":336,\"p\":321,\"n\":\"tertiary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"337\" data-m='{\"i\":337,\"p\":336,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoO4Z\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%8f%b0%e7%a9%8d%e9%9b%bb%e9%81%ad5%e5%a4%96%e8%b3%87%e4%b8%8b%e4%bf%ae%e7%9b%ae%e6%a8%99%e5%83%b9-%e6%9c%80%e4%bd%8e210%e5%85%83/ar-BBSoO4Z?li=BBqiQ9P\"  >\n" +
"<img alt=\"FILE PHOTO: A logo of Taiwan Semiconductor Manufacturing Co (TSMC) is seen at it...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAwpcNz.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"FILE PHOTO: A logo of Taiwan Semiconductor Manufacturing Co (TSMC) is seen at it... - REUTERS/Eason Lam/File Photo\" /> <div>\n" +
"<h3   aria-label=\"台積電遭5外資下修目標價 最低210元-文章\">台積電遭5外資下修目標價 最低210元</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5I03M.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"338\" data-m='{\"i\":338,\"p\":336,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSozuh\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e9%a2%a8%e8%a9%95%e9%99%8d%e5%82%99%e8%bd%89%e5%ae%b9%e9%87%8f%e7%8e%87%e2%94%80%e8%94%a1%e6%94%bf%e5%ba%9c%e5%8f%88%e8%a6%81%e7%8e%a9%e6%95%b8%e5%ad%97%e9%81%8a%e6%88%b2%ef%bc%9f/ar-BBSozuh?li=BBqiQ9P\"  >\n" +
"<img alt=\"風評：降備轉容量率─蔡政府又要玩數字遊戲？\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSozud.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=307&amp;y=108&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"風評：降備轉容量率─蔡政府又要玩數字遊戲？ - 由 Storm Media Group 提供\" /> <div>\n" +
"<h3   aria-label=\"風評：降備轉容量率─蔡政府又要玩數字遊戲？-文章\">風評：降備轉容量率─蔡政府又要玩數字遊戲？</h3>\n" +
"\n" +
"<img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>風傳媒</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"339\" data-m='{\"i\":339,\"p\":336,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSow4p\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%8a%b1%e9%8c%a2%e4%b9%9f%e5%88%86%e7%97%9b%e6%88%96%e4%b8%8d%e7%97%9b%ef%bc%9f%e9%87%91%e9%8c%a2%e5%bf%83%e7%90%86%e5%ad%b8%e6%95%99%e4%bd%a0%e7%a0%b4%e8%a7%a3%e5%95%86%e4%ba%ba%e5%bf%85%e6%ae%ba%e6%8a%80/ar-BBSow4p?li=BBqiQ9P\"  >\n" +
"<img alt=\"花錢也有比較痛跟比較不痛的花法？商人掌控了金錢心理學，就能輕易讓你無痛撒鈔票。（東方IC）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoFFE.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"花錢也有比較痛跟比較不痛的花法？商人掌控了金錢心理學，就能輕易讓你無痛撒鈔票。（東方IC） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"花錢也分痛或不痛？金錢心理學教你破解商人必殺技-文章\">花錢也分痛或不痛？金錢心理學教你破解商人必殺技</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"340\" data-m='{\"i\":340,\"p\":321,\"n\":\"secondary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"341\" data-m='{\"i\":341,\"p\":340,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoce0\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%87%a8%e6%ab%8350%e8%90%ac%e5%85%a7%e5%ad%98%e5%8c%af%e6%ac%be-%e7%86%9f%e5%ae%a2%e5%85%8d%e6%9f%a5/ar-BBSoce0?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoo9K.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=465&amp;y=83&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"臨櫃50萬內存匯款 熟客免查 - Copyright? 中時電子報\" /> <div>\n" +
"<h3   aria-label=\"臨櫃50萬內存匯款 熟客免查-文章\">臨櫃50萬內存匯款 熟客免查</h3>\n" +
"\n" +
"<img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中時電子報</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"342\" data-m='{\"i\":342,\"p\":321,\"n\":\"secondary\",\"y\":8,\"o\":7}'>\n" +
" <li  data-id=\"343\" data-m='{\"i\":343,\"p\":342,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmMJW\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e4%ba%ba%e5%b7%a5%e6%99%ba%e6%85%a7%e9%87%80%e5%8d%8a%e5%b0%8e%e9%ab%94%e5%ae%8c%e7%be%8e%e9%a2%a8%e6%9a%b4%ef%bc%9f%e7%be%8e%e5%95%86%e6%87%89%e6%9d%90%e9%bb%9e%e5%87%ba5%e5%a4%a7%e9%97%9c%e9%8d%b5%e9%9d%9e%e6%94%b9%e4%b8%8d%e5%8f%af/ar-BBSmMJW?li=BBqiQ9P\"  >\n" +
"<img alt=\"余定陸點出半導體業非得提升的5大關鍵要素，才能避免AI成為完美風暴。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmBud.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=283&amp;y=166&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"余定陸點出半導體業非得提升的5大關鍵要素，才能避免AI成為完美風暴。 - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"人工智慧釀半導體完美風暴？美商應材點出5大關鍵非改不可-文章\">人工智慧釀半導體完美風暴？美商應材點出5大關鍵非改不可</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"344\" data-m='{\"i\":344,\"p\":279,\"n\":\"rightarrow\",\"y\":12,\"o\":8}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"新聞\"\n" +
"          data-positions=\".news .stripecontent:nth-of-type(1) .tertiary li:nth-child(3)\" data-section-id=\"stripe.news\"\n" +
"          data-section-id=\"stripe.news\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.news_stripe\"  data-id=\"345\" data-m='{\"i\":345,\"p\":19,\"n\":\"stripe.news\",\"t\":\"stripe\",\"o\":10}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"346\" data-m='{\"i\":346,\"p\":345,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.news.navigation_stripenavigation\"  data-id=\"347\" data-m='{\"i\":347,\"p\":345,\"n\":\"stripe.news.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"348\" data-m='{\"i\":348,\"p\":347,\"n\":\"news\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/news\"  data-id=\"349\" data-m='{\"i\":349,\"p\":347,\"n\":\"news\",\"y\":4,\"o\":2}'>新聞</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"350\" data-m='{\"i\":350,\"p\":347,\"n\":\"other\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/news/other\">即時新聞總覽</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"351\" data-m='{\"i\":351,\"p\":347,\"n\":\"?掰掰2018?\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/news/yearinreview2018\">?掰掰2018?</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"352\" data-m='{\"i\":352,\"p\":347,\"n\":\"newsphotos\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/news/photos\">精彩圖輯</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"353\" data-m='{\"i\":353,\"p\":347,\"n\":\"newsnational\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/news/national\">國內</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"354\" data-m='{\"i\":354,\"p\":347,\"n\":\"newsbusiness\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/news/money\">財經</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"355\" data-m='{\"i\":355,\"p\":347,\"n\":\"newsmilitary\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/news/military\">軍事</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"356\" data-m='{\"i\":356,\"p\":347,\"n\":\"newsworld\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/news/world\">兩岸國際</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"357\" data-m='{\"i\":357,\"p\":347,\"n\":\"living\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/news/living\">生活文教</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"358\" data-m='{\"i\":358,\"p\":347,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"359\" data-m='{\"i\":359,\"p\":347,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"360\" data-m='{\"i\":360,\"p\":347,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"361\" data-m='{\"i\":361,\"p\":347,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"362\" data-m='{\"i\":362,\"p\":347,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|stripe.news|stripe|stripe.news.hero|headlines\"  data-aop=\"1_topstories\"  data-id=\"363\" data-m='{\"i\":363,\"p\":345,\"n\":\"stripe.news.hero\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"364\" data-m='{\"i\":364,\"p\":363,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"365\" data-m='{\"i\":365,\"p\":364,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrlr7\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/world/%e7%8d%a8%e8%a3%81%e8%80%85%e9%96%93%e7%9a%84%e3%80%8c%e6%83%ba%e6%83%ba%e7%9b%b8%e6%83%9c%e3%80%8d%ef%bc%9f%e8%ae%9a%e5%98%86%e6%9d%9c%e7%89%b9%e8%92%82%e9%90%b5%e8%a1%80%e6%8e%83%e6%af%92%e6%98%af%e3%80%8c%e8%88%89%e4%b8%96%e5%85%b8%e7%af%84%e3%80%8d%ef%bc%8c%e6%96%af%e9%87%8c%e8%98%ad%e5%8d%a1%e7%b8%bd%e7%b5%b1%e6%88%91%e8%a6%81%e4%bb%bf%e6%95%88%e8%8f%b2%e5%be%8b%e8%b3%93%ef%bc%81/ar-BBSrlr7?li=BBqj0iS\"  >\n" +
"<img alt=\"獨裁者間的「惺惺相惜」？讚嘆杜特蒂鐵血掃毒是「舉世典範」，斯里蘭卡總統：我要仿效菲律賓！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrrw1.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=296&amp;y=109&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"獨裁者間的「惺惺相惜」？讚嘆杜特蒂鐵血掃毒是「舉世典範」，斯里蘭卡總統：我要仿效菲律賓！ - 由 Storm Media Group 提供\" /> <div>\n" +
"<h3   aria-label=\"獨裁者間的「惺惺相惜」？讚嘆杜特蒂鐵血掃毒是「舉世典範」，斯里蘭卡總統：我要仿效菲律賓！-文章\">獨裁者間的「惺惺相惜」？讚嘆杜特蒂鐵血掃毒是「舉世典範」，斯里蘭卡總統：我要仿效菲律賓！</h3>\n" +
"\n" +
"<img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>風傳媒</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.news|stripe|stripe.news.HD1|headlineLinkList\"   data-id=\"366\" data-m='{\"i\":366,\"p\":345,\"n\":\"stripe.news.HD1\",\"t\":\"headlineLinkList\",\"o\":4}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"367\" data-m='{\"i\":367,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmTgd\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e9%a6%96%e5%ba%a6%e8%a1%a8%e6%85%8b%e5%8f%83%e9%81%b82020%e7%b8%bd%e7%b5%b1-%e7%8e%8b%e9%87%91%e5%b9%b3%e5%8f%aa%e5%b7%ae%e6%b2%92%e8%aa%aa%e5%87%ba%e5%8f%a3%e8%80%8c%e5%b7%b2/ar-BBSmTgd?li=BBqj0iS\"   aria-label=\"首度表態參選2020總統 王金平：只差沒說出口而已-文章\">\n" +
"\n" +
"                    <h3>首度表態參選2020總統 王金平：只差沒說出口而已</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"368\" data-m='{\"i\":368,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSplTl\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%b0%8d%e6%8a%97%e5%81%87%e6%b6%88%e6%81%af-%e8%94%a1%e7%b8%bd%e7%b5%b1%e8%ab%8b%e5%8a%a0%e6%88%91%e8%87%89%e6%9b%b8line%e7%be%a4%e7%b5%84/ar-BBSplTl?li=BBqj0iS\"   aria-label=\"對抗假消息 蔡總統:請加我臉書line群組-文章\">\n" +
"\n" +
"                    <h3>對抗假消息 蔡總統:請加我臉書LINE群組</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"369\" data-m='{\"i\":369,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnhFh\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/2019%e4%b8%96%e7%95%8c%e4%ba%ba%e6%ac%8a%e5%a0%b1%e5%91%8a%e3%80%8b%e4%b8%ad%e5%9c%8b%e7%af%87%e7%bf%92%e8%bf%91%e5%b9%b3%e9%8e%ae%e5%a3%93%e8%ae%8a%e6%9c%ac%e5%8a%a0%e5%8e%b2%e3%80%81%e6%8b%98%e7%95%99%e5%a4%a7%e9%87%8f%e6%96%b0%e7%96%86%e5%b1%85%e6%b0%91%e3%80%81%e8%b5%b7%e8%a8%b4%e5%92%8c%e5%b9%b3%e8%a8%80%e8%ab%96/ar-BBSnhFh?li=BBqj0iS\"   aria-label=\"2019世界人權報告》中國篇：習近平鎮壓變本加厲、拘留大量新疆居民、起訴和平言論-文章\">\n" +
"\n" +
"                    <h3>2019世界人權報告》中國篇：習近平鎮壓變本加厲、拘留大量新疆居民、起訴和平言論</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"370\" data-m='{\"i\":370,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpvlw\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e6%98%a5%e7%af%80%e9%80%a3%e5%81%87%e5%87%ba%e5%8b%a4-%e5%8a%a0%e7%8f%ad%e8%b2%bb%e9%80%99%e9%ba%bc%e7%ae%97/ar-BBSpvlw?li=BBqj0iS\"   aria-label=\"春節連假出勤 加班費這麼算-文章\">\n" +
"\n" +
"                    <h3>春節連假出勤 加班費這麼算</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"371\" data-m='{\"i\":371,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp3s8\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e8%94%a1%e7%b8%bd%e7%b5%b1%e7%aa%81%e8%a5%b2%e8%a5%bf%e9%96%80%e7%94%ba%ef%bc%8c%e7%a9%b6%e7%ab%9f%e5%90%83%e4%ba%86%e5%93%aa%e4%ba%9b%e5%90%8d%e5%ba%97%ef%bc%9f%e8%80%81%e5%a4%a9%e7%a5%bf%e3%80%81%e5%a4%a9%e5%a4%a9%e5%88%a9%e2%80%a6%e9%80%99%e4%ba%9b%e9%83%bd%e6%98%af%e5%95%86%e5%9c%88%e6%9c%80%e5%a4%af%e7%be%8e%e9%a3%9f%ef%bc%81/ar-BBSp3s8?li=BBqj0iS\"   aria-label=\"蔡總統突襲西門町，究竟吃了哪些名店？老天祿、天天利…這些都是商圈最夯美食！-文章\">\n" +
"\n" +
"                    <h3>蔡總統突襲西門町，究竟吃了哪些名店？老天祿、天天利…這些都是商圈最夯美食！</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"風傳媒 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"372\" data-m='{\"i\":372,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSplPE\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e8%99%90%e7%ab%a5%e6%9a%b4%e5%8a%9b%e9%a0%bb%e5%82%b3-%e7%9b%a3%e5%af%9f%e9%99%a2%e5%b0%87%e8%a8%ad%e5%85%92%e7%ab%a5%e6%ac%8a%e5%88%a9%e4%bf%9d%e9%9a%9c%e5%b0%88%e6%a1%88%e5%b0%8f%e7%b5%84/ar-BBSplPE?li=BBqj0iS\"   aria-label=\"虐童暴力頻傳 監察院：將設兒童權利保障專案小組-文章\">\n" +
"\n" +
"                    <h3>虐童暴力頻傳 監察院：將設兒童權利保障專案小組</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"民報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA8I0td.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"373\" data-m='{\"i\":373,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSppZU\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e7%be%8e%e5%a5%b3%e6%88%bf%e4%bb%b2%e3%80%8c%e6%9b%be%e7%b6%93%e8%b3%a3%e6%88%bf%e8%b3%a3%e5%88%b0%e5%93%ad%e3%80%8d-%e8%8b%a6%e7%9b%a1%e7%94%98%e4%be%86%e5%b9%b4%e6%88%90%e4%ba%a442%e4%bb%b6/ar-BBSppZU?li=BBqj0iS\"   aria-label=\"業務奇才！美女房仲：曾賣房賣到哭-文章\">\n" +
"\n" +
"                    <h3>業務奇才！美女房仲：曾賣房賣到哭</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"374\" data-m='{\"i\":374,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphzL\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e9%a1%8f%e5%af%ac%e6%81%92%e6%94%af%e6%8c%81%e8%99%90%e7%ab%a5%e8%80%85%e5%88%a4%e6%ad%bb-%e7%b6%b2%e5%8f%8b%e6%ad%aa%e6%a8%93%e5%81%9a%e6%88%90%e6%b6%88%e6%b3%a2%e5%a1%8a/ar-BBSphzL?li=BBqj0iS\"   aria-label=\"顏寬恒支持虐童者判死 網友歪樓：做成消波塊-文章\">\n" +
"\n" +
"                    <h3>顏寬恒支持虐童者判死 網友歪樓：做成消波塊</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.news|stripe|stripe.news.HD2|headlineLinkList\"   data-id=\"375\" data-m='{\"i\":375,\"p\":345,\"n\":\"stripe.news.HD2\",\"t\":\"headlineLinkList\",\"o\":5}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"376\" data-m='{\"i\":376,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpeT0\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%8f%88%e8%a6%8b%e8%99%90%e7%ab%a5%ef%bc%81%e6%9c%89%e4%bf%9d%e8%ad%b7%e4%bb%a4%e4%b9%9f%e4%b8%8d%e6%80%95-%e6%83%a1%e7%88%b6%e6%af%86%e6%89%93%e5%ad%90%e5%a5%b3%e9%81%8d%e9%ab%94%e9%b1%97%e5%82%b7/ar-BBSpeT0?li=BBqj0iS\"   aria-label=\"又見虐童！有保護令也不怕 惡父毆打子女遍體鱗傷-文章\">\n" +
"\n" +
"                    <h3>又見虐童！有保護令也不怕 惡父毆打子女遍體鱗傷</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"377\" data-m='{\"i\":377,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpcLH\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%b9%ab%e9%ab%98%e8%aa%bf%ef%bc%81%e5%a4%96%e5%aa%92%e6%8f%ad%e4%b8%ad%e5%85%b1%e6%bb%b2%e9%80%8f%e5%8f%b0%e7%81%a3%e6%9c%89%e9%80%99%e5%b9%be%e6%8b%9b/ar-BBSpcLH?li=BBqj0iS\"   aria-label=\"幫高調！外媒揭中共滲透台灣有這幾招-文章\">\n" +
"\n" +
"                    <h3>幫高調！外媒揭中共滲透台灣有這幾招</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"378\" data-m='{\"i\":378,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp8Xt\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e6%8f%ad%e5%af%86%ef%bc%8f%e8%ad%a6%e7%95%8c%e3%80%8c%e5%a4%a7%e4%bb%81%e5%93%a5%e3%80%8d%e7%82%ba%e4%bd%95%e5%8f%97%e5%9f%ba%e5%b1%a4%e6%84%9b%e6%88%b4/ar-BBSp8Xt?li=BBqj0iS\"   aria-label=\"揭密／警界「大仁哥」為何受基層愛戴-文章\">\n" +
"\n" +
"                    <h3>揭密／警界「大仁哥」為何受基層愛戴</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"379\" data-m='{\"i\":379,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpdq5\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e6%8f%ad%e8%91%9b%e4%be%86%e5%84%80%e5%8a%9b%e6%8c%ba%e5%8f%a3%e8%ad%af%e5%93%a5%e5%b9%95%e5%be%8c%e8%91%89%e6%85%b6%e5%85%83%e6%8f%90%e3%80%8c3%e9%bb%9e%e3%80%8d%e6%8b%bf%e4%ba%ba%e5%98%b4%e8%bb%9f/ar-BBSpdq5?li=BBqj0iS\"   aria-label=\"揭葛來儀力挺口譯哥幕後...葉慶元提「3點」：拿人嘴軟-文章\">\n" +
"\n" +
"                    <h3>揭葛來儀力挺口譯哥幕後...葉慶元提「3點」：拿人嘴軟</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"380\" data-m='{\"i\":380,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoWWc\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e4%b8%ad%e5%9c%8b%e9%a0%bb%e5%97%86%e6%ad%a6%e7%b5%b1-%e7%be%8e%e5%9c%8b%e9%98%b2%e9%83%a8%e6%8c%ba%e5%8f%b0%e7%81%a3%e8%aa%aa%e8%a9%b1%e4%ba%86/ar-BBSoWWc?li=BBqj0iS\"   aria-label=\"中國頻嗆武統 美國防部挺台灣說話了-文章\">\n" +
"\n" +
"                    <h3>中國頻嗆武統 美國防部挺台灣說話了</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"381\" data-m='{\"i\":381,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpc31\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e6%b5%b7%e9%82%8a%e6%92%bf%e9%80%8f%e6%98%8e%e8%bb%9f%e6%a3%92%ef%bc%81%e5%a5%b9%e7%8d%b2%e7%9c%9f%e7%9b%b8%e9%a9%9a%e5%91%86%e6%98%af%e5%8d%b5/ar-BBSpc31?li=BBqj0iS\"   aria-label=\"海邊撿透明軟棒！她獲真相驚呆：是卵-文章\">\n" +
"\n" +
"                    <h3>海邊撿透明軟棒！她獲真相驚呆：是卵</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"382\" data-m='{\"i\":382,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoUmK\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/world/%e7%8f%ad%e5%85%8b%e8%a5%bf%e7%9c%9f%e8%b7%a1%e3%80%8c%e6%92%90%e5%82%98%e8%80%81%e9%bc%a0%e3%80%8d-%e6%97%a5%e6%9c%ac%e7%8f%be%e8%b9%a4/ar-BBSoUmK?li=BBqj0iS\"   aria-label=\"班克西真跡「撐傘老鼠」 日本現蹤-文章\">\n" +
"\n" +
"                    <h3>班克西真跡「撐傘老鼠」 日本現蹤</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"383\" data-m='{\"i\":383,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpf8s\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%85%a9%e5%b2%b8%e7%b7%8a%e5%bc%b5%e5%8a%a0%e5%8a%87-cnn%e5%8f%b0%e7%81%a3%e8%bb%8d%e6%bc%94%e5%b0%8d%e6%8a%97%e4%be%b5%e7%95%a5%e5%a8%81%e8%84%85/ar-BBSpf8s?li=BBqj0iS\"   aria-label=\"兩岸緊張加劇 cnn：台灣軍演對抗侵略威脅-文章\">\n" +
"\n" +
"                    <h3>兩岸緊張加劇 CNN：台灣軍演對抗侵略威脅</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|stripe.news|stripe|stripe.news.topStories1|headlines\"  data-aop=\"5_backfill\"  data-id=\"384\" data-m='{\"i\":384,\"p\":345,\"n\":\"stripe.news.topStories1\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"385\" data-m='{\"i\":385,\"p\":384,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"386\" data-m='{\"i\":386,\"p\":385,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpaTF\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e5%ad%b8%e8%80%85%e7%94%a8%e6%b0%91%e8%aa%bf%e5%88%86%e6%9e%90%e9%9f%93%e7%b2%89%e7%89%b9%e6%80%a7-%e7%b6%b2%e9%a9%9a%e5%a5%b3%e6%80%a7%e6%94%af%e6%8c%81%e8%80%85%e6%af%94%e9%99%b3%e5%85%b6%e9%82%81%e9%82%84%e5%a4%9a/ar-BBSpaTF?li=BBqj0iS\"  >\n" +
"<img alt=\"國民黨高雄市長候選人韓國瑜造勢晚會。（資料照／韓國瑜臉書）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQ0Qwq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"國民黨高雄市長候選人韓國瑜造勢晚會。（資料照／韓國瑜臉書） - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"學者用民調分析韓粉特性 網驚：女性支持者比陳其邁還多-文章\">學者用民調分析韓粉特性 網驚：女性支持者比陳其邁還多</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"387\" data-m='{\"i\":387,\"p\":385,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp9wG\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/%e3%80%8c%e8%9b%8b%e3%80%8d%e6%b4%97%e7%a4%be%e7%be%a4%e7%b6%b2%e7%ab%99-instagram%e7%b6%b2%e7%b4%85%e8%9b%8b%e5%be%80twitter%e6%8c%91%e6%88%b0/ar-BBSp9wG?li=BBqj0iS\"  >\n" +
"<img alt=\"網紅蛋轉戰 Twitter。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp9wC.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"網紅蛋轉戰 Twitter。 - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"「蛋」洗社群網站 instagram網紅蛋往twitter挑戰-文章\">「蛋」洗社群網站 Instagram網紅蛋往Twitter挑戰</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"388\" data-m='{\"i\":388,\"p\":385,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpeTz\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/national/%e8%be%a6%e8%99%90%e7%ab%a5%e6%a1%88-%e5%8d%97%e8%ad%a6%e5%b1%80%e9%95%b7%e8%87%89%e6%9b%b8po%e5%87%ba%e4%b8%8d%e6%8d%a8%e8%88%87%e6%86%a4%e6%80%92/ar-BBSpeTz?li=BBqj0iS\"  >\n" +
"<img alt=\"辦虐童案 南警局長臉書PO出不捨與憤怒\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp9A7.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"辦虐童案 南警局長臉書PO出不捨與憤怒 - 中央社\" /> <div>\n" +
"<h3   aria-label=\"辦虐童案 南警局長臉書po出不捨與憤怒-文章\">辦虐童案 南警局長臉書PO出不捨與憤怒</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"389\" data-m='{\"i\":389,\"p\":384,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"390\" data-m='{\"i\":390,\"p\":389,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpkQ5\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e5%8f%b2%e4%b8%8a%e6%9c%80%e5%b7%a8%ef%bc%816%e5%85%ac%e5%b0%ba%e5%a4%a7%e7%99%bd%e9%af%8a%e7%8f%be%e8%ba%ab%e5%a4%8f%e5%a8%81%e5%a4%b7/ar-BBSpkQ5?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp9Hm.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"史上最巨！6公尺大白鯊現身夏威夷 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"史上最巨！6公尺大白鯊現身夏威夷-文章\">史上最巨！6公尺大白鯊現身夏威夷</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"391\" data-m='{\"i\":391,\"p\":389,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoRl5\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/%e3%80%90%e8%b1%aa%e5%ae%85%e6%8e%89%e6%bc%86%e3%80%91%e5%85%ac%e8%a8%ad%e7%bc%ba%e5%a4%b1%e9%81%94800%e9%a0%85-%e6%b6%88%e8%b2%bb%e8%80%85%e6%8e%a7%e5%bb%ba%e5%95%86%e4%b8%8d%e7%b5%a6%e9%a9%97%e5%b1%8b/ar-BBSoRl5?li=BBqj0iS\"  >\n" +
"<img alt=\"消費者控訴的豪宅緊鄰凹仔底森林公園、捷運站，具備地段優勢。（讀者提供）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoRl3.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"消費者控訴的豪宅緊鄰凹仔底森林公園、捷運站，具備地段優勢。（讀者提供） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"公設缺失達800項 消費者控建商不給驗屋-文章\">公設缺失達800項 消費者控建商不給驗屋</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"392\" data-m='{\"i\":392,\"p\":389,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZvR\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/national/%e8%94%a1%e8%8b%b1%e6%96%87%e8%b7%9f%e9%a2%a8%e8%87%89%e6%9b%b8%e6%8c%91%e6%88%b0-%e5%8e%9f%e4%be%8610%e5%b9%b4%e5%89%8d%e5%b0%b1%e6%98%af%e3%80%8c%e8%be%a3%e5%8f%b0%e6%b4%be%e3%80%8d/ar-BBSoZvR?li=BBqj0iS\"  >\n" +
"<img alt=\"總統蔡英文在臉書跟風參加10年大挑戰。（翻攝自蔡英文粉絲專頁）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoWXS.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=421&amp;y=206&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"總統蔡英文在臉書跟風參加10年大挑戰。（翻攝自蔡英文粉絲專頁） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"蔡英文跟風臉書挑戰 原來10年前就是「辣台派」-文章\">蔡英文跟風臉書挑戰 原來10年前就是「辣台派」</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"393\" data-m='{\"i\":393,\"p\":384,\"n\":\"secondary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"394\" data-m='{\"i\":394,\"p\":393,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoRga\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e6%9a%96%e5%bf%83%e8%8c%b6%e8%91%89%e8%9b%8b3%e5%8c%97%e5%ae%9c%e8%8d%92%e9%87%8e%e6%8a%93%e4%ba%a4%e6%9b%bf-%e6%98%af%e5%a5%b9%e7%9a%84%e7%ab%a5%e5%b9%b4%e6%97%a5%e5%b8%b8%e3%80%90%e5%a3%b9%e9%bb%9e%e5%b0%b1%e5%a0%b1%e3%80%91/ar-BBSoRga?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1xp.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=105&amp;y=229&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"〈暖心茶葉蛋3〉北宜荒野抓交替 是她的童年日常【壹點就報】 - 由 Next Media Publishing Limited 提供\" /> <div>\n" +
"<h3   aria-label=\"北宜荒野抓交替 是她的童年日常-文章\">北宜荒野抓交替 是她的童年日常</h3>\n" +
"\n" +
"<img alt=\"壹週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>壹週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"395\" data-m='{\"i\":395,\"p\":384,\"n\":\"tertiary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"396\" data-m='{\"i\":396,\"p\":395,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoOmB\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e3%80%90%e8%b1%aa%e5%ae%85%e6%8e%89%e6%bc%86%e3%80%91%e5%bb%ba%e5%95%86%e7%a8%b1%e5%83%85%e9%a1%98%e8%b3%a050%e8%90%ac%e5%85%83-%e5%a5%b9%e4%b8%8d%e6%9c%8d%e9%81%ad%e5%af%847%e5%b0%81%e5%ad%98%e8%ad%89%e4%bf%a1%e5%87%bd/ar-BBSoOmB?li=BBqj0iS\"  >\n" +
"<img alt=\"葉女指出，建商逕行配給的2個車位（左方）有設計瑕疵。（讀者提供）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoTRD.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"葉女表示，因為建案的諸多問題導致她出現睡眠障礙，進而確診憂鬱症。（讀者提供） - 由 Mirror Media Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"建商稱僅願賠50萬元 她不服遭寄7封存證信函-文章\">建商稱僅願賠50萬元 她不服遭寄7封存證信函</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"397\" data-m='{\"i\":397,\"p\":395,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoRZ7\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/%e8%b6%85%e9%9d%92%e6%98%a5%e5%91%8a%e7%99%bd%e6%b3%95%e9%96%83%e7%9e%8e%e7%b6%b2%e5%8f%8b-%e3%80%8c%e4%b8%80%e5%bc%b5%e5%95%8f%e5%8d%b7%e3%80%8d%e5%91%8a%e7%99%bd%e6%88%90%e5%8a%9f%e7%9c%9f%e7%9a%84%e8%b6%85%e6%9c%83/ar-BBSoRZ7?li=BBqj0iS\"  >\n" +
"<img alt=\"Nw1GwrL\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp8ST.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Nw1GwrL - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"超青春告白法閃瞎網友 「一張問卷」告白成功真的超會-文章\">超青春告白法閃瞎網友 「一張問卷」告白成功真的超會</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"398\" data-m='{\"i\":398,\"p\":395,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpb1w\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/national/%e7%ac%91%e7%bf%bb%ef%bc%81-%e4%b8%80%e5%bc%b5%e5%9c%96%e7%a5%9e%e8%a7%a3%e9%a6%ac%e8%8b%b1%e4%b9%9d%e8%94%a1%e8%8b%b1%e6%96%87%e5%b7%ae%e5%88%a5/ar-BBSpb1w?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpfR4.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=267&amp;y=529&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"笑翻！ 一張圖神解馬英九蔡英文差別 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"笑翻！ 一張圖神解馬英九蔡英文差別-文章\">笑翻！ 一張圖神解馬英九蔡英文差別</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"399\" data-m='{\"i\":399,\"p\":384,\"n\":\"tertiary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"400\" data-m='{\"i\":400,\"p\":399,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HU\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e5%90%83%e5%88%b0%e3%80%8c%e6%aa%b3%e6%a6%94%e7%8e%8b%e3%80%8d%e6%96%83%e5%91%bd%ef%bc%9f%e7%a1%ac%e6%9c%97%e4%b8%83%e6%97%ac%e7%bf%81%e7%97%9b%e8%8b%a6%e5%80%92%e5%9c%b0-%e9%80%81%e9%86%ab%e5%be%8c%e4%b8%8d%e6%b2%bb/ar-BBSp1HU?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1HS.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"吃到「檳榔王」斃命？硬朗七旬翁痛苦倒地 送醫後不治 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"吃到「檳榔王」斃命？七旬翁送醫後不治-文章\">吃到「檳榔王」斃命？七旬翁送醫後不治</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"401\" data-m='{\"i\":401,\"p\":399,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTRu\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/97%e6%ad%b2%e8%8f%b2%e5%88%a9%e6%99%ae%e8%a6%aa%e7%8e%8b%e8%87%aa%e9%a7%95%e7%ab%9f%e7%bf%bb%e8%bb%8a-%e9%a9%9a%e9%9a%aa%e6%af%ab%e9%ab%ae%e7%84%a1%e5%82%b7/ar-BBSoTRu?li=BBqj0iS\"  >\n" +
"<img alt=\"97歲的菲利普親王自駕時遇到車禍，所幸毫髮無傷。（東方IC）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoRkZ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=435&amp;y=160&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"97歲的菲利普親王自駕時遇到車禍，所幸毫髮無傷。（東方IC） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"97歲菲利普親王自駕竟翻車 驚險毫髮無傷-文章\">97歲菲利普親王自駕竟翻車 驚險毫髮無傷</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"402\" data-m='{\"i\":402,\"p\":399,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2B2\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/living/%e7%83%98%e8%a1%a3%e6%a9%9f%e8%a6%8b%e3%80%8c%e5%8d%83%e5%b1%a4%e8%a1%a3%e5%b1%91%e3%80%8d-%e7%b6%b2%e6%9b%9d%e9%a9%9a%e4%ba%ba%e4%ba%8b%e5%af%a6/ar-BBSp2B2?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoX9a.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"烘衣機見「千層衣屑」 網曝驚人事實 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"烘衣機見「千層衣屑」 網曝驚人事實-文章\">烘衣機見「千層衣屑」 網曝驚人事實</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"403\" data-m='{\"i\":403,\"p\":384,\"n\":\"secondary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"404\" data-m='{\"i\":404,\"p\":403,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoOmL\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e6%94%bf%e6%b2%bb%e4%ba%ba%e7%89%a910%e5%b9%b4%e5%a4%a7%e6%8c%91%e6%88%b0-%e5%8f%aa%e6%9c%89%e9%82%b1%e6%af%85%e9%a9%9a%e4%ba%ba%e3%80%8c%e9%80%86%e7%94%9f%e9%95%b7%e3%80%8d/ar-BBSoOmL?li=BBqj0iS\"  >\n" +
"<img alt=\"老天鵝娛樂小編貼心提醒網友，兩張前後照片「沒有放反」。（翻攝自老天鵝娛樂粉絲專頁）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoOmG.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=429&amp;y=228&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"老天鵝娛樂小編貼心提醒網友，兩張前後照片「沒有放反」。（翻攝自老天鵝娛樂粉絲專頁） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"政治人物10年大挑戰 只有邱毅驚人「逆生長」-文章\">政治人物10年大挑戰 只有邱毅驚人「逆生長」</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"405\" data-m='{\"i\":405,\"p\":384,\"n\":\"secondary\",\"y\":8,\"o\":7}'>\n" +
" <li  data-id=\"406\" data-m='{\"i\":406,\"p\":405,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTYU\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/national/%e9%99%b3%e5%85%b6%e9%82%8110%e5%b9%b4%e6%8c%91%e6%88%b0%e8%87%aa%e5%98%b2%e8%ba%ab%e6%9d%90%e8%b5%b0%e9%90%98-%e6%9e%97%e4%bd%b3%e9%be%8d%e8%a2%ab%e5%b0%8f%e7%b7%a8%e3%80%8c%e4%bd%b3%e9%be%8dcam%e3%80%8d%e6%83%a1%e6%95%b4/ar-BBSoTYU?li=BBqj0iS\"  >\n" +
"<img alt=\"行政院副院長陳其邁和交通部長林佳龍也參加「十年挑戰」，網友表示越來越年輕。（翻攝林佳龍、陳其邁IG）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZIx.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=414&amp;y=167&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"行政院副院長陳其邁和交通部長林佳龍也參加「十年挑戰」，網友表示越來越年輕。（翻攝林佳龍、陳其邁IG） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"陳其邁10年挑戰自嘲身材走鐘 林佳龍被小編「佳龍cam」惡整-文章\">陳其邁10年挑戰自嘲身材走鐘 林佳龍被小編「佳龍cam」惡整</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div class=\"pollmodule notspartanpoll\"  data-module-id=\"startpage|stripe.news|stripe|pollModule|pollModule\"  data-id=\"407\" data-m='{\"i\":407,\"p\":345,\"n\":\"pollModule\",\"t\":\"pollModule\",\"o\":7}'>\n" +
" \n" +
" <div class=\"poll first\"\n" +
" data-pollresultsuptodate=\"True\">\n" +
"<form tabindex=\"0\"  aria-label=\"投票\"\n" +
">\n" +
"  <header>\n" +
" <h3>投票</h3>\n" +
" </header>\n" +
"\n" +
"<div class=\"questions\" data-action=\"https://ratingsedge.rnr.microsoft.com/v1.0/ratingsedge/polls/vote/aaa07ys-tw2018electioncampaign01-zhtw-amp/\" id=\"poll-aaa07ys-tw2018electioncampaign01-zhtw-amp\">\n" +
"<h4 id=\"pollquestion-aaa07ys-tw2018electioncampaign01-zhtw-amp\">與新北市脫勾，台北市此次不放颱風假，你認為是否會影響柯文哲的年底選情？</h4>\n" +
" <ul role=\"radiogroup\" aria-labelledby=\"pollquestion-aaa07ys-tw2018electioncampaign01-zhtw-amp\">\n" +
"\n" +
" <li role=\"radio\" aria-checked=\"false\" aria-setsize=\"3\" aria-posinset=\"1\" aria-labelledby=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0-label\">\n" +
"<input type=\"radio\" value=\"0\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0\" name=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"408\" data-m='{\"i\":408,\"p\":407,\"n\":\"poll_answer\",\"y\":10,\"o\":1}' />\n" +
"<label for=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0\" class=\"answer\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0-label\"><span class=\"radio-icon\"><span></span></span>不會</label>\n" +
"</li>\n" +
" <li role=\"radio\" aria-checked=\"false\" aria-setsize=\"3\" aria-posinset=\"2\" aria-labelledby=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1-label\">\n" +
"<input type=\"radio\" value=\"1\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1\" name=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"409\" data-m='{\"i\":409,\"p\":407,\"n\":\"poll_answer\",\"y\":10,\"o\":2}' />\n" +
"<label for=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1\" class=\"answer\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1-label\"><span class=\"radio-icon\"><span></span></span>會</label>\n" +
"</li>\n" +
" <li role=\"radio\" aria-checked=\"false\" aria-setsize=\"3\" aria-posinset=\"3\" aria-labelledby=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2-label\">\n" +
"<input type=\"radio\" value=\"2\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2\" name=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"410\" data-m='{\"i\":410,\"p\":407,\"n\":\"poll_answer\",\"y\":10,\"o\":3}' />\n" +
"<label for=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2\" class=\"answer\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2-label\"><span class=\"radio-icon\"><span></span></span>沒意見</label>\n" +
"</li>\n" +
" </ul>\n" +
"<div class=\"ctr\"><button disabled=\"disabled\" name=\"vote\" id=\"poll-button-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"411\" data-m='{\"i\":411,\"p\":407,\"n\":\"poll_submit\",\"y\":11,\"o\":4}'>投票</button></div>\n" +
"                    </div>\n" +
"                </form>\n" +
"                <div class=\"results\">\n" +
"  <header>\n" +
" <h3>投票結果</h3>\n" +
" </header>\n" +
"\n" +
"<h4>與新北市脫勾，台北市此次不放颱風假，你認為是否會影響柯文哲的年底選情？</h4>\n" +
" <ul>\n" +
" <li >\n" +
"<div class=\"resultsdivpadding\">\n" +
"<div class=\"value\">50%</div>\n" +
"<div class=\"answer\">不會<div class=\"bar\"><div class=\"meter\" role=\"progressbar\" aria-valuenow=\"50\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:50%;\"></div></div>\n" +
"                                </div>\n" +
"                           </div>\n" +
"                        </li>\n" +
" <li >\n" +
"<div class=\"resultsdivpadding\">\n" +
"<div class=\"value\">50%</div>\n" +
"<div class=\"answer\">會<div class=\"bar\"><div class=\"meter\" role=\"progressbar\" aria-valuenow=\"50\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:50%;\"></div></div>\n" +
"                                </div>\n" +
"                           </div>\n" +
"                        </li>\n" +
" <li >\n" +
"<div class=\"resultsdivpadding\">\n" +
"<div class=\"value\">0%</div>\n" +
"<div class=\"answer\">沒意見<div class=\"bar\"><div class=\"meter\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:0%;\"></div></div>\n" +
"                                </div>\n" +
"                           </div>\n" +
"                        </li>\n" +
" </ul>\n" +
"<div class=\"ctr\">\n" +
"<footer>\n" +
"  <a href=\"https://www.msn.com/zh-tw/news/opinion\"  data-id=\"412\" data-m='{\"i\":412,\"p\":407,\"n\":\"PollModuleResultTextLink\",\"y\":14,\"o\":5}'  target=\"_blank\">\n" +
"<span>&#128227;決戰異言堂給你最多元的評論</span>\n" +
" </a>\n" +
"                        </footer>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"413\" data-m='{\"i\":413,\"p\":345,\"n\":\"rightarrow\",\"y\":12,\"o\":8}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"生活\"\n" +
"          data-positions=\".lifestyle .stripecontent:nth-of-type(2) .tertiary li:nth-child(3)\" data-section-id=\"stripe.lifestyle\"\n" +
"          data-section-id=\"stripe.lifestyle\">\n" +
"        <div class=\"lifestyle stripeouter\"  data-aop=\"stripe.lifestyle_stripe\"  data-id=\"414\" data-m='{\"i\":414,\"p\":19,\"n\":\"stripe.lifestyle\",\"t\":\"stripe\",\"o\":11}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"415\" data-m='{\"i\":415,\"p\":414,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.lifestyle.navigation_stripenavigation\"  data-id=\"416\" data-m='{\"i\":416,\"p\":414,\"n\":\"stripe.lifestyle.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"417\" data-m='{\"i\":417,\"p\":416,\"n\":\"lifestyle\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/lifestyle\"  data-id=\"418\" data-m='{\"i\":418,\"p\":416,\"n\":\"lifestyle\",\"y\":4,\"o\":2}'>生活</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"419\" data-m='{\"i\":419,\"p\":416,\"n\":\"fortune2019\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/lifestyle/fortune2019\">?2019年度運勢全攻略?</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"420\" data-m='{\"i\":420,\"p\":416,\"n\":\"減肥瘦身大作戰\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/lifestyle/foreverdiet\">減肥瘦身大作戰</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"421\" data-m='{\"i\":421,\"p\":416,\"n\":\"健康\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/health\">健康</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"422\" data-m='{\"i\":422,\"p\":416,\"n\":\"旅遊\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/travel\">旅遊</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"423\" data-m='{\"i\":423,\"p\":416,\"n\":\"lifestylehoroscope\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/lifestyle/horoscope\">星座運勢</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"424\" data-m='{\"i\":424,\"p\":416,\"n\":\"lifestylebeauty\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/lifestyle/beauty\">美容時尚</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"425\" data-m='{\"i\":425,\"p\":416,\"n\":\"lifestyledecor\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/lifestyle/decor\">居家設計</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"426\" data-m='{\"i\":426,\"p\":416,\"n\":\"美食\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/foodanddrink\">美食</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"427\" data-m='{\"i\":427,\"p\":416,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"428\" data-m='{\"i\":428,\"p\":416,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"429\" data-m='{\"i\":429,\"p\":416,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"430\" data-m='{\"i\":430,\"p\":416,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"431\" data-m='{\"i\":431,\"p\":416,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.lifestyle|stripe|stripe.lifestyle.hero|headlines\"  data-aop=\"stripe.lifestyle.hero\"  data-id=\"432\" data-m='{\"i\":432,\"p\":414,\"n\":\"stripe.lifestyle.hero\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"433\" data-m='{\"i\":433,\"p\":432,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"434\" data-m='{\"i\":434,\"p\":433,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoU5T\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e5%8f%b0%e4%ba%ba%e7%98%8b%e6%90%b6%e7%9a%84%e3%80%8crimowa%e8%a1%8c%e6%9d%8e%e7%ae%b1%e3%80%8d%e6%96%b0%e4%bb%a3%e7%90%86%e6%ac%8a%e8%aa%b0%e6%8b%bf%e5%88%b0%ef%bc%9f%e7%ad%94%e6%a1%88%e7%b5%82%e6%96%bc%e6%8f%ad%e6%9b%89%ef%bc%81/ar-BBSoU5T?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoOuV.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 &quot;Bella.tw 儂儂 提供\" /> <div>\n" +
"<h3   aria-label=\"台人瘋搶的「rimowa行李箱」新代理權誰拿到？答案終於揭曉！-文章\">台人瘋搶的「Rimowa行李箱」新代理權誰拿到？答案終於揭曉！</h3>\n" +
"\n" +
"<img alt=\"Bella.tw 儂儂 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw 儂儂</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"435\" data-m='{\"i\":435,\"p\":433,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmdW8\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e9%9c%8d%e5%bb%ba%e8%8f%af%e3%80%8a%e5%a6%82%e6%87%bf%e5%82%b3%e3%80%8b%e5%be%8c%e5%ae%ae%e9%bd%8a%e8%81%9a%e4%b8%80%e5%a0%82%ef%bc%81%e5%91%a8%e8%bf%85%e4%b9%9f%e5%88%b0%e5%a0%b4%ef%bc%8c%e5%ae%8c%e7%b5%90%e7%af%87%e5%be%8c%e6%98%8e%e6%98%9f%e8%bf%91%e6%b3%81/ar-BBSmdW8?li=BBwkz21\"  >\n" +
"<img alt=\"霍建華《如懿傳》後宮齊聚一堂！周迅也到場，完結篇後明星近況\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmsb7.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=516&amp;y=266&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"霍建華《如懿傳》後宮齊聚一堂！周迅也到場，完結篇後明星近況 - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"霍建華《如懿傳》後宮齊聚一堂！周迅也到場，完結篇後明星近況-文章\">霍建華《如懿傳》後宮齊聚一堂！周迅也到場，完結篇後明星近況</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"436\" data-m='{\"i\":436,\"p\":433,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpfwZ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e8%be%a6%e5%b9%b4%e8%b2%a8%e5%b0%b1%e5%88%b0%e8%aa%a0%e5%93%81%e7%94%9f%e6%b4%bb%ef%bc%81%e9%ab%98%e8%a8%ad%e8%a8%88%e8%b3%aa%e6%84%9f%e7%9a%84%e8%b1%ac%e5%b9%b4%e9%96%8b%e9%81%8b%e5%b0%8f%e7%89%a9%e9%80%9a%e9%80%9a%e5%9c%a8%e9%80%99%e8%a3%a1/ar-BBSpfwZ?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoRDI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 &quot;Bella.tw 儂儂 提供\" /> <div>\n" +
"<h3   aria-label=\"辦年貨就到誠品生活！高設計質感的豬年開運小物通通在這裡-文章\">辦年貨就到誠品生活！高設計質感的豬年開運小物通通在這裡</h3>\n" +
"\n" +
"<img alt=\"Bella.tw 儂儂 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw 儂儂</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.lifestyle|stripe|stripe.lifestyle.topStories1|headlines\"  data-aop=\"stripe.lifestyle.topstories1\"  data-id=\"437\" data-m='{\"i\":437,\"p\":414,\"n\":\"stripe.lifestyle.topStories1\",\"t\":\"headlines\",\"o\":4}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"438\" data-m='{\"i\":438,\"p\":437,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"439\" data-m='{\"i\":439,\"p\":438,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS96Nx\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyledecor\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/decor/%e6%89%ad%e8%bd%89%e8%80%81%e5%b1%8b%e5%8a%a3%e5%8b%a2%e3%80%81%e6%95%b4%e5%90%88%e5%87%8c%e4%ba%82%e7%ae%a1%e7%b7%9a%ef%bc%8c%e5%9c%a8%e6%99%82%e5%b0%9a%e6%a3%ae%e6%9e%97%e4%b8%ad%e9%ab%94%e9%a9%97%e9%a0%82%e7%b4%9aspa%e4%ba%ab%e5%8f%97/ar-BBS96Nx?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8Svk.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=406&amp;y=669&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"扭轉老屋劣勢、整合凌亂管線，在時尚森林中體驗頂級SPA享受 - 由 Home Media Group (II) 提供\" /> <div>\n" +
"<h3   aria-label=\"扭轉老屋劣勢 在時尚森林中體驗頂級spa享受-文章\">扭轉老屋劣勢 在時尚森林中體驗頂級SPA享受</h3>\n" +
"\n" +
"<img alt=\"設計家 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAbxtYs.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>設計家</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"440\" data-m='{\"i\":440,\"p\":438,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoOx8\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e6%ad%90%e9%99%bd%e5%a8%9c%e5%a8%9c%e9%a9%9a%e7%8f%be%e8%80%b3%e4%b8%8b%e7%9f%ad%e9%ab%ae%ef%bc%81%e5%a8%9c%e6%af%94%e7%9a%845%e5%b9%b4%e9%95%b7%e9%ab%ae%e9%80%b2%e5%8c%96%e5%8f%b2%ef%bc%8c%e5%8a%a0%e7%a2%bc%e6%8e%a8%e8%96%a62019%e7%9f%ad%e9%ab%ae%e7%af%84%e6%9c%ac/ar-BBSoOx8?li=BBwkz21\"  >\n" +
"<img alt=\"歐陽娜娜驚現耳下短髮！娜比的5年長髮進化史，加碼推薦2019短髮範本\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZSL.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=807&amp;y=275&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"歐陽娜娜驚現耳下短髮！娜比的5年長髮進化史，加碼推薦2019短髮範本 - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"歐陽娜娜驚現耳下短髮！娜比的5年長髮進化史，加碼推薦2019短髮範本-文章\">歐陽娜娜驚現耳下短髮！娜比的5年長髮進化史，加碼推薦2019短髮範本</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"441\" data-m='{\"i\":441,\"p\":438,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmDD2\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e3%80%8a%e7%9f%a5%e5%90%a6%e7%9f%a5%e5%90%a6%e3%80%8b%e5%a6%82%e8%98%ad%e4%ba%94%e5%b0%8f%e5%a7%90%e5%94%87%e8%89%b2%e6%98%af%e9%80%99%e6%94%af%ef%bc%81-3%e5%b9%b4%e4%be%86%e6%9c%80%e6%84%9b%e7%97%98%e7%97%98%e7%a5%9e%e5%99%a8%ef%bc%8c%e7%a7%81%e4%b8%8b%e7%8b%82%e6%8e%a85%e6%ac%be%e7%94%a2%e5%93%81/ar-BBSmDD2?li=BBwkz21\"  >\n" +
"<img alt=\"《知否知否》如蘭五小姐唇色是這支！ 3年來最愛痘痘神器，私下狂推5款產品\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmDCh.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=481&amp;y=218&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"《知否知否》如蘭五小姐唇色是這支！ 3年來最愛痘痘神器，私下狂推5款產品 - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"《知否知否》如蘭五小姐唇色是這支！ 3年來最愛痘痘神器，私下狂推5款產品-文章\">《知否知否》如蘭五小姐唇色是這支！ 3年來最愛痘痘神器，私下狂推5款產品</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.lifestyle|stripe|stripe.lifestyle.HD1|headlines\"  data-aop=\"stripe.lifestyle.hd1\"  data-id=\"442\" data-m='{\"i\":442,\"p\":414,\"n\":\"stripe.lifestyle.HD1\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"443\" data-m='{\"i\":443,\"p\":442,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"444\" data-m='{\"i\":444,\"p\":443,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjxH8\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e5%85%a8%e5%8f%b0%e9%a6%96%e9%96%93%e8%88%8a%e7%81%ab%e8%bb%8a%e7%ab%99%e6%94%b9%e5%bb%ba%e8%80%8c%e6%88%90%e6%98%9f%e5%b7%b4%e5%85%8b%e5%9c%a8%e9%80%99%e8%a3%a1%ef%bc%81%e9%82%84%e5%8f%af%e4%bb%a5%e4%b8%80%e9%82%8a%e6%ac%a3%e8%b3%9e%e7%81%ab%e8%bb%8a%e4%b8%80%e9%82%8a%e5%96%9d%e5%92%96%e5%95%a1/ar-BBSjxH8?li=BBwkz21\"  >\n" +
"<img alt=\"全台首間舊火車站改建而成星巴克在這裡！還可以一邊欣賞火車一邊喝咖啡~\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjGM4.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"全台首間舊火車站改建而成星巴克在這裡！還可以一邊欣賞火車一邊喝咖啡~ - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"全台首間舊火車站改建而成星巴克在這裡！還可以一邊欣賞火車一邊喝咖啡~-文章\">全台首間舊火車站改建而成星巴克在這裡！還可以一邊欣賞火車一邊喝咖啡~</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"445\" data-m='{\"i\":445,\"p\":443,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmRmT\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e5%a5%b3%e4%ba%ba%e8%a6%81%e4%b8%80%e6%99%82%e7%9a%84%e5%90%b8%e5%bc%95%e5%8a%9b%e3%80%81%e9%82%84%e6%98%af%e7%84%a1%e9%99%90%e6%9c%9f%e7%9a%84%e8%bf%b7%e4%ba%ba%e6%b0%a3%e5%a0%b4%ef%bc%9f/ar-BBSmRmT?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmLaP.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=470&amp;y=118&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"女人要一時的吸引力、還是無限期的迷人氣場？ - 由 Global Views Commonwealth 提供\" /> <div>\n" +
"<h3   aria-label=\"女人要一時的吸引力、還是無限期的迷人氣場？-文章\">女人要一時的吸引力、還是無限期的迷人氣場？</h3>\n" +
"\n" +
"<img alt=\"遠見雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>遠見雜誌</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"446\" data-m='{\"i\":446,\"p\":443,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjwj6\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e8%b6%85%e7%b0%a1%e5%96%ae%e3%80%8c%e9%9f%93%e5%9c%8b%e4%ba%ba%e5%8f%83%e9%9b%9e%e6%b9%af%e3%80%8dbunny%e6%95%99%e4%bd%a0%e8%bc%95%e9%ac%86%e5%8b%95%e6%89%8b%e5%81%9a%ef%bc%8c%e8%a3%9c%e6%b0%a3%e9%a4%8a%e8%ba%ab%e6%ba%ab%e6%9a%96%e4%bd%a0%e6%95%b4%e5%80%8b%e5%86%ac%ef%bd%9e/ar-BBSjwj6?li=BBwkz21\"  >\n" +
"<img alt=\"超簡單「韓國人參雞湯」Bunny教你輕鬆動手做，補氣養身溫暖你整個冬～\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjwiq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=402&amp;y=393&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"超簡單「韓國人參雞湯」Bunny教你輕鬆動手做，補氣養身溫暖你整個冬～ - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"超簡單「韓國人參雞湯」bunny教你輕鬆動手做，補氣養身溫暖你整個冬～-文章\">超簡單「韓國人參雞湯」Bunny教你輕鬆動手做，補氣養身溫暖你整個冬～</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.lifestyle|stripe|stripe.lifestyle.hero1|headlines\"  data-aop=\"stripe.lifestyle.hero1\"  data-id=\"447\" data-m='{\"i\":447,\"p\":414,\"n\":\"stripe.lifestyle.hero1\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"448\" data-m='{\"i\":448,\"p\":447,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"449\" data-m='{\"i\":449,\"p\":448,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm3bU\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/angelababy%e6%a5%8a%e7%a9%8e%e7%9a%84%e5%a6%9d%e5%8f%88%e4%b8%8a%e7%86%b1%e6%90%9c%ef%bc%81%e5%ba%95%e5%a6%9d%e3%80%81%e7%9c%bc%e5%a6%9d%e3%80%81%e5%94%87%e5%bd%a9%e4%bd%bf%e7%94%a8%e5%93%81%e7%89%8cplus%e7%95%ab%e6%b3%95%e5%a4%a7%e5%85%ac%e9%96%8b/ar-BBSm3bU?li=BBwkz21\"  >\n" +
"<img alt=\"Angelababy楊穎的妝又上熱搜！底妝、眼妝、唇彩使用品牌+畫法大公開\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmcKo.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=486&amp;y=176&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Angelababy楊穎的妝又上熱搜！底妝、眼妝、唇彩使用品牌+畫法大公開 - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"angelababy楊穎的妝又上熱搜！底妝、眼妝、唇彩使用品牌+畫法大公開-文章\">Angelababy楊穎的妝又上熱搜！底妝、眼妝、唇彩使用品牌+畫法大公開</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"450\" data-m='{\"i\":450,\"p\":448,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYlY\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/travel/%e5%87%ba%e5%9c%8b%e6%97%85%e9%81%8a%e8%a9%b2%e6%80%8e%e9%ba%bc%e8%a8%82%e6%88%bf%ef%bc%9f%e7%94%a8%e9%80%993%e5%80%8b%e9%bb%9e%e6%8e%8c%e6%8f%a1%e3%80%8c2019%e7%89%b9%e8%89%b2%e4%bd%8f%e5%ae%bf%e7%86%b1%e6%bd%ae%e3%80%8d/ar-BBSoYlY?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoQXf.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=263&amp;y=180&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 &quot;Bella.tw 儂儂 提供\" /> <div>\n" +
"<h3   aria-label=\"出國旅遊該怎麼訂房？用這3點掌握「2019特色住宿熱潮」-文章\">出國旅遊該怎麼訂房？用這3點掌握「2019特色住宿熱潮」</h3>\n" +
"\n" +
"<img alt=\"Bella.tw 儂儂 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw 儂儂</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"451\" data-m='{\"i\":451,\"p\":448,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjY5d\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e5%ad%b8%e6%ad%90%e9%99%bd%e5%a8%9c%e5%a8%9c%e7%9a%84%e6%8b%8d%e7%85%a7%e5%a7%bf%e5%8b%a2%ef%bc%815%e5%80%8b%e5%b0%8f%e6%8a%80%e5%b7%a7%e8%ae%93%e5%a6%b3%e9%9b%99%e8%85%bf%e7%ab%8b%e5%88%bb%e6%8b%89%e9%95%b710%e5%85%ac%e5%88%86/ar-BBSjY5d?li=BBwkz21\"  >\n" +
"<img alt=\"學歐陽娜娜的拍照姿勢！5個小技巧讓妳雙腿立刻拉長10公分\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjJOR.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=350&amp;y=74&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"學歐陽娜娜的拍照姿勢！5個小技巧讓妳雙腿立刻拉長10公分 - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"學歐陽娜娜的拍照姿勢！5個小技巧讓妳雙腿立刻拉長10公分-文章\">學歐陽娜娜的拍照姿勢！5個小技巧讓妳雙腿立刻拉長10公分</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"452\" data-m='{\"i\":452,\"p\":447,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"453\" data-m='{\"i\":453,\"p\":452,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjpc3\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e5%85%88%e5%88%a5%e6%80%a5%e8%91%97%e4%b8%9f%ef%bc%81%e9%81%8e%e6%9c%9f%e7%be%8e%e5%a6%9d%e5%93%81%e5%b1%85%e7%84%b6%e5%8f%af%e4%bb%a5%e7%95%b6%e4%bd%9c%e9%99%a4%e6%bf%95%e5%8a%91%e4%be%86%e7%94%a8%ef%bc%8c%e4%b9%9f%e5%a4%aa%e7%a5%9e%e4%ba%86%e5%90%a7%ef%bc%9f%ef%bc%81/ar-BBSjpc3?li=BBwkz21\"  >\n" +
"<img alt=\"先別急著丟！過期美妝品居然可以當作除濕劑來用，也太神了吧？！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjtfN.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"先別急著丟！過期美妝品居然可以當作除濕劑來用，也太神了吧？！ - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"先別急著丟！過期美妝品居然可以當作除濕劑來用，也太神了吧？！-文章\">先別急著丟！過期美妝品居然可以當作除濕劑來用，也太神了吧？！</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"454\" data-m='{\"i\":454,\"p\":452,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSk6e5\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e9%81%8e%e5%b9%b4%e5%a4%a7%e6%8e%83%e9%99%a4%e9%80%99%e6%a8%a3%e6%8e%83%e8%ae%8a%e8%bc%95%e9%ac%86%ef%bc%81%e5%8e%bb%e9%99%a4%e5%86%b0%e7%ae%b1%e7%95%b0%e5%91%b3%e3%80%81%e5%90%84%e9%a1%9e%e6%b2%99%e7%99%bc%e3%80%81%e7%a2%97%e7%9b%a4%e6%b8%85%e6%bd%94%e5%85%a8%e6%94%bb%e7%95%a5/ar-BBSk6e5?li=BBwkz21\"  >\n" +
"<img alt=\"過年大掃除這樣掃變輕鬆！去除冰箱異味、各類沙發、碗盤清潔全攻略\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSk3Vh.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=528&amp;y=200&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"過年大掃除這樣掃變輕鬆！去除冰箱異味、各類沙發、碗盤清潔全攻略 - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"過年大掃除變輕鬆！去除冰箱異味、各類沙發、碗盤清潔全攻略-文章\">過年大掃除變輕鬆！去除冰箱異味、各類沙發、碗盤清潔全攻略</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"455\" data-m='{\"i\":455,\"p\":452,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS8hxh\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/2019%e9%a1%af%e7%99%bd%e9%ab%ae%e8%89%b2%e6%8e%a8%e8%96%a6%ef%bc%8c%e9%9f%93%e5%9c%8b%e5%a5%b3%e6%98%8e%e6%98%9f%e6%9c%80%e6%84%9b%e7%9a%84%e6%b7%b1%e9%ab%ae%e8%89%b2top5%ef%bc%8c%e9%80%99%e5%b9%be%e8%89%b2%e9%83%bd%e7%be%8e%e5%91%86%e4%ba%86%ef%bc%81/ar-BBS8hxh?li=BBwkz21\"  >\n" +
"<img alt=\"2019顯白髮色推薦，韓國女明星最愛的深髮色TOP5，這幾色都美呆了！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8qof.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=225&amp;y=180&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2019顯白髮色推薦，韓國女明星最愛的深髮色TOP5，這幾色都美呆了！ - 由 Ever Shinning Publications, Inc 提供\" /> <div>\n" +
"<h3   aria-label=\"2019顯白髮色推薦，韓國女明星最愛的深髮色top5，這幾色都美呆了！-文章\">2019顯白髮色推薦，韓國女明星最愛的深髮色TOP5，這幾色都美呆了！</h3>\n" +
"\n" +
"<img alt=\"beauty321 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"456\" data-m='{\"i\":456,\"p\":447,\"n\":\"secondary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"457\" data-m='{\"i\":457,\"p\":456,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoW7y\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/travel/%e5%9a%b4%e8%82%85%e5%9f%8e%e5%b8%82%e8%a3%a1%e7%9a%84%e5%af%ab%e5%af%a6%e5%a1%97%e9%b4%89-%e4%b8%80%e8%b5%b7%e8%b5%b0%e5%85%a5%e7%be%8e%e5%9c%8b%e8%8f%af%e5%ba%9c%e7%9a%84%e3%80%8c%e5%9c%b0%e4%b8%8b%e6%96%87%e5%8c%96%e3%80%8d/ar-BBSoW7y?li=BBwkz21\"  >\n" +
"<img alt=\"左邊是孩子一歲時，右側畫面是孩子兩歲時，被父親抱在懷中的寫實作品。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoW7h.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=338&amp;y=260&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"左邊是孩子一歲時，右側畫面是孩子兩歲時，被父親抱在懷中的寫實作品。 - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"嚴肅城市裡的寫實塗鴉 一起走入美國華府的「地下文化」-文章\">嚴肅城市裡的寫實塗鴉 一起走入美國華府的「地下文化」</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"458\" data-m='{\"i\":458,\"p\":447,\"n\":\"tertiary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"459\" data-m='{\"i\":459,\"p\":458,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoqLm\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashion\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/fashion/angus-chiang-%e6%b1%9f%e5%bc%8f%e5%93%b2%e5%ad%b8%ef%bc%8c%e6%b6%88%e5%a4%b1%e6%96%bc%e5%9f%8e%e5%b8%82%e7%9a%84%e8%a8%98%e6%86%b6%e5%b0%b1%e7%94%a8%e6%9c%8d%e8%a3%9d%e4%be%86%e5%bb%b6%e7%ba%8c/ar-BBSoqLm?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSogWk.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=651&amp;y=159&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 &quot;Bella.tw 儂儂 提供\" /> <div>\n" +
"<h3   aria-label=\"angus chiang 江式哲學，消失於城市的記憶就用服裝來延續-文章\">ANGUS CHIANG 江式哲學，消失於城市的記憶就用服裝來延續</h3>\n" +
"\n" +
"<img alt=\"Bella.tw 儂儂 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw 儂儂</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"460\" data-m='{\"i\":460,\"p\":458,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTbb\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/supernumber10yearschallenge-%e6%a0%b9%e6%9c%ac%e5%9b%9e%e6%86%b6%e6%ae%ba%ef%bc%81%e5%a6%b9%e5%a6%b9%e9%a0%ad%e3%80%81%e9%9b%a2%e5%ad%90%e7%87%99%e3%80%81%e7%8e%89%e7%b1%b3%e9%ac%9a%e9%80%99%e4%ba%9b%e9%ab%ae%e5%9e%8b%e4%bd%a0%e4%b8%80%e5%ae%9a%e7%95%99%e9%81%8e/ar-BBSoTbb?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoJhR.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=388&amp;y=161&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"由 &quot;Bella.tw 儂儂 提供\" /> <div>\n" +
"<h3   aria-label=\"#10yearschallenge 根本回憶殺！妹妹頭、離子燙這些髮型你一定留過-文章\">#10YearsChallenge 根本回憶殺！妹妹頭、離子燙這些髮型你一定留過</h3>\n" +
"\n" +
"<img alt=\"Bella.tw 儂儂 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw 儂儂</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"461\" data-m='{\"i\":461,\"p\":458,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYTH\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/travel/%e3%80%90%e8%be%b2%e6%b3%8a%e8%a7%80%e5%85%89%ef%bc%88%e4%b8%8a%ef%bc%89%e3%80%91%e9%95%b7%e4%bd%8f%e5%bc%8f%e6%97%85%e9%81%8a-%e5%85%a8%e7%90%83%e6%97%85%e5%ae%a2%e6%84%9b%e4%b8%8a%e6%97%a5%e6%9c%ac%e8%be%b2%e5%ae%b6%e6%a8%82/ar-BBSoYTH?li=BBwkz21\"  >\n" +
"<img alt=\"長野縣上田市武石地區的農泊設施「信州青春村（信州?????村）」一景。（信州青春村官網）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoWip.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"長野縣上田市武石地區的農泊設施「信州青春村（信州?????村）」一景。（信州青春村官網） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"【農泊觀光（上）】長住式旅遊 全球旅客愛上日本農家樂-文章\">【農泊觀光（上）】長住式旅遊 全球旅客愛上日本農家樂</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"462\" data-m='{\"i\":462,\"p\":447,\"n\":\"secondary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"463\" data-m='{\"i\":463,\"p\":462,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoO94\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/travel/%e3%80%90%e8%be%b2%e6%b3%8a%e8%a7%80%e5%85%89%ef%bc%88%e4%b8%8b%ef%bc%89%e3%80%91%e9%80%99%e4%ba%9b%e5%9c%b0%e6%96%b9%e9%83%bd%e5%8f%af%e4%bb%a5%e9%ab%94%e9%a9%97%e6%97%a5%e6%9c%ac%e7%94%b0%e9%87%8e%e9%ad%85%e5%8a%9b/ar-BBSoO94?li=BBwkz21\"  >\n" +
"<img alt=\"青森縣七戶農家民宿的大蒜田。（七戶農家民宿官方部落格）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoO93.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"青森縣七戶農家民宿的大蒜田。（七戶農家民宿官方部落格） - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"【農泊觀光（下）】這些地方都可以體驗日本田野魅力-文章\">【農泊觀光（下）】這些地方都可以體驗日本田野魅力</h3>\n" +
"\n" +
"<img alt=\"鏡週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>鏡週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"464\" data-m='{\"i\":464,\"p\":447,\"n\":\"secondary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"465\" data-m='{\"i\":465,\"p\":464,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSj7Ad\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e6%95%a2%e6%96%bc%e4%b8%8d%e5%90%8c%e7%9a%84%e5%8b%87%e6%b0%a3%e2%94%80%e2%94%8028%e6%ad%b2%e3%80%8c%e9%ab%98%e9%bd%a1%e3%80%8d%e7%9a%84%e8%8b%b1%e5%9c%8b%e5%bf%97%e5%b7%a5gap-year%ef%bc%8c%e8%ae%93%e6%88%91%e6%89%be%e5%88%b0%e7%9c%9f%e6%ad%a3%e5%96%9c%e6%ad%a1%e7%9a%84%e8%87%aa%e5%b7%b1/ar-BBSj7Ad?li=BBwkz21\"  >\n" +
"<img alt=\"敢於不同的勇氣──28歲「高齡」的英國志工Gap Year，讓我找到真正喜歡的自己\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjies.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=710&amp;y=225&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"敢於不同的勇氣──28歲「高齡」的英國志工Gap Year，讓我找到真正喜歡的自己 - 由 Common Wealth Magazine Group 提供\" /> <div>\n" +
"<h3   aria-label=\"敢於不同的勇氣──28歲「高齡」的英國志工gap year，讓我找到真正喜歡的自己-文章\">敢於不同的勇氣──28歲「高齡」的英國志工Gap Year，讓我找到真正喜歡的自己</h3>\n" +
"\n" +
"<img alt=\"換日線 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBluhS9.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>換日線</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"466\" data-m='{\"i\":466,\"p\":414,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"健康\"\n" +
"          data-section-id=\"stripe.health\"\n" +
"          data-section-id=\"stripe.health\">\n" +
"        <div class=\"healthfitness stripeouter\"  data-aop=\"stripe.health_stripe\"  data-id=\"467\" data-m='{\"i\":467,\"p\":19,\"n\":\"stripe.health\",\"t\":\"stripe\",\"o\":12}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"468\" data-m='{\"i\":468,\"p\":467,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.health.navigation_stripenavigation\"  data-id=\"469\" data-m='{\"i\":469,\"p\":467,\"n\":\"stripe.health.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"470\" data-m='{\"i\":470,\"p\":469,\"n\":\"健康\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/health\"  data-id=\"471\" data-m='{\"i\":471,\"p\":469,\"n\":\"健康\",\"y\":4,\"o\":2}'>健康</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"472\" data-m='{\"i\":472,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"高效減脂\",\"o\":3}'><a href=\"/zh-tw/health/search/filter?Filter=focus%7c10&amp;cluster=fitness\">高效減脂</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"473\" data-m='{\"i\":473,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"重量訓練\",\"o\":4}'><a href=\"/zh-tw/health/search/filter?Filter=type%7c1&amp;cluster=fitness\">重量訓練</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"474\" data-m='{\"i\":474,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"皮拉提斯\",\"o\":5}'><a href=\"/zh-tw/health/search/filter?Filter=type%7c2&amp;cluster=fitness\">皮拉提斯</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"475\" data-m='{\"i\":475,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"瑜珈\",\"o\":6}'><a href=\"/zh-tw/health/search/filter?Filter=type%7c3&amp;cluster=fitness\">瑜珈</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"476\" data-m='{\"i\":476,\"p\":469,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":7}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"477\" data-m='{\"i\":477,\"p\":469,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":8}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"478\" data-m='{\"i\":478,\"p\":469,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":9}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"479\" data-m='{\"i\":479,\"p\":469,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":10}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"480\" data-m='{\"i\":480,\"p\":469,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":11}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.health|stripe|stripe.health.hero|headlines\"  data-aop=\"hero\"  data-id=\"481\" data-m='{\"i\":481,\"p\":467,\"n\":\"stripe.health.hero\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"482\" data-m='{\"i\":482,\"p\":481,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"483\" data-m='{\"i\":483,\"p\":482,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp6eO\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e5%b9%ab%e5%af%b6%e5%af%b6%e6%b4%97%e6%be%a1%e5%a5%bd%e5%8f%af%e6%80%95%ef%bc%9f%e6%96%b0%e6%89%8b%e7%88%b8%e5%aa%bd%e8%ac%b9%e8%a8%985%e6%ad%a5%e9%a9%9f%e4%b8%8dng/ar-BBSp6eO?li=BBwkEg5\"  >\n" +
"<img alt=\"幫寶寶洗澡好可怕？新手爸媽謹記5步驟不NG\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpcjf.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=313&amp;y=136&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"幫寶寶洗澡好可怕？新手爸媽謹記5步驟不NG - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"幫寶寶洗澡好可怕？新手爸媽謹記5步驟不ng-文章\">幫寶寶洗澡好可怕？新手爸媽謹記5步驟不NG</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.health|stripe|stripe.health.HD1|headlineLinkList\"   data-id=\"484\" data-m='{\"i\":484,\"p\":467,\"n\":\"stripe.health.HD1\",\"t\":\"headlineLinkList\",\"o\":4}'   \n" +
"  aria-label=\"健康\" >\n" +
" \n" +
" <h2><a href=\"/zh-tw/health\" >健康</a></h2>\n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"486\" data-m='{\"i\":486,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBShcbq\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%ae%8a%e8%80%81%e9%9b%96%e7%84%b6%e9%80%a0%e6%88%90%e4%b8%8d%e5%ae%89%ef%bc%8c%e8%87%aa%e5%b7%b1%e5%89%b5%e9%80%a0%e4%ba%ba%e7%94%9f%e4%b8%8b%e5%8d%8a%e9%83%a8%e6%89%8d%e7%b2%be%e9%87%87/ar-BBShcbq?li=AA51Z6\"   aria-label=\"變老雖然造成不安，自己創造人生下半部才精采-文章\">\n" +
"\n" +
"                    <h3>變老雖然造成不安，自己創造人生下半部才精采</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"遠見雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"487\" data-m='{\"i\":487,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphAh\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%85%ab%e6%ae%b5%e9%8c%a6%e5%a4%af%e4%bb%80%e9%ba%bc%ef%bc%9f%e8%88%92%e7%ad%8b%e6%b4%bb%e8%a1%80%e7%90%86%e6%b0%a3%ef%bc%8c6%e5%a4%a7%e5%bc%b7%e8%ba%ab%e5%8a%9f%e6%95%88%e5%a0%b1%e4%bd%a0%e7%9f%a5%ef%bc%81/ar-BBSphAh?li=AA51Z6\"   aria-label=\"八段錦夯什麼？舒筋活血理氣，6大強身功效報你知！-文章\">\n" +
"\n" +
"                    <h3>八段錦夯什麼？舒筋活血理氣，6大強身功效報你知！</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"488\" data-m='{\"i\":488,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnkay\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e4%ba%ba%e8%94%98%e5%be%88%e8%a3%9c-%e4%bd%86%e9%80%998%e7%a8%ae%e4%ba%ba%e4%b8%8d%e9%81%a9%e5%90%88%e5%90%83/ar-BBSnkay?li=AA51Z6\"   aria-label=\"人蔘很補 但這8種人不適合吃-文章\">\n" +
"\n" +
"                    <h3>人蔘很補 但這8種人不適合吃</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"489\" data-m='{\"i\":489,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm23r\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e7%99%b2%e7%99%87%e7%99%bc%e4%bd%9c%e6%80%8e%e9%ba%bc%e8%be%a6%ef%bc%9f%e8%aa%8d%e8%ad%98%e7%99%b2%e7%99%87%e6%80%a5%e6%95%918%e6%ad%a5%e9%a9%9f%e4%bf%9d%e5%91%bd/ar-BBSm23r?li=AA51Z6\"   aria-label=\"癲癇發作怎麼辦？認識癲癇急救8步驟保命-文章\">\n" +
"\n" +
"                    <h3>癲癇發作怎麼辦？認識癲癇急救8步驟保命</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"早安健康 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAdgxC6.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"490\" data-m='{\"i\":490,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSn9GS\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%bf%85%e9%80%9f%e7%b7%a9%e8%a7%a3%e8%b6%b3%e5%ba%95%e7%ad%8b%e8%86%9c%e7%82%8e%ef%bc%8c%e9%86%ab%e5%b8%ab%e5%a6%99%e6%96%b9%e7%ab%9f%e6%98%af%e3%80%8c%e7%a9%bf%e9%ab%98%e8%b7%9f%e9%9e%8b%e3%80%8d%ef%bc%9f/ar-BBSn9GS?li=AA51Z6\"   aria-label=\"迅速緩解足底筋膜炎，醫師妙方竟是「穿高跟鞋」？-文章\">\n" +
"\n" +
"                    <h3>迅速緩解足底筋膜炎，醫師妙方竟是「穿高跟鞋」？</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"遠見雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"491\" data-m='{\"i\":491,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpgyX\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e6%88%91%e5%80%91%e9%83%bd%e5%90%83%e9%8c%af%e4%ba%86%ef%bc%9f%e9%80%99%e6%a8%a3%e5%90%83%e9%ab%98%e9%ba%97%e8%8f%9c%e6%89%8d%e6%9c%80%e6%9c%89%e6%95%88/ar-BBSpgyX?li=AA51Z6\"   aria-label=\"我們都吃錯了？這樣吃高麗菜才最有效-文章\">\n" +
"\n" +
"                    <h3>我們都吃錯了？這樣吃高麗菜才最有效</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"492\" data-m='{\"i\":492,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjnqo\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e6%b3%8c%e5%b0%bf%e7%a7%91%e9%86%ab%e5%b8%ab%e6%95%993%e6%8b%9b%e9%8d%9b%e9%8d%8a%e9%aa%a8%e7%9b%86%e5%ba%95%e8%82%8c%ef%bc%8c%e6%96%ac%e9%99%a4%e6%bc%8f%e5%b0%bf%e3%80%81%e9%a0%bb%e5%b0%bf%e7%85%a9%e6%83%b1/ar-BBSjnqo?li=AA51Z6\"   aria-label=\"泌尿科醫師教3招鍛鍊骨盆底肌，斬除漏尿、頻尿煩惱-文章\">\n" +
"\n" +
"                    <h3>泌尿科醫師教3招鍛鍊骨盆底肌，斬除漏尿、頻尿煩惱</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"早安健康 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAdgxC6.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"493\" data-m='{\"i\":493,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp35j\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":9}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%a5%b9%e6%8b%89%e5%87%ba%e7%81%b0%e7%99%bd%e8%89%b2%e5%a4%a7%e4%be%bf-%e7%ab%9f%e7%bd%b9%e7%84%a1%e8%81%b2%e7%99%8c2%e6%9c%9f/ar-BBSp35j?li=AA51Z6\"   aria-label=\"她拉出灰白色大便 竟罹無聲癌2期-文章\">\n" +
"\n" +
"                    <h3>她拉出灰白色大便 竟罹無聲癌2期</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.health|stripe|stripe.health.HD2|headlineLinkList\"   data-id=\"494\" data-m='{\"i\":494,\"p\":467,\"n\":\"stripe.health.HD2\",\"t\":\"headlineLinkList\",\"o\":5}'   \n" +
"  aria-label=\"健康\" >\n" +
" \n" +
" <h2><a href=\"/zh-tw/health\" >健康</a></h2>\n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"496\" data-m='{\"i\":496,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYCE\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%90%8d%e9%86%ab40%e6%ad%b2%e5%be%8c%e9%a3%b2%e9%a3%9f%e6%b8%85%e5%96%ae%ef%bc%8c%e5%bf%85%e5%82%99%e7%b6%ad%e7%94%9f%e7%b4%a0d%e3%80%81%e9%a6%99%e8%95%89%e7%b6%a0%e6%8b%bf%e9%90%b5/ar-BBSoYCE?li=AA51Z6\"   aria-label=\"名醫：40歲後飲食清單，必備維生素d、香蕉綠拿鐵-文章\">\n" +
"\n" +
"                    <h3>名醫：40歲後飲食清單，必備維生素D、香蕉綠拿鐵</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"早安健康 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAdgxC6.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"497\" data-m='{\"i\":497,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSeeMx\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e9%9f%b3%e6%a8%82%e6%98%af%e8%89%af%e8%97%a5%ef%bc%81%e9%80%80%e4%bc%91%e7%9a%84%e4%bb%96%e9%87%8d%e6%8b%be%e6%a8%82%e5%99%a8%ef%bc%8c%e5%b1%85%e7%84%b6%e6%94%b9%e5%96%84%e5%81%a5%e5%bf%98%e3%80%81%e8%ae%8a%e5%be%97%e6%9b%b4%e5%81%a5%e5%ba%b7/ar-BBSeeMx?li=AA51Z6\"   aria-label=\"音樂是良藥！退休的他重拾樂器，居然改善健忘、變得更健康-文章\">\n" +
"\n" +
"                    <h3>音樂是良藥！退休的他重拾樂器，居然改善健忘、變得更健康</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"遠見雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"498\" data-m='{\"i\":498,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnhmH\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e3%80%8c%e8%b5%b7%e5%8f%b8%e8%87%89%e3%80%8d%e6%95%91%e4%ba%86%e5%a5%b9%e5%b9%b8%e9%81%8b%e6%8f%aa%e5%87%ba%e7%99%8c%e7%8e%8b/ar-BBSnhmH?li=AA51Z6\"   aria-label=\"「起司臉」救了她...幸運揪出癌王-文章\">\n" +
"\n" +
"                    <h3>「起司臉」救了她...幸運揪出癌王</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"499\" data-m='{\"i\":499,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmZ2d\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%96%9d%e3%80%8c%e4%b9%b3%e6%b8%85%e8%9b%8b%e7%99%bd%e3%80%8d%e5%a2%9e%e8%82%8c-%e9%81%8e%e9%87%8f%e4%bd%bf%e7%94%a8%e6%81%90%e6%9a%b4%e8%82%a5/ar-BBSmZ2d?li=AA51Z6\"   aria-label=\"喝「乳清蛋白」增肌 過量使用恐暴肥-文章\">\n" +
"\n" +
"                    <h3>喝「乳清蛋白」增肌 過量使用恐暴肥</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"500\" data-m='{\"i\":500,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmDUt\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%96%9d%e5%92%96%e5%95%a1%e6%9c%89%e7%a6%81%e5%bf%8c-%e5%b0%88%e5%ae%b6%e9%80%99%e6%99%82%e9%96%93%e5%8d%83%e8%90%ac%e5%88%a5%e5%96%9d/ar-BBSmDUt?li=AA51Z6\"   aria-label=\"喝咖啡有禁忌 專家：這時間千萬別喝-文章\">\n" +
"\n" +
"                    <h3>喝咖啡有禁忌 專家：這時間千萬別喝</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"501\" data-m='{\"i\":501,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSn9dN\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%82%9a%e8%87%8d%e5%86%b7%e6%98%93%e7%83%99%e8%b3%bd6%e9%83%a8%e4%bd%8d%e5%8f%97%e5%af%92%e6%81%90%e6%90%8d%e5%99%a8%e5%ae%98/ar-BBSn9dN?li=AA51Z6\"   aria-label=\"肚臍冷易腹瀉 全身這6部位受寒恐損器官-文章\">\n" +
"\n" +
"                    <h3>肚臍冷易腹瀉 全身這6部位受寒恐損器官</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"502\" data-m='{\"i\":502,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYy7\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%8f%a0%e8%8f%9c%ef%bc%8b%e8%b1%86%e8%85%90%ef%bc%9d%e8%85%8e%e7%b5%90%e7%9f%b3%ef%bc%9f%e7%87%9f%e9%a4%8a%e5%b8%ab%e7%a0%b4%e8%a7%a3%e5%8d%83%e5%8f%a4%e8%bf%b7%e6%80%9d%ef%bc%81/ar-BBSoYy7?li=AA51Z6\"   aria-label=\"菠菜＋豆腐＝腎結石？營養師破解千古迷思！-文章\">\n" +
"\n" +
"                    <h3>菠菜＋豆腐＝腎結石？營養師破解千古迷思！</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"503\" data-m='{\"i\":503,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoNV0\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":9}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%86%ac%e5%ad%a3%e8%8d%89%e8%8e%93%e5%ae%89%e5%bf%83%e5%90%83-2%e4%bb%b6%e4%ba%8b%e6%9c%80%e9%87%8d%e8%a6%81/ar-BBSoNV0?li=AA51Z6\"   aria-label=\"如何清洗才乾淨？冬季草莓安心吃 2件事最重要-文章\">\n" +
"\n" +
"                    <h3>如何清洗才乾淨？冬季草莓安心吃 2件事最重要</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"康健雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.health|stripe|stripe.health.topstories2|headlines\"  data-aop=\"top stories1\"  data-id=\"504\" data-m='{\"i\":504,\"p\":467,\"n\":\"stripe.health.topstories2\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"505\" data-m='{\"i\":505,\"p\":504,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"506\" data-m='{\"i\":506,\"p\":505,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoVeC\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e8%82%ba%e7%82%8e%e5%bc%95%e8%b5%b7%e7%9a%84%e6%80%a5%e6%80%a7%e5%91%bc%e5%90%b8%e8%a1%b0%e7%ab%ad%ef%bc%8c%e5%a6%82%e4%bd%95%e9%a0%90%e9%98%b2%ef%bc%9f/ar-BBSoVeC?li=AA51Z6\"  >\n" +
"<img alt=\"肺炎引起的急性呼吸衰竭，如何預防？\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoTea.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=414&amp;y=165&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"肺炎引起的急性呼吸衰竭，如何預防？ - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"肺炎引起的急性呼吸衰竭，如何預防？-文章\">肺炎引起的急性呼吸衰竭，如何預防？</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"507\" data-m='{\"i\":507,\"p\":505,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoVql\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%b0%a3%e6%ba%ab%e9%a9%9f%e9%99%8d%e5%b0%8f%e5%bf%83%e8%85%a6%e4%b8%ad%e9%a2%a8-%e5%ae%b9%e6%98%93%e8%a2%ab%e5%bf%bd%e7%95%a5%e7%9a%845%e5%be%b5%e5%85%86/ar-BBSoVql?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoQMu.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"氣溫驟降小心腦中風 容易被忽略的5徵兆 - 由 Common Wealth Magazine Group 提供\" /> <div>\n" +
"<h3   aria-label=\"氣溫驟降小心腦中風 容易被忽略的5徵兆-文章\">氣溫驟降小心腦中風 容易被忽略的5徵兆</h3>\n" +
"\n" +
"<img alt=\"康健雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>康健雜誌</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"508\" data-m='{\"i\":508,\"p\":505,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoLXP\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e9%ab%98%e8%a1%80%e8%84%82%e6%98%af%e5%bf%83%e8%82%8c%e6%a2%97%e5%a1%9e%e9%9a%b1%e5%bd%a2%e6%ae%ba%e6%89%8b%ef%bc%81%e5%90%b3%e6%98%8e%e7%8f%a0%e5%96%9d%e9%bb%83%e8%80%86%e9%a4%8a%e5%bf%83%e8%8c%b6%e6%b4%bb%e8%a1%80%e5%8c%96%e7%98%80/ar-BBSoLXP?li=AA51Z6\"  >\n" +
"<img alt=\"中醫進行活血化瘀也有助於預防心肌梗塞，以下推荐喝「七七養心茶」，以及護心穴位保養。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoSWq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=573&amp;y=317&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"中醫進行活血化瘀也有助於預防心肌梗塞，以下推荐喝「七七養心茶」，以及護心穴位保養。 - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"高血脂是心肌梗塞隱形殺手！吳明珠：喝黃耆養心茶活血化瘀-文章\">高血脂是心肌梗塞隱形殺手！吳明珠：喝黃耆養心茶活血化瘀</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"509\" data-m='{\"i\":509,\"p\":504,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"510\" data-m='{\"i\":510,\"p\":509,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoT41\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e8%80%81%e8%8a%b1%e7%9c%bc%e7%aa%81%e7%84%b6%e6%94%b9%e5%96%84%ef%bc%8c%e5%b0%8f%e5%bf%83%e7%99%bd%e5%85%a7%e9%9a%9c%e4%b8%8a%e8%ba%ab%ef%bc%81%e5%87%ba%e7%8f%be%e9%80%995%e5%be%b5%e5%85%86%e8%a6%81%e7%95%b6%e5%bf%83/ar-BBSoT41?li=AA51Z6\"  >\n" +
"<img alt=\"老花眼突然改善，小心白內障上身！出現這5徵兆要當心\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoXkp.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=495&amp;y=95&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"老花眼突然改善，小心白內障上身！出現這5徵兆要當心 - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"老花眼突然改善，小心白內障上身！出現這5徵兆要當心-文章\">老花眼突然改善，小心白內障上身！出現這5徵兆要當心</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"511\" data-m='{\"i\":511,\"p\":509,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGx7\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e7%88%b8%e5%aa%bd%e8%be%9b%e8%8b%a6%e4%ba%86%ef%bc%81%e5%86%8d%e5%bf%99%e4%b9%9f%e8%a6%81%e8%87%aa%e5%b7%b1%e7%85%ae-%e9%86%ab%e5%b0%8f%e5%bf%83%e5%ad%a9%e5%ad%90%e9%ae%ae%e4%b9%b3%e9%88%a3%e8%b3%aa%e9%9b%99%e4%b8%8d%e8%b6%b3/ar-BBSoGx7?li=AA51Z6\"  >\n" +
"<img alt=\"柚子小兒科診所院長陳木榮舉例，如鄰國日本，在飲食相當重視鮮乳，政府更訂下「學校給食法」，將鮮乳重視度提升跟米飯一樣重要-。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoMIG.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=254&amp;y=136&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"柚子小兒科診所院長陳木榮舉例，如鄰國日本，在飲食相當重視鮮乳，政府更訂下「學校給食法」，將鮮乳重視度提升跟米飯一樣重要-。 - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"爸媽辛苦了！再忙也要自己煮 醫：小心孩子鮮乳鈣質雙不足-文章\">爸媽辛苦了！再忙也要自己煮 醫：小心孩子鮮乳鈣質雙不足</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"512\" data-m='{\"i\":512,\"p\":509,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmsUp\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e8%bf%91%e7%99%be%e4%ba%ba%e7%91%9e%e8%a9%b2%e6%89%8b%e8%a1%93%e5%97%8e%ef%bc%9f%e5%be%ae%e5%89%b5%e6%89%8b%e8%a1%93%e5%8a%a999%e6%ad%b2%e5%ac%a4%e6%88%b0%e5%8b%9d%e9%ab%96%e9%83%a8%e9%aa%a8%e6%8a%98/ar-BBSmsUp?li=AA51Z6\"  >\n" +
"<img alt=\"到底面對長輩發生髖部骨折，該不該讓他們接受手術治療呢？\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmokH.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"到底面對長輩發生髖部骨折，該不該讓他們接受手術治療呢？ - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"近百人瑞該手術嗎？微創手術助99歲嬤戰勝髖部骨折-文章\">近百人瑞該手術嗎？微創手術助99歲嬤戰勝髖部骨折</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"513\" data-m='{\"i\":513,\"p\":504,\"n\":\"secondary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"514\" data-m='{\"i\":514,\"p\":513,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmBdM\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%b3%a8%e6%84%8f%ef%bc%81%e8%87%aa%e5%8a%a9%e9%a4%90%e9%80%992%e7%a8%ae%e9%9d%92%e8%8f%9c%e3%80%8c%e8%be%b2%e8%97%a5%e8%b6%85%e6%a8%99%e3%80%8d/ar-BBSmBdM?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmIiq.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"注意！自助餐這2種青菜「農藥超標」 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"注意！自助餐這2種青菜「農藥超標」-文章\">注意！自助餐這2種青菜「農藥超標」</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"515\" data-m='{\"i\":515,\"p\":504,\"n\":\"tertiary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"516\" data-m='{\"i\":516,\"p\":515,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmIup\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e3%80%90%e5%8d%b3%e6%99%82%e6%96%b0%e8%81%9e%e3%80%91%e6%97%a5%e6%9c%ac%e5%b0%8f%e7%94%b7%e7%94%9f%e9%ab%94%e5%9e%8b%e8%bc%83%e9%ab%98%ef%bc%8c%e5%b0%88%e5%ae%b6%e9%bb%9e%e5%87%ba%e9%80%99%e9%97%9c%e9%8d%b5/ar-BBSmIup?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmIuk.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=601&amp;y=191&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【即時新聞】日本小男生體型較高，專家點出這關鍵 - 由 Nong Nong Magazine Co., Ltd. 提供\" /> <div>\n" +
"<h3   aria-label=\"【即時新聞】日本小男生體型較高，專家點出這關鍵-文章\">【即時新聞】日本小男生體型較高，專家點出這關鍵</h3>\n" +
"\n" +
"<img alt=\"媽媽寶寶 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBmWMqY.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>媽媽寶寶</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"517\" data-m='{\"i\":517,\"p\":515,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmBmr\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e3%80%90%e7%84%a6%e9%bb%9e%e8%ad%b0%e9%a1%8c%e3%80%91%e4%b8%8d%e5%ad%95%e7%97%87%e6%b2%bb%e7%99%82%ef%bc%8c%e5%9c%93%e4%b8%80%e5%80%8b%e7%94%9f%e5%ad%a9%e5%ad%90%e7%9a%84%e5%a4%a2%ef%bc%81/ar-BBSmBmr?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmKA6.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【焦點議題】不孕症治療，圓一個生孩子的夢！ - 由 Nong Nong Magazine Co., Ltd. 提供\" /> <div>\n" +
"<h3   aria-label=\"【焦點議題】不孕症治療，圓一個生孩子的夢！-文章\">【焦點議題】不孕症治療，圓一個生孩子的夢！</h3>\n" +
"\n" +
"<img alt=\"媽媽寶寶 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBmWMqY.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>媽媽寶寶</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"518\" data-m='{\"i\":518,\"p\":515,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmloM\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e5%b0%8d%e6%8a%97%e8%85%a6%e9%83%a8%e8%80%81%e5%8c%96%e8%a6%81%e6%8a%97%e6%b0%a7%e5%8c%96%ef%bc%81%e7%a0%94%e7%a9%b6%e7%b6%ad%e7%94%9f%e7%b4%a0e%e8%83%bd%e5%bb%b6%e7%b7%a9%e9%98%bf%e8%8c%b2%e6%b5%b7%e9%bb%98%e7%97%87%e7%99%bc%e7%97%85/ar-BBSmloM?li=AA51Z6\"  >\n" +
"<img alt=\"對抗腦部老化要抗氧化！研究：維生素E能延緩阿茲海默症發病\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmeba.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"對抗腦部老化要抗氧化！研究：維生素E能延緩阿茲海默症發病 - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"對抗腦部老化要抗氧化！研究：維生素e能延緩阿茲海默症發病-文章\">對抗腦部老化要抗氧化！研究：維生素E能延緩阿茲海默症發病</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"519\" data-m='{\"i\":519,\"p\":504,\"n\":\"tertiary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"520\" data-m='{\"i\":520,\"p\":519,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmsUr\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e7%b6%93%e5%b8%b8%e9%a0%b8%e9%83%a8%e5%83%b5%e7%a1%ac%ef%bc%8c%e5%8f%af%e8%83%bd%e6%98%af%e8%84%8a%e6%a4%8e%e5%87%ba%e5%95%8f%e9%a1%8c%ef%bc%81%e5%81%9a%e9%80%992%e5%8b%95%e4%bd%9c%e8%87%aa%e6%88%91%e6%aa%a2%e6%9f%a5/ar-BBSmsUr?li=AA51Z6\"  >\n" +
"<img alt=\"經常頸部僵硬，可能是脊椎出問題！做這2動作自我檢查\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmzey.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"經常頸部僵硬，可能是脊椎出問題！做這2動作自我檢查 - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"經常頸部僵硬，可能是脊椎出問題！做這2動作自我檢查-文章\">經常頸部僵硬，可能是脊椎出問題！做這2動作自我檢查</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"521\" data-m='{\"i\":521,\"p\":519,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2w8\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e4%b8%80%e5%a4%a9%e5%86%b7%e5%b0%b1%e6%84%9f%e5%86%92%e3%80%81%e7%8b%82%e5%92%b3%e5%97%bd%ef%bc%9f%e4%b8%ad%e9%86%ab%e6%8f%ad%e8%ba%ab%e9%ab%94%e5%8f%af%e8%83%bd%e3%80%8c6%e5%80%8b%e9%83%a8%e4%bd%8d%e3%80%8d%e5%8f%97%e5%af%92/ar-BBSp2w8?li=AA51Z6\"  >\n" +
" <div>\n" +
"<h3   aria-label=\"一天冷就感冒、狂咳嗽？中醫揭身體可能「6個部位」受寒-文章\">一天冷就感冒、狂咳嗽？中醫揭身體可能「6個部位」受寒</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"522\" data-m='{\"i\":522,\"p\":519,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HN\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%89%be%e5%88%b0%e8%a1%b0%e8%80%81%e7%9a%84%e9%97%9c%e9%8d%b5%e4%ba%86%ef%bc%81%e8%a1%80%e6%b6%b2%e4%b8%ad%e3%80%8c%e9%80%99%e5%80%8b%e6%8c%87%e6%a8%99%e3%80%8d%e6%bf%83%e5%ba%a6%e9%80%8f%e9%9c%b2%e5%a4%b1%e8%83%bd%e6%a9%9f%e7%8e%87/ar-BBSp1HN?li=AA51Z6\"  >\n" +
" <div>\n" +
"<h3   aria-label=\"找到衰老的關鍵了！血液中「這個指標」濃度透露失能機率-文章\">找到衰老的關鍵了！血液中「這個指標」濃度透露失能機率</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"523\" data-m='{\"i\":523,\"p\":504,\"n\":\"secondary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"524\" data-m='{\"i\":524,\"p\":523,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmDrP\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e3%80%90%e5%8d%b3%e6%99%82%e6%96%b0%e8%81%9e%e3%80%91%e8%bc%b8%e5%8d%b5%e7%ae%a1%e9%98%bb%e5%a1%9e%e5%a5%b3%e6%80%a7%e5%b0%91%e5%90%83%e5%86%b0%e5%86%b7%ef%bc%8c%e5%bf%83%e6%83%85%e6%94%be%e9%ac%86%e6%9c%89%e5%8a%a9%e5%a5%bd%e5%ad%95/ar-BBSmDrP?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmP6G.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=551&amp;y=184&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【即時新聞】輸卵管阻塞女性少吃冰冷，心情放鬆有助好孕 - 由 Nong Nong Magazine Co., Ltd. 提供\" /> <div>\n" +
"<h3   aria-label=\"【即時新聞】輸卵管阻塞女性少吃冰冷，心情放鬆有助好孕-文章\">【即時新聞】輸卵管阻塞女性少吃冰冷，心情放鬆有助好孕</h3>\n" +
"\n" +
"<img alt=\"媽媽寶寶 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBmWMqY.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>媽媽寶寶</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"525\" data-m='{\"i\":525,\"p\":504,\"n\":\"tertiary\",\"y\":8,\"o\":7}'>\n" +
" <li  data-id=\"526\" data-m='{\"i\":526,\"p\":525,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSlWac\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e4%bb%8a%e4%bd%8e%e6%ba%ab%e4%b8%8b%e6%8e%a213%e2%84%83%ef%bc%81%e4%bd%a0%e7%9f%a5%e9%81%93%e6%97%a5%e9%9f%93%e5%81%8f%e5%a5%bd%e7%9a%84%e3%80%8c%e7%8e%89%e8%9c%80%e9%bb%8d%e5%bc%8f%e7%a9%bf%e6%b3%95%e3%80%8d%e5%97%8e%ef%bc%9f/ar-BBSlWac?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm1iE.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=245&amp;y=115&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"今低溫下探13℃！你知道日韓偏好的「玉蜀黍式穿法」嗎？ - 由 Common Wealth Magazine Group 提供\" /> <div>\n" +
"<h3   aria-label=\"冷氣團一波接一波！你知道日韓偏好的「玉蜀黍式穿法」嗎？-文章\">冷氣團一波接一波！你知道日韓偏好的「玉蜀黍式穿法」嗎？</h3>\n" +
"\n" +
"<img alt=\"康健雜誌 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>康健雜誌</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"527\" data-m='{\"i\":527,\"p\":525,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm2YZ\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e8%9c%82%e8%9c%9c%e6%aa%b8%e6%aa%ac%e8%bc%b8%e4%ba%86%ef%bc%81%e5%b7%a7%e5%85%8b%e5%8a%9b%e6%89%8d%e6%98%af%e6%ad%a2%e5%92%b3%e6%9c%80%e4%bd%b3%e8%a7%a3/ar-BBSm2YZ?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPGnXs.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=257&amp;y=116&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"「咳痰悶喘」逾2週　恐這致命病警訊 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"蜂蜜檸檬輸了！巧克力才是止咳最佳解-文章\">蜂蜜檸檬輸了！巧克力才是止咳最佳解</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"528\" data-m='{\"i\":528,\"p\":525,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSlWvf\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%97%a9%e9%a4%90%e4%b8%8d%e5%a4%a9%e7%84%b6%ef%bc%8c%e7%90%86%e6%89%80%e7%95%b6%e7%84%b6%ef%bc%9f/ar-BBSlWvf?li=AA51Z6\"  >\n" +
"<img alt=\"選購穀飲等相關產品時，學會看懂包裝上的成分標示，挑選擁有『雙潔淨標章驗證Clean Label』的產品，就是吃的安心的好方法。\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm4ph.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=315&amp;y=118&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"選購穀飲等相關產品時，學會看懂包裝上的成分標示，挑選擁有『雙潔淨標章驗證Clean Label』的產品，就是吃的安心的好方法。 - 由 PIN NETWORK CO LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"早餐不天然，理所當然？-文章\">早餐不天然，理所當然？</h3>\n" +
"\n" +
"<img alt=\"華人健康網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>華人健康網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"529\" data-m='{\"i\":529,\"p\":504,\"n\":\"secondary\",\"y\":8,\"o\":8}'>\n" +
" <li  data-id=\"530\" data-m='{\"i\":530,\"p\":529,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm67y\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e5%b0%8f%e8%85%b9%e7%98%a6%e4%b8%8d%e4%b8%8b%ef%bc%9f%e9%80%995%e7%a8%ae%e6%b0%b4%e6%9e%9c%e8%83%bd%e5%90%83%e5%9b%9e%e5%b0%8f%e8%a0%bb%e8%85%b0/ar-BBSm67y?li=AA51Z6\"  >\n" +
"<img alt=\"Blueberries in the hands of farmers, women&#39;s hands. Fruits, berries, food, natur...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmbg0.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=2615&amp;y=1376&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Blueberries in the hands of farmers, women&#39;s hands. Fruits, berries, food, natur... - Getty\" /> <div>\n" +
"<h3   aria-label=\"小腹瘦不下？這5種水果能吃回小蠻腰-文章\">小腹瘦不下？這5種水果能吃回小蠻腰</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"531\" data-m='{\"i\":531,\"p\":467,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"運動\"\n" +
"          data-positions=\".sports .stripecontent .tertiary:nth-of-type(1) li:nth-child(3)\" data-section-id=\"stripe.sports\"\n" +
"          data-section-id=\"stripe.sports\">\n" +
"        <div class=\"sports stripeouter\"  data-aop=\"stripe.sports_stripe\"  data-id=\"532\" data-m='{\"i\":532,\"p\":19,\"n\":\"stripe.sports\",\"t\":\"stripe\",\"o\":13}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"533\" data-m='{\"i\":533,\"p\":532,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.sports.navigation_stripenavigation\"  data-id=\"534\" data-m='{\"i\":534,\"p\":532,\"n\":\"stripe.sports.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"535\" data-m='{\"i\":535,\"p\":534,\"n\":\"sports\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/sports\"  data-id=\"536\" data-m='{\"i\":536,\"p\":534,\"n\":\"sports\",\"y\":4,\"o\":2}'>運動</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"537\" data-m='{\"i\":537,\"p\":534,\"n\":\"basketball_nba\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/sports/nba\">NBA</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"538\" data-m='{\"i\":538,\"p\":534,\"n\":\"baseball_mlb\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/sports/mlb\">MLB</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"539\" data-m='{\"i\":539,\"p\":534,\"n\":\"baseball_cpbl\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/sports/cpbl\">中華職棒</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"540\" data-m='{\"i\":540,\"p\":534,\"n\":\"baseball_npb\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/sports/npb\">日本職棒</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"541\" data-m='{\"i\":541,\"p\":534,\"n\":\"golf\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/sports/golf\">高爾夫球</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"542\" data-m='{\"i\":542,\"p\":534,\"n\":\"tennis\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/sports/tennis\">網球</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"543\" data-m='{\"i\":543,\"p\":534,\"n\":\"soccer\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/sports/soccer\">足球</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"544\" data-m='{\"i\":544,\"p\":534,\"n\":\"racing_form_one\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/sports/formula1\">F1</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"545\" data-m='{\"i\":545,\"p\":534,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"546\" data-m='{\"i\":546,\"p\":534,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"547\" data-m='{\"i\":547,\"p\":534,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"548\" data-m='{\"i\":548,\"p\":534,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"549\" data-m='{\"i\":549,\"p\":534,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.sports|stripe|stripe.sports.topStories.1|headlines\"  data-aop=\"top_stories_1\"  data-id=\"550\" data-m='{\"i\":550,\"p\":532,\"n\":\"stripe.sports.topStories.1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"551\" data-m='{\"i\":551,\"p\":550,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"552\" data-m='{\"i\":552,\"p\":551,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrrQ9\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball_nba\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e6%9e%97%e6%9b%b8%e8%b1%aa%e6%ba%96%e5%82%99%e5%be%a9%e5%87%ba-%e7%be%8e%e5%aa%92%e9%a0%90%e6%b8%ac%e4%b8%8b%e5%a0%b4%e5%85%88%e7%99%bc/ar-BBSrrQ9?li=BBqiVh0\"  >\n" +
"<img alt=\"16 PTS / 4 AST / 3 REB  on 50% shooting \n" +
"\n" +
"Jeremy Lin took over in the 4th quarte...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSnXKg.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=355&amp;y=140&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Jeremy Lin Full Highlights - Atlanta Hawks vs Washington Wizards - Click\" /> <div>\n" +
"<h3   aria-label=\"林書豪準備復出 美媒預測下場先發-文章\">林書豪準備復出 美媒預測下場先發</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.sports|stripe|stripe.sports.HD1|headlineLinkList\"   data-id=\"553\" data-m='{\"i\":553,\"p\":532,\"n\":\"stripe.sports.HD1\",\"t\":\"headlineLinkList\",\"o\":4}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"554\" data-m='{\"i\":554,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpvck\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball_nba\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e6%81%90%e6%b9%96%e7%97%87%ef%bc%9f%e5%a8%81%e5%b0%912%e6%88%b0%e7%8b%82%e6%89%9340%e9%90%b5/ar-BBSpvck?li=BBqiVh0\"   aria-label=\"恐湖症？威少2戰狂打40鐵-文章\">\n" +
"\n" +
"                    <h3>恐湖症？威少2戰狂打40鐵</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"555\" data-m='{\"i\":555,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrGwd\",\"h\":0,\"v\":\"sports\",\"c\":\"tennis\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/tennis/%e6%be%b3%e7%b6%b2%ef%bc%8f%e6%89%93%e5%88%b0%e5%b0%8d%e6%89%8b%e9%83%bd%e9%bc%93%e6%8e%8c-%e8%ac%9d%e6%b7%91%e8%96%87%e8%b4%8f%e5%be%97%e5%b0%8a%e9%87%8d/ar-BBSrGwd?li=BBqiVh0\"   aria-label=\"打到對手都鼓掌 謝淑薇贏得尊重-文章\">\n" +
"\n" +
"                    <h3>打到對手都鼓掌 謝淑薇贏得尊重</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"556\" data-m='{\"i\":556,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrExW\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/baseball/%e9%9f%93%e8%81%b7%ef%bc%8f%e5%85%8d%e7%95%b6%e5%85%b5%e5%be%88%e8%a3%9c-%e5%90%b3%e6%99%ba%e7%85%a5%e5%8a%a0%e8%96%aa%e7%ad%89fa/ar-BBSrExW?li=BBqiVh0\"   aria-label=\"免當兵很補 吳智煥加薪等fa-文章\">\n" +
"\n" +
"                    <h3>免當兵很補 吳智煥加薪等FA</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"557\" data-m='{\"i\":557,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpKPN\",\"h\":0,\"v\":\"sports\",\"c\":\"soccer\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/soccer/%e5%bd%b1%e3%80%8b%e7%94%b7%e8%b6%b3%e4%b8%ad%e5%a0%b4%e6%a0%b8%e5%bf%83-%e6%ba%ab%e6%99%ba%e8%b1%aa%e8%88%87%e5%8c%97%e6%8e%a7%e7%ba%8c%e7%b4%843%e5%b9%b4/ar-BBSpKPN?li=BBqiVh0\"   aria-label=\"影》男足中場核心 溫智豪與北控續約3年-文章\">\n" +
"\n" +
"                    <h3>影》男足中場核心 溫智豪與北控續約3年</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"558\" data-m='{\"i\":558,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpQLS\",\"h\":0,\"v\":\"sports\",\"c\":\"tennis\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/tennis/%e6%8a%80%e5%a3%93%e5%9c%b0%e4%b8%bb%e9%81%b8%e6%89%8b-nadal%e4%b8%80%e7%9b%a4%e6%9c%aa%e5%a4%b1%e9%97%96%e6%be%b3%e7%b6%b216%e5%bc%b7/ar-BBSpQLS?li=BBqiVh0\"   aria-label=\"技壓地主選手 nadal一盤未失闖澳網16強-文章\">\n" +
"\n" +
"                    <h3>技壓地主選手 Nadal一盤未失闖澳網16強</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"559\" data-m='{\"i\":559,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpx8F\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball_mlb\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/mlb/mlb%ef%bc%8f%e5%a4%a7%e8%b0%b7%e7%bf%94%e5%b9%b3%e6%9c%aa%e4%be%86-%e7%8e%8b%e8%b2%9e%e6%b2%bb%e6%9c%89%e5%bb%ba%e8%ad%b0/ar-BBSpx8F?li=BBqiVh0\"   aria-label=\"mlb／大谷翔平未來 王貞治有建議-文章\">\n" +
"\n" +
"                    <h3>MLB／大谷翔平未來 王貞治有建議</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"560\" data-m='{\"i\":560,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq6Xh\",\"h\":0,\"v\":\"sports\",\"c\":\"soccer\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/soccer/%e7%94%b7%e8%b6%b3%e3%80%8c%e8%8b%b1%e6%b4%be%e3%80%8d%e7%ba%8c%e9%9b%86-%e8%98%ad%e5%8d%a1%e6%96%af%e7%89%b9%e6%8e%a5%e6%8e%8c%e5%85%b5%e7%ac%a6/ar-BBSq6Xh?li=BBqiVh0\"   aria-label=\"男足「英派」續集 蘭卡斯特接掌兵符-文章\">\n" +
"\n" +
"                    <h3>男足「英派」續集 蘭卡斯特接掌兵符</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中時電子報 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"561\" data-m='{\"i\":561,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpPps\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/basketball/%e6%96%b0%e4%bb%bb%e5%a5%b6%e7%88%b8%e7%8e%8b%e7%9a%93%e5%90%89-%e9%a3%86%e7%94%9f%e6%b6%af%e6%96%b0%e9%ab%98%e9%80%80%e7%92%9e%e5%9c%92/ar-BBSpPps?li=BBqiVh0\"   aria-label=\"新任奶爸王皓吉 飆生涯新高退璞園-文章\">\n" +
"\n" +
"                    <h3>新任奶爸王皓吉 飆生涯新高退璞園</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.sports|stripe|stripe.sports.HD2|headlineLinkList\"   data-id=\"562\" data-m='{\"i\":562,\"p\":532,\"n\":\"stripe.sports.HD2\",\"t\":\"headlineLinkList\",\"o\":5}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"563\" data-m='{\"i\":563,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpyEN\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball_mlb\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/mlb/mlb%ef%bc%8f%e9%99%b3%e5%81%89%e6%ae%b7%e5%b8%b6%e6%b5%81%e6%b5%aa%e7%8a%ac%e9%a3%9b%e7%be%8e%e5%9c%8b/ar-BBSpyEN?li=BBqiVh0\"   aria-label=\"mlb／陳偉殷帶流浪犬飛美國-文章\">\n" +
"\n" +
"                    <h3>MLB／陳偉殷帶流浪犬飛美國</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"564\" data-m='{\"i\":564,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpUph\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/baseball/%e5%b4%87%e8%b6%8a%e5%86%8d%e8%a6%8b%e4%bf%9d%e9%80%81-%e5%90%88%e5%ba%ab2%e9%80%a3%e9%9c%b8%e5%8f%aa%e5%b7%ae%e4%b8%80%e6%ad%a5/ar-BBSpUph?li=BBqiVh0\"   aria-label=\"崇越再見保送 合庫2連霸只差一步-文章\">\n" +
"\n" +
"                    <h3>崇越再見保送 合庫2連霸只差一步</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"565\" data-m='{\"i\":565,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrEnr\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball_nba\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e9%81%8b%e7%90%83%e5%83%8f%e5%9c%a8%e8%b7%b3%e8%88%9e-%e5%8e%84%e6%96%87%e6%88%b2%e8%80%8d%e5%b0%8d%e6%89%8b/ar-BBSrEnr?li=BBqiVh0\"   aria-label=\"nba／運球像在跳舞 厄文戲耍對手-文章\">\n" +
"\n" +
"                    <h3>NBA／運球像在跳舞 厄文戲耍對手</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"566\" data-m='{\"i\":566,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpZm3\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/basketball/%e4%bd%90%e8%97%8d%e8%9e%8d%e5%85%a5%e9%87%91%e9%85%92%e4%bd%b3-%e9%81%94%e6%ac%a32%e9%80%a3%e6%88%b0%e7%8f%be%e7%96%b2%e6%85%8b/ar-BBSpZm3?li=BBqiVh0\"   aria-label=\"佐藍融入金酒佳 達欣2連戰現疲態-文章\">\n" +
"\n" +
"                    <h3>佐藍融入金酒佳 達欣2連戰現疲態</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"567\" data-m='{\"i\":567,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp9GE\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/nba%ef%bc%8f%e5%8e%84%e6%96%87%e8%87%b4%e9%9b%bb%e8%a9%b9%e7%9a%87%e9%81%93%e6%ad%89-%e8%83%8c%e5%be%8c%e5%85%a7%e5%b9%95/ar-BBSp9GE?li=BBqiVh0\"   aria-label=\"厄文致電詹皇道歉 背後內幕-文章\">\n" +
"\n" +
"                    <h3>厄文致電詹皇道歉 背後內幕</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"568\" data-m='{\"i\":568,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpj1h\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/%e6%be%b3%e7%b6%b2%e5%a5%b3%e9%9b%99%e5%83%85%e8%8a%b165%e5%88%86%e9%90%98-%e8%a9%b9%e8%a9%a0%e7%84%b6%e8%a9%b9%e7%9a%93%e6%99%b4%e6%8c%ba%e9%80%b2%e7%ac%ac3%e8%bc%aa/ar-BBSpj1h?li=BBqiVh0\"   aria-label=\"澳網女雙僅花65分鐘 詹詠然詹皓晴挺進第3輪-文章\">\n" +
"\n" +
"                    <h3>澳網女雙僅花65分鐘 詹詠然詹皓晴挺進第3輪</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5Iv9i.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"569\" data-m='{\"i\":569,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGWC\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/%e7%be%bd%e7%90%83%ef%bc%8f%e6%88%b4%e8%b3%87%e7%a9%8e%e8%b2%bc%e5%bf%83%e5%b0%8f%e5%8b%95%e4%bd%9c-%e7%b6%b2%e5%8f%8b%e7%8b%82%e8%ae%9a%ef%bc%81/ar-BBSoGWC?li=BBqiVh0\"   aria-label=\"戴資穎貼心小動作 網友狂讚！-文章\">\n" +
"\n" +
"                    <h3>戴資穎貼心小動作 網友狂讚！</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"570\" data-m='{\"i\":570,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphgn\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/%e6%9a%b4%e9%be%8dsiakam%e6%9c%80%e5%be%8c%e4%b8%80%e6%93%8a%e7%b5%95%e6%ae%ba-%e5%b0%8d%e6%89%8b%e4%b9%9f%e6%84%8f%e5%a4%96/ar-BBSphgn?li=BBqiVh0\"   aria-label=\"暴龍siakam最後一擊絕殺 對手也意外-文章\">\n" +
"\n" +
"                    <h3>暴龍Siakam最後一擊絕殺 對手也意外</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.sports|stripe|stripe.sports.topStories.0|headlines\"  data-aop=\"top stories0\"  data-id=\"571\" data-m='{\"i\":571,\"p\":532,\"n\":\"stripe.sports.topStories.0\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"572\" data-m='{\"i\":572,\"p\":571,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"573\" data-m='{\"i\":573,\"p\":572,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpd87\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/sports/sports-index/nba%ef%bc%8f%e5%8f%af%e6%84%9b%e8%bc%aa%e4%bc%91-%e4%bb%96%e6%8a%95%e9%80%b2%e8%87%b4%e5%8b%9d%e5%a3%93%e5%93%a8%e7%90%83/ar-BBSpd87?li=BBqiVh0\"  >\n" +
"<img alt=\"▲暴龍新秀席亞康（Pascal Siakam）投進致勝壓哨上籃絕殺太陽。（圖／翻攝自推特）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpd86.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=175&amp;y=105&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"▲暴龍新秀席亞康（Pascal Siakam）投進致勝壓哨上籃絕殺太陽。（圖／翻攝自推特） - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"可愛輪休 他投進致勝壓哨球-文章\">可愛輪休 他投進致勝壓哨球</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"574\" data-m='{\"i\":574,\"p\":572,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp0ln\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball_mlb\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/sports/mlb/mlb%ef%bc%8f%e6%9b%be%e8%aa%87%e5%8f%a3%e8%83%bd%e4%b8%89%e6%8c%af%e8%b2%9d%e6%af%94%e9%ad%af%e6%96%af-%e5%a6%82%e4%bb%8a%e4%bb%96%e8%a2%ab%e6%b4%8b%e5%9f%ba%e9%87%8d%e9%87%91%e7%b0%bd%e4%b8%8b/ar-BBSp0ln?li=BBqiVh0\"  >\n" +
"<img alt=\"Adam Ottavino轉隊至洋基（圖／美聯社／達志影像）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoYgn.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=651&amp;y=150&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Adam Ottavino轉隊至洋基（圖／美聯社／達志影像） - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"曾誇口能三振貝比魯斯 如今他被洋基重金簽下-文章\">曾誇口能三振貝比魯斯 如今他被洋基重金簽下</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"575\" data-m='{\"i\":575,\"p\":572,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZIX\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball_nba\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e4%b9%9f%e5%a4%aa%e5%a4%a9%ef%bc%81-%e4%bb%96%e4%b8%8a%e5%a0%b4%e5%bf%98%e8%a8%98%e7%a9%bf%e7%90%83%e8%a4%b2/ar-BBSoZIX?li=BBqiVh0\"  >\n" +
"<img alt=\"▲湖人隊畢斯利（Michael Beasley）準備替補上場發現自己忘記穿球褲。（圖／翻攝自House of Highlights）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoXaO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=226&amp;y=86&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"▲湖人隊畢斯利（Michael Beasley）準備替補上場發現自己忘記穿球褲。（圖／翻攝自House of Highlights） - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"也太天！他上場竟忘記穿球褲 被全程現場live直播-文章\">也太天！他上場竟忘記穿球褲 被全程現場Live直播</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"576\" data-m='{\"i\":576,\"p\":532,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"汽車\"\n" +
"          data-positions=\".autos .stripecontent .tertiary li:nth-child(3)\" data-section-id=\"stripe.autos\"\n" +
"          data-section-id=\"stripe.autos\">\n" +
"        <div class=\"autos stripeouter\"  data-aop=\"stripe.autos_stripe\"  data-id=\"577\" data-m='{\"i\":577,\"p\":19,\"n\":\"stripe.autos\",\"t\":\"stripe\",\"o\":14}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"578\" data-m='{\"i\":578,\"p\":577,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.autos.navigation_stripenavigation\"  data-id=\"579\" data-m='{\"i\":579,\"p\":577,\"n\":\"stripe.autos.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"580\" data-m='{\"i\":580,\"p\":579,\"n\":\"autos\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/autos\"  data-id=\"581\" data-m='{\"i\":581,\"p\":579,\"n\":\"autos\",\"y\":4,\"o\":2}'>汽車</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"582\" data-m='{\"i\":582,\"p\":579,\"n\":\"autosnews\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/autos/news\">新聞總覽</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"583\" data-m='{\"i\":583,\"p\":579,\"n\":\"autosBuying\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/autos/buying\">購車情報</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"584\" data-m='{\"i\":584,\"p\":579,\"n\":\"autosEnthusiasts\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/autos/enthusiasts\">升級改裝</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"585\" data-m='{\"i\":585,\"p\":579,\"n\":\"autosracing\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/autos/racing\">賽車動態</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"586\" data-m='{\"i\":586,\"p\":579,\"n\":\"gallery\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/autos/gallery\">精彩圖輯</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"587\" data-m='{\"i\":587,\"p\":579,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":8}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"588\" data-m='{\"i\":588,\"p\":579,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":9}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"589\" data-m='{\"i\":589,\"p\":579,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":10}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"590\" data-m='{\"i\":590,\"p\":579,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":11}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"591\" data-m='{\"i\":591,\"p\":579,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":12}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.autos|stripe|stripe.autos.topstories1|headlines\"  data-aop=\"auto.topstories1\"  data-id=\"592\" data-m='{\"i\":592,\"p\":577,\"n\":\"stripe.autos.topstories1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"593\" data-m='{\"i\":593,\"p\":592,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"594\" data-m='{\"i\":594,\"p\":593,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoKbz\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%be%b7%e7%b3%bb%e4%b8%ad%e5%9e%8b%e6%88%bf%e8%bb%8a%e4%b9%8b%e6%88%b0-3%e6%9c%89%e6%84%9f%e6%94%b9%e6%ac%be-bmw%e5%85%a8%e6%96%b03%e7%b3%bb%e5%88%97%e5%b9%b4%e5%be%8c%e4%b8%8a%e5%b8%82%e3%80%90%e5%a3%b9%e7%89%b9%e5%a0%b1%e3%80%91/ar-BBSoKbz?li=AAivr37\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZpW.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=355&amp;y=313&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"〈德系中型房車之戰-3〉有感改款 BMW全新3系列年後上市【壹特報】 - 由 Next Media Publishing Limited 提供\" /> <div>\n" +
"<h3   aria-label=\"有感改款 bmw全新3系列年後上市-文章\">有感改款 BMW全新3系列年後上市</h3>\n" +
"\n" +
"<img alt=\"壹週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>壹週刊</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"newlist stripeheadlinelinklist\"  data-module-id=\"startpage|stripe.autos|stripe|stripe.autos.HD1|headlineLinkList\"   data-id=\"595\" data-m='{\"i\":595,\"p\":577,\"n\":\"stripe.autos.HD1\",\"t\":\"headlineLinkList\",\"o\":4}'   \n" +
"  >\n" +
" \n" +
" \n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"596\" data-m='{\"i\":596,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2Gf\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e5%9b%9b%e7%92%b0%e6%97%97%e8%89%a6%e9%81%8b%e5%8b%95%e4%bc%91%e6%97%85%ef%bc%8caudi-q8%e5%af%a6%e8%bb%8a%e8%b3%9e%e6%9e%90/ar-BBSp2Gf?li=AAivr37\"   aria-label=\"2019新加坡車展：四環旗艦運動休旅，audi q8實車賞析-文章\">\n" +
"\n" +
"                    <h3>2019新加坡車展：四環旗艦運動休旅，Audi Q8實車賞析</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"597\" data-m='{\"i\":597,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1Lg\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e5%be%b7%e7%b3%bb%e4%b8%ad%e5%9e%8b%e6%88%bf%e8%bb%8a%e5%a4%a7%e6%88%b0-1%e5%8b%95%e5%8a%9b%e9%80%b2%e5%8c%96-mbenz-c-200%e5%b0%8f%e6%94%b9%e6%ac%be%e8%a9%a6%e9%a7%95%e3%80%90%e5%a3%b9%e7%89%b9%e5%a0%b1%e3%80%91/ar-BBSp1Lg?li=AAivr37\"   aria-label=\"動力進化 m.benz c 200小改款試駕-文章\">\n" +
"\n" +
"                    <h3>動力進化 M.Benz C 200小改款試駕</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"壹週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"598\" data-m='{\"i\":598,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1Ld\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e5%be%b7%e7%b3%bb%e4%b8%ad%e5%9e%8b%e6%88%bf%e8%bb%8a%e4%b9%8b%e6%88%b0-2%e6%ac%b2%e5%bc%b7%e5%89%87%e5%bc%b7-bmw%e8%88%87audi%e5%85%a8%e5%8a%9b%e4%bf%83%e9%8a%b7%e5%8f%8d%e6%93%8a%e3%80%90%e5%a3%b9%e7%89%b9%e5%a0%b1%e3%80%91/ar-BBSp1Ld?li=AAivr37\"   aria-label=\"遇強則強！bmw與audi全力促銷反擊-文章\">\n" +
"\n" +
"                    <h3>遇強則強！BMW與Audi全力促銷反擊</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"壹週刊 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"599\" data-m='{\"i\":599,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmXKh\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e4%ba%a4%e9%80%9a%e9%83%a8%e7%99%bc479%e8%90%ac%e7%b4%85%e5%8c%85-%e6%a9%9f%e8%bb%8aabs%e8%a3%9c%e5%8a%a9%e6%ac%be%e6%8f%90%e6%97%a9%e7%99%bc%e6%94%be/ar-BBSmXKh?li=AAivr37\"   aria-label=\"交通部發479萬紅包 機車abs補助款提早發放-文章\">\n" +
"\n" +
"                    <h3>交通部發479萬紅包 機車ABS補助款提早發放</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"600\" data-m='{\"i\":600,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp05S\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e5%8c%97%e7%be%8e%e8%bb%8a%e5%b1%95%e8%b3%bd%e8%bb%8a%e6%96%b0%e5%8b%a2%e5%8a%9b%ef%bc%81hyundai-veloster-n-tcr%e6%ad%a3%e5%bc%8f%e4%ba%ae%e7%9b%b8/ar-BBSp05S?li=AAivr37\"   aria-label=\"2019北美車展：賽車新勢力！hyundai veloster n tcr正式亮相-文章\">\n" +
"\n" +
"                    <h3>2019北美車展：賽車新勢力！Hyundai Veloster N TCR正式亮相</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"601\" data-m='{\"i\":601,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmJJN\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e5%8c%97%e7%be%8e%e8%bb%8a%e5%b1%95n-line%e8%bb%8a%e5%9e%8b%e9%a6%96%e5%ba%a6%e8%b8%8f%e4%b8%8a%e7%be%8e%e5%9c%8b%ef%bc%8chyundai%e7%99%bc%e8%a1%a8elantra-gt-n-line/ar-BBSmJJN?li=AAivr37\"   aria-label=\"2019北美車展：n line車型首度踏上美國，hyundai發表elantra gt n line-文章\">\n" +
"\n" +
"                    <h3>2019北美車展：N Line車型首度踏上美國，Hyundai發表Elantra GT N Line</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"602\" data-m='{\"i\":602,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmIpL\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e9%9b%bb%e8%bb%8a%e9%ad%85%e5%8a%9b%e5%a4%af-300%e5%a4%9a%e4%ba%ba%e6%90%b6%e8%b3%bcporsche%e7%b4%94%e9%9b%bb%e8%b7%91%e8%bb%8a/ar-BBSmIpL?li=AAivr37\"   aria-label=\"純電跑車夯！porsche taycan 台灣訂單破三百張-文章\">\n" +
"\n" +
"                    <h3>純電跑車夯！Porsche Taycan 台灣訂單破三百張</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"603\" data-m='{\"i\":603,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmjln\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e5%80%bc%e5%be%97%e7%ad%89%e5%be%85%e7%9a%84%e7%91%9e%e5%85%b8%e4%bf%8a%e4%bf%8f%e8%b7%91%e6%88%bf%e8%bb%8a%ef%bc%8cvolvo-%e7%ac%ac%e4%b8%89%e4%bb%a3-s60-t5-%e4%ba%9e%e5%a4%aa%e5%8d%80%e5%9f%9f%e9%a6%96%e5%ba%a6%e4%ba%ae%e7%9b%b8/ar-BBSmjln?li=AAivr37\"   aria-label=\"2019新加坡車展：值得等待的瑞典俊俏跑房車，volvo 第三代 s60 t5 亞太區域首度亮相-文章\">\n" +
"\n" +
"                    <h3>2019新加坡車展：值得等待的瑞典俊俏跑房車，Volvo 第三代 S60 T5 亞太區域首度亮相</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.autos|stripe|stripe.autos.topstories3|headlines\"  data-aop=\"auto.topstories3\"  data-id=\"604\" data-m='{\"i\":604,\"p\":577,\"n\":\"stripe.autos.topstories3\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"605\" data-m='{\"i\":605,\"p\":604,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"606\" data-m='{\"i\":606,\"p\":605,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmJIZ\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e7%ac%ac%e5%9b%9b%e4%b8%96%e4%bb%a3-mazda3-sedan-%e4%ba%9e%e5%a4%aa%e5%8d%80%e5%9f%9f%e6%90%b6%e5%85%88%e6%9b%9d%e5%85%89%ef%bc%81/ar-BBSmJIZ?li=AAivr37\"  >\n" +
"<img alt=\"2019-mazda3-sedan\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJIb.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"IMG_2534.JPG - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"2019新加坡車展：mazda 3 sedan 搶先曝光！-文章\">2019新加坡車展：Mazda 3 Sedan 搶先曝光！</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"607\" data-m='{\"i\":607,\"p\":605,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnhXv\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e4%bd%a0%e4%bf%a1%e4%b8%8d%e4%bf%a1%e6%88%91%e6%89%93%e4%bd%a0%ef%bc%9f%e6%83%a1%e9%84%b0%e6%9a%b4%e5%8a%9b%e5%81%9c%e8%bb%8a%e9%9a%aa%e6%8f%8d%e4%ba%ba/ar-BBSnhXv?li=AAivr37\"  >\n" +
"<img alt=\"中市停車利多 8/1起住宅區週日不收費\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBL8syq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"中市停車利多 8/1起住宅區週日不收費 - 中央社\" /> <div>\n" +
"<h3   aria-label=\"你信不信我打你？惡鄰暴力停車險揍人-文章\">你信不信我打你？惡鄰暴力停車險揍人</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"608\" data-m='{\"i\":608,\"p\":605,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmjmv\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e6%9b%b4%e5%b9%b4%e8%bc%95%e5%a4%a7%e6%b0%a3%e7%9a%84%e4%b8%89%e6%8e%92%e4%b8%83%e4%ba%ba%e5%ba%a7suv%ef%bc%8chyundai-%e7%ac%ac%e5%9b%9b%e4%bb%a3-santa-fe-%e5%af%a6%e8%bb%8a%e8%b3%9e%e6%9e%90/ar-BBSmjmv?li=AAivr37\"  >\n" +
"<img alt=\"2019-suv-hyundai-santa-fe\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmqcu.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2019-suv-hyundai-santa-fe - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"2019新加坡車展：更年輕大氣的三排七人座suv，hyundai 第四代 santa fe 實車賞析-文章\">2019新加坡車展：更年輕大氣的三排七人座SUV，Hyundai 第四代 Santa Fe 實車賞析</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|stripe.autos|stripe|stripe.autos.topstories4|headlines\"  data-aop=\"auto.topstories4\"  data-id=\"609\" data-m='{\"i\":609,\"p\":577,\"n\":\"stripe.autos.topstories4\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"610\" data-m='{\"i\":610,\"p\":609,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"611\" data-m='{\"i\":611,\"p\":610,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSn1K6\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e9%80%b2%e9%9b%aa%e9%9a%a7%e6%b2%92%e4%bf%9d%e9%a4%8a%e5%b0%8f%e5%bf%83%e5%82%b7%e8%8d%b7%e5%8c%85-%e5%b0%8f%e5%ae%a2%e8%bb%8a%e6%8b%96%e6%95%91%e8%b2%bb3%e6%9c%88%e8%b5%b73%e5%8d%83%e8%b5%b7%e8%b7%b3/ar-BBSn1K6?li=AAivr37\"  >\n" +
"<img alt=\"圖2.108年1月8日08時41分國5北向15.6K自小客車火燒車，回堵4.5公里\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmX4z.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"圖2.108年1月8日08時41分國5北向15.6K自小客車火燒車，回堵4.5公里 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"進雪隧沒保養小心傷荷包 小客車拖救費3月起3千起跳-文章\">進雪隧沒保養小心傷荷包 小客車拖救費3月起3千起跳</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"612\" data-m='{\"i\":612,\"p\":610,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSofkI\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e7%9c%8b%e4%ba%86%e6%9c%83%e7%86%b1%e8%a1%80%e7%9a%84leaf-nismo-rc326hp%e7%9a%84%e7%99%be%e9%87%8c%e5%8a%a0%e9%80%9f%e5%8f%aa%e8%a6%8134%e7%a7%92/ar-BBSofkI?li=AAivr37\"  >\n" +
"<img alt=\"看了會熱血的Leaf Nismo RC326hp的百里加速只要3.4秒....\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSo8qX.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"看了會熱血的Leaf Nismo RC326hp的百里加速只要3.4秒.... - 由 PROTO Taiwan Co. Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"看了會熱血的leaf nismo rc326hp的百里加速只要3.4秒....-文章\">看了會熱血的Leaf Nismo RC326hp的百里加速只要3.4秒....</h3>\n" +
"\n" +
"<img alt=\"車訊網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBeTHK.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>車訊網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"613\" data-m='{\"i\":613,\"p\":610,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmJIf\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/vision-x-%e5%be%9e%e6%a6%82%e5%bf%b5%e5%8c%96%e4%bd%9c%e9%87%8f%e7%94%a2%ef%bc%8cskoda-%e6%97%97%e4%b8%8b%e6%9c%80%e5%85%a5%e9%96%80-suv-%e5%8d%b3%e5%b0%87%e6%96%bc-2019-%e6%97%a5%e5%85%a7%e7%93%a6%e8%bb%8a%e5%b1%95%e5%89%8d%e5%a4%95%e5%95%8f%e4%b8%96%ef%bc%81/ar-BBSmJIf?li=AAivr37\"  >\n" +
"<img alt=\"vision-x-skoda-suv-2019\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJHp.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"vision-x-skoda-suv-2019 - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"vision x 從概念化作量產，skoda 旗下最入門 suv 即將於 2019 日內瓦車展前夕問世！-文章\">Vision X 從概念化作量產，Skoda 旗下最入門 SUV 即將於 2019 日內瓦車展前夕問世！</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"614\" data-m='{\"i\":614,\"p\":609,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"615\" data-m='{\"i\":615,\"p\":614,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSlU6B\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e6%9c%80%e7%90%86%e6%80%a7%e7%9a%84%e4%ba%ab%e5%8f%97-lexus-ux-250h/ar-BBSlU6B?li=AAivr37\"  >\n" +
"<img alt=\"最理性的享受 Lexus UX 250h\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmeI0.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"最理性的享受 Lexus UX 250h - 由 isCar! 提供\" /> <div>\n" +
"<h3   aria-label=\"最理性的享受 lexus ux 250h-文章\">最理性的享受 Lexus UX 250h</h3>\n" +
"\n" +
"<img alt=\"isCar! 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/CCelz1.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>isCar!</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"616\" data-m='{\"i\":616,\"p\":614,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmCxf\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%85%a8%e6%96%b0mazda3%e5%90%8c%e7%b4%9a%e4%b9%8b%e6%9c%80%ef%bc%8c%e6%8e%a1%e7%94%a8%e5%85%a8%e7%90%83%e9%a6%96%e5%89%b51310-mpa%e9%ab%98%e5%bc%b7%e5%ba%a6%e9%8b%bc%e6%9d%90%e5%86%b7%e6%b2%96%e5%a3%93%e8%bb%8a%e8%ba%ab%e7%b5%90%e6%a7%8b/ar-BBSmCxf?li=AAivr37\"  >\n" +
"<img alt=\"mazda3-1-310-mpa\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmjkr.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"mazda3-1-310-mpa - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"全新mazda3同級之最，採用全球首創1,310 mpa高強度鋼材冷沖壓車身結構-文章\">全新Mazda3同級之最，採用全球首創1,310 MPa高強度鋼材冷沖壓車身結構</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"617\" data-m='{\"i\":617,\"p\":614,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmP64\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%a4%96%e8%a7%80%e5%85%a7%e8%a3%9d%e5%be%ae%e6%95%b4%e5%bd%a2%e3%80%81%e6%8f%90%e5%8d%87%e6%b2%b9%e8%80%97%e8%87%b3-224-km-l%ef%bc%8chyundai-ioniq-hybrid-plug-in-hybrid-%e5%b0%8f%e6%94%b9%e6%ac%be%e9%9f%93%e5%9c%8b%e7%99%bc%e5%94%ae/ar-BBSmP64?li=AAivr37\"  >\n" +
"<img alt=\"22-4-km-l-hyundai-ioniq-hybrid-plug-in-hybrid\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmFXc.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"22-4-km-l-hyundai-ioniq-hybrid-plug-in-hybrid - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"外觀內裝微整形、提升油耗至 22.4 km/l，hyundai ioniq hybrid/plug-in hybrid 小改款韓國發售-文章\">外觀內裝微整形、提升油耗至 22.4 km/l，Hyundai IONIQ Hybrid/Plug-In Hybrid 小改款韓國發售</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"618\" data-m='{\"i\":618,\"p\":609,\"n\":\"secondary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"619\" data-m='{\"i\":619,\"p\":618,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjhuv\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e7%a6%8f%e6%96%af%e9%9b%bb%e5%8b%95%e8%bb%8a%e8%a6%81%e4%be%86%e4%ba%86%e5%97%8e-%e9%a6%96%e6%ac%be%e7%a7%bb%e5%8b%95%e5%bc%8f%e5%bf%ab%e9%80%9f%e6%a6%82%e5%bf%b5%e5%85%85%e9%9b%bb%e7%ab%99%e7%8f%be%e8%ba%ab/ar-BBSjhuv?li=AAivr37\"  >\n" +
"<img alt=\"福斯電動車要來了嗎　首款移動式快速概念充電站現身\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjvaD.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=2136&amp;y=1947&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"福斯電動車要來了嗎 首款移動式快速概念充電站現身 - 由 NOWnews Network Co.,Ltd 提供\" /> <div>\n" +
"<h3   aria-label=\"福斯電動車要來了？首款快速概念充電站現身-文章\">福斯電動車要來了？首款快速概念充電站現身</h3>\n" +
"\n" +
"<img alt=\"NOWnews 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"620\" data-m='{\"i\":620,\"p\":609,\"n\":\"tertiary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"621\" data-m='{\"i\":621,\"p\":620,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmHGx\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e7%82%ba%e5%a4%a9%e7%a9%ba%e7%84%a1%e9%99%90%e8%80%8c%e5%a5%94%ef%bc%81mclaren-600lt-spider%e6%ad%a3%e5%bc%8f%e4%ba%ae%e7%9b%b8-%e5%85%a7%e6%9c%89%e5%bd%b1%e7%89%87/ar-BBSmHGx?li=AAivr37\"  >\n" +
"<img alt=\"mclaren-600lt-spider\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmjkt.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"mclaren-600lt-spider - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"為天空無限而奔！mclaren 600lt spider正式亮相(內有影片)-文章\">為天空無限而奔！McLaren 600LT Spider正式亮相(內有影片)</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"622\" data-m='{\"i\":622,\"p\":620,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmZWL\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/porsche-top5%e7%b3%bb%e5%88%97%e6%9c%80%e6%96%b0%e5%bd%b1%e7%89%87%e6%8f%ad%e7%a4%ba919-hybrid-evo%e7%9a%84%e4%ba%94%e9%a0%85%e5%bc%b7%e8%99%95/ar-BBSmZWL?li=AAivr37\"  >\n" +
"<img alt=\"porsche-top5-919-hybrid-evo\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmQR2.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"porsche-top5-919-hybrid-evo - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"porsche top5系列最新影片揭示919 hybrid evo的五項強處-文章\">Porsche Top5系列最新影片揭示919 Hybrid EVO的五項強處</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"623\" data-m='{\"i\":623,\"p\":620,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmqdy\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/mini-60%e5%91%a8%e5%b9%b4%e7%b4%80%e5%bf%b5%e7%89%88%e9%9a%86%e9%87%8d%e6%8e%a8%e5%87%ba%ef%bc%81-%e5%85%a7%e6%9c%89%e5%bd%b1%e7%89%87/ar-BBSmqdy?li=AAivr37\"  >\n" +
"<img alt=\"mini-60\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJHu.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"mini-60 - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"mini 60周年紀念版隆重推出！(內有影片)-文章\">MINI 60周年紀念版隆重推出！(內有影片)</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"624\" data-m='{\"i\":624,\"p\":609,\"n\":\"tertiary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"625\" data-m='{\"i\":625,\"p\":624,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmJHO\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%8e%9f%e5%bb%a0%e5%87%ba%e5%93%81%e6%9c%80%e5%bc%b7golf-gti%ef%bc%81volkswagen-golf-gti-tcr%e9%87%8f%e7%94%a2%e7%89%88%e6%ad%a3%e5%bc%8f%e4%ba%ae%e7%9b%b8/ar-BBSmJHO?li=AAivr37\"  >\n" +
"<img alt=\"golf-gti-volkswagen-golf-gti-tcr\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJHn.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"golf-gti-volkswagen-golf-gti-tcr - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"原廠出品最強golf gti！volkswagen golf gti tcr量產版正式亮相-文章\">原廠出品最強Golf GTI！Volkswagen Golf GTI TCR量產版正式亮相</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"626\" data-m='{\"i\":626,\"p\":624,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSlVdb\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/3%e5%80%8b%e7%8d%8e%e9%a0%85%e5%9b%8a%e6%8b%ac2%e5%80%8b%e5%86%a0%e8%bb%8d%ef%bc%81hyundai%e6%88%90%e7%82%ba2019%e5%8c%97%e7%be%8e%e5%b9%b4%e5%ba%a6%e9%a2%a8%e9%9b%b2%e8%bb%8a%e6%9c%80%e5%a4%a7%e8%b4%8f%e5%ae%b6/ar-BBSlVdb?li=AAivr37\"  >\n" +
"<img alt=\"3-2-hyundai-2019\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSlVd8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=440&amp;y=628&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2.jpg - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"囊括2冠！hyundai 成為2019年度風雲車最大贏家-文章\">囊括2冠！Hyundai 成為2019年度風雲車最大贏家</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"627\" data-m='{\"i\":627,\"p\":624,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmgYW\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/2019-vw-tiguan-offroad%e7%89%b9%e5%bc%8f%e7%89%88%e5%a4%96%e8%a7%80%e5%88%86%e6%9e%90%e7%af%87/ar-BBSmgYW?li=AAivr37\"  >\n" +
"<img alt=\"2019-vw-tiguan-offroad\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmg0M.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2019-vw-tiguan-offroad - 由 Carstuff Auto-media LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"2019 vw tiguan offroad特式版外觀分析篇-文章\">2019 VW Tiguan Offroad特式版外觀分析篇</h3>\n" +
"\n" +
"<img alt=\"人車事 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>人車事</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"628\" data-m='{\"i\":628,\"p\":609,\"n\":\"secondary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"629\" data-m='{\"i\":629,\"p\":628,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjR6m\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e7%99%bd%e7%89%8c%e9%87%8d%e6%a9%9f%e9%97%96%e5%9c%8b%e9%81%93-%e8%b3%93%e5%a3%ab%e9%9c%b8%e6%b0%a3%e6%94%94%e8%bb%8a%e6%8b%94%e9%91%b0%e5%8c%99/ar-BBSjR6m?li=AAivr37\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjR6d.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"白牌重機闖國道 賓士霸氣攔車拔鑰匙 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"白牌重機闖國道 賓士霸氣攔車拔鑰匙-文章\">白牌重機闖國道 賓士霸氣攔車拔鑰匙</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"630\" data-m='{\"i\":630,\"p\":609,\"n\":\"secondary\",\"y\":8,\"o\":7}'>\n" +
" <li  data-id=\"631\" data-m='{\"i\":631,\"p\":630,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjIcg\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%a4%a7%e8%bb%8a%e6%ad%bb%e8%a7%92%e6%9c%89%e5%a4%9a%e5%a4%a7%ef%bc%9f-%e5%af%a6%e6%b8%ac%e5%bd%b1%e7%89%87%e8%ae%93%e4%bd%a0%e7%9f%a5/ar-BBSjIcg?li=AAivr37\"  >\n" +
"<img alt=\"▲大車視野死角（圖／翻攝Youtube）\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjG5z.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"▲大車視野死角（圖／翻攝Youtube） - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"大車死角有多大？實測影片讓你知-文章\">大車死角有多大？實測影片讓你知</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"632\" data-m='{\"i\":632,\"p\":577,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"影音\"\n" +
"          data-section-id=\"stripe.video\"\n" +
"          data-section-id=\"stripe.video\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.video_stripe\"  data-id=\"633\" data-m='{\"i\":633,\"p\":19,\"n\":\"stripe.video\",\"t\":\"stripe\",\"o\":15}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"634\" data-m='{\"i\":634,\"p\":633,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.video.navigation_stripenavigation\"  data-id=\"635\" data-m='{\"i\":635,\"p\":633,\"n\":\"stripe.video.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"636\" data-m='{\"i\":636,\"p\":635,\"n\":\"video\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/video\"  data-id=\"637\" data-m='{\"i\":637,\"p\":635,\"n\":\"video\",\"y\":4,\"o\":2}'>影音</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"638\" data-m='{\"i\":638,\"p\":635,\"n\":\"entertainment\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/video/entertainment\">娛樂</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"639\" data-m='{\"i\":639,\"p\":635,\"n\":\"news\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/video/news\">新聞</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"640\" data-m='{\"i\":640,\"p\":635,\"n\":\"viral\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/video/viral\">新奇</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"641\" data-m='{\"i\":641,\"p\":635,\"n\":\"旅行\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/travel/video/\">旅行</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"642\" data-m='{\"i\":642,\"p\":635,\"n\":\"sports\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/video/sports\">運動</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"643\" data-m='{\"i\":643,\"p\":635,\"n\":\"healthandfitness\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/video/healthandfitness\">健康</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"644\" data-m='{\"i\":644,\"p\":635,\"n\":\"military\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/video/military\">軍事</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"645\" data-m='{\"i\":645,\"p\":635,\"n\":\"seeallvideos\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/video/browse/mostwatchedtoday\">精選影音總覽</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"646\" data-m='{\"i\":646,\"p\":635,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"647\" data-m='{\"i\":647,\"p\":635,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"648\" data-m='{\"i\":648,\"p\":635,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"649\" data-m='{\"i\":649,\"p\":635,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"650\" data-m='{\"i\":650,\"p\":635,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.video|stripe|stripe.video.topstories1|headlines\"  data-aop=\"top video 1\"  data-id=\"651\" data-m='{\"i\":651,\"p\":633,\"n\":\"stripe.video.topstories1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"652\" data-m='{\"i\":652,\"p\":651,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"653\" data-m='{\"i\":653,\"p\":652,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrLxg\",\"h\":0,\"v\":\"video\",\"c\":\"news\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/news/%e7%ae%a1%e7%90%86%e5%9f%8e%e9%9a%8d%e5%bb%9f-%e9%99%b3%e6%96%87%e6%96%87%e7%94%a8%e5%bf%83%e7%9c%8b%e5%be%97%e8%a6%8b/vi-BBSrLxg\"  >\n" +
"<img alt=\"管理城隍廟 陳文文用心看得見\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrDgj.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"管理城隍廟 陳文文用心看得見 - 由 CNA 提供\" /> <div>\n" +
"<h3   aria-label=\"管理城隍廟 陳文文用心看得見-影音\">管理城隍廟 陳文文用心看得見</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.video|stripe|stripe.video.topstories3|headlines\"  data-aop=\"top video 2\"  data-id=\"654\" data-m='{\"i\":654,\"p\":633,\"n\":\"stripe.video.topstories3\",\"t\":\"headlines\",\"o\":4}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"655\" data-m='{\"i\":655,\"p\":654,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"656\" data-m='{\"i\":656,\"p\":655,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqPU8\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e7%b2%89%e7%b4%85%e8%a5%bf%e8%a3%9d%e4%b8%8a%e8%ba%ab%e3%80%80%e5%90%b3%e5%b0%8a%e6%88%91%e5%be%88%e6%80%a7%e6%84%9f/vi-BBSqPU8\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSr2EB.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=950&amp;y=400&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"粉紅西裝上身　吳尊：我很性感 Thumbnail\" /> <div>\n" +
"<h3   aria-label=\"粉紅西裝上身　吳尊：我很性感-影音\">粉紅西裝上身　吳尊：我很性感</h3>\n" +
"\n" +
"<img alt=\"wikienter 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBqbgYI.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>wikienter</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"657\" data-m='{\"i\":657,\"p\":655,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS3BLX\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e9%9b%bb%e5%bd%b1%e3%80%8a%e8%ad%89%e4%ba%ba%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e9%84%ad%e9%9b%a8%e7%9b%9b%e9%80%8f%e9%9c%b2%e5%9b%a0%e6%8b%8d%e6%94%9d%e9%97%9c%e4%bf%82%e7%89%87%e5%a0%b4%e8%a6%81%e9%95%b7%e6%9c%9f%e6%ba%96%e5%82%99%e3%80%8c%e6%b0%a7%e6%b0%a3%e5%91%bc%e5%90%b8%e6%a9%9f%e3%80%8d%ef%bc%9f%ef%bc%81/vi-BBS3BLX\"  >\n" +
"<img alt=\"【電影《證人》發佈會】鄭雨盛透露因拍攝關係片場要長期準備「氧氣呼吸機」？！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3mJ8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=723&amp;y=317&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【電影《證人》發佈會】鄭雨盛透露因拍攝關係片場要長期準備「氧氣呼吸機」？！ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【電影《證人》發佈會】鄭雨盛透露因拍攝關係片場要長期準備「氧氣呼吸機」？！-影音\">【電影《證人》發佈會】鄭雨盛透露因拍攝關係片場要長期準備「氧氣呼吸機」？！</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"658\" data-m='{\"i\":658,\"p\":655,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSo9B5\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e6%9e%97%e5%bf%83%e5%a6%82%e5%8b%9d%e8%a8%b4%e5%b0%8d%e8%ac%a0%e8%a8%80%e4%b8%8d%e5%a7%91%e6%81%af%e3%80%80%e9%80%8f%e9%9c%b2%e9%9c%8d%e5%bb%ba%e8%8f%af%e6%9c%80%e6%84%9b%e6%8b%8d%e8%83%8c%e5%bd%b1/vi-BBSo9B5\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoe65.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"林心如勝訴對謠言不姑息　透露霍建華最愛拍背影 Thumbnail\" /> <div>\n" +
"<h3   aria-label=\"林心如勝訴對謠言不姑息　透露霍建華最愛拍背影-影音\">林心如勝訴對謠言不姑息　透露霍建華最愛拍背影</h3>\n" +
"\n" +
"<img alt=\"wikienter 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBqbgYI.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>wikienter</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.video|stripe|stripe.video.topstories4|headlines\"  data-aop=\"top video 3\"  data-id=\"659\" data-m='{\"i\":659,\"p\":633,\"n\":\"stripe.video.topstories4\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"660\" data-m='{\"i\":660,\"p\":659,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"661\" data-m='{\"i\":661,\"p\":660,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrF0V\",\"h\":0,\"v\":\"video\",\"c\":\"news\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/news/%e5%8d%b0%e5%ba%a6%e6%97%85%e9%81%8a%e5%b8%82%e5%a0%b4%e5%a4%a7-%e8%87%ba%e6%94%bb%e9%ab%98%e6%89%80%e5%be%97%e5%ae%a2%e7%be%a4/vi-BBSrF0V\"  >\n" +
"<img alt=\"印度旅遊市場大 臺攻高所得客群\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrBN5.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=168&amp;y=110&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"印度旅遊市場大 臺攻高所得客群 - 由 CNA 提供\" /> <div>\n" +
"<h3   aria-label=\"印度旅遊市場大 臺攻高所得客群-影音\">印度旅遊市場大 臺攻高所得客群</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"662\" data-m='{\"i\":662,\"p\":660,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpJFi\",\"h\":0,\"v\":\"video\",\"c\":\"news\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/news/%e9%a9%9a%e6%82%9a%e7%89%87%e3%80%8a%e7%95%b0%e8%a3%82%e3%80%8b-%e8%a1%97%e9%a0%ad%e8%b6%85%e8%83%bd%e5%b0%8d%e6%b1%ba/vi-BBSpJFi\"  >\n" +
"<img alt=\"驚悚片《異裂》 街頭超能對決\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpRxg.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=348&amp;y=128&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"驚悚片《異裂》 街頭超能對決 - 由 CNA 提供\" /> <div>\n" +
"<h3   aria-label=\"驚悚片《異裂》 街頭超能對決-影音\">驚悚片《異裂》 街頭超能對決</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"663\" data-m='{\"i\":663,\"p\":660,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpU0g\",\"h\":0,\"v\":\"video\",\"c\":\"news\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/news/%e5%a8%81%e5%b0%bc%e6%96%af%e4%b8%83%e6%9c%88%e8%b5%b7-%e5%be%b5%e6%97%85%e9%81%8a%e4%b8%8a%e5%b2%b8%e7%a8%85/vi-BBSpU0g\"  >\n" +
"<img alt=\"威尼斯七月起 徵旅遊上岸稅\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpRIw.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"威尼斯七月起 徵旅遊上岸稅 - 由 CNA 提供\" /> <div>\n" +
"<h3   aria-label=\"威尼斯七月起 徵旅遊上岸稅-影音\">威尼斯七月起 徵旅遊上岸稅</h3>\n" +
"\n" +
"<img alt=\"中央通訊社 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>中央通訊社</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.video|stripe|stripe.video.topstories2|headlines\"  data-aop=\"top video 4\"  data-id=\"664\" data-m='{\"i\":664,\"p\":633,\"n\":\"stripe.video.topstories2\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"665\" data-m='{\"i\":665,\"p\":664,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"666\" data-m='{\"i\":666,\"p\":665,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS9P6o\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e6%b2%b3%e6%ad%a3%e5%ae%87%e5%86%8d%e6%ac%a1%e6%8c%91%e6%88%b0%e5%bb%a3%e6%9d%b1%e8%a9%b1%e8%b7%9f%e9%a6%99%e6%b8%af%e7%b2%89%e7%b5%b2%e6%89%93%e6%8b%9b%e5%91%bc%ef%bd%9e%e5%90%8c%e6%99%82%e5%85%ac%e9%96%8b%e3%80%8a%e8%bd%9f%e5%a4%a9%e6%9a%b4%e9%9a%8a%e3%80%8b%e4%b8%89%e5%a4%a7%e5%bf%85%e7%9d%87%e7%9c%8b%e9%bb%9e%ef%bc%81/vi-BBS9P6o\"  >\n" +
"<img alt=\"河正宇再次挑戰廣東話跟香港粉絲打招呼～同時公開《轟天暴隊》三大必睇看點！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS9WDf.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=504&amp;y=257&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"河正宇再次挑戰廣東話跟香港粉絲打招呼～同時公開《轟天暴隊》三大必睇看點！ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"河正宇再次挑戰廣東話跟香港粉絲打招呼～同時公開《轟天暴隊》三大必睇看點！-影音\">河正宇再次挑戰廣東話跟香港粉絲打招呼～同時公開《轟天暴隊》三大必睇看點！</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"667\" data-m='{\"i\":667,\"p\":664,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"668\" data-m='{\"i\":668,\"p\":667,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS01ke\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e6%80%8e%e9%ba%bc%e5%b0%b1%ef%bc%8c%e7%b5%90%e5%a9%9a%e4%ba%86%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e9%87%91%e6%9d%b1%e6%97%ad%e5%9c%a8%e6%9c%83%e4%b8%8a%e7%9b%b4%e6%8e%a5%e6%8b%bf%e5%87%ba%e9%91%bd%e6%88%92%e5%90%91%e9%ab%98%e8%81%96%e7%86%99%e6%b1%82%e5%a9%9a%ef%bc%81%ef%bc%9f/vi-BBS01ke\"  >\n" +
"<img alt=\"【《怎麼就，結婚了》發佈會】金東旭在會上直接拿出鑽戒向高聖熙求婚！？\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS09EJ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=683&amp;y=302&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《怎麼就，結婚了》發佈會】金東旭在會上直接拿出鑽戒向高聖熙求婚！？ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《怎麼就，結婚了》發佈會】金東旭在會上直接拿出鑽戒向高聖熙求婚！？-影音\">【《怎麼就，結婚了》發佈會】金東旭在會上直接拿出鑽戒向高聖熙求婚！？</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"669\" data-m='{\"i\":669,\"p\":667,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBRPo3h\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8acoffee-friends%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e5%ad%ab%e6%b5%a9%e4%bf%8a%e7%88%86%e6%96%99%e3%80%8c%e7%86%b1%e6%83%85%e5%85%81%e6%b5%a9%e5%81%9a%e6%8d%90%e8%b4%88%e4%b9%9f%e4%b8%8d%e9%a1%98%e8%bc%b8%ef%bc%81%e3%80%8d/vi-BBRPo3h\"  >\n" +
"<img alt=\"【《Coffee Friends》發佈會】孫浩俊爆料：「熱情允浩做捐贈也不願輸！」\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRP6wy.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=680&amp;y=206&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《Coffee Friends》發佈會】孫浩俊爆料：「熱情允浩做捐贈也不願輸！」 - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《coffee friends》發佈會】孫浩俊爆料：「熱情允浩做捐贈也不願輸！」-影音\">【《Coffee Friends》發佈會】孫浩俊爆料：「熱情允浩做捐贈也不願輸！」</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"670\" data-m='{\"i\":670,\"p\":667,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBRKarq\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e6%88%90%e7%82%ba%e7%8e%8b%e7%9a%84%e7%94%b7%e4%ba%ba%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e5%91%82%e7%8f%8d%e4%b9%9d%e5%be%9e%e7%94%b7%e5%ad%a9%e8%ae%8a%e6%88%90%e4%ba%86%e7%94%b7%e4%ba%ba%ef%bc%81%e8%a8%b1%e8%ab%be%e6%94%b6%e8%a6%96%e7%8e%87%e5%85%ac%e7%b4%84%e9%81%94%e6%88%90%e5%b0%87%e7%a9%bf%e5%8f%a4%e8%a3%9d%e9%80%81%e6%8a%b1%e6%8a%b1%ef%bd%9e/vi-BBRKarq\"  >\n" +
"<img alt=\"【《成為王的男人》發佈會】呂珍九從男孩變成了男人！許諾收視率公約達成將穿古裝送抱抱～\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRKhpy.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=670&amp;y=201&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《成為王的男人》發佈會】呂珍九從男孩變成了男人！許諾收視率公約達成將穿古裝送抱抱～ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《成為王的男人》發佈會】呂珍九從男孩變成了男人！許諾收視率公約達成將穿古裝送抱抱～-影音\">【《成為王的男人》發佈會】呂珍九從男孩變成了男人！許諾收視率公約達成將穿古裝送抱抱～</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"671\" data-m='{\"i\":671,\"p\":664,\"n\":\"tertiary\",\"y\":8,\"o\":3}'>\n" +
" <li  data-id=\"672\" data-m='{\"i\":672,\"p\":671,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBRf6KM\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e8%82%87%e9%80%83%e8%a8%88%e7%95%ab%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e5%ad%94%e6%9b%89%e6%8c%af%e7%88%86%e6%96%99%e7%94%b7%e4%b8%bb%e9%a7%95%e9%a7%9b%e6%8a%80%e8%a1%93%e6%9b%b9%e6%94%bf%e5%a5%ad%e6%98%af%e7%a9%a9%e9%a7%95%e6%b4%be%e3%80%81%e6%9f%b3%e4%bf%8a%e7%83%88%e8%bf%bd%e6%b1%82%e9%80%9f%e5%ba%a6%ef%bc%81/vi-BBRf6KM\"  >\n" +
"<img alt=\"【《肇逃計畫》發佈會】孔曉振爆料男主駕駛技術：曹政奭是穩駕派、柳俊烈追求速度！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRfmJO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=651&amp;y=137&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《肇逃計畫》發佈會】孔曉振爆料男主駕駛技術：曹政奭是穩駕派、柳俊烈追求速度！ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《肇逃計畫》發佈會】孔曉振爆料男主駕駛技術：曹政奭是穩駕派、柳俊烈追求速度！-影音\">【《肇逃計畫》發佈會】孔曉振爆料男主駕駛技術：曹政奭是穩駕派、柳俊烈追求速度！</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"673\" data-m='{\"i\":673,\"p\":671,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBQc0fS\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e9%98%bf%e7%88%be%e7%bd%95%e5%b8%83%e6%8b%89%e5%ae%ae%e7%9a%84%e5%9b%9e%e6%86%b6%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e7%8e%84%e5%bd%acand%e6%9c%b4%e4%bf%a1%e6%83%a0%e4%ba%92%e8%ae%9a-%e9%87%91%e7%be%a9%e8%81%96%e9%a2%a8%e8%b6%a3%e5%90%90%e6%a7%bd%e5%8f%88%e6%98%af%e6%bc%94%e7%88%b6%e8%a6%aa%ef%bc%8c%e6%88%91%e6%9c%89%e9%82%a3%e9%ba%bc%e8%80%81%e5%97%8e%ef%bc%9f/vi-BBQc0fS\"  >\n" +
"<img alt=\"【《阿爾罕布拉宮的回憶》發佈會】玄彬&amp;朴信惠互讚 金義聖風趣吐槽：又是演父親，我有那麼老嗎？\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQc0fQ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=570&amp;y=183&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《阿爾罕布拉宮的回憶》發佈會】玄彬&amp;朴信惠互讚 金義聖風趣吐槽：又是演父親，我有那麼老嗎？ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《阿爾罕布拉宮的回憶》發佈會】玄彬&amp;朴信惠互讚 金義聖風趣吐槽：又是演父親，我有那麼老嗎？-影音\">【《阿爾罕布拉宮的回憶》發佈會】玄彬&amp;朴信惠互讚 金義聖風趣吐槽：又是演父親，我有那麼老嗎？</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"674\" data-m='{\"i\":674,\"p\":671,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBQ6zwl\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e5%85%88%e7%86%b1%e6%83%85%e5%9c%b0%e6%89%93%e6%8e%83%e5%90%a7%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e4%bb%8a%e6%99%9a%e9%a6%96%e6%92%ad%ef%bc%81%e4%b8%bb%e6%bc%94%e9%87%91%e8%a3%95%e8%b2%9e%e3%80%81%e5%b0%b9%e9%88%9e%e7%9b%b8%e3%80%81%e5%ae%8b%e5%86%8d%e8%87%a8%e5%9d%87%e5%87%ba%e5%b8%ad-%e7%94%b7%e7%94%b7cp%e4%b9%9f%e5%be%88%e8%ae%93%e4%ba%ba%e6%9c%9f%e5%be%85%e5%93%a6%ef%bd%9e%e2%99%a5-xd/vi-BBQ6zwl\"  >\n" +
"<img alt=\"【《先熱情地打掃吧》發佈會】今晚首播！主演金裕貞、尹鈞相、宋再臨均出席 男男CP也很讓人期待哦～? XD\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQ6zwj.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=602&amp;y=142&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《先熱情地打掃吧》發佈會】今晚首播！主演金裕貞、尹鈞相、宋再臨均出席 男男CP也很讓人期待哦～? XD - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《先熱情地打掃吧》發佈會】今晚首播！主演金裕貞、尹鈞相、宋再臨均出席 男男cp也很讓人期待哦～? xd-影音\">【《先熱情地打掃吧》發佈會】今晚首播！主演金裕貞、尹鈞相、宋再臨均出席 男男CP也很讓人期待哦～? XD</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"675\" data-m='{\"i\":675,\"p\":664,\"n\":\"secondary\",\"y\":8,\"o\":4}'>\n" +
" <li  data-id=\"676\" data-m='{\"i\":676,\"p\":675,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPWF7M\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e7%94%b7%e6%9c%8b%e5%8f%8b%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e6%9c%b4%e5%af%b6%e5%8a%8d%e7%82%ba%e5%b8%ab%e5%85%84%e5%ae%8b%e4%bb%b2%e5%9f%ba%e6%96%b0%e5%8a%87%e5%8a%a0%e6%b2%b9%e5%a4%aa%e5%8f%af%e6%84%9b%e5%95%a6%ef%bd%9e/vi-BBPWF7M\"  >\n" +
"<img alt=\"【《男朋友》發佈會】朴寶劍為師兄宋仲基新劇加油：太可愛啦～\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPWDoB.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=644&amp;y=193&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《男朋友》發佈會】朴寶劍為師兄宋仲基新劇加油：太可愛啦～ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《男朋友》發佈會】朴寶劍為師兄宋仲基新劇加油：太可愛啦～-影音\">【《男朋友》發佈會】朴寶劍為師兄宋仲基新劇加油：太可愛啦～</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"677\" data-m='{\"i\":677,\"p\":664,\"n\":\"tertiary\",\"y\":8,\"o\":5}'>\n" +
" <li  data-id=\"678\" data-m='{\"i\":678,\"p\":677,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPVUGe\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e7%9a%87%e5%90%8e%e7%9a%84%e5%93%81%e6%a0%bc%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e5%b4%94%e6%8c%af%e8%b5%ab%e8%b2%a0%e5%82%b7%e4%ba%ae%e7%9b%b8%e7%8c%9b%e9%81%93%e6%ad%89-%e5%bc%b5%e5%a8%9c%e6%8b%89%e8%a8%82%e4%b8%8b%e6%94%b6%e8%a6%96%e5%85%ac%e7%b4%84%ef%bc%81/vi-BBPVUGe\"  >\n" +
"<img alt=\"【《皇后的品格》發佈會】崔振赫負傷亮相猛道歉 張娜拉訂下收視公約！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPVIpP.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=659&amp;y=223&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【《皇后的品格》發佈會】崔振赫負傷亮相猛道歉 張娜拉訂下收視公約！ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"【《皇后的品格》發佈會】崔振赫負傷亮相猛道歉 張娜拉訂下收視公約！-影音\">【《皇后的品格》發佈會】崔振赫負傷亮相猛道歉 張娜拉訂下收視公約！</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"679\" data-m='{\"i\":679,\"p\":677,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPRwWL\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/exo%e5%9c%a8%e6%a9%9f%e5%a0%b4%e5%b8%b6%e4%be%86%e9%a9%9a%e5%96%9c%e7%a6%ae%e7%89%a9%ef%bc%81suho%e4%b8%80%e4%b8%8b%e8%bb%8a%e5%b0%b1%e7%bf%bb%e8%b7%9f%e6%96%97%e6%af%94%e6%84%9b%e5%bf%83%ef%bc%8c%e7%87%a6%e7%83%88%e5%89%87%e5%9c%a8%e8%bb%8a%e8%a3%a1%e7%ac%91%e8%91%97%e9%82%84%e6%8b%bf%e8%91%97%e6%89%8b%e6%a9%9f%e6%8b%8d%e6%94%9d%ef%bc%81/vi-BBPRwWL\"  >\n" +
"<img alt=\"EXO在機場帶來驚喜禮物！Suho一下車就翻跟斗比愛心，燦烈則在車裡笑著還拿著手機拍攝！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPRlms.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=1208&amp;y=127&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"EXO在機場帶來驚喜禮物！Suho一下車就翻跟斗比愛心，燦烈則在車裡笑著還拿著手機拍攝！ - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"exo在機場帶來驚喜禮物！suho一下車就翻跟斗比愛心，燦烈則在車裡笑著還拿著手機拍攝！-影音\">EXO在機場帶來驚喜禮物！Suho一下車就翻跟斗比愛心，燦烈則在車裡笑著還拿著手機拍攝！</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"680\" data-m='{\"i\":680,\"p\":677,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPDEQi\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%8apriest%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e5%bb%b6%e5%ae%87%e6%8c%af%e6%8e%a5%e6%9b%bf%e9%87%91%e6%9d%90%e6%98%b1%e7%b9%bc%e7%ba%8c%e9%a9%85%e9%ad%94-%e8%8b%a6%e7%b7%b4%e6%8b%89%e4%b8%81%e6%96%87%e8%88%87%e8%ae%9a%e9%a0%8c%e6%ad%8c%e5%8f%aa%e6%b1%82%e5%a5%bd%e5%a4%a2/vi-BBPDEQi\"  >\n" +
"<img alt=\"《Priest》發佈會：延宇振接替金材昱繼續驅魔 苦練拉丁文與讚頌歌只求好夢\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPDNde.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=634&amp;y=281&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"《Priest》發佈會：延宇振接替金材昱繼續驅魔 苦練拉丁文與讚頌歌只求好夢 - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"《priest》發佈會：延宇振接替金材昱繼續驅魔 苦練拉丁文與讚頌歌只求好夢-影音\">《Priest》發佈會：延宇振接替金材昱繼續驅魔 苦練拉丁文與讚頌歌只求好夢</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"681\" data-m='{\"i\":681,\"p\":664,\"n\":\"tertiary\",\"y\":8,\"o\":6}'>\n" +
" <li  data-id=\"682\" data-m='{\"i\":682,\"p\":681,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPDHka\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/do%e7%99%bc%e4%bd%88%e6%9c%83%e8%87%a8%e6%99%82%e8%a2%abcue%e5%a4%a7%e8%b7%b3%e8%b8%a2%e8%ba%82%e8%88%9e%ef%bc%81%e5%90%8d%e7%ac%a6%e5%85%b6%e5%af%a6%e7%9a%84%e3%80%8a%e6%90%96%e6%93%ba%e7%94%b7%e5%ad%a9%e3%80%8b/vi-BBPDHka\"  >\n" +
"<img alt=\"D.O.發佈會臨時被Cue大跳踢躂舞！名符其實的《搖擺男孩》\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPDRdn.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=640&amp;y=231&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"D.O.發佈會臨時被Cue大跳踢躂舞！名符其實的《搖擺男孩》 - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"d.o.發佈會臨時被cue大跳踢躂舞！名符其實的《搖擺男孩》-影音\">D.O.發佈會臨時被Cue大跳踢躂舞！名符其實的《搖擺男孩》</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"683\" data-m='{\"i\":683,\"p\":681,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPr3e9\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e9%98%b2%e5%bd%88%e5%b0%91%e5%b9%b4%e5%9c%98%e6%88%90%e7%82%ba2018-mga%e7%9a%84%e4%b8%bb%e4%ba%ba%e5%85%ac%ef%bc%8cwanna-one%e3%80%81twice%e4%b8%89%e5%86%a0%e7%8e%8b/vi-BBPr3e9\"  >\n" +
"<img alt=\"防彈少年團成為2018 MGA的主人公，Wanna One、TWICE三冠王\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPr0Hr.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=356&amp;y=168&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"防彈少年團成為2018 MGA的主人公，Wanna One、TWICE三冠王 - 由 韓星網 提供\" /> <div>\n" +
"<h3   aria-label=\"防彈少年團成為2018 mga的主人公，wanna one、twice三冠王-影音\">防彈少年團成為2018 MGA的主人公，Wanna One、TWICE三冠王</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"684\" data-m='{\"i\":684,\"p\":681,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPlDgB\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e5%a4%9a%e5%9c%96%e3%80%91%e9%87%91%e4%bf%8a%e7%a7%80%e9%80%80%e4%bc%8d%e7%8f%be%e5%a0%b4%e7%85%a7%e7%89%87%e5%85%ac%e9%96%8b%ef%bc%81-ig%e9%80%8f%e9%9c%b2%e5%bf%83%e5%a2%83%e3%80%8c%e6%84%9f%e8%ac%9d%e6%89%80%e6%9c%89%e4%b8%80%e5%90%8c%e8%b5%b0%e9%81%8e%e7%9a%84%e4%ba%ba%e3%80%8d/vi-BBPlDgB\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPlYvQ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"【多圖】金俊秀退伍現場照片公開！ IG透露心境：「感謝所有一同走過的人」 Thumbnail\" /> <div>\n" +
"<h3   aria-label=\"【多圖】金俊秀退伍現場照片公開！ ig透露心境：「感謝所有一同走過的人」-影音\">【多圖】金俊秀退伍現場照片公開！ IG透露心境：「感謝所有一同走過的人」</h3>\n" +
"\n" +
"<img alt=\"韓星網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>韓星網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"685\" data-m='{\"i\":685,\"p\":633,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"新奇\"\n" +
"          data-section-id=\"stripe.viralvideo\"\n" +
"          data-section-id=\"stripe.viralvideo\">\n" +
"        <div class=\"stripeouter\"  data-aop=\"stripe.viralvideo_stripe\"  data-id=\"686\" data-m='{\"i\":686,\"p\":19,\"n\":\"stripe.viralvideo\",\"t\":\"stripe\",\"o\":16}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"687\" data-m='{\"i\":687,\"p\":686,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.viralvideo.navigation_stripenavigation\"  data-id=\"688\" data-m='{\"i\":688,\"p\":686,\"n\":\"stripe.viralvideo.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"689\" data-m='{\"i\":689,\"p\":688,\"n\":\"新奇\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/video/viral\"  data-id=\"690\" data-m='{\"i\":690,\"p\":688,\"n\":\"新奇\",\"y\":4,\"o\":2}'>新奇</a></h2>\n" +
"</li>\n" +
"  </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"691\" data-m='{\"i\":691,\"p\":688,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":3}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"692\" data-m='{\"i\":692,\"p\":688,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":4}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"693\" data-m='{\"i\":693,\"p\":688,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":5}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"694\" data-m='{\"i\":694,\"p\":688,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":6}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"695\" data-m='{\"i\":695,\"p\":688,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":7}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.viralvideo|stripe|stripe.viralvideo.hero1|headlines\"  data-aop=\"hero1\"  data-id=\"696\" data-m='{\"i\":696,\"p\":686,\"n\":\"stripe.viralvideo.hero1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"697\" data-m='{\"i\":697,\"p\":696,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"698\" data-m='{\"i\":698,\"p\":697,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdBnz\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/viral/%e5%81%9a%e4%ba%86%e8%99%a7%e5%bf%83%e4%ba%8b%ef%bc%9f%e5%a5%b9%e8%a2%ab%e5%ae%a2%e4%ba%ba%e5%9a%87%e5%88%b0%e6%91%94%e5%80%8b%e5%9b%9b%e8%85%b3%e6%9c%9d%e5%a4%a9/vi-BBSdBnz\"  >\n" +
"<img alt=\"做了虧心事？她被客人嚇到摔個四腳朝天\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfUKk.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=122&amp;y=68&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"做了虧心事？她被客人嚇到摔個四腳朝天 - buzzvideos\" /> <div>\n" +
"<h3   aria-label=\"做了虧心事？她被客人嚇到摔個四腳朝天-影音\">做了虧心事？她被客人嚇到摔個四腳朝天</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.viralvideo|stripe|stripe.viralvideo.hero2|headlines\"  data-aop=\"hero2\"  data-id=\"699\" data-m='{\"i\":699,\"p\":686,\"n\":\"stripe.viralvideo.hero2\",\"t\":\"headlines\",\"o\":4}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"700\" data-m='{\"i\":700,\"p\":699,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"701\" data-m='{\"i\":701,\"p\":700,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgl5Z\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/viral/%e9%a3%9b%e6%a9%9f%e5%a4%9c%e9%96%93%e9%99%8d%e8%90%bd%e6%9c%89%e5%a4%a0%e7%be%8e%ef%bc%81/vi-BBSgl5Z\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmiro.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Airbus A320 landing over runway approach-lights at dusk - Getty\" /> <div>\n" +
"<h3   aria-label=\"飛機夜間降落有夠美！-影音\">飛機夜間降落有夠美！</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.viralvideo|stripe|stripe.viralvideo.hero3|headlines\"  data-aop=\"hero3\"  data-id=\"702\" data-m='{\"i\":702,\"p\":686,\"n\":\"stripe.viralvideo.hero3\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"703\" data-m='{\"i\":703,\"p\":702,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"704\" data-m='{\"i\":704,\"p\":703,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgzJA\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/viral/%e7%aa%a9%e5%9c%a8%e4%b8%80%e8%b5%b7%e7%9d%a1%e5%8d%88%e8%a6%ba%e6%af%94%e8%bc%83%e9%a6%99%ef%bc%81/vi-BBSgzJA\"  >\n" +
"<img alt=\"窩在一起睡午覺比較香！\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm8Hy.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=388&amp;y=770&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"窩在一起睡午覺比較香！ - buzzvideos\" /> <div>\n" +
"<h3   aria-label=\"窩在一起睡午覺比較香！-影音\">窩在一起睡午覺比較香！</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.viralvideo|stripe|stripe.viralvideo.hero4|headlines\"  data-aop=\"hero4\"  data-id=\"705\" data-m='{\"i\":705,\"p\":686,\"n\":\"stripe.viralvideo.hero4\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"706\" data-m='{\"i\":706,\"p\":705,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"707\" data-m='{\"i\":707,\"p\":706,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgl2L\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":1}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/viral/%e4%bb%bb%e6%80%a7%e8%bc%aa%e8%83%8e%e5%87%ba%e8%b5%b0-%e4%b8%bb%e4%ba%ba%e8%bf%bd%e9%80%90%e7%9a%84%e8%ba%ab%e5%bd%b1%e6%9c%89%e8%82%a1%e6%b7%a1%e6%b7%a1%e7%9a%84%e5%93%80%e5%82%b7/vi-BBSgl2L\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS5jLX.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=371&amp;y=519&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Young man chases tire on highway! - BuzzV?deos\" /> <div>\n" +
"<h3   aria-label=\"任性輪胎出走 主人追逐的身影有股淡淡的哀傷-影音\">任性輪胎出走 主人追逐的身影有股淡淡的哀傷</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"708\" data-m='{\"i\":708,\"p\":686,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"工具\"\n" +
"          data-section-id=\"stripe.weather\"\n" +
"          data-section-id=\"stripe.weather\">\n" +
"        <div class=\"weather stripeouter\"  data-aop=\"stripe.weather_stripe\"  data-id=\"709\" data-m='{\"i\":709,\"p\":19,\"n\":\"Stripe.weather\",\"t\":\"stripe\",\"o\":17}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"710\" data-m='{\"i\":710,\"p\":709,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.weather.navigation_stripenavigation\"  data-id=\"711\" data-m='{\"i\":711,\"p\":709,\"n\":\"Stripe.weather.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"712\" data-m='{\"i\":712,\"p\":711,\"n\":\"工具\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/weather\"  data-id=\"713\" data-m='{\"i\":713,\"p\":711,\"n\":\"工具\",\"y\":4,\"o\":2}'>工具</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"714\" data-m='{\"i\":714,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"即時天氣新聞\",\"o\":3}'><a href=\"/zh-tw/weather/news\">即時天氣新聞</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"715\" data-m='{\"i\":715,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"氣象圖\",\"o\":4}'><a href=\"/zh-tw/weather/maps\">氣象圖</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"716\" data-m='{\"i\":716,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"氣溫雨量統計\",\"o\":5}'><a href=\"/zh-tw/weather/records\">氣溫雨量統計</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"717\" data-m='{\"i\":717,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"交通狀況\",\"o\":6}'><a href=\"/zh-tw/weather/traffic\">交通狀況</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"718\" data-m='{\"i\":718,\"p\":711,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":7}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"719\" data-m='{\"i\":719,\"p\":711,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":8}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"720\" data-m='{\"i\":720,\"p\":711,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":9}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"721\" data-m='{\"i\":721,\"p\":711,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":10}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"722\" data-m='{\"i\":722,\"p\":711,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":11}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
"\n" +
"<div class=\"weastripetile \"  data-aop=\"Stripe.weather.weatherSD_WeatherHpStripeTile\" data-module-id=\"startpage|Stripe.weather|stripe|Stripe.weather.weatherSD|WeatherHpStripeTile\"  data-id=\"723\" data-m='{\"i\":723,\"p\":709,\"n\":\"WeatherHpStripeTile\",\"y\":4,\"o\":3}'>\n" +
" <a  href=\"/zh-tw/weather/today/%e8%87%ba%e5%8c%97%e5%b8%82,%e8%87%ba%e7%9d%a3/we-city?iso=TW&amp;el=88BvMEEFglY1eFnLmpENHA%3D%3D\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\">\n" +
"<div class=\"info\">\n" +
" <div class=\"city\">臺北市</div>\n" +
"<div class=\"now\">現在</div>\n" +
"<div class=\"currentcond\">\n" +
"<span>19</span>\n" +
"<span class=\"unit\">°C</span>\n" +
"</div>\n" +
"<div  class=\"wind winddir_sw\">SW 2 公里/小時</div>\n" +
"\n" +
"<div class=\"fl\">體感溫度: 19&#176;</div>\n" +
"<div class=\"text\">多雲時陰</div>\n" +
"<div class=\"time\">更新時間: 下午 11:35 2019年1月19日</div>\n" +
"</div>\n" +
"<div class=\"hovereff\"></div>\n" +
"</a>\n" +
" <a  href=\"/zh-tw/weather/today/%e8%87%ba%e5%8c%97%e5%b8%82,%e8%87%ba%e7%9d%a3/we-city?iso=TW&amp;el=88BvMEEFglY1eFnLmpENHA%3D%3D\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\">\n" +
"<div class=\"today\">\n" +
"<div>今天</div>\n" +
"<div class=\"avglow\">低溫: 17&#176;</div>\n" +
"<div class=\"avghigh\">高溫: 19&#176;</div>\n" +
"</div>\n" +
"</a>\n" +
" <style>.skybg{background-color: #022332 !important; } </style>\n" +
" <div class=\"herobg skybg\" data-skycode=\"30\"  data-current-bg-img=\"{&quot;baseUrl&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/&quot;,&quot;size4Img&quot;:&quot;BBaI7S.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=305&amp;h=300&quot;}\"></div>\n" +
" <div class=\"gradient\" style=\"background: url(//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2J3Pd.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=305&amp;h=300) repeat-x left bottom;\"></div>\n" +
"\n" +
" <span class=\"edithome\" data-degreetype=\"C\"  data-id=\"724\" data-m='{\"i\":724,\"p\":709,\"n\":\"weathereditbtn\",\"y\":12,\"o\":4}'\n" +
"data-home=\"搜尋地點/城市\" title=\"變更\" aria-label=\"變更位置或溫度單位\">變更</span>\n" +
"<div class=\"weapopup\" role=\"dialog\" aria-labelledby=\"weaaddlocation-label\"  data-aop=\"editweatherflyout\"  data-region=\"editweatherflyout\">\n" +
"<div class=\"weaddn wpopbg\"></div>\n" +
"<div class=\"weaddn wpopctn\">\n" +
"<a class=\"close\"  data-id=\"725\" data-m='{\"i\":725,\"p\":709,\"n\":\"weatherTodayMiniClose\",\"t\":\"CloseBtn\",\"o\":5}' role=\"button\" href=\"#\" title=\"關閉\">關閉</a>\n" +
" \n" +
"\n" +
"<div class=\"weaaddlocation\">\n" +
"\n" +
"<form  data-id=\"726\" data-m='{\"i\":726,\"p\":709,\"n\":\"weasearchlocation\",\"y\":8,\"o\":6}' action=\"/zh-tw/weather/search\" data-action=\"/zh-tw/weather/ajax/places/search/\" method=\"get\"  class=\"nogps\">\n" +
" \n" +
"<p class=\"label\" id=\"weaaddlocation-label\">設定預設位置</p>\n" +
"<div class=\"add-loc-as-container\">\n" +
"<input name=\"q\" class=\"query\" accesskey=\"L\" autocomplete=\"off\" type=\"search\" aria-autocomplete=\"list\"\n" +
"value=\"\" maxlength=\"250\" data-auto-suggest-settings='{&quot;market&quot;:&quot;zh-tw&quot;,&quot;mode&quot;:&quot;AS&quot;,&quot;baseurl&quot;:&quot;/zh-tw/weather/today&quot;,&quot;action&quot;:&quot;sethome&quot;,&quot;method&quot;:&quot;custom&quot;,&quot;selector&quot;:&quot;.weaaddlocation&quot;,&quot;urltype&quot;:&quot;GeoLocation&quot;,&quot;formcode&quot;:&quot;&quot;,&quot;lat&quot;:22.9944,&quot;lon&quot;:120.199}'\n" +
"                   placeholder=\"搜尋地點/城市\" data-seemoretext=\"按下 &lt;Enter&gt; 以查看更多內容\" data-autosuggestdelay=\"100\"\n" +
"                   aria-label=\"搜尋地點/城市\"  data-id=\"727\" data-m='{\"i\":727,\"p\":726,\"n\":\"weaautosuggest\",\"y\":10,\"o\":1}' />\n" +
"<button type=\"submit\" title =\"搜尋\" class=\"searchbtn\"  data-id=\"728\" data-m='{\"i\":728,\"p\":726,\"n\":\"wealocationsearch\",\"y\":11,\"o\":2}'\n" +
"  aria-label=\"搜尋\">\n" +
"<span class=\"x-screen-reader\">搜尋</span>               \n" +
"            </button>\n" +
"        </div>\n" +
"        <div class=\"nolocerr\" aria-live=\"assertive\" data-message=\"找不到「{0}」的搜尋結果\"></div>\n" +
"<div class=\"errmsg\" aria-hidden=\"true\" data-error-in-service-message=\"發生意外的錯誤，請再試一次。\"></div>\n" +
"<div class=\"suggestmsg\"></div>\n" +
"<div class=\"autosuggestresults\"  data-id=\"729\" data-m='{\"i\":729,\"p\":726,\"n\":\"weaautosuggestresults\",\"y\":5,\"o\":3}'></div>\n" +
" \n" +
"</form>\n" +
"</div>\n" +
"\n" +
" \n" +
"\n" +
"\n" +
"<div  role=\"radiogroup\">\n" +
"<p>溫度顯示單位</p>\n" +
"<form id=\"id75f499e11155466e901cd6acace69db1\" class=\"setdegree\"  data-id=\"730\" data-m='{\"i\":730,\"p\":709,\"n\":\"degreetype\",\"y\":12,\"o\":7}' action=\"/zh-tw/weather/ajax/places/savedegree/\" method=\"post\">\n" +
" \n" +
"<div>\n" +
"<button name=\"weaDegreeType\" id=\"id75f499e11155466e901cd6acace69db1_fahrenheit_tile\" value=\"F\"\n" +
"                        class=\"\"\n" +
" role=\"radio\"\n" +
"  data-id=\"731\" data-m='{\"i\":731,\"p\":730,\"n\":\"weafahrenheit\",\"y\":11,\"o\":1}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id75f499e11155466e901cd6acace69db1_fahrenheit_tile\" form=\"id75f499e11155466e901cd6acace69db1\">華氏</label>\n" +
"            </div>\n" +
"            <div>\n" +
"                <button name=\"weaDegreeType\" id=\"id75f499e11155466e901cd6acace69db1_celsius_tile\" value=\"C\"\n" +
"                        class=\"selected\"\n" +
" role=\"radio\"\n" +
"  data-id=\"732\" data-m='{\"i\":732,\"p\":730,\"n\":\"weacelsius\",\"y\":11,\"o\":2}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id75f499e11155466e901cd6acace69db1_celsius_tile\" form=\"id75f499e11155466e901cd6acace69db1\">攝氏</label>\n" +
"</div>\n" +
" \n" +
"</form>\n" +
"</div>\n" +
"\n" +
"<button  data-id=\"733\" data-m='{\"i\":733,\"p\":709,\"n\":\"weatherTodayMiniDone\",\"t\":\"DoneBtn\",\"o\":8}' class=\"donebutton disabled\" disabled=\"disabled\" title=\"完成\">完成</button>\n" +
"</div>\n" +
"</div>\n" +
" <a  href=\"/zh-tw/weather/today\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\">\n" +
"<div class=\"dynlink\">\n" +
" 10 日預報\n" +
"</div>\n" +
"</a>\n" +
"\n" +
"</div>\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|Stripe.weather|stripe|Stripe.weather.WeatherNews|headlines\"  data-aop=\"stripe.weather.weathernews\"  data-id=\"734\" data-m='{\"i\":734,\"p\":709,\"n\":\"Stripe.weather.WeatherNews\",\"t\":\"headlines\",\"o\":9}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"735\" data-m='{\"i\":735,\"p\":734,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"736\" data-m='{\"i\":736,\"p\":735,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrKhN\",\"h\":0,\"v\":\"weather\",\"c\":\"other\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/weather/other/%e5%98%89%e7%be%a9%e5%9c%b0%e9%9c%87%e8%a6%8f%e6%a8%a138-%e6%9c%80%e5%a4%a7%e9%9c%87%e5%ba%a63%e7%b4%9a/ar-BBSrKhN\"  >\n" +
"<img alt=\"地震20190109\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrKhM.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"地震20190109 - 由 Sanlih E-television Co., LTD 提供\" /> <div>\n" +
"<h3   aria-label=\"嘉義地震規模3.8 最大震度3級-文章\">嘉義地震規模3.8 最大震度3級</h3>\n" +
"\n" +
"<img alt=\"三立新聞網 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>三立新聞網</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"sportsstripe\"  data-aop=\"Stripe.weather.SportsSD_sportsStripeScoresModule\" data-module-id=\"startpage|Stripe.weather|stripe|Stripe.weather.SportsSD|sportsStripeScoresModule\" data-pdp-dependent=\"true\"  data-id=\"737\" data-m='{\"i\":737,\"p\":709,\"n\":\"Stripe.weather.SportsSD\",\"t\":\"sportsStripeScoresModule\",\"o\":10}'>\n" +
" \n" +
" <div class=\"heading\">\n" +
"<a href=\"https://www.msn.com/zh-tw/sports/nba\" class=\"clearfix\"   data-id=\"738\" data-m='{\"i\":738,\"p\":737,\"n\":\"Stripe.weather.SportsSD\",\"t\":\"sportsStripeScoresModule\",\"o\":1}'>\n" +
"<p class=\"sports-header-bold\"><span title=\"NBA\">NBA</span></p>\n" +
"</a>\n" +
" \n" +
"</div>\n" +
" <div class=\"sponsoredad\"  data-aop=\"stripe.weather.sportssd_sportsstripescoresmodule\"  data-id=\"739\" data-m='{\"i\":739,\"p\":737,\"n\":\"Stripe.weather.SportsSD\",\"t\":\"sportsStripeScoresModule\",\"o\":2}'>\n" +
"<span class=\"sponsorshipcategory hide123\"></span>\n" +
"<span class=\"sponsorimage hide123\">\n" +
" </span>\n" +
"</div>\n" +
"  <a href=\"/zh-tw/sports/nba/紐奧良鵜鶘-at-波特蘭拓荒者/game-center/sp-id-30401000002074178\" aria-label=\"紐奧良鵜鶘 對 波特蘭拓荒者。比賽日期: 1月19日 上午 11:30 CST 。得分為 112-128 。比賽結束。\" class=\"game clearfix\"   data-id=\"740\" data-m='{\"i\":740,\"p\":737,\"n\":\"basketball_nba\",\"y\":15,\"l\":\"30401000002074178\",\"o\":3}'>\n" +
" <div class=\"teambased \">\n" +
"<div>\n" +
"<div>\n" +
"<img alt=\"紐奧良鵜鶘 標誌\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cMXj?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">鵜鶘</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div class=\"score-container\">\n" +
" <p class=\"sports-header-bold\">1月19日</p>\n" +
"\n" +
" <div class=\"clearfix\">\n" +
"<p class=\"sports-header-light\">112</p>\n" +
"<p class=\"sports-header-light\">-</p>\n" +
"<p class=\"sports-header-light\">128</p>\n" +
"</div>\n" +
"\n" +
" <p class=\"sports-header-bold\">比賽結束</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div>\n" +
"<img alt=\"波特蘭拓荒者 標誌\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cXfr?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">拓荒者</p>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" </a>\n" +
" <a href=\"/zh-tw/sports/nba/金州勇士-at-洛杉磯快艇/game-center/sp-id-30401000002073943\" aria-label=\"金州勇士 對 洛杉磯快艇。比賽日期: 1月19日 上午 11:30 CST 。得分為 112-94 。比賽結束。\" class=\"game clearfix\"   data-id=\"741\" data-m='{\"i\":741,\"p\":737,\"n\":\"basketball_nba\",\"y\":15,\"l\":\"30401000002073943\",\"o\":4}'>\n" +
" <div class=\"teambased \">\n" +
"<div>\n" +
"<div>\n" +
"<img alt=\"金州勇士 標誌\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cS5z?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">勇士</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div class=\"score-container\">\n" +
" <p class=\"sports-header-bold\">1月19日</p>\n" +
"\n" +
" <div class=\"clearfix\">\n" +
"<p class=\"sports-header-light\">112</p>\n" +
"<p class=\"sports-header-light\">-</p>\n" +
"<p class=\"sports-header-light\">94</p>\n" +
"</div>\n" +
"\n" +
" <p class=\"sports-header-bold\">比賽結束</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div>\n" +
"<img alt=\"洛杉磯快艇 標誌\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AAfbmMi?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">快艇</p>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" </a>\n" +
" <a href=\"/zh-tw/sports/nba/克里夫蘭騎士-at-猶他爵士/game-center/sp-id-30401000002074313\" aria-label=\"克里夫蘭騎士 對 猶他爵士。比賽日期: 1月19日 上午 10:00 CST 。得分為 99-115 。比賽結束。\" class=\"game clearfix\"   data-id=\"742\" data-m='{\"i\":742,\"p\":737,\"n\":\"basketball_nba\",\"y\":15,\"l\":\"30401000002074313\",\"o\":5}'>\n" +
" <div class=\"teambased \">\n" +
"<div>\n" +
"<div>\n" +
"<img alt=\"克里夫蘭騎士 標誌\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cZLB?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">騎士</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div class=\"score-container\">\n" +
" <p class=\"sports-header-bold\">1月19日</p>\n" +
"\n" +
" <div class=\"clearfix\">\n" +
"<p class=\"sports-header-light\">99</p>\n" +
"<p class=\"sports-header-light\">-</p>\n" +
"<p class=\"sports-header-light\">115</p>\n" +
"</div>\n" +
"\n" +
" <p class=\"sports-header-bold\">比賽結束</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div>\n" +
"<img alt=\"猶他爵士 標誌\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cPAk?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">爵士</p>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" </a>\n" +
"\n" +
"\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<script>\n" +
"    define(\"homepageFinanceIndices\", [\"c.deferred\"], function () {\n" +
"        var config = {};\n" +
"        config.indexdetailsurl = \"/zh-tw/money/indexdetails\";\n" +
"config.stockdetailsurl = \"/zh-tw/money/stockdetails\";\n" +
"config.funddetailsurl = \"/zh-tw/money/funddetails\";\n" +
"config.etfdetailsurl = \"/zh-tw/money/etfdetails\";\n" +
"config.recentquotesurl = \"/zh-tw/money/getrecentquotes\";\n" +
"config.commoditydetailsurl = \"/zh-tw/money/markets/commoditydetails\";\n" +
"config.currencyConverterUrl = \"/zh-tw/money/currencyconverter\";\n" +
"config.market = \"zh-tw\";\n" +
"config.FORMCode = \"PRHPSQ\";\n" +
"config.PopularSearchesFormCode = \"PHMSPS\";\n" +
"config.RecentQuotesFormCode = \"PRHMRQ\";\n" +
"return config;\n" +
"});\n" +
"</script>\n" +
" <div id=\"fi-module1\" class=\"dense-module\"   data-id=\"743\" data-m='{\"i\":743,\"p\":709,\"n\":\"Stripe.weather.FinanceSD\",\"t\":\"FinanceHomepageStructuredDataModuleServiceTask\",\"o\":11}' >\n" +
"     <div class=\"fi-as-container\">\n" +
"        <input type=\"text\"\n" +
"               id=\"finance-autosuggest\"\n" +
"               role=\"combobox\"\n" +
"               aria-expanded=\"false\"\n" +
"               aria-autocomplete=\"list\"\n" +
"               aria-owns=\"quote_search_results\"\n" +
"               placeholder=\"報價搜尋\"\n" +
"               title=\"報價搜尋\"\n" +
"               \n" +
"               autocomplete=\"off\"\n" +
"                data-id=\"744\" data-m='{\"i\":744,\"p\":709,\"n\":\"quotesearch\",\"y\":14,\"o\":12}' />\n" +
"        <span class=\"search fi-as-icon\" role=\"button\" title=\"\"></span>\n" +
"    </div>\n" +
"\n" +
" <div class=\"as-peek-container\">\n" +
"\n" +
"</div>\n" +
"\n" +
" <a class=\"multiquoteboxheader markets-header\" href=\"/zh-tw/money/markets\"  data-id=\"745\" data-m='{\"i\":745,\"p\":709,\"n\":\"DenseStartStripeMarketsLink\",\"y\":14,\"o\":13}'>\n" +
"<span>市場</span>\n" +
"<span class=\"multiquote-cheveron\" aria-hidden=\"true\"></span>\n" +
"</a>\n" +
" <a aria-label=\"台股指數 increase 9,836.06 +46.91 +0.48%\" href=\"/zh-tw/money/indexdetails/fi-144.10.%21WTIND\"  data-id=\"746\" data-m='{\"i\":746,\"p\":709,\"n\":\"DenseStartStripeEntitiesLink\",\"y\":14,\"o\":14}'>\n" +
" <div class=\"fi-multiquoteview\">\n" +
" <span class=\"fi-title\"><p class='truncated-string'  title='台股指數'>台股指數</p></span>\n" +
" <span class=\"fi-sec-title\"><p class='truncated-string'  title='!WTIND'>!WTIND</p></span>\n" +
" <div class=\"fi-values\">\n" +
"<div class=\"fi-curval-cntr\">\n" +
"<span class=\"fi-curval\">9,836.06</span>\n" +
"<span class=\"fi-chdir increase\">&#x25B2;</span>\n" +
"</div>\n" +
"<div class=\"fi-ch-cntnr\">\n" +
"<span class=\"fi-ch  increase\">+46.91</span>\n" +
"<span class=\"fi-chp  increase\">+0.48%</span>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" <div class=\"fi-multiquoteview-hover\"></div>\n" +
"\n" +
"</a>\n" +
" <a aria-label=\"台積電 decrease 218.50 -2.00 -0.91%\" href=\"/zh-tw/money/stockdetails/fi-144.1.2330.TAI\"  data-id=\"747\" data-m='{\"i\":747,\"p\":709,\"n\":\"DenseStartStripeEntitiesLink\",\"y\":14,\"o\":15}'>\n" +
" <div class=\"fi-multiquoteview\">\n" +
" <span class=\"fi-title\"><p class='truncated-string'  title='台積電'>台積電</p></span>\n" +
" <span class=\"fi-sec-title\"><p class='truncated-string'  title='2330'>2330</p></span>\n" +
" <div class=\"fi-values\">\n" +
"<div class=\"fi-curval-cntr\">\n" +
"<span class=\"fi-curval\">218.50</span>\n" +
"<span class=\"fi-chdir decrease\">&#x25BC;</span>\n" +
"</div>\n" +
"<div class=\"fi-ch-cntnr\">\n" +
"<span class=\"fi-ch  decrease\">-2.00</span>\n" +
"<span class=\"fi-chp  decrease\">-0.91%</span>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" <div class=\"fi-multiquoteview-hover\"></div>\n" +
"\n" +
"</a>\n" +
" <a aria-label=\"USD/TWD increase 30.8720 +0.0150 +0.05%\" href=\"/zh-tw/money/tools/currencyconverter/fi-USD-TWD\"  data-id=\"748\" data-m='{\"i\":748,\"p\":709,\"n\":\"DenseStartStripeEntitiesLink\",\"y\":14,\"o\":16}'>\n" +
" <div class=\"fi-multiquoteview\">\n" +
" <span class=\"fi-title\"><p class='truncated-string'  title='USD/TWD'>USD/TWD</p></span>\n" +
" <span class=\"fi-sec-title\"></span>\n" +
" <div class=\"fi-values\">\n" +
"<div class=\"fi-curval-cntr\">\n" +
"<span class=\"fi-curval\">30.8720</span>\n" +
"<span class=\"fi-chdir increase\">&#x25B2;</span>\n" +
"</div>\n" +
"<div class=\"fi-ch-cntnr\">\n" +
"<span class=\"fi-ch  increase\">+0.0150</span>\n" +
"<span class=\"fi-chp  increase\">+0.05%</span>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" <div class=\"fi-multiquoteview-hover\"></div>\n" +
"\n" +
"</a>\n" +
" <a aria-label=\"JPY/TWD increase 0.2817 +0.0064 +2.34%\" href=\"/zh-tw/money/tools/currencyconverter/fi-JPY-TWD\"  data-id=\"749\" data-m='{\"i\":749,\"p\":709,\"n\":\"DenseStartStripeEntitiesLink\",\"y\":14,\"o\":17}'>\n" +
" <div class=\"fi-multiquoteview\">\n" +
" <span class=\"fi-title\"><p class='truncated-string'  title='JPY/TWD'>JPY/TWD</p></span>\n" +
" <span class=\"fi-sec-title\"></span>\n" +
" <div class=\"fi-values\">\n" +
"<div class=\"fi-curval-cntr\">\n" +
"<span class=\"fi-curval\">0.2817</span>\n" +
"<span class=\"fi-chdir increase\">&#x25B2;</span>\n" +
"</div>\n" +
"<div class=\"fi-ch-cntnr\">\n" +
"<span class=\"fi-ch  increase\">+0.0064</span>\n" +
"<span class=\"fi-chp  increase\">+2.34%</span>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" <div class=\"fi-multiquoteview-hover\"></div>\n" +
"\n" +
"</a>\n" +
"\n" +
"</div>\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent highdensity\"  data-module-id=\"startpage|Stripe.weather|stripe|Stripe.weather.AD_MS|headlines\"  data-aop=\"stripe.weather.ad_ms\"  data-id=\"750\" data-m='{\"i\":750,\"p\":709,\"n\":\"Stripe.weather.AD_MS\",\"t\":\"headlines\",\"o\":18}'>\n" +
" \n" +
" <section>\n" +
"<header><h3><a href=\"/zh-tw/weather\" >工具</a></h3></header>\n" +
"  <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"752\" data-m='{\"i\":752,\"p\":750,\"n\":\"secondary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"753\" data-m='{\"i\":753,\"p\":752,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":1}'  >\n" +
"<a href=\"http://clk.tradedoubler.com/click?p=235163&amp;a=2811343&amp;epi=PRIME_ZHTW_HP_ENTSS&amp;url=https://www.microsoft.com/zh-tw/store/d/office-365-university/cfq7ttc0k5bb\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAhz6Z8.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Office365 Students - Microsoft\" /> <div>\n" +
"<h3  >一套Office供多人使用 教育專案特價實施中</h3>\n" +
"\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
"\n" +
"</section>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"754\" data-m='{\"i\":754,\"p\":709,\"n\":\"rightarrow\",\"y\":12,\"o\":19}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"本日星座運勢\"\n" +
"          data-section-id=\"stripe.tv\"\n" +
"          data-section-id=\"stripe.tv\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.tv_stripe\"  data-id=\"755\" data-m='{\"i\":755,\"p\":19,\"n\":\"stripe.tv\",\"t\":\"stripe\",\"o\":18}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"756\" data-m='{\"i\":756,\"p\":755,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.tv.navigation_stripenavigation\"  data-id=\"757\" data-m='{\"i\":757,\"p\":755,\"n\":\"stripe.tv.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"758\" data-m='{\"i\":758,\"p\":757,\"n\":\"本日星座運勢\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/lifestyle/horoscope\"  data-id=\"759\" data-m='{\"i\":759,\"p\":757,\"n\":\"本日星座運勢\",\"y\":4,\"o\":2}'>本日星座運勢</a></h2>\n" +
"</li>\n" +
"  </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"760\" data-m='{\"i\":760,\"p\":757,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":3}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"761\" data-m='{\"i\":761,\"p\":757,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":4}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"762\" data-m='{\"i\":762,\"p\":757,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":5}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"763\" data-m='{\"i\":763,\"p\":757,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":6}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"764\" data-m='{\"i\":764,\"p\":757,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":7}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.tv|stripe|shopping.tv.hero1|headlines\"  data-aop=\"hero1\"  data-id=\"765\" data-m='{\"i\":765,\"p\":755,\"n\":\"shopping.tv.hero1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"766\" data-m='{\"i\":766,\"p\":765,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"767\" data-m='{\"i\":767,\"p\":766,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYkY5\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e7%89%a1%e7%be%8a%e5%ba%a7-%e8%a6%81%e5%a4%9a%e6%b3%a8%e6%84%8f%e8%ba%ab%e9%ab%94%e7%99%bc%e5%87%ba%e7%9a%84%e8%ad%a6%e8%a8%8a%e3%80%82/ar-BBNYkY5?li=BBuDJhq\"  >\n" +
"<img alt=\"牡羊座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcrv.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"牡羊座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"牡羊座-要多注意身體發出的警訊。-文章\">牡羊座-要多注意身體發出的警訊。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"768\" data-m='{\"i\":768,\"p\":766,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYefU\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e9%87%91%e7%89%9b%e5%ba%a7-%e5%9c%a8%e5%bf%99%e4%ba%82%e5%92%8c%e9%96%92%e9%81%a9%e4%b9%8b%e9%96%93%e6%89%be%e5%b9%b3%e8%a1%a1%e9%bb%9e%e3%80%82/ar-BBNYefU?li=BBuDJhq\"  >\n" +
"<img alt=\"金牛座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYa1N.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"金牛座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"金牛座-在忙亂和閒適之間找平衡點。-文章\">金牛座-在忙亂和閒適之間找平衡點。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"769\" data-m='{\"i\":769,\"p\":766,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYcrB\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e9%9b%99%e5%ad%90%e5%ba%a7-%e9%96%8b%e6%9c%97%e6%a8%82%e8%a7%80%e7%9a%84%e6%85%8b%e5%ba%a6%e6%9c%89%e5%8a%a9%e5%81%a5%e5%ba%b7%e3%80%82/ar-BBNYcrB?li=BBuDJhq\"  >\n" +
"<img alt=\"雙子座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcry.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"雙子座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"雙子座-開朗樂觀的態度有助健康。-文章\">雙子座-開朗樂觀的態度有助健康。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.tv|stripe|shopping.tv.hero2|headlines\"  data-aop=\"hero2\"  data-id=\"770\" data-m='{\"i\":770,\"p\":755,\"n\":\"shopping.tv.hero2\",\"t\":\"headlines\",\"o\":4}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"771\" data-m='{\"i\":771,\"p\":770,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"772\" data-m='{\"i\":772,\"p\":771,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYhd5\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e5%b7%a8%e8%9f%b9%e5%ba%a7-%e6%b3%a8%e6%84%8f%e9%81%8b%e5%8b%95%ef%bc%8c%e6%8f%90%e9%ab%98%e6%8a%b5%e6%8a%97%e5%8a%9b%e3%80%82/ar-BBNYhd5?li=BBuDJhq\"  >\n" +
"<img alt=\"巨蟹座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcrw.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"巨蟹座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"巨蟹座-注意運動，提高抵抗力。-文章\">巨蟹座-注意運動，提高抵抗力。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"773\" data-m='{\"i\":773,\"p\":771,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYhd6\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e7%8d%85%e5%ad%90%e5%ba%a7-%e5%ae%8c%e5%85%a8%e7%9a%84%e6%ba%96%e5%82%99%e8%ae%93%e8%87%aa%e5%b7%b1%e8%a1%a8%e7%8f%be%e4%b8%8d%e5%87%a1%e3%80%82/ar-BBNYhd6?li=BBuDJhq\"  >\n" +
"<img alt=\"獅子座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGB.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"獅子座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"獅子座-完全的準備讓自己表現不凡。-文章\">獅子座-完全的準備讓自己表現不凡。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"774\" data-m='{\"i\":774,\"p\":771,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNY6BJ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e8%99%95%e5%a5%b3%e5%ba%a7-%e5%b1%95%e7%8f%be%e5%8f%a3%e6%89%8d%e8%83%bd%e5%8a%9b%e3%80%82/ar-BBNY6BJ?li=BBuDJhq\"  >\n" +
"<img alt=\"處女座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGy.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"處女座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"處女座-展現口才能力。-文章\">處女座-展現口才能力。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.tv|stripe|shopping.tv.hero3|headlines\"  data-aop=\"hero3\"  data-id=\"775\" data-m='{\"i\":775,\"p\":755,\"n\":\"shopping.tv.hero3\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"776\" data-m='{\"i\":776,\"p\":775,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"777\" data-m='{\"i\":777,\"p\":776,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYhd4\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e5%a4%a9%e7%a7%a4%e5%ba%a7-%e6%8e%a7%e5%88%b6%e8%87%aa%e5%b7%b1%e7%9a%84%e4%b8%8d%e7%a9%a9%e5%ae%9a%e6%83%85%e7%b7%92%e3%80%82/ar-BBNYhd4?li=BBuDJhq\"  >\n" +
"<img alt=\"天秤座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGz.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"天秤座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"天秤座-控制自己的不穩定情緒。-文章\">天秤座-控制自己的不穩定情緒。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"778\" data-m='{\"i\":778,\"p\":776,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNY6BI\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e5%a4%a9%e8%a0%8d%e5%ba%a7-%e7%a9%8d%e6%a5%b5%e5%8f%83%e5%8a%a0%e5%90%84%e9%a0%85%e6%b4%bb%e5%8b%95%e3%80%82/ar-BBNY6BI?li=BBuDJhq\"  >\n" +
"<img alt=\"天蠍座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNY6BG.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"天蠍座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"天蠍座-積極參加各項活動。-文章\">天蠍座-積極參加各項活動。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"779\" data-m='{\"i\":779,\"p\":776,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYcrA\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e5%b0%84%e6%89%8b%e5%ba%a7-%e5%a0%85%e6%8c%81%e8%87%aa%e5%b7%b1%e4%b8%80%e8%b2%ab%e7%9a%84%e7%94%9f%e6%b4%bb%e7%8b%80%e6%85%8b%e3%80%82/ar-BBNYcrA?li=BBuDJhq\"  >\n" +
"<img alt=\"射手座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYhd0.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"射手座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"射手座-堅持自己一貫的生活狀態。-文章\">射手座-堅持自己一貫的生活狀態。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.tv|stripe|shopping.tv.hero4|headlines\"  data-aop=\"hero4\"  data-id=\"780\" data-m='{\"i\":780,\"p\":755,\"n\":\"shopping.tv.hero4\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"781\" data-m='{\"i\":781,\"p\":780,\"n\":\"tertiary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"782\" data-m='{\"i\":782,\"p\":781,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYjGC\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e6%91%a9%e7%be%af%e5%ba%a7-%e8%88%87%e5%90%88%e4%bd%9c%e5%a4%a5%e4%bc%b4%e8%a8%8e%e8%ab%96%e6%9c%aa%e4%be%86%e3%80%82/ar-BBNYjGC?li=BBuDJhq\"  >\n" +
"<img alt=\"摩羯座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcrx.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"摩羯座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"摩羯座-與合作夥伴討論未來。-文章\">摩羯座-與合作夥伴討論未來。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"783\" data-m='{\"i\":783,\"p\":781,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYjGI\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e6%b0%b4%e7%93%b6%e5%ba%a7-%e4%b8%8d%e8%a6%81%e6%94%be%e9%81%8e%e4%bb%bb%e4%bd%95%e6%a9%9f%e6%9c%83%e3%80%82/ar-BBNYjGI?li=BBuDJhq\"  >\n" +
"<img alt=\"水瓶座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGH.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"水瓶座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"水瓶座-不要放過任何機會。-文章\">水瓶座-不要放過任何機會。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"784\" data-m='{\"i\":784,\"p\":781,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYjGJ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e9%9b%99%e9%ad%9a%e5%ba%a7-%e9%96%b1%e8%ae%80%e4%ba%9b%e4%bf%9d%e9%a4%8a%e7%9a%84%e6%9b%b8%e7%b1%8d%e6%9c%83%e6%9c%89%e5%b9%ab%e5%8a%a9%e3%80%82/ar-BBNYjGJ?li=BBuDJhq\"  >\n" +
"<img alt=\"雙魚座\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNY6BO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"雙魚座 - 明日工作室\" /> <div>\n" +
"<h3   aria-label=\"雙魚座-閱讀些保養的書籍會有幫助。-文章\">雙魚座-閱讀些保養的書籍會有幫助。</h3>\n" +
"\n" +
"<img alt=\"明日工作室 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>明日工作室</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"785\" data-m='{\"i\":785,\"p\":755,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"微軟商城\"\n" +
"          data-section-id=\"stripe.special\"\n" +
"          data-section-id=\"stripe.special\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.special_stripe\"  data-id=\"786\" data-m='{\"i\":786,\"p\":19,\"n\":\"stripe.special\",\"t\":\"stripe\",\"o\":19}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"787\" data-m='{\"i\":787,\"p\":786,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"上一頁\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.special.navigation_stripenavigation\"  data-id=\"788\" data-m='{\"i\":788,\"p\":786,\"n\":\"stripe.special.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"789\" data-m='{\"i\":789,\"p\":788,\"n\":\"微軟商城\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAV&u=https://www.microsoft.com/zh-tw/store/b/home\"  data-id=\"790\" data-m='{\"i\":790,\"p\":788,\"n\":\"微軟商城\",\"y\":4,\"o\":2}'>微軟商城</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"791\" data-m='{\"i\":791,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Office\",\"o\":3}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVOffice1&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\">Office</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"792\" data-m='{\"i\":792,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Windows\",\"o\":4}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVWin2&amp;u=https://www.microsoft.com/zh-tw/store/collections/windows/pc\">Windows</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"793\" data-m='{\"i\":793,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Visio\",\"o\":5}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVVisio3&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\">Visio</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"794\" data-m='{\"i\":794,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Project\",\"o\":6}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVProject4&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\">Project</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"795\" data-m='{\"i\":795,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Visual Studio\",\"o\":7}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVVS5&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\">Visual Studio</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"796\" data-m='{\"i\":796,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Outlook信箱 (Hotmail)\",\"o\":8}'><a href=\"https://www.hotmail.com\">Outlook信箱 (Hotmail)</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"797\" data-m='{\"i\":797,\"p\":788,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":9}'>編輯</button>\n" +
" <button  role=\"menuitem\"  data-id=\"798\" data-m='{\"i\":798,\"p\":788,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":10}' class=\"remove\">移除區段</button>\n" +
" <button  role=\"menuitem\"  data-id=\"799\" data-m='{\"i\":799,\"p\":788,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":11}' class=\"up\">將區段向上移動</button>\n" +
"<button  role=\"menuitem\"  data-id=\"800\" data-m='{\"i\":800,\"p\":788,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":12}' class=\"down\">將區段向下移動</button>\n" +
" <button  role=\"menuitem\"  data-id=\"801\" data-m='{\"i\":801,\"p\":788,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":13}' class=\"add\">在下面新增區段</button>\n" +
" </div>\n" +
"\n" +
" \n" +
"</div>\n" +
"    <div class=\"paging-container\">\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.special|stripe|stripe.special.1|headlines\"  data-aop=\"section_1\"  data-id=\"802\" data-m='{\"i\":802,\"p\":786,\"n\":\"stripe.special.1\",\"t\":\"headlines\",\"o\":3}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"803\" data-m='{\"i\":803,\"p\":802,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"804\" data-m='{\"i\":804,\"p\":803,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":1}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_O365&amp;u=https://www.microsoft.com/zh-tw/store/collections/officesuites/pc\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBBgmBy.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Office 365 - Microsoft\" /> <div>\n" +
"<h3  >Office 365跨平台通用 驚喜價只要219元</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"廣告\">廣告</span>\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.special|stripe|stripe.special.2|headlines\"  data-aop=\"section_2\"  data-id=\"805\" data-m='{\"i\":805,\"p\":786,\"n\":\"stripe.special.2\",\"t\":\"headlines\",\"o\":4}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"806\" data-m='{\"i\":806,\"p\":805,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"807\" data-m='{\"i\":807,\"p\":806,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":1}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_Windows&amp;u=https://www.microsoft.com/zh-tw/store/collections/windows/pc\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBBg8nB.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Windows 10 - Microsoft\" /> <div>\n" +
"<h3  >Windows 10：有史以來最好的微軟作業系統</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"廣告\">廣告</span>\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.special|stripe|stripe.special.3|headlines\"  data-aop=\"section_3\"  data-id=\"808\" data-m='{\"i\":808,\"p\":786,\"n\":\"stripe.special.3\",\"t\":\"headlines\",\"o\":5}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"809\" data-m='{\"i\":809,\"p\":808,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"810\" data-m='{\"i\":810,\"p\":809,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":1}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_OFFICEALL&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAmaQeF.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <div>\n" +
"<h3  >為您量身打造的全系列 Office</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"廣告\">廣告</span>\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|stripe.special|stripe|stripe.special.4|headlines\"  data-aop=\"section_4\"  data-id=\"811\" data-m='{\"i\":811,\"p\":786,\"n\":\"stripe.special.4\",\"t\":\"headlines\",\"o\":6}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"812\" data-m='{\"i\":812,\"p\":811,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"813\" data-m='{\"i\":813,\"p\":812,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":1}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_VisualStudio&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBBgfxs.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Visual Studio 2017 - Microsoft\" /> <div>\n" +
"<h3  >全新 Visual Studio 2017 登場 享受五星級開發體驗</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"廣告\">廣告</span>\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" <ul class=\"tertiary\"  data-aop=\"tertiary\"  data-id=\"814\" data-m='{\"i\":814,\"p\":811,\"n\":\"tertiary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"815\" data-m='{\"i\":815,\"p\":814,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBB8utw\",\"h\":0,\"v\":\"news\",\"c\":\"microsofttw\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/news/microsofttaiwan/%e7%82%ba%e5%8d%94%e5%8a%a9%e6%8a%b5%e7%a6%a6%e5%a4%a7%e8%a6%8f%e6%a8%a1%e6%83%a1%e6%84%8f%e5%8b%92%e7%b4%a2%e7%97%85%e6%af%92%e7%9a%84%e4%be%b5%e8%a5%b2%ef%bc%8c%e8%ab%8b%e7%94%a8%e6%88%b6%e7%ab%8b%e5%8d%b3%e5%ae%89%e8%a3%9d%e5%be%ae%e8%bb%9f%e6%96%bc%e4%b8%89%e6%9c%88%e9%87%8b%e5%87%ba%e7%9a%84%e5%ae%89%e5%85%a8%e6%80%a7%e6%9b%b4%e6%96%b0ms17-010/ar-BBB8utw?li=BBqiSG2\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBB8E0e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"MS17-010\" /> <div>\n" +
"<h3   aria-label=\"【重要】抵禦惡意勒索病毒 請立即安裝更新-文章\">【重要】抵禦惡意勒索病毒 請立即安裝更新</h3>\n" +
"\n" +
"<img alt=\"Photos 標誌\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Photos</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"816\" data-m='{\"i\":816,\"p\":814,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":2}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_Project&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBqBJmP.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Check list - iStock/Getty-Images\" /> <div>\n" +
"<h3  >使用 Project 管理專案 就是這麼井然有序</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"廣告\">廣告</span>\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"817\" data-m='{\"i\":817,\"p\":814,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":3}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_MacOffice&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/CCnD9N.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Mac Office - Microsoft\" /> <div>\n" +
"<h3  >最棒的文書處理軟體 Mac 也能擁有！</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"廣告\">廣告</span>\n" +
" <span>Microsoft Store</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"    </div>\n" +
"\n" +
"                <div class=\"paging\"></div>\n" +
"            </div>\n" +
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"818\" data-m='{\"i\":818,\"p\":786,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"下一頁\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
" <a id=\"deferred-page-content\"  href=\"https://www.msn.com/zh-tw/?ocid=mailsignout&amp;item=deferred_page:1&amp;ignorejs=webcore%2fmodules%2fjsbundleperfmarkerstart%3bwebcore%2fpages%2fbasepage%3bwebcore%2fpages%2fstartpage%3bwebcore%2fmodules%2flazyload%3bwebcore%2fshared%2fcore%2ftracking%2fotflogging.vnext%3bwebcore%2fmodules%2ffeedback%3bwebcore%2fmodules%2fpageheader%3bwebcore%2fmodules%2fpagefooter%3bwebcore%2fmodules%2ffloatingfeedbacklink%3bwebcore%2fmodules%2fautosuggestsnr%3bwebcore%2fmodules%2fmecontrol%3bweather%2fmodules%2ftodayminimodule%3bwebcore%2fmodules%2fheadlinesvnext%3bwebcore%2fmodules%2fsectionheadlines%3bwebcore%2fmodules%2fpollmodule%3bweather%2fmodules%2fweatherhpstripetile%3bsports%2fmodules%2fsportsstripemodule%3bfinance%2fmodules%2fstartpagefinanceindices%3bwebcore%2fmodules%2finfopanevnext%3bwebcore%2fmodules%2fdelayload%3bwebcore%2fmodules%2fjsbundleperfmarkerend\">\n" +
"<span>Click here for more</span>\n" +
"</a>\n" +
"\n" +
"\n" +
"   </main>\n" +
" </div>\n" +
"</div>\n" +
"\n" +
"    <div id=\"prefooter\"  data-region=\"prefooter\"  data-id=\"819\" data-m='{\"i\":819,\"n\":\"prefooter\",\"y\":6}'>\n" +
"        \n" +
"\n" +
"            <a class=\"floatingfeedback\" href=\"#\"  data-id=\"820\" data-m='{\"i\":820,\"p\":819,\"n\":\"feedbackLink\",\"y\":12,\"o\":1}'  data-aop=\"floatingfeedbacklink\">意見反應</a>\n" +
"\n" +
"\n" +
"        \n" +
"        \n" +
" <section id=\"stripemenuoptions\"  data-aop=\"stripe-personalization\">\n" +
"<p>新增或移除區段</p>\n" +
"<button class=\"close\"  data-id=\"821\" data-m='{\"i\":821,\"y\":12,\"l\":\"stripe_personalization_close\"}'>關閉</button>\n" +
"<div>\n" +
" <button  aria-label=\"移除 焦點\"  data-stripe-id=\"stripe.photos\"  data-id=\"822\" data-m='{\"i\":822,\"y\":12,\"l\":\"stripe_toggle_stripe.photos\"}' >\n" +
" \n" +
" <span>焦點</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 娛樂\"  data-stripe-id=\"stripe.entertainment\"  data-id=\"823\" data-m='{\"i\":823,\"y\":12,\"l\":\"stripe_toggle_stripe.entertainment\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5YPIS.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>娛樂</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 財經\"  data-stripe-id=\"stripe.finance\"  data-id=\"824\" data-m='{\"i\":824,\"y\":12,\"l\":\"stripe_toggle_stripe.finance\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4BwSM.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Finance\" />\n" +
" <span>財經</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 新聞\"  data-stripe-id=\"stripe.news\"  data-id=\"825\" data-m='{\"i\":825,\"y\":12,\"l\":\"stripe_toggle_stripe.news\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4CFdS.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"National News\" />\n" +
" <span>新聞</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 生活\"  data-stripe-id=\"stripe.lifestyle\"  data-id=\"826\" data-m='{\"i\":826,\"y\":12,\"l\":\"stripe_toggle_stripe.lifestyle\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oDps.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>生活</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 健康\"  data-stripe-id=\"stripe.health\"  data-id=\"827\" data-m='{\"i\":827,\"y\":12,\"l\":\"stripe_toggle_stripe.health\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5YKmV.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>健康</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 運動\"  data-stripe-id=\"stripe.sports\"  data-id=\"828\" data-m='{\"i\":828,\"y\":12,\"l\":\"stripe_toggle_stripe.sports\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oQGX.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>運動</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 汽車\"  data-stripe-id=\"stripe.autos\"  data-id=\"829\" data-m='{\"i\":829,\"y\":12,\"l\":\"stripe_toggle_stripe.autos\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4Ca1l.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Autos\" />\n" +
" <span>汽車</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 影音\"  data-stripe-id=\"stripe.video\"  data-id=\"830\" data-m='{\"i\":830,\"y\":12,\"l\":\"stripe_toggle_stripe.video\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oAOK.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>影音</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 新奇\"  data-stripe-id=\"stripe.viralvideo\"  data-id=\"831\" data-m='{\"i\":831,\"y\":12,\"l\":\"stripe_toggle_stripe.viralvideo\"}' >\n" +
" \n" +
" <span>新奇</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 工具\"  data-stripe-id=\"stripe.weather\"  data-id=\"832\" data-m='{\"i\":832,\"y\":12,\"l\":\"stripe_toggle_Stripe.weather\"}' >\n" +
" \n" +
" <span>工具</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 本日星座運勢\"  data-stripe-id=\"stripe.tv\"  data-id=\"833\" data-m='{\"i\":833,\"y\":12,\"l\":\"stripe_toggle_stripe.tv\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oL47.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>本日星座運勢</span>\n" +
" </button>\n" +
" <button  aria-label=\"移除 微軟商城\"  data-stripe-id=\"stripe.special\"  data-id=\"834\" data-m='{\"i\":834,\"y\":12,\"l\":\"stripe_toggle_stripe.special\"}' >\n" +
" \n" +
" <span>微軟商城</span>\n" +
" </button>\n" +
" <button  aria-label=\"新增 兩岸國際\"  data-stripe-id=\"stripe.world\"  data-id=\"835\" data-m='{\"i\":835,\"y\":12,\"l\":\"stripe_toggle_stripe.world\"}'  class=\"pending\">\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6olcF.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>兩岸國際</span>\n" +
" </button>\n" +
" <button  aria-label=\"新增 國內\"  data-stripe-id=\"stripe.national\"  data-id=\"836\" data-m='{\"i\":836,\"y\":12,\"l\":\"stripe_toggle_stripe.national\"}'  class=\"pending\">\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oAHY.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>國內</span>\n" +
" </button>\n" +
" <button  aria-label=\"新增 科技與科學\"  data-stripe-id=\"stripe.tech\"  data-id=\"837\" data-m='{\"i\":837,\"y\":12,\"l\":\"stripe_toggle_stripe.tech\"}'  class=\"pending\">\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4Cxu3.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Khoa h?c &amp; C?ng ngh?\" />\n" +
" <span>科技與科學</span>\n" +
" </button>\n" +
" <div class=\"loading\"></div>\n" +
"</div>\n" +
"<button class=\"done\"  data-id=\"838\" data-m='{\"i\":838,\"y\":12,\"l\":\"stripe_personalization_submit\"}'>完成</button>\n" +
"</section>\n" +
"\n" +
"    </div>\n" +
"        <div id=\"foot\">\n" +
"            <footer  class=\"ab c2\"\n" +
"                role=\"contentinfo\"  data-region=\"footer\"\n" +
"                 data-id=\"839\" data-m='{\"i\":839,\"n\":\"Footer\",\"y\":2}'>\n" +
"                \n" +
"                 <a class=\"copyright microsoft\" href=\"https://www.microsoft.com/zh-tw/\"  data-id=\"840\" data-m='{\"i\":840,\"p\":839,\"n\":\"MicrosoftCopyright\",\"y\":14,\"o\":1}'><span></span><span></span>&#169; 2019 Microsoft</a>\n" +
" <ul class=\"app-badges\">\n" +
"        <li class=\"apple-badge\">\n" +
"            <a href=\"https://itunes.apple.com/tw/app/microsoft-news/id945416273?pt=80423&amp;ct=prime_footer&amp;mt=8\"  target=\"_blank\"  title=\"App Store 下載\"  data-id=\"841\" data-m='{\"i\":841,\"p\":839,\"n\":\"amsnewsft\",\"y\":11,\"o\":2}'><img  alt=\"App Store 下載\" src=\"https://linkmaker.itunes.apple.com/assets/shared/badges/zh-tw/appstore-lrg.svg\")/></a>\n" +
"        </li>\n" +
"        <li class=\"google-badge\">\n" +
"            <a href=\"https://play.google.com/store/apps/details?id=com.microsoft.amp.apps.bingnews&amp;hl=zh-tw&amp;referrer=utm_source=prime_footer&amp;utm_campaign=footer\"  target=\"_blank\"  title=\"Google Play 立即下載\"  data-id=\"842\" data-m='{\"i\":842,\"p\":839,\"n\":\"gmsnewsft\",\"y\":11,\"o\":3}'><img  alt=\"Google Play 立即下載\" src=\"https://play.google.com/intl/en_us/badges/images/generic/zh-tw_badge_web_generic.png\")/></a>\n" +
"        </li>\n" +
" </ul>\n" +
" <ul id=\"social-plugins\"\n" +
" data-facebook-like-url=\"https://www.facebook.com/msntwnews\" data-facebook-button-width=\"9.7rem\"  data-twitter-follow-screen-name=\"msntaiwan\" data-twitter-button-width=\"13.4rem\" data-twitter-show-screen-name=\"false\" >\n" +
" <li id=\"fbcount\"  data-id=\"843\" data-m='{\"i\":843,\"p\":839,\"n\":\"facebook\",\"y\":11,\"o\":4}'></li>\n" +
"  <li id=\"twcount\"  data-id=\"844\" data-m='{\"i\":844,\"p\":839,\"n\":\"twitter\",\"y\":11,\"o\":5}'></li>\n" +
" </ul>\n" +
" <ul id=\"links\">\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkId=521839\"    data-id=\"845\" data-m='{\"i\":845,\"p\":839,\"n\":\"footer_privacy\",\"y\":14,\"o\":6}'\n" +
">\n" +
"隱私權 &amp; 小型文字檔案\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkID=246338\"    data-id=\"846\" data-m='{\"i\":846,\"p\":839,\"n\":\"footer_termsofuse\",\"y\":14,\"o\":7}'\n" +
">\n" +
"使用規定\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkID=286759\"    data-id=\"847\" data-m='{\"i\":847,\"p\":839,\"n\":\"footer_adprivacyinfo\",\"y\":14,\"o\":8}'\n" +
">\n" +
"關於我們的廣告\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"#\"  id=\"footer_feedback\"   data-id=\"848\" data-m='{\"i\":848,\"p\":839,\"n\":\"footer_feedback\",\"y\":14,\"o\":9}'\n" +
" target=\"_self\">意見反應\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkId=512703\"    data-id=\"849\" data-m='{\"i\":849,\"p\":839,\"n\":\"footer_help\",\"y\":14,\"o\":10}'\n" +
">\n" +
"說明\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"/zh-tw/msn-worldwide\"    data-id=\"850\" data-m='{\"i\":850,\"p\":839,\"n\":\"footer_worldwide\",\"y\":14,\"o\":11}'\n" +
">\n" +
"MSN 全球\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?linkid=875132\"    data-id=\"851\" data-m='{\"i\":851,\"p\":839,\"n\":\"footer_advertise\",\"y\":14,\"o\":12}'\n" +
">\n" +
"廣告\n" +
"</a>\n" +
"</li>\n" +
" </ul>\n" +
"\n" +
"                \n" +
"            </footer>\n" +
"        </div>\n" +
"\n" +
"        <div id=\"feedback-flyout\"  data-aop=\"feedback_flyout\">\n" +
"             <button id=\"feedback-close\"  title=\"關閉\"  data-id=\"852\" data-m='{\"i\":852,\"n\":\"feedback\",\"y\":11,\"l\":\"close\"}'></button>\n" +
" <div class=\"feedbackheader mainheader\">\n" +
"<h2>傳送 MSN 意見反應</h2>\n" +
"</div>\n" +
" <div class=\"feedbackheader thankyou\">\n" +
"<h2>感謝您提供意見反應!</h2>\n" +
"</div>\n" +
" <div id=\"feedback-feedbackarea\">\n" +
"<div class=\"feedbackarea\">\n" +
"<label for=\"feedback-inputbox\">我們可以如何改進?</label>\n" +
"<textarea id=\"feedback-inputbox\" maxlength=\"400\" placeholder=\"請在此輸入您的意見反應。為協助保護您的隱私權，請不包含個人資訊 (例如您的姓名或地址)。\" aria-live=\"assertive\"></textarea>\n" +
"</div>\n" +
"</div>\n" +
" <div id=\"feedback-starrating\">\n" +
"  <div class=\"stars\">\n" +
"<p>請提供整體網站評分:</p>\n" +
"<ul data-selected=\"0\" aria-label=\"請提供整體網站評分:\" role=\"radiogroup\">\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 星級評分得到 1\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 星級評分得到 2\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 星級評分得到 3\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 星級評分得到 4\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 星級評分得到 5\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" </ul>\n" +
"</div>\n" +
" </div>\n" +
" <button id=\"feedback-submit\" class=\"footerbutton\"  title=\"提交\"  data-id=\"853\" data-m='{\"i\":853,\"n\":\"feedback\",\"y\":11,\"l\":\"submit\"}'>提交</button>\n" +
" <button id=\"feedback-ok\" class=\"footerbutton\"  title=\"關閉\"  data-id=\"854\" data-m='{\"i\":854,\"n\":\"feedback\",\"y\":11,\"l\":\"ok\"}'>關閉</button>\n" +
" <div class=\"feedbackfooter\">\n" +
" <div id=\"feedback-privacy-link\">\n" +
"<a href=\"https://go.microsoft.com/fwlink/?LinkId=521839\" class=\"footerlink\" target=\"_blank\"  data-id=\"855\" data-m='{\"i\":855,\"n\":\"feedback\",\"y\":14,\"l\":\"feedbackPrivacyLink\"}'>隱私權聲明</a>\n" +
"</div>\n" +
"  <div id=\"feedback-help-link\">\n" +
"<a href=\"https://support.microsoft.com/product/msn/msn\" class=\"footerlink\" target=\"_blank\"  data-id=\"856\" data-m='{\"i\":856,\"n\":\"feedback\",\"y\":14,\"l\":\"feedbackHelpLink\"}'>說明</a>\n" +
"</div>\n" +
"  <div id=\"feedback-help-support-link\">\n" +
"<a href=\"https://support.microsoft.com/product/msn/msn\" class=\"footerlink\" target=\"_blank\"  data-id=\"857\" data-m='{\"i\":857,\"n\":\"feedback\",\"y\":14,\"l\":\"feedbackHelpSupportLink\"}'>說明與支援</a>\n" +
"</div>\n" +
"  </div>\n" +
"\n" +
"        </div>\n" +
"<script>require([\"window\",\"document\",\"location\",\"trackInfo\",\"headData\",\"c.onload\"],function(n,t,i,r,u){(function f(){var e=r.sitePage,h=e.chartBeatUID,y=e.localeCode,o=e.channel,c=e.department,l=e.chartBeatBase,p=e.chartBeatDomain||i.hostname,w=c?o+\",\"+o+\":\"+c:o,s,u,b,a,v;h&&l?(s=n._timing||{},n._st_startpt=s.start||0,n._st_endpt=s.load||0,u=n.location.pathname,u===\"/\"||u===\"/en-us/\"?u=\"/en-us\":u.charAt(u.length-1)==\"/\"&&(u=u.substr(0,u.length-1)),b=\"\",a=y+\".\"+p,n._sf_async_config={uid:h,sessionLength:15,domain:a,sections:w,authors:e.cvPartner?decodeURIComponent(e.cvPartner.replace(\"+\",\"%20\")):\"\",path:u},v=(/\\bsn:\\s*(\\w*)/.exec(t.getElementsByTagName(\"HEAD\")[0].getAttribute(\"data-info\"))||{})[1]||\"\",n._cbq=n._cbq||[],n._cbq.push([\"_cdname\",v]),require({js:l+\"/js/chartbeat.js\"})):setTimeout(f,50)})()})</script><script>require([\"imageLoad\",\"perfMarker\",\"perfMeasure\"],function(n,t,i){var r=\"TimeToImageLoadStart\",u=\"TimeToImageLoadEnd\";t(r);n.cleanup();t(u);i(\"TimeForImageLoad\",r,u,!0)});require([\"jquery\",\"logging\",\"webApp.tokens\",\"c.deferred\"],function(n,t,i){function r(r){var u=n(this).attr(r);i.validVersionPattern.test(u)||t.error(\"[staticsLinkVerifier.js] ver query parameter missing in statics url: \"+u)}n(\"link[href*='_sc/css']\").each(function(){r.call(this,\"href\")});n(\"script[src*='_sc/js']\").each(function(){r.call(this,\"src\")})});require([\"trackInfo\",\"window\",\"c.onload\"],function(n,t){function c(){if(n.sitePage.requestId){var i=o.setupParameters(\"load_time\");i&&(i.timeToOnload=u,i.timeToDomComplete=s,i.timeToFirstByte=h,f&&(i.timeToFirstSearchRendered=f),t.performance&&t.performance.navigation&&t.performance.navigation.type&&(i.navType=t.performance.navigation.type),require([\"c.infopaneinteractive\"],function(n){n&&(i.timeToInfopaneInteractive=n);o.sendUpdate(i)}))}else t.setTimeout(c,500)}var o=n.telemetryTracking,u,s,h,f,i=(t.performance||{}).timing,r,e;i&&(u=i.loadEventStart-i.navigationStart,s=i.domComplete-i.navigationStart,h=i.responseStart-i.navigationStart,t.performance&&(r=t.performance.getEntriesByName(\"TimeToFirstSearchRendered\",\"mark\"),r&&(e=r.length,e&&e>0&&(f=Math.round(r[0].startTime)))),u&&c())});window._perfMarker&&window._perfMarker(\"TimeTocDom\",!0);window._perfMeasure&&window._perfMeasure(\"TimeForcDom\",\"TimeToHeadStart\",\"TimeTocDom\",!0);define(\"c.dom\",1);window.onload=function(n){function r(){clearTimeout(t);t=0;window._perfMarker&&window._perfMarker(\"TimeTocDeferred\");window._perfMeasure&&window._perfMeasure(\"TimeForcDeferred\",\"TimeTocOnload\",\"TimeTocDeferred\");define(\"c.deferred\",1);require([\"c.deferred\"],function(){i=setTimeout(f,u)})}function f(){clearTimeout(i);i=0;window._perfMarker&&window._perfMarker(\"TimeTocPostDeferred\");window._perfMeasure&&window._perfMeasure(\"TimeForcPostdeferred\",\"TimeTocDeferred\",\"TimeTocPostDeferred\");define(\"c.postdeferred\",1)}var t,i,u=2e3;return function(n){var i;n&&(i=(window.JSON&&window.JSON.parse(n)||{}).dms,u=(window.JSON&&window.JSON.parse(n)||{}).ps);t=setTimeout(r,i||3e3)}(document.getElementsByTagName(\"head\")[0].getAttribute(\"data-js\")),function(i){typeof n==\"function\"&&n(i);window._perfMarker&&window._perfMarker(\"TimeTocOnload\",!0);window._perfMeasure&&window._perfMeasure(\"TimeForcOnload\",\"TimeTocDom\",\"TimeTocOnload\",!0);define(\"c.onload\",1);t&&(window.setImmediate?setImmediate(r):setTimeout(r,0))}}(window.onload);define(\"withQueryNavigation\",[\"jquery\",\"navigation\",\"document\",\"location\",\"withQueryNavigation.tokens\"],function(n,t,i,r,u){function h(n){var f,s,h,e;if(!n||!c)return n;var i,r=t.getParamsFromUrl(n,!0),u=n.split(\"?\")[0],l=\"\";u&&(f=u.split(\"#\"),f.length==2&&(u=f[0],l=\"#\"+f[1]));s=[];for(i in o)r[i]||(r[i]=o[i]);for(i in r)for(h=r[i],e=0;e<h.length;++e)s.push(i+\"=\"+h[e]);return u+\"?\"+s.join(\"&\")+l}function a(n){var i=\"\";return n&&n.length>0&&(i=t.getHostName(n),!i)?!1:d.test(i)}function v(n,t){for(var i=0;i<s.length;i++)if(s[i](n,w(n,t))===!1)return!1}function y(n){return{href:n.attr(\"href\"),target:n.attr(\"target\"),$elem:n}}function p(t){if(t){for(var i=n(t.target),r=y(i);!r.href&&i.length;)i=i.parents(\"a\").eq(0),i.length&&(r=y(i));if(i.length&&r.href)return r}return null}function w(n,i){var u=\"\";if(n&&n.length){if(n.indexOf(\"javascript:\")===0)return!0;if(u=t.getHostName(n),!u)return!1}return i||u!=r.host&&u&&!b.test(u)}var b=new RegExp(u.matchDomainAsInternal,\"i\"),k=u.whiteListParamKeys.split(\",\"),e=t.getParamsFromUrl(r.href,!0),o={},s=[],c=!1,d=/(^login\\.live(-int)?\\.com$)/i,f,l;for(f in e)e.hasOwnProperty(f)&&(l=k.indexOf(f.toLowerCase()),l>-1&&(o[f]=e[f],c=!0));t.filter=function(n){return v(n)===!1?!1:a(n)?n:h(n)};n(i).on(\"click\",\"a\",function(n){var t=p(n);if(t&&v(t.href,t.target)===!1)return n.preventDefault(),n.stopPropagation(),!1});n(i).on(\"mousedown\",\"a\",function(n){var t=p(n),i,r;t&&(i=!1,r=!1,t.$elem[0].appendedWhiteListQueryParams||!i&&w(t.href,t.target)||r||(t.$elem[0].appendedWhiteListQueryParams=!0,t.$elem.attr(\"href\",a(t.href)?t.href:h(t.href))))});return{addNavigateListener:function(n){typeof n==\"function\"&&s.push(n)},ensureUrl:h}});define(\"withQueryNavigation.tokens\",{matchDomainAsInternal:\"(^t\\.(.*?\\.)?msn\\.com$)|(^news\\.msn\\.com$)|(^news\\.uk\\.msn\\.com$)|(^login\\.live(-int)?\\.com$)\",whiteListParamKeys:\"console,debugjs,devicegroup,downlevel,env,hostoverride,item,lang,noredir,staticsmode,tmx,view,deferred_page,deferred_regions_per_page,pdpenabled,flatlist,xd,skipxd,getstaticpage,setmarket,cachebypass,mock,collectmockdata,fdhead,ocid,setflight,trendinglist,csopd,csopdb,suiv,wah,ffid,overlay,overlayMinimized\"})</script><script>define(\"trackingConstants\",{trackingData: {lastIndex: 857 } });</script>        <script>window._perfMarker && window._perfMarker(\"TimeToBodyEnd\");window._perfMeasure && window._perfMeasure(\"TimeForBody\",\"TimeToBodyStart\",\"TimeToBodyEnd\",true);</script>\n" +
"</body>\n" +
"        <!--MSNAvailToken-->\n" +
"    </html>";
    public StringBuffer bufX01;
    public X01() {
        bufX01=new StringBuffer(JSP);
    }
    
    
}
