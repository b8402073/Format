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
"<link rel=\"preconnect\" href=\"img-s-msn-com.akamaized.net\" /><link rel=\"preconnect\" href=\"c.msn.com\" /><link rel=\"preconnect\" href=\"c.msn.cn\" /><link rel=\"preconnect\" href=\"https://www.bing.com\" /><link rel=\"preconnect\" href=\"//otf.msn.com\" /><link rel=\"dns-prefetch\" href=\"img-s-msn-com.akamaized.net\" /><link rel=\"dns-prefetch\" href=\"c.msn.com\" /><link rel=\"dns-prefetch\" href=\"c.msn.cn\" /><link rel=\"dns-prefetch\" href=\"https://www.bing.com\" /><link rel=\"dns-prefetch\" href=\"//otf.msn.com\" /><link rel=\"canonical\" href=\"https://www.msn.com/zh-tw/\" /><meta name=\"msapplication-TileColor\" content=\"#224f7b\"/><meta name=\"msapplication-TileImage\" content=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/1f/08ced4.png\"/><meta name=\"msapplication-config\" content=\"none\"/><meta name=\"robots\" content=\"noydir,noodp\"/><link rel=\"chrome-webstore-item\" href=\"https://chrome.google.com/webstore/detail/msn-homepage-bing-search/aodojjhnfnfhaplflfohfddffmjkdjak\" />        <title>msn �x�W�UWindows 10, Windows app ���ε{��, Microsoft Store �ӫ�, hotmail, outlook, skype, �Y�ɷs�D</title>\n" +
"<meta name=\"description\" content=\"MSN�x�W����Windows 10 �ɯŸ�T�BWindows app ���ε{�����˻P�U���s���A�H��Surface���L�n�ӫ� Microsoft Store ���˰ӫ~�C�z�]�i�H�\Ū���|�B�F�v�B�B�ʡB�W�H�B�]�g�B�Ѯ�B�ȹC�B���d�B�P�y�������s�D�A�õ��X Outlook�BFacebook�BTwitter�BHotmail �P Skype ����Τu��C\"/>\n" +
" <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,maximum-scale=2.0\" />\n" +
"\n" +
"<link rel=\"stylesheet\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/zh-tw/homepage/_sc/css/b443689a-3b49c9c2/direction=ltr.locales=zh-tw.themes=start.dpi=resolution14x/61-cc157a-7671518b/af-37d959-382170f/31-c31fb0-68ddb2ab/49-481f80-7eae05f8/25-6efef1-fce9433e/f1-153e2c-bdb2961c/6e-d0a082-77515f0c/25-dd7b49-f58f55bd/47-65dfbf-8fd3dd03/18-56aa26-dbc6220a/2a-91f1d1-dd7daec7/b8-cbc6ea-793099c5/67-f5a030-5770e913/1e-ed96c4-74b5c9cc/b5-77bbe0-155dcdc6/15-ee8111-1a8ff8cd/d8-c523c0-70b73742/91-7bd6e1-5209838f/7c-4a4739-dc5e5fdd/51-157940-294d173b/eb-dfc493-882a8855/ae-0f4566-ee675a14/12-6e175b-a5200a3e/d4-d9c441-e0ed2b3d?ver=20190112_13811432&amp;fdhead=muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf&amp;ocid=mailsignout&amp;csopd=20190117002427&amp;csopdb=20190118225755\" type=\"text/css\" media=\"all\" /><script>(function(n){function i(i,r){try{var u=new n.FontFace(i,r,{}).load();t.push(u)}catch(f){}}var t=[];typeof n.FontFace==\"function\"&&i(\"ps_g\",\"url(//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/25d540.woff2)\")})(window),function(n,t){function h(n,i,r){typeof n!=\"string\"&&(r=i,i=n,n=t);i&&i.splice||(r=i,i=[]);n==it?a=!0:n==rt&&(v=!0);l(n,i,r,!1,!1)}function l(n,t,i,r,f,e){var s,y;if(!n||!c[n]){var h=ot(n,t),o=h.dependencyNotFound,l=h.resolved;if(o){typeof u[o]==\"undefined\"&&(u[o]=[]);u[o].push(e||{i:n,d:t,f:i,r:r,s:f});return}s=typeof i==\"function\";y=v&&a&&s&&!f;y?et(n,i,l,r):ft(s,n,i,l,r)}}function ft(n,t,i,r,u){var f;f=n?i.apply(null,r):i;d(t,f,u)}function et(n,t,i,r){setTimeout(function(){var u=t.apply(null,i);d(n,u,r)},1)}function d(t,i,r){r&&(i={});t&&(i?(c[t]=i,f.push(t),g()):n.console&&console.error(\"Dependencies resolved, but object still not defined (or is otherwise falsey). id:\"+t+\"; typeof obj: \"+typeof i))}function g(){var t,s,h,i,o,c,r,n;if(e)e&&(e=2);else{t=[];do{for(e=1,h=f.length,i=0;i<h;i++)o=f[i],c=u[o]||[],t=t.concat(c),delete u[o];for(f=[],s=t.length,r=0;r<s;r++)n=t[r],l(n.i,n.d,n.f,n.r,n.s,n);t=[]}while(e>1);e=0}}function ot(n,t){for(var e,i=[],r,o=t?t.length:0,u=0;u<o;u++){var f=t[u],s=c[f],h=typeof s!=\"undefined\";if(!h){if(e=st(n,f),e){i.push(e);continue}r||(r=f);break}i.push(s)}return o===i.length?{resolved:i}:{dependencyNotFound:r}}function st(i,r){var f=k.exec(r),e,u;if(f){if(e=f[1],u=n[e],u!==t)return u;s||(s=setTimeout(nt,w))}}function nt(){var i,r,e,o,h;s=0;i=!1;for(r in u)e=k.exec(r),e&&(o=e[1],h=n[o],h!==t?f.push(r):i=!0);i&&!s&&(s=setTimeout(nt,w));f.length&&g()}function ht(n,t,i){if((typeof n!=\"object\"||n&&n.splice)&&(i=t,t=n,n={}),t&&t.splice||(i=t,t=[]),ct(n.js),i){var r,u=n.synchronous||!1;l(r,t,i,!0,u)}}function ct(n){if(typeof n==\"string\")tt(n);else if(n)for(var t=0;t<n.length;t++)tt(n[t])}function tt(n){if(!b[n]){b[n]=1;var i=o.getElementsByTagName(\"script\")[0],t=o.createElement(\"script\");t.src=n;t.onload=t.onreadystatechange=function(){this.readyState&&this.readyState!=\"loaded\"&&this.readyState!=\"complete\"||(t.onload=t.onreadystatechange=null,t.parentNode&&t.parentNode.removeChild(t))};i.parentNode.insertBefore(t,i)}}function lt(n){return ut?n?i.now():Math.round(i.now()):new Date-y}var it=n._jsLoaderAsyncCanary||\"c.dom\",rt=\"c.pageReveal\",a=!1,v=typeof n._jsLoaderRevealMode==\"undefined\"?!0:n._jsLoaderRevealMode,i=n.performance,ut=i&&typeof i.now==\"function\",r=\" ----- \",y=((i||{}).timing||{}).navigationStart||+new Date,o=n.document,p=null;try{p=n.localStorage}catch(at){}var c={date:Date,document:o,image:n.Image,localStorage:p,location:o&&o.location,navigator:navigator,pageStart:y,pageTime:lt,screen:n.screen,window:n},u={},f=[],e,w=50,s,b={},k=/^window\\.(.+)$/;h.amd={jQuery:1};h.is=function(n){return typeof c[n]!=\"undefined\"};n.define=h;n.require=ht;h.showUserMarks=function(){var n=[\"Mark Name\"+r+\"Start time in ms\"];return i.getEntriesByType(\"mark\").forEach(function(t){n.push(t.name+r+t.startTime+\"ms\")}),n.join(\"\\n\")};h.showUserMeasures=function(){var n=[\"Measure name\"+r+\"Start time in ms\"+r+\"Duration in ms\"];return i.getEntriesByType(\"measure\").forEach(function(t){n.push(t.name+r+t.startTime+\"ms\"+r+t.duration+\"ms\")}),n.join(\"\\n\")}}(window);define(\"perfPing\",function(){function n(n){require([\"w3cTimer\"],n)}function t(t){n(function(n){n.mark(t)})}function i(t){n(function(n){n.fire();typeof t==\"function\"&&t(n.payload)})}return{setMarker:t,getPayLoad:i}});define(\"perfMarker\",[\"window\"],function(n){function o(){return s?t.now()|0:r&&c()-r}function f(n){return typeof n==\"function\"}var t=n.performance,i;if(!t)return i=function(){},i.now=function(){return 0},i;var s=f(t.now),h=f(t.mark),r=(t.timing||{}).navigationStart,u=n.Date,c=f(u.now)?u.now:function(){return+new u},l,e=n._pageTimings||(n._pageTimings={}),a=!1,i=function(n,i,u,f){var s,c;typeof n!=\"string\"||i&&e[n]&&!u||(s=typeof i==\"number\",s||(h&&t.mark(n),l&&console.timeStamp(n)),(i||a)&&(c=s?Math.round(i-(f?0:r)):o(),isNaN(c)||(e[n]=c)))};return i.now=o,n._perfMarker=i,i});define(\"perfMeasure\",[\"window\"],function(n){function f(){}function r(n,i,r,f){var e=\"string\",s,h,o;typeof n===e&&typeof i===e&&typeof r===e&&(s=t.getEntriesByName(i),h=t.getEntriesByName(r),s.length>=1&&h.length>=1&&(t.measure(n,i,r),f&&(o=t.getEntriesByName(n),o.length>=1&&(u[n]=Math.round(o[0].duration)))))}function e(){require([\"c.onload\"],function(){i(\"TimeFordomComplete\",\"domLoading\",\"domComplete\");i(\"TimeFordomInteractive\",\"domLoading\",\"domInteractive\");i(\"TimeFordomContentLoaded\",\"domContentLoadedEventStart\",\"domContentLoadedEventEnd\");i(\"TimeForloadEvent\",\"loadEventStart\",\"loadEventEnd\")})}function i(n,i,r){try{t.measure(n,i,r)}catch(u){console&&console.error(\"Error while measuring native marker: \"+n+\", error: \"+u)}}var u=n._pageTimings||(n._pageTimings={}),t=n.performance;return typeof t==\"object\"&&typeof t.measure==\"function\"&&typeof t.getEntriesByName==\"function\"?(e(),n._perfMeasure=r,r):f});define(\"evaluate\",function(){return window.JSON&&window.JSON.parse||function(n){return eval(\"(\"+n+\")\")}});define(\"headData\",[\"evaluate\",\"document\"],function(n,t){var r=t.getElementsByTagName(\"head\")[0],i,u,f;return r?(i={},u=r.getAttribute(\"data-js\"),u&&(i=n(u)),f=r.getAttribute(\"data-client-settings\"),f&&(i.clientSettings=n(f)),i.xdid=r.getAttribute(\"data-xd-id\"),i.locale=t.getElementsByTagName(\"html\")[0].getAttribute(\"lang\").toLowerCase(),i.currentFlights=((/f:\\s*([^;]+)/i.exec(r.getAttribute(\"data-info\"))||{})[1]||\"\").toLowerCase(),i.userOptOut=((/userOptOut:\\s*([^;]+)/i.exec(r.getAttribute(\"data-info\"))||{})[1]||\"\").toLowerCase(),i):{}});define(\"requestPageRevealCallback\",[\"window\",\"headData\"],function(n,t){function u(u){typeof u==\"function\"&&(t.ispreload?i?u(i):n.require([\"c.pageReveal\"],function(n){i=n;u(i)}):u(r))}var i=null,r={didPreload:!1,timeTakenForRevealInMs:0};return u})</script><script async=\"async\"  src=\"//acdn.adnxs.com/ast/ast.js\"></script><script async=\"async\"  src=\"//static-global-s-msn-com.akamaized.net/hp-eas/_h/975a7d20/webcore/externalscripts/jquery/jquery-2.1.1.min.js\" crossorigin=\"anonymous\"></script><script async=\"async\"  src=\"//static-global-s-msn-com.akamaized.net/hp-eas/zh-tw/homepage/_sc/js/b443689a-ea9cb139/direction=ltr.locales=zh-tw.themes=start.dpi=resolution14x/97-9a8c47-68ddb2ab/e1-557388-3ad0ecc7/7e-312127-e72da089/fe-53353d-68ddb2ab/d9-222405-e211f3f8/9e-a7a255-68ddb2ab/a9-ac9b58-68ddb2ab/6c-23e9a8-cae48929/9c-627b70-1988ecdd/30-ea66ac-35c4b177/f1-d6770c-68ddb2ab/a7-636d60-35c4b177/fe-718b87-243aa040/42-dd91f1-d397ee68/9e-639daf-68ddb2ab/85-0f8009-68ddb2ab?ver=20190112_13811432&amp;fdhead=muidflt14cf,muidflt49cf,muidflt52cf,adflt-unruly,muidflt259cf,mmxios1cf,startedge1cf,moneyedge3cf,platagyhp3cf,pnehz2cf,audexhz3cf,artgly5cf,gallery2cf&amp;ocid=mailsignout&amp;csopd=20190117002427&amp;csopdb=20190118225755\" crossorigin=\"anonymous\"></script><script>define(\"headInfo\",[\"document\"],function(n){function l(n){var r={},i,t,u;if(!n)return r;for(n=n.substring(1,n.length-1),i=n.split(\",\"),t=0,u=i.length;t<u;t++)if(t in i){var e=i[t],f=e.split(\":\"),o=f.splice(0,1),s=f.join(\":\").replace(/^\\s+/,\"\").replace(/\\s+$/,\"\");r[o[0].replace(/^\\s+/,\"\").replace(/\\s+$/,\"\")]=s}return r}var e=n.getElementsByTagName(\"head\")[0],r,u,i,t,o;if(e){if(r={},u=e.getAttribute(\"data-info\"),u)for(i=u.split(\";\"),t=0,o=i.length;t<o;t++)if(t in i){var h=i[t],s=h.split(\":\"),c=s.splice(0,1),f=s.join(\":\");r[c[0]]=f.charAt(0)===\"{\"?l(f):f.replace(/^\\s+/,\"\").replace(/\\s+$/,\"\")}return r}return{}});define(\"deviceGroup\",function(){return{isTmx:1,isPc:1,isWebKit:1,isChrome:1}});define(\"measure\",function(){return function(n,t){var i=window.getComputedStyle(n);return t?i[t]||i.getPropertyValue(t):function(n){return i[n]||i.getPropertyValue(n)}}});define(\"deviceInit\",function(){function u(i){return n[t(i)]}function f(i){return n[t(i)]==\"true\"}var n={},t=function(n){return n.toUpperCase()},i,r={capability:u,isCapable:f};return function(u){var f,e;if(i)throw\"device was already initialized.\";for(f in u)e=u[f],n[t(f)]=e;i=1;define(\"device\",r)}});define(\"requestAnimationFrame\",[\"window\"],function(n){return function(){return n.requestAnimationFrame||n.webkitRequestAnimationFrame||n.mozRequestAnimationFrame||n.oRequestAnimationFrame||n.msRequestAnimationFrame||function(t){typeof t==\"function\"&&n.setTimeout(t,16.7)}}()});define(\"requestAnimationFrameBackground\",[\"window\",\"requestAnimationFrame\",\"headData\"],function(n,t,i){function u(i){typeof i==\"function\"&&(n.define.is(r)?t(i):i())}var r=\"c.pageReveal\";return i.ispreload&&!n.define.is(r)?u:t});define(\"mediator\",function(){function i(n){return t[n]||(t[n]=new r),t[n]}function r(){var n={};return{pub:function(t,i){var u=n[t],r;if(u)for(r=0;r<u.length;r++)u[r](i)},sub:function(t,i){if(typeof i==\"function\"){var r=n[t];r||(r=[],n[t]=r);r.push(i)}},unsub:function(t,i){var u=n[t],r;if(u)for(r=0;r<u.length;r++)u[r]===i&&u.splice(r--,1)}}}var n=new r,t={};return{pub:n.pub,sub:n.sub,unsub:n.unsub,pubChannel:function(n,t,r){i(t).pub(n,r)},subChannel:function(n,t,r){i(t).sub(n,r)},unsubChannel:function(n,t,r){i(t).unsub(n,r)}}});define(\"mediaQueryMatch\",[\"device\",\"deviceGroup\",\"mediator\",\"requestAnimationFrame\",\"window\"],function(n,t,i,r,u){function s(){function e(n,t){var i=n.exec(t);return i?i[1]*16:null}function n(){r(function(){t=u.innerWidth;f=u.innerHeight;for(var n=0;n<o.length;n++)h(o[n])})}function h(n){var r=p(n),t,i;if(n.matches!=r)for(n.matches=r,i=0;t=n.queryFunctions[i];i++)typeof t==\"function\"&&t()}function p(n){var i=!n.maxWidth||t<=n.maxWidth,r=!n.minWidth||t>=n.minWidth,u=!n.maxHeight||f<=n.maxHeight,e=!n.minHeight||f>=n.minHeight;return i&&r&&u&&e}function c(n){return{isMatching:function(){return!1},addListener:function(){},matches:!1,media:n,queryFunctions:[]}}var l=/min\\-width\\:\\s*(\\d+(\\.\\d+)?)/,a=/max\\-width\\:\\s*(\\d+(\\.\\d+)?)/,v=/min\\-height\\:\\s*(\\d+(\\.\\d+)?)/,y=/max\\-height\\:\\s*(\\d+(\\.\\d+)?)/,t,f,o=[],s;return require([\"jquery\"],function(t){t(u).resize(function(){clearTimeout(s);s=setTimeout(n,50)});require([\"c.deferred\"],n);setTimeout(n,500);i.subChannel(\"update\",\"mediaQuery\",n)}),function(i){if(!i)return c(i);var r={addListener:function(n){typeof n==\"function\"&&r.queryFunctions.push(n)},isMatching:function(){return n(),r.matches},matches:!1,media:i,queryFunctions:[]};return(r.minWidth=e(l,i),r.maxWidth=e(a,i),r.minHeight=e(v,i),r.maxHeight=e(y,i),!r.minWidth&&!r.maxWidth&&!r.minHeight&&!r.maxHeight)?c(i):(t=u.innerWidth,f=u.innerHeight,h(r),o.push(r),r)}}function h(n){var t=f(n);return t.isMatching=function(){return t.matches},t}var f=u.msMatchMedia||u.matchMedia,e=f?h:null,o=n.isCapable(\"UseCustomMatchMedia\");return!o&&e||s()});define(\"scaledView\",[],function(){return{addListener:function(){},removeListener:function(){},isScaled:function(){return!1}}});require([\"measure\",\"scaledView\",\"document\"],function(n,t,i){function u(){r=f.rem=parseFloat(n(i.getElementsByTagName(\"head\")[0],\"font-size\"))}function f(n){return n*r}function e(n){return n/r}var r;t.addListener(u);u();define(\"remToPixel\",function(){return f});define(\"pixelToRem\",function(){return e})});define(\"viewAwareInit\",[\"deviceGroup\",\"pageTime\",\"mediaQueryMatch\",\"document\",\"remToPixel\"],function(n,t,i,r){return function(t){function f(n,t){var r,u,f;n&&(r=n.match(/calc\\((.*?)\\)/),r&&r.length==2&&(n=n.replace(r[0],eval(r[1]))),u=i(n),f=u.isMatching(),f&&(e=t),u.addListener(function(){u.matches&&s(t)}),h.push({mq:u,viewValue:t}))}function s(n){e=n;for(var t=0;t<o.length;t++)o[t](e)}var u={NONE:0,SIZE1COLUMN:1,SIZE2COLUMN:2,SIZE3COLUMN:4,SIZE4COLUMN:8,SIZE12COLUMN:3,SIZE23COLUMN:6,SIZE34COLUMN:12,SIZE234COLUMN:14,SIZE1ROW:256,SIZE1ROWSIZE1COLUMN:257,SIZE1ROWSIZE2COLUMN:258,SIZE1ROWSIZE3COLUMN:260,SIZE1ROWSIZE4COLUMN:264,SIZE2ROW:512,SIZE2ROWSIZE1COLUMN:513,SIZE2ROWSIZE2COLUMN:514,SIZE2ROWSIZE3COLUMN:516,SIZE2ROWSIZE4COLUMN:520,ALL:783},o=[],h=[],e=n.isMobile?u.SIZE1ROWSIZE1COLUMN:u.SIZE2ROWSIZE4COLUMN;f(t.size1rowsize1column,u.SIZE1ROWSIZE1COLUMN);f(t.size2rowsize1column,u.SIZE2ROWSIZE1COLUMN);f(t.size1rowsize2column,u.SIZE1ROWSIZE2COLUMN);f(t.size2rowsize2column,u.SIZE2ROWSIZE2COLUMN);f(t.size1rowsize3column,u.SIZE1ROWSIZE3COLUMN);f(t.size2rowsize3column,u.SIZE2ROWSIZE3COLUMN);f(t.size1rowsize4column,u.SIZE1ROWSIZE4COLUMN);f(t.size2rowsize4column,u.SIZE2ROWSIZE4COLUMN);s(e);define(\"viewAware\",{listen:function(n){typeof n==\"function\"&&(o.push(n),n(e))},views:u,currentView:function(){return e}})}});define(\"screenDpiImpl\",[\"window\"],function(n){return function(){return n.devicePixelRatio||1}});define(\"dpi\",[\"screenDpiImpl\",\"headData\",\"measure\",\"deviceGroup\",\"document\",\"window\",\"location\"],function(n,t,i,r,u,f,e){var v=t.dpi||1,o={screen:1,detected:t.ddpi,override:t.dpio,forceServerDpi:t.forcedpi||!(typeof navigator.msManipulationViewsEnabled==\"undefined\"?!0:navigator.msManipulationViewsEnabled),server:v,client:v,dpiMultiplier:1,sizeMultiplier:1,refresh:!1},h,p,s,c,y,l,a;if(e.href.indexOf(\"nodpi=1\")==-1&&(o.screen=n(o)),h=r.isMobile?[1.5,2.25,2.4,2.7]:[1,1.4,1.8,2],p=/<link[^>]*rel=\"stylesheet\"[^>]*href=\"([^\"]*)\"[^>]*\\/>/ig,o.forceServerDpi===!0)t.dpi=t.ddpi;else if(o.server!=o.screen){for(s=0;s<h.length;s++)if(c=h[s],o.screen<=c||s==h.length-1){o.dpiMultiplier=(o.client=c)/o.server;break}o.client!=o.server&&(y=\"dpio\",l=y+\"=\",t&&t.clientSettings&&!t.clientSettings.functionalonly_cookie_experience&&(u.cookie=l+o.client+\";path=/\"),o.refresh&&e.href.indexOf(\"dpir=1\")==-1&&e.href.indexOf(l)==-1&&require([\"navigation\"],function(n){var t=e.href.replace(/dpio=[\\d.]*/,\"\");t+=(t.indexOf(\"?\")==-1?\"?\":\"&\")+\"dpir=1\";n.navigate(t,!0)}))}return a=parseFloat(i(u.documentElement,\"font-size\")),a&&(o.sizeMultiplier=a/10/o.client),o});define(\"escape\",[\"window\"],function(n){function r(t){return t!=null&&n.encodeURI(t)||\"\"}function u(t){return t!=null&&n.encodeURIComponent(t)||\"\"}function f(n){return n!=null&&(\"\"+n).replace(t,function(n){return i[n]||\"\"})||\"\"}var t=/[\"&'\\/<>]/g,i={'\"':\"&quot;\",\"&\":\"&amp;\",\"'\":\"&#39;\",\"/\":\"&#47;\",\"<\":\"&lt;\",\">\":\"&gt;\"};return{url:r,urlPart:u,html:f}});define(\"classList\",function(){function i(n){return t[n]||(t[n]=new RegExp(\"(\\\\s|^)\"+n+\"(\\\\s|$)\"))}function n(n,t){return n?n.classList?n.classList.contains(t):n.className?n.className.match(i(t)):!1:!1}function r(t,i){t&&(t.classList?t.classList.add(i):n(t,i)||(t.className+=\" \"+i))}function f(t,i){t&&(t.classList?t.classList.toggle(i):n(t,i)?u(t,i):r(t,i))}function u(t,r){t&&(t.classList?t.classList.remove(r):n(t,r)&&(t.className=t.className?t.className.replace(i(r),\" \"):!1))}var t=[];return{add:r,remove:u,toggle:f,contains:n}});define(\"viewport\",[\"mediator\",\"requestAnimationFrame\",\"window\",\"document\"],function(n,t,i,r){function kt(){l=at();a=lt();(l!=s||a!=f)&&(u=!0,e=!0)}function g(){return{left:s,right:et,top:f,bottom:ot,width:h,height:c}}function ht(){u&&(s=l||at(),f=a||lt(),l=a=null,!nt&&f>yt&&(nt=!0,setTimeout(function(){define(\"c.scrolled\",1)},ft)));o&&(h=i.innerWidth||r.documentElement.clientWidth,c=i.innerHeight||r.documentElement.clientHeight);(u||o)&&(et=s+h,ot=f+c);u=o=!1}function w(){if(e){pt=new Date;e=!1;var i=o,r=u,l=h,a=c,v=s,y=f;ht();i=i&&(a!=c||l!=h);r=r&&(v!=s||y!=f);i||r?(b||(b=setTimeout(function(){b=0;var t=g();n.pub(tt,t);r&&n.pub(it,t);i&&n.pub(rt,t)},ft)),dt(),setTimeout(w,ut)):t(w)}else t(w)}function dt(){v&&(st=+new Date,y||(y=setTimeout(function t(){y=v=!1;var i=new Date-st;i>d?n.pub(bt,k):y=setTimeout(t,d-i)},d)))}function ct(){u=!0;o=!0;e=!0}function lt(){if(typeof pageYOffset!=\"undefined\")return pageYOffset;var t=r.body,n=r.documentElement;return n=n.clientHeight?n:t,n.scrollTop}function at(){if(typeof i.pageXOffset!=\"undefined\")return i.pageXOffset;var t=r.body,n=r.documentElement;return n=n.clientWidth?n:t,n.scrollLeft}function gt(n){for(var i=null,t;n&&n.nodeName!=\"BODY\"&&n.nodeName!=\"HTML\";){if(t=n.getAttribute(wt),t){t=t.split(\";\");i={x:parseInt(t[0])||0,y:parseInt(t[1])||0};break}n=n.parentNode}return i}function ni(n,t,i,r){var u=n.getBoundingClientRect();if(!u.top&&!u.right&&!u.bottom&&!u.left)return 0;r||(r=g());var o=r.width*(t||0),s=r.height*(i||0),h={left:-o,right:r.width+o,top:0-s,bottom:r.bottom+s},f={left:u.left,right:u.right,top:u.top,bottom:u.bottom},e=gt(n.parentNode);return e&&(f.left+=e.x,f.right+=e.x,f.top+=e.y,f.bottom+=e.y),ti(h,f)}function ti(n,t){return!(t.left>n.right||t.right<n.left||t.top>n.bottom||t.bottom<n.top)}function vt(n,t){i.addEventListener(n,t,!1)}var e=!0,u=!0,o=!0,l=null,a=null,yt=10,nt,tt=\"viewport_change\",it=\"viewport_scroll_change\",rt=\"viewport_size_change\",ut=parseInt(\"\")||200,ft=50,b,s=0,et=0,f=0,ot=0,h=0,c=0,pt,wt=\"data-offset\",k=\"\",v=!1,y=0,d=1e3,st,bt=\"ViewabilityUpdatedEvent\",p;return ht(),require([\"c.dom\"],ct),p=\"c.deferred\",require([p],function(){i.setInterval(kt,ut);t(w)}),require([p],ct),vt(\"resize\",function(){v=!0;k=\"resize\";o=!0;e=!0}),vt(\"scroll\",function(){v=!0;k=\"scroll\";u=!0;e=!0}),{getDimensions:function(){return g()},changeEventName:tt,sizeChangeEventName:rt,scrollChangeEventName:it,isInViewport:ni,deferredCanaryName:p}});require([\"window\"],function(n){n._llic=function(n){require([\"imgSrc\"],function(t){t.checkLoad(n)})}});define(\"imgSrc\",[\"viewAware\",\"measure\",\"dpi\",\"evaluate\",\"mediator\",\"viewport\",\"classList\",\"window\",\"document\",\"image\",\"headData\",\"logging\",\"perfMarker\"],function(n,t,i,r,u,f,e,o,s,h,c,l){function ai(){u.sub(f.changeEventName,function(n){var t=Math.abs(n.left-p.left+n.width-p.width),i=Math.abs(n.top-p.top+n.height-p.height);(t>vt()||i>yt())&&(vt=function(){return n.width/4},yt=function(){return n.height/4},p=n,b())})}function vi(){w=[]}function yi(n,t){var i=n.getAttribute(t);if(i)try{return r(i)}catch(u){l.error(\"[imgSrc] error evaluating the '\"+t+\"' attribute: '\"+i+\"'\",u)}}function pi(n,t){var u=!1,i=ht(n),r;return i&&i.src&&t&&typeof t.find==\"function\"&&typeof t.filter==\"function\"&&(r=t.find(\"img[data-src]\").filter(function(){return this.imgSrcObj&&this.imgSrcObj.loadedSrc==i.src}),r.length&&(i.loadingSrc=i.src,n.imgSrcObj=i,ti(n,i,r[0]),u=!0)),u}function ht(n,t){var i=yi(n,ci),f,r,u;if(i){if(f=i.dpi||1,i=i[a]!==t?i[a]:i[v]!==t?i[v]:i[\"default\"],r=typeof i,r==\"string\")i={src:i};else if(r!=\"object\"||!i)return null;return i.dpi=f,i.src?(u=i.src.indexOf(\"//\"),u>0&&(i.src=i.src.substring(u)),i.src=di(i.src,fi)):i.src=bt,i}return null}function dt(n,t){var i,r;return kt?(n.onload=null,i=ht(n),i&&(r=wi(n,i,t),r&&k(n,i,!0)),r):!1}function wi(n,t,i){return kt==2?!0:t.load==\"wait\"||t.load==\"defer\"?!1:e.contains(n,\"wait\")?!1:e.contains(n,\"defer\")?!1:n.getAttribute(rt)?!1:gt(n)?ct(n,t)?(i||f.isInViewport(n,0,0))?!0:!1:!1:!1}function bi(t){var i=nt&&nt!=t;nt=t;switch(t){case n.views.SIZE1ROWSIZE1COLUMN:a=\"size1rowsize1column\";v=\"size1column\";break;case n.views.SIZE2ROWSIZE1COLUMN:a=\"size2rowsize1column\";v=\"size1column\";break;case n.views.SIZE1ROWSIZE2COLUMN:a=\"size1rowsize2column\";v=\"size2column\";break;case n.views.SIZE2ROWSIZE2COLUMN:a=\"size2rowsize2column\";v=\"size2column\";break;case n.views.SIZE1ROWSIZE3COLUMN:a=\"size1rowsize3column\";v=\"size3column\";break;case n.views.SIZE2ROWSIZE3COLUMN:a=\"size2rowsize3column\";v=\"size3column\";break;case n.views.SIZE1ROWSIZE4COLUMN:a=\"size1rowsize4column\";v=\"size4column\";break;default:a=\"size2rowsize4column\";v=\"size4column\"}i&&b()}function ki(n){return(n||s).getElementsByTagName(\"img\")}function b(n){var c,u,i;if(st){var s=\"TimeToLoadDeferredImagesStart\"+d,h=\"TimeToLoadDeferredImagesEnd\"+d,l=\"TimeForLoadDeferredImages\"+d;for(d++,o._perfMarker&&o._perfMarker(s),c=0,u=ki(n),i=0;i<u.length;i++){var t=u[i],r=ii(t),a=r&&r.load!=\"wait\"&&!e.contains(t,\"wait\")&&!t.getAttribute(rt)&&ct(t,r)&&(e.contains(t,\"defer\")||gt(t)&&f.isInViewport(t,oi,si));a&&(c++,k(t,r))}o._perfMarker&&o._perfMarker(h);o._perfMeasure&&o._perfMeasure(l,s,h)}}function gt(n){do{if(t(n,\"display\")==\"none\")return!1;n=n.parentNode}while(n&&n.nodeName!=\"BODY\");return!0}function di(n,t){var i=n.match(li);return i&&i[y]!=t?n.replace(i[0],i[0].replace(i[y],t)):n}function gi(n,t){var r=n.match(pt),u,i,f;return r&&(u=r[y]*t+.5|0,n=n.replace(r[0],r[0].replace(r[y],u))),i=n.match(wt),i&&(f=i[y]*t+.5|0,n=n.replace(i[0],i[0].replace(i[y],f))),n}function ni(n,t){t()}function nr(n,t,i){var r=g(n);t.src==r.loadingSrc&&(t.lowq&&i.loadingSrc==t.lowq?(t.lowqLoaded=!0,e.remove(n,at),k(n,t)):(n.src=t.src,e.remove(n,et),e.remove(n,ot),e.add(n,ft)))}function ti(n,t,r){var u=g(n);t.src==u.loadingSrc&&(u.loadedSrc=t.src,i.sizeMultiplier>1&&(n.width=r.width*i.sizeMultiplier+.5|0),n.removeAttribute(\"height\"),n.src=r.src,t.lowq&&r.loadingSrc==t.lowq?(t.lowqLoaded=!0,e.remove(n,at),k(n,t)):(e.add(n,ot),e.remove(n,ft),e.remove(n,et)))}function ct(n,t){if(!t||!t.src)return!1;var i=g(n);return i.loadedSrc!=t.src&&t.src!=i.loadingSrc}function ii(n,t){if(!n)return null;if(t)t.src||(t={src:t});else{if(t=ht(n),!t)return null;var r=t.dpi||1;r!=i.client&&(t.src=gi(t.src,i.client/r))}return t}function ri(n,t){n&&(t=ii(n,t),ct(n,t)&&k(n,t))}function g(n){var t=n.imgSrcObj;return t||n.nodeName!=\"IMG\"||(t={img:n,id:w.length},n.imgSrcObj=t,w[n.imgSrcObj.id]=t),t}function k(n,t){var r=g(n,t),u,i;r.isInViewport===undefined&&(r.isInViewport=!0);r.loadingSrc=t.src;t.w&&t.h?n.setAttribute(ut,\"width:\"+t.w+\"rem;height:\"+t.h+\"rem;\"):n.hasAttribute(ut)&&n.removeAttribute(ut);e.add(n,et);e.remove(n,ot);e.remove(n,ft);u=(t.lowqLoaded?null:t.lowq)||t.src;i=new h;i.onload=function(){i.onload=null;i.onerror=null;ni(n,function(){ti(n,t,i)},t)};i.onerror=function(){i.onload=null;i.onerror=null;ni(n,function(){nr(n,t,i)},t)};i.src=i.loadingSrc=u}var nt,a,v,tt=(c.clientSettings||{}).imgsrc||{},fi=tt.quality_high||60,tr=tt.quality_low||5,ei=tt.order_timeout||1e3,oi=1,si=1,hi=!1,it,d=0,lt=100*i.client,rt=\"data-noupdate\",ci=\"data-src\",ut=\"style\",ft=\"err\",et=\"loading\",ot=\"loaded\",at=\"lowq\",vt=function(){return 10},yt=function(){return 10},w=[],y=2,pt=/([?&]w=|_w)(\\d+)/,wt=/([?&]h=|_h)(\\d+)/,li=/([?&]q=|_q)(\\d+)/,bt=\"data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAEALAAAAAABAAEAAAIBTAA7\",kt={all:0,auto:1,none:2}[(location.search.match(/[?&]llibf=([^&#]+)/i)||[])[1]]||1,p,st;return o._llic=dt,p=f.getDimensions(),n.listen(bi),st=!1,require([\"c.deferred\"],function(){st=!0;ai();b()}),o.loadDeferredImages=b,{go:ri,reset:ri,noUpdate:rt,data:bt,checkLoad:dt,isInViewport:f.isInViewport,loadInViewport:b,dataOffsetAttr:\"data-offset\",force:pi,clearImages:vi}});define(\"imageLoad\",[\"imgSrc\",\"classList\",\"document\",\"window\"],function(n,t,i,r){function a(){s();n.isInViewport?y():f(i.querySelectorAll(\"main img[data-src]\"),c)}function s(n){u(\".ip .swipenav>li:first-child+li img,.carousel .slides li+li img\",\"defer\",n);u(\".sip .swipenav>li:first-child+li img,.carousel .slides li+li img\",\"defer\",n);u(\".ip .swipenav>li+li+li img\",\"wait\",n);u(\".sip .swipenav>li+li+li img\",\"wait\",n);u(\".todaystripe .pipedheadlinelistwithimage img\",\"defer\",n)}function v(n,t){typeof n==\"string\"&&(n=i.querySelector(n));s(n);o(n,t)}function y(){e=!1;h(i.getElementById(\"precontent\"));f((i.getElementById(\"main\")||{}).childNodes,p);h(i.getElementById(\"aside\"))}function p(i){var r=!1,u;return!t.contains(i,\"mestripeouter\")&&i.querySelector(\"img[data-src]\")&&(u=n.isInViewport(i,0,0),u?(e=!0,o(i)):e&&(r=!0)),r}function h(t){var i=!1;return t&&t.querySelector(\"img[data-src]\")&&n.isInViewport(t,0,0)&&(i=!0,o(t)),i}function o(n,t){f(n.querySelectorAll(\"img[data-src]\"),function(n){c(n,t)})}function c(n){var i;return n&&(!n.src||!t.contains(n,\"loaded\")&&!t.contains(n,\"loading\"))&&l(n,i)?!0:!1}function f(n,t){var i,r;if(n&&n.length)for(i=0;r=n[i];++i)if(r.nodeType==1&&t(r))break}function u(n,r,u){f((u||i).querySelectorAll(n),function(n){t.add(n,r)})}var l=n.checkLoad||r._llic,e;return{cleanup:a,module:v}});define(\"autoSizeFlex\",[\"jquery\",\"jqBehavior\",\"mediator\",\"pixelToRem\",\"dir.tokens\"],function(n,t,i,r,u){function f(n){function e(){var i;(t=n.children(\":visible\").last(),f.length&&t.length)&&(i=u.ltr?t.offset().left-n.offset().left+t.outerWidth():f.offset().left-t.offset().left+f.outerWidth(!0),i>n.width()&&n.width(r(i)+\"rem\"))}var t,f=n.children().first();return i.sub(\"tabChanged\",e),{setup:e,update:e}}return t(f)});require([\"binding\",\"c.dom\"],function(n){n(\"autoSizeFlex\",\".autosizeflex\").all()});define(\"allPageBindings\",function(){return function(n){var t=function(t){t(n)};require([\"pageBindings\"],t);require([\"pageBindings.pc\"],t);require([\"pageBindings.pc-!ms.ie10plus\"],t)}});require([\"allPageBindings\"],function(n){n(\"html\")});define(\"navigation\",[\"escape\",\"location\",\"document\"],function(n,t,i){function o(t,i,r){var u=t[i],e,f;if(!u||u.length===0)return\"\";for(e=\"\",f=0;f<u.length;f++)u[f]&&(e=e+r+i+\"=\"+n.urlPart(u[f]),r===\"?\"&&(r=\"&\"));return e}function u(n,t,i){var s=function(n){return n=n.replace(/\\+/g,\" \"),decodeURIComponent(n)},u={},o,e;if(n)for(n=n.split(\"#\")[0],o=n.split(\"&\"),e=0;e<o.length;e++){var h=o[e].split(\"=\"),r=h[0],f=h[1];i&&(r=s(r),f&&(f=s(f)));t||r===\"item\"?(u[r]||(u[r]=[]),u[r].push(f)):u[r]=f}return u}function f(n){var t=i.createElement(\"a\");return t.href=n,{protocol:t.protocol,host:t.host,hostName:t.hostname,port:t.port,path:t.pathname,hash:t.hash,query:t.search,origin:t.origin}}function e(n){return f(n).hostName}var r={getUrl:function(n){return r.filter?r.filter(n):n},navigate:function(n,i){r.filter&&(n=r.filter(n));i?t.replace(n):t.href=n},getHostName:e,parseUrl:f,isLocal:function(n){var i=e(n);return!i||t.hostname==i},getParams:u,getParamsFromUrl:function(n,t,i){var r=n.split(\"?\")[1];return u(r,t,i)},mergeQueryStringParams:function(t,i){var s,f,e,h,r,c;if(i){if(s=t.split(\"?\"),s[1]){f=u(s[1],!1,!0);for(r in i)f[r]=i[r]}else f=i;t=s[0];e=\"?\";h=\"item\";for(r in f)r!==h&&(t+=f[r]?e+n.urlPart(r)+\"=\"+n.urlPart(f[r]):e+n.urlPart(r),e===\"?\"&&(e=\"&\"));c=o(f,h,e);t=t+c}return t},filter:null};return r});require([\"logging\",\"measure\",\"document\",\"c.onload\"],function(n,t,i){var e=t(i.getElementsByTagName(\"head\")[0]),o=e(\"boxSizing\"),r;if(o!=\"border-box\"){var s=\"Ad block is \"+(window.adsEnabled?\"off.\":\"on.\"),u=\"\",f=i.getElementsByTagName(\"head\")[0];f?(r=f.querySelectorAll(\"link[href*='/_sc/css/']\"),u=r.length===0?\"No css found.\":r.length===1?r[0].href:\"Multiple css urls found: \"+r[0].href+\" \"+r[1].href):u=\"No head element found.\";n.fatalError(\"C5001 Css was not loaded correctly. \"+s+\" \"+u)}});define(\"logging\",[\"navigation\",\"headData\",\"requestAnimationFrame\",\"window\",\"document\",\"pageTime\",\"escape\"],function(n,t,i,r,u,f,e){function ut(n,t){if(n.addEventListener)n.addEventListener(\"error\",t,!1);else if(n.onerror){var i=n.onerror;n.onerror=function(n,r,u,f,e){return i(n,r,u,f,e),t(n,r,u,f,e)}}else n.onerror=t}function ft(){if(!o&&(o=n.getUrl(t.clientSettings.base_url+\"_log\"),!/[?&]fdhead=[^&#]*/i.test(o))){var i=(/\\bf\\:([^;]*)/.exec(u.getElementsByTagName(\"head\")[0].getAttribute(\"data-info\"))||{})[1]||\"\";i&&(o+=(o.indexOf(\"?\")>0?\"&\":\"?\")+\"fdhead=\"+i)}return o}function g(){c&&k&&!p&&(p=setTimeout(function(){var h,l,o,i,f,e;if(p=0,s.length){if(h=ft(),l=\"POST\",r.hybridEnabled===1&&(d=!0),o=[],i=u.querySelectorAll&&u.querySelectorAll(\"[data-anadid]\"),i&&i.length)for(f=0;f<i.length;f++)o.push(i[f].getAttribute(\"data-anadid\"));e={aid:t.clientSettings.aid,v:t.clientSettings.v,messages:s,isInstart:d,adIds:o};e=JSON.stringify(e);var v=JSON.stringify({data:e}),n=new XMLHttpRequest;n.onload=function(){n.status!=200&&(a(\"error\",\"[506] Could not log, request status: \"+n.status+\"; response text: \"+n.responseText),c=!1)};n.open(l,h,!0);n.setRequestHeader(\"Content-Type\",\"application/json;charset=UTF-8\");n.send(v);s=[]}},2e3))}function l(n,t){return(t==b&&n.indexOf(\"Script error\")>=0&&(t=h),t==h)?\"warn\":t==y?\"info\":(c&&(s.push({m:e.urlPart(n),t:t,d:f()}),g()),t==y?\"info\":t==h?\"warn\":\"error\")}function a(n,t,i){if(r.console){if(!i&&n==\"info\")return;if(!i&&n==\"warn\")return;var u=console[n];u&&typeof u==\"function\"?console[n](t):console.log&&console.log(t)}}function v(n){var r=[],t,i;if(n)for(t=0;t<n.length;++t)i=nt(n[t]),i&&r.push(i);return r.join(\", \")}function nt(n,t,i,u,f){var o=(n==null||typeof n==\"string\"?n:n.message||n.description)||\"\",e,s;return!o&&(n!=null&&(typeof n==\"object\"&&n.toString()==\"[object Event]\"?(e=r.event,e&&e.type==\"error\"&&(o=e.errorMessage,t=e.errorUrl,i=e.errorLine,u=e.errorCharacter)):o=n.toString()),!o)?\"\":(t=n.url||n.filename||t,i=n.lineno||i,u=n.colno||u,s=n.stack||n.error&&n.error.stack,o.trim()+(f||\"\")+(i?\"\\nLine=\"+i:\"\")+(u?\"\\nColumn=\"+u:\"\")+(t?\"\\nScriptUrl=\"+t:\"\")+(s?\"\\nStack=\"+s:\"\"))}function et(){var n=v(arguments);l(n,it);i(function(){var n=u.location,i=e.html(n.protocol+\"//\"+n.host),f=e.url(n.href),o=function(n){var i=\"\",r,t;if(n)for(r=n.length,t=0;t<r;t++)(t===8||t===12||t===16||t===20)&&(i+=\"-\"),i+=n[t];return i};u.getElementsByTagName(\"body\")[0].innerHTML=\"<style>body{font-family:Arial;margin-left:40px}img{border:0 none}#content{margin-left:auto;margin-right:auto}#message h2{font-size:20px;font-weight:normal;color:#000;margin:34px 0 0 0}#message p{font-size:13px;color:#000;margin:7px 0 0 0}#errorref{font-size:11px;color:#737373;margin-top:41px}<\\/style><div id='content'><div id='message'><h2>�������ثe�L�k�ϥ�<\\/h2><p>�Y�z�������s�u�����D�A�αz���b����n��/�~���{���ɡA���ɭԷ|�o�ͳo�ر��p�A�o�i��|�v�T�z�������y�q�C<br/><br/><a href=\\\"\"+e.html(f)+'\" onclick=\"window.location.reload(true)\">���o��<\\/a> �ЦA���դ@���������A�γy�X�G <a href=\"'+i+'\">'+i+\"<\\/a><\\/p><\\/div><div id='errorref'><span>Ref 1: \"+e.html(o(t.clientSettings.aid))+\"&nbsp;&nbsp;&nbsp;Ref 2: \"+e.html(t.clientSettings.sid||\"000000\")+\"&nbsp;&nbsp;&nbsp;Ref 3: \"+e.html((new r.Date).toUTCString())+\"<\\/span><\\/div><\\/div>\"})}function tt(){var n=v(arguments);a(l(n,b),n,!0)}function ot(){var n=v(arguments);a(l(n,h),n)}function st(){var n=v(arguments);a(l(n,y),n)}function ht(n){(r.console||{}).timeStamp?console.timeStamp(n):(r.performance||{}).mark&&r.performance.mark(n)}var w=0,it=-1,b=0,h=1,y=2,s=[],p,k,rt,o,d=!1,c=Math.random()*100<=-1;return ut(r,function(n,t,i,r){return w++,n=nt(n,t,i,r,\" [ENDMESSAGE]\"),n&&tt(\"[SCRIPTERROR] \"+n),!0}),c&&require([\"jquery\",\"c.deferred\"],function(n){k=!0;rt=n;s.length&&g()}),{error:tt,fatalError:et,unhandledErrorCount:function(){return w},perfMark:ht,warning:ot,information:st}});require([\"viewAwareInit\"],function(n){n({size2row:\"(min-height: 48.75em)\",size1row:\"(max-height: 48.74em)\",size4column:\"(min-width: 79em)\",size3column:\"(min-width: 58.875em) and (max-width: 78.99em)\",size2column:\"(min-width: 43.75em) and (max-width: 58.865em)\",size2rowsize4column:\"(min-width: 79em) and (min-height: 48.75em)\",size2rowsize3column:\"(min-width: 58.875em) and (max-width: 78.99em) and (min-height: 48.75em)\",size2rowsize2column:\"(max-width: 58.865em) and (min-height: 48.75em)\",size1rowsize4column:\"(min-width: 79em) and (max-height: 48.74em)\",size1rowsize3column:\"(min-width: 58.875em) and (max-width: 78.99em) and (max-height: 48.74em)\",size1rowsize2column:\"(max-width: 58.865em) and (max-height: 48.74em)\"})});require([\"deviceInit\"],function(n){n({AllowTransform3d:\"false\",AllowTransform2d:\"true\",RtlScrollLeftAdjustment:\"fromLeft\",ShowMoveTouchGestures:\"true\",SupportFixedPosition:\"true\",UseCustomMatchMedia:null,Viewport_Behavior:\"Default\",Viewport_Landscape:null,Viewport:\"width=device-width,initial-scale=1.0,maximum-scale=2.0\",IsMobileDevice:\"false\"})})</script><meta property=\"sharing_url\" content=\"https://www.msn.com/zh-tw\"/><meta property=\"og:url\" content=\"https://www.msn.com/zh-tw/\"/><meta property=\"og:title\" content=\"msn �x�W�UWindows 10, Windows app ���ε{��, Microsoft Store �ӫ�, hotmail, outlook, skype, �Y�ɷs�D\"/><meta property=\"twitter:card\" content=\"summary_large_image\"/><meta property=\"og:type\" content=\"website\"/><meta property=\"og:site_name\" content=\"MSN\"/><meta property=\"og:image\" content=\"https://static-global-s-msn-com.akamaized.net/hp-eas/sc/c6/519670.jpg\"/><link rel=\"shortcut icon\" href=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/2b/a5ea21.ico\" /><style>@media screen and (max-width:78.99em) and (min-width:58.875em){.layout-none:not(.mod1) .pos2{left:0}}.ie8 .grid .pick4~li.pick{display:none}.todaystripe .todayshowcasead:hover{opacity:1}.spartan #main .paging-container.snap{overflow-x:hidden}#addRemoveSectionsModalContainer #addRemoveSectionsModal{display:block}.tmx.mobile .superbowl .matchupstripe{margin:0 auto}.stripecontainer .stripeouter.noborder{height:33.7rem}html[dir='rtl'] .ie8 .mip>ul>li.triptych h3+a{border-right:0}html[dir='ltr'] .ie8 .mip>ul>li.triptych h3+a{border-left:0}.meflyouts .integratedskype .signin>ul li:first-child{display:none}.tmx.pc.webkit.chrome .stripecontent ul{overflow-x:hidden}.meflyouts .bingrewards{display:none}.mobile .galleryinfo .img-divider{display:none}.homepage.tmx.pc.chrome #main .one-col,.homepage.tmx.pc.chrome #main .two-col,.homepage.tmx.pc.chrome #main .three-col{margin-right:-.016rem;margin-left:-.016rem}.homepage.midlevel .pagingsection>button.show,.channelplayerpage.midlevel .pagingsection>button.show{display:none}.settings.start.tmx.pc .globalsettings .social.twitter{display:none}</style>\n" +
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
"  <a class=\"logo\" aria-label=\"��^ msn ����\" href=\"/zh-tw\"\n" +
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
"  aria-label=\"�j�M:\"\n" +
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
" <button id=\"sb_form_go\" class=\"text \"  title=\"�j�M����\"  data-id=\"6\" data-m='{\"i\":6,\"p\":4,\"n\":\"search_websearch\",\"y\":9,\"o\":2}'>�j�M����</button>\n" +
" </div>\n" +
"<input type=\"hidden\" name=\"form\" value=\"PRTWZH\">\n" +
"     <input type=\"hidden\" name=\"httpsmsn\" value=\"1\">\n" +
"     <input type=\"hidden\" name=\"refig\" value=\"5ccff976c56c4a539087c2a9ffe97c17\">\n" +
"</form>\n" +
"<button type=\"button\"  title=\"�j�M����\" id=\"sb\"  data-id=\"7\" data-m='{\"i\":7,\"p\":4,\"n\":\"search_sb\",\"y\":9,\"o\":3}'></button>\n" +
" \n" +
"</section>\n" +
" </li>\n" +
" <li>\n" +
"<button id=\"skip_to_nav\" class=\"skip-to\"  data-id=\"8\" data-m='{\"i\":8,\"p\":1,\"n\":\"skip_to_nav\",\"y\":11,\"o\":4}'>���ܾ���</button>\n" +
"</li>\n" +
" <li>\n" +
"<button id=\"skip_to_con\" class=\"skip-to\"  data-id=\"9\" data-m='{\"i\":9,\"p\":1,\"n\":\"skip_to_con\",\"y\":11,\"o\":5}'>���ܤ��e</button>\n" +
"</li>\n" +
" <li>\n" +
"<button id=\"skip_to_footer\" class=\"skip-to\"  data-id=\"10\" data-m='{\"i\":10,\"p\":1,\"n\":\"skip_to_footer\",\"y\":11,\"o\":6}'>���ܭ��}</button>\n" +
"</li>\n" +
"\n" +
" <li>\n" +
"  <ul id=\"user-profile\"  data-sso-dependent=\"true\" data-module-id=\"startpage|start.header|header|header-signin|signin\" data-dhp_cookie_days=\"0\"  data-id=\"11\" data-m='{\"i\":11,\"p\":1,\"n\":\"header-signin\",\"t\":\"signin\",\"o\":7}'>\n" +
" \n" +
"<li id=\"sign-in\" >\n" +
" <div id=\"meCtrl\"  data-sign-in-url=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\" data-sign-out-url=\"https://login.live.com/logout.srf?ct=1547912517&amp;rver=7.0.6730.0&amp;lc=1033&amp;id=1184&amp;lru=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout&amp;mkt=zh-tw&amp;pcexp=True\" data-me-url=\"https://login.live.com/me.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2F%2Fwww.msn.com%2Fzh-tw%2Fhomepage%2FSecure%2FPassport%3Fru%3Dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw\" data-anonckname=\"\">\n" +
" <a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\" title=\"�n�J\"  data-id=\"12\" data-m='{\"i\":12,\"p\":11,\"n\":\"SignInNavigation\",\"y\":14,\"o\":1}' >\n" +
"<span class=\"mectrlname mectrlsignin\">�n�J</span>\n" +
"</a>\n" +
" </div>\n" +
"                    <script>require([\"refreshSigninModule\", \"c.sso\"], function (r) { r() })</script>\n" +
" </li>\n" +
" <li role=\"presentation\" id=\"settings\" >\n" +
"<a href=\"#temp\"  data-id=\"13\" data-m='{\"i\":13,\"p\":11,\"n\":\"settings\",\"y\":14,\"o\":2}'  alt=\"�]�w\"  aria-label=\"�����]�w\"></a>\n" +
"  <ul>\n" +
"\n" +
" <li role=\"presentation\">\n" +
"<label>�ܧ�y���P���e:</label>\n" +
"<select role=\"menuitem\" id=\"site-market\" rel=\"nofollow\" aria-label=\"�ܧ�y���P���e:\"  data-id=\"14\" data-m='{\"i\":14,\"p\":11,\"n\":\"changemarket\",\"y\":14,\"o\":3}'>\n" +
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
" <option data-mkt=\"el-gr\" data-mkt-url=\"//www.msn.com/el-gr\" >�H�f�f?�_�\ (�`�f�f�b�h�d�e?)</option>\n" +
" <option data-mkt=\"ru-ru\" data-mkt-url=\"//www.msn.com/ru-ru\" >?????? (P??????)</option>\n" +
" <option data-mkt=\"he-il\" data-mkt-url=\"//www.msn.com/he-il\" >????? (?????)?</option>\n" +
" <option data-mkt=\"ar-ae\" data-mkt-url=\"//www.msn.com/ar-ae\" >???????? ??????? ??????? (????????)</option>\n" +
" <option data-mkt=\"ar-sa\" data-mkt-url=\"//www.msn.com/ar-sa\" >??????? ??????? ???????? (????????)</option>\n" +
" <option data-mkt=\"ar-eg\" data-mkt-url=\"//www.msn.com/ar-eg\" >??? (????????)</option>\n" +
" <option data-mkt=\"th-th\" data-mkt-url=\"//www.msn.com/th-th\" >??? (???)</option>\n" +
" <option data-mkt=\"zh-cn\" data-mkt-url=\"//www.msn.cn/zh-cn\" >��?�H���@�M? (?�^����)</option>\n" +
" <option data-mkt=\"ja-jp\" data-mkt-url=\"//www.msn.com/ja-jp\" >�饻 (�饻�y)</option>\n" +
" <option data-mkt=\"zh-tw\" data-mkt-url=\"//www.msn.com/zh-tw\"  selected>�x�W (�c�餤��)</option>\n" +
" <option data-mkt=\"zh-hk\" data-mkt-url=\"//www.msn.com/zh-hk\" >����S?��F�� (�c�餤��)</option>\n" +
" <option data-mkt=\"ko-kr\" data-mkt-url=\"//www.msn.com/ko-kr\" >?? (???)</option>\n" +
" </select>\n" +
"</li>\n" +
"\n" +
"\n" +
"\n" +
" <li role=\"presentation\" >\n" +
"<a role=\"menuitem\" href=\"#\" id=\"usermenu-feedback\"  data-id=\"15\" data-m='{\"i\":15,\"p\":11,\"n\":\"feedback\",\"y\":14,\"o\":4}'>\n" +
" �N������\n" +
"</a>\n" +
"</li>\n" +
"\n" +
" <li role=\"presentation\" class=\"global\">\n" +
"<button role=\"menuitem\" class=\"personalization\"  data-id=\"16\" data-m='{\"i\":16,\"p\":11,\"n\":\"personalization\",\"y\":11,\"o\":5}'>�ۭq������</button>\n" +
"</li>\n" +
"\n" +
" <li role=\"presentation\" >\n" +
"<a role=\"menuitem\" id=\"makehomepage\" target=\"_blank\" href=\"https://chrome.google.com/webstore/detail/msn-homepage-bing-search/aodojjhnfnfhaplflfohfddffmjkdjak\"  data-id=\"17\" data-m='{\"i\":17,\"p\":11,\"n\":\"homepagelink\",\"y\":14,\"l\":\"homepage\",\"o\":6}'>�N MSN �]�w���ڪ�����</a>\n" +
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
"            <button class=\"stripearrow\"  data-aop=\"leftarrow\"  data-id=\"21\" data-m='{\"i\":21,\"p\":20,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            \n" +
"            <div class=\"mestripe\" >\n" +
"                    <h2 class=\"hide\">�J�f�����s��</h2>\n" +
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
"                        <h3>�a��<span></span></h3>\n" +
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
"            <button class=\"stripearrow\"  data-aop=\"rightarrow\"  data-id=\"31\" data-m='{\"i\":31,\"p\":20,\"n\":\"rightarrow\",\"y\":12,\"o\":11}'  title=\"�U�@��\"></button>\n" +
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
"<h2>�b�����o�z���l��</h2>\n" +
"<ul>\n" +
" <li>�d�ݳ̪񪺹q�l�l��</li>\n" +
" <li>�ǰe�ֳt�q�l�l��</li>\n" +
" <li>���P�޲z�z����ƾ�</li>\n" +
" </ul>\n" +
"</section>\n" +
"<h3>�ϥΥ��� Microsoft �b��n�J: Outlook�BHotmail�BMSN�BLive</h3>\n" +
"<p><a href=\"https://go.microsoft.com/fwlink/?LinkID=254486\"  data-id=\"34\" data-m='{\"i\":34,\"p\":33,\"n\":\"mailsignedoutflyout-accounthelp\",\"y\":12,\"o\":1}'>����O Microsoft �b��?</a></p>\n" +
"            <ul>\n" +
"                <li>\n" +
"                    <a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"  data-id=\"35\" data-m='{\"i\":35,\"p\":33,\"n\":\"mailsignedoutflyout-signin\",\"y\":12,\"o\":2}'>�n�J</a>\n" +
"                </li>\n" +
"                <li>\n" +
"                    <a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"  data-id=\"36\" data-m='{\"i\":36,\"p\":33,\"n\":\"mailsignedoutflyout-createaccount\",\"y\":12,\"o\":3}'>�ߧY�إ�</a>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKYZT.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�H�𭺿�A\" /> <h3>�s�ѹq�����ơIOffice 365 �Ͳ��O�j�i��</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_WIN10&amp;u=https://www.microsoft.com/zh-tw/store/collections/windows/pc\" target=\"_blank\"\n" +
"  data-id=\"40\" data-m='{\"i\":40,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":3}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKLU0.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�H�𭺿�B\" /> <h3>�v�W�̧֪��}���t�� �ߨ�ɯŦ�Windows 10</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_O365YEAR&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\" target=\"_blank\"\n" +
"  data-id=\"41\" data-m='{\"i\":41,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":4}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKZ0c.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�H�𭺿�C\" /> <h3>�O�H��ߪ��C�� Office 365�u�n$ 2,190�I</h3>\n" +
"                    </div>\n" +
"                </a>\n" +
"\n" +
"            </li>\n" +
" <li>\n" +
"<a  href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME_VISUALSTUDIO&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\" target=\"_blank\"\n" +
"  data-id=\"42\" data-m='{\"i\":42,\"p\":37,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"o\":5}'\n" +
"  >\n" +
"<div>\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBvKTJn.img?h=70&amp;w=70&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�H�𭺿�D\" /> <h3>�Q�gApp�H�֥ε{���]�p�v���̷R�GVisual Studio</h3>\n" +
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
"                                <a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_ME&amp;u=https://support.microsoft.com/zh-tw/products/store\" target=\"_blank\">�䴩<span></span></a>\n" +
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
" �d�ݷs�D�K�n\n" +
"</a>\n" +
"</li>\n" +
"<li  data-id=\"48\" data-m='{\"i\":48,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":3}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com/notifications\">\n" +
"<span></span>\n" +
" �d�ݳq��\n" +
"</a>\n" +
"</li>\n" +
"<li  data-id=\"49\" data-m='{\"i\":49,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":4}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com/messages\">\n" +
"<span></span>\n" +
" �˵��T��\n" +
"</a>\n" +
"</li>\n" +
"<li  data-id=\"50\" data-m='{\"i\":50,\"p\":45,\"n\":\"facebook.flyout\",\"y\":14,\"o\":5}'>\n" +
"<a target=\"_blank\" href=\"https://www.facebook.com/friends/requests\">\n" +
"<span></span>\n" +
" �T�{����ܽ�\n" +
"</a>\n" +
"</li>\n" +
"</ul>\n" +
" <a href=\"https://www.facebook.com/msntwnews\" target=\"_blank\"  data-id=\"51\" data-m='{\"i\":51,\"p\":45,\"n\":\"fbflyoutstndlike\",\"y\":14,\"o\":6}'>\n" +
"<h3>�b Facebook �W�� MSN �g</h3>\n" +
"</a>\n" +
"            <ul>\n" +
"                <li>\n" +
"                    <div>\n" +
"                         <h3>msn</h3>\n" +
"                    </div>\n" +
"                    <p>���o Facebook �̨νu�W���e!</p>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/95/8bd8bf.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>�n�J�z�� Microsoft ���b��H�d�ݳ̷s�� OneDrive ���e�C</p>\n" +
"                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"   data-id=\"53\" data-m='{\"i\":53,\"p\":52,\"n\":\"onedrive\",\"y\":14,\"l\":\"me_onedrive_footerText\",\"o\":1}'>�n�J</a>\n" +
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
"<a href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\" class=\"loginlink\" target=\"_blank\">�n�J</a>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/44/c08e43.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>�K�O�z�L Office Online �˵��̪񪺤��Ϋإ߷s���C</p>\n" +
"\n" +
"<div  data-module-id=\"startpage|meStripe|meStripe|meStripe.office|meOffice\" data-sso-dependent=\"true\"  data-cache-duration=\"300000\"  data-module-deferred=\"true\">\n" +
"</div>                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"   data-id=\"56\" data-m='{\"i\":56,\"p\":55,\"n\":\"office\",\"y\":14,\"l\":\"me_office_footerText\",\"o\":1}'>�n�J</a>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer maps \"   data-id=\"57\" data-m='{\"i\":57,\"p\":20,\"n\":\"meStripe.maps\",\"y\":5,\"o\":18}'>\n" +
"            \n" +
"            <div class=\"meflyout signin\">\n" +
"                <section>\n" +
"                            <a href=\"https://www.bing.com/maps/?FORM=MSNLOC&amp;cp=25.04~121.56&amp;lvl=12\" target=\"_blank\"  data-id=\"58\" data-m='{\"i\":58,\"p\":57,\"n\":\"maps\",\"y\":14,\"l\":\"me_maps_headerText\",\"o\":1}'><h3>�O�_��</h3></a>\n" +
"                        <div >\n" +
"\n" +
" <a href=\"https://www.bing.com/maps/?FORM=MSNSMP&amp;cp=25.04~121.56&amp;lvl=12&amp;trfc=1\" target=\"_blank\"  data-id=\"59\" data-m='{\"i\":59,\"p\":57,\"n\":\"static.map\",\"y\":14,\"o\":2}'>\n" +
" <img alt=\"�t��q��T���uBing �a�ϡv�v��\" data-src=\"{&quot;default&quot;:&quot;//ecn.dev.virtualearth.net/REST/v1/Imagery/Map/road/25.04,121.56/12?mapSize=368,182&amp;mapLayer=trafficflow&amp;c=zh&amp;key=Ar57SaDngRFDOGK62G-DuNqDGb44RUPiWza5E9lLntmzp2nFhJnvFELTRZFUhoyq&amp;maxAge=300&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"</a>\n" +
"                        </div>\n" +
"                </section>\n" +
"                    <ul>\n" +
"                            <li  data-id=\"60\" data-m='{\"i\":60,\"p\":57,\"n\":\"maps\",\"y\":14,\"l\":\"me_maps_directions\",\"o\":3}'>\n" +
"                                <a href=\"https://www.bing.com/maps/?FORM=MSNDIR&amp;rtp=pos.25.04_121.56&amp;mode=D\" target=\"_blank\">���u<span></span></a>\n" +
"                            </li>\n" +
"                            <li  data-id=\"61\" data-m='{\"i\":61,\"p\":57,\"n\":\"maps\",\"y\":14,\"l\":\"me_maps_traffic\",\"o\":4}'>\n" +
"                                <a href=\"https://www.bing.com/maps/?FORM=MSNTRF&amp;cp=25.04~121.56&amp;lvl=12&amp;trfc=1\" target=\"_blank\">��q���p<span></span></a>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/8c/865070.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>�n�J�z�� Microsoft �b��H�˵��̪񪺵��O�C</p>\n" +
"\n" +
"<div  data-module-id=\"startpage|meStripe|meStripe|meStripe.onenote|meOneNote\" data-sso-dependent=\"true\"  data-cache-duration=\"300000\"  data-module-deferred=\"true\">\n" +
"</div>                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://login.live.com/login.srf?wa=wsignin1.0&amp;rpsnv=13&amp;ct=1547912516&amp;rver=7.0.6730.0&amp;wp=LBI&amp;wreply=https:%2f%2fwww.msn.com%2fzh-tw%2fhomepage%2fSecure%2fPassport%3fru%3dhttps%253a%252f%252fwww.msn.com%252fzh-tw%252f%253focid%253dmailsignout%2526pfr%253d1&amp;lc=1033&amp;id=1184&amp;mkt=zh-tw&amp;pcexp=True\"   data-id=\"63\" data-m='{\"i\":63,\"p\":62,\"n\":\"onenote\",\"y\":14,\"l\":\"me_onenote_footerText\",\"o\":1}'>�n�J</a>\n" +
"                </section>\n" +
"            </div>\n" +
"            \n" +
"        </div>\n" +
"        <div  class=\"meflyoutcontainer twitter \"  data-deferred=\"1\"  data-id=\"64\" data-m='{\"i\":64,\"p\":20,\"n\":\"meStripe.twitter\",\"y\":5,\"o\":20}'>\n" +
"            \n" +
"            <div class=\"meflyout signout\">\n" +
"                <section>\n" +
"                        <div  data-signedout-image-url=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/52/8adb60.jpg\">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/hp-eas/sc/52/8adb60.jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />                                <p>���o�z�� Twitter ��s</p>\n" +
"                        </div>\n" +
"                            <a class=\"mefoot\" href=\"https://twitter.com/\"   data-id=\"65\" data-m='{\"i\":65,\"p\":64,\"n\":\"twitter\",\"y\":14,\"l\":\"me_twitter_footerText\",\"o\":1}'>�n�J</a>\n" +
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
"            <button tabindex=\"-1\" class=\"stripearrow\"  data-aop=\"leftarrow\"  data-id=\"68\" data-m='{\"i\":68,\"p\":67,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"sectioncontent\">\n" +
"\n" +
"\n" +
" <div class=\"weatodaymini\"  data-module-id=\"startpage|todayNavigation|section|stripe.today.weather|WeatherTodayMiniModule\"  data-id=\"69\" data-m='{\"i\":69,\"p\":67,\"n\":\"weatherTodayMiniModule\",\"y\":4,\"o\":2}'>\n" +
"<a  href=\"/zh-tw/weather/today/%e8%87%ba%e5%8c%97%e5%b8%82,%e8%87%ba%e7%9d%a3/we-city?iso=TW&amp;el=88BvMEEFglY1eFnLmpENHA%3D%3D\" class=\"location\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\" aria-label=\"�O�_�����Ѯ�O�h���ɳ��A�ū׬O 19 �סC\">\n" +
" <img class=\"image\" src=\"//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB1kKVy.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=30&amp;h=30\"\n" +
"\n" +
"data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB1kKVy.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=30&amp;h=30&quot;}\"\n" +
"alt=\"�h���ɳ�\" title=\"�h���ɳ�\" data-icon=\"30\" />\n" +
"<div class=\"loc\">\n" +
"�O�_�� / <span>19&#176;C</span>\n" +
"\n" +
"</div>\n" +
"</a>\n" +
"\n" +
" <div class=\"edit\"  data-aop=\"change\">\n" +
"<a class=\"edithome\" href=\"#\" aria-label=\"�ܧ��m�ηū׳��\" data-degreetype=\"C\"  data-id=\"70\" data-m='{\"i\":70,\"p\":67,\"n\":\"weathereditbtn\",\"y\":12,\"o\":3}'\n" +
"data-home=\"�j�M�a�I/����\" title=\"�ܧ�\">�ܧ�</a>\n" +
"</div>\n" +
"<div class=\"weapopup\" role=\"dialog\" aria-labelledby=\"weaaddlocation-label\"  data-aop=\"editweatherflyout\"  data-region=\"editweatherflyout\">\n" +
"<div class=\"weaddn wpopbg\"></div>\n" +
"<div class=\"weaddn wpopctn\">\n" +
"<a class=\"close\"  data-id=\"71\" data-m='{\"i\":71,\"p\":67,\"n\":\"weatherTodayMiniClose\",\"t\":\"CloseBtn\",\"o\":4}' role=\"button\" href=\"#\" title=\"����\">����</a>\n" +
" \n" +
"\n" +
"<div class=\"weaaddlocation\">\n" +
"\n" +
"<form  data-id=\"72\" data-m='{\"i\":72,\"p\":67,\"n\":\"weasearchlocation\",\"y\":8,\"o\":5}' action=\"/zh-tw/weather/search\" data-action=\"/zh-tw/weather/ajax/places/search/\" method=\"get\"  class=\"nogps\">\n" +
" \n" +
"<p class=\"label\" id=\"weaaddlocation-label\">�]�w�w�]��m</p>\n" +
"<div class=\"add-loc-as-container\">\n" +
"<input name=\"q\" class=\"query\" accesskey=\"L\" autocomplete=\"off\" type=\"search\" aria-autocomplete=\"list\"\n" +
"value=\"\" maxlength=\"250\" data-auto-suggest-settings='{&quot;market&quot;:&quot;zh-tw&quot;,&quot;mode&quot;:&quot;AS&quot;,&quot;baseurl&quot;:&quot;/zh-tw/weather/today&quot;,&quot;action&quot;:&quot;sethome&quot;,&quot;method&quot;:&quot;custom&quot;,&quot;selector&quot;:&quot;.weaaddlocation&quot;,&quot;urltype&quot;:&quot;GeoLocation&quot;,&quot;formcode&quot;:&quot;&quot;,&quot;lat&quot;:22.9944,&quot;lon&quot;:120.199}'\n" +
"                   placeholder=\"�j�M�a�I/����\" data-seemoretext=\"���U &lt;Enter&gt; �H�d�ݧ�h���e\" data-autosuggestdelay=\"100\"\n" +
"                   aria-label=\"�j�M�a�I/����\"  data-id=\"73\" data-m='{\"i\":73,\"p\":72,\"n\":\"weaautosuggest\",\"y\":10,\"o\":1}' />\n" +
"<button type=\"submit\" title =\"�j�M\" class=\"searchbtn\"  data-id=\"74\" data-m='{\"i\":74,\"p\":72,\"n\":\"wealocationsearch\",\"y\":11,\"o\":2}'\n" +
"  aria-label=\"�j�M\">\n" +
"<span class=\"x-screen-reader\">�j�M</span>               \n" +
"            </button>\n" +
"        </div>\n" +
"        <div class=\"nolocerr\" aria-live=\"assertive\" data-message=\"�䤣��u{0}�v���j�M���G\"></div>\n" +
"<div class=\"errmsg\" aria-hidden=\"true\" data-error-in-service-message=\"�o�ͷN�~�����~�A�ЦA�դ@���C\"></div>\n" +
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
"<p>�ū���ܳ��</p>\n" +
"<form id=\"id0ec343ae6f874e55adddd937501339a7\" class=\"setdegree\"  data-id=\"76\" data-m='{\"i\":76,\"p\":67,\"n\":\"degreetype\",\"y\":12,\"o\":6}' action=\"/zh-tw/weather/ajax/places/savedegree/\" method=\"post\">\n" +
" \n" +
"<div>\n" +
"<button name=\"weaDegreeType\" id=\"id0ec343ae6f874e55adddd937501339a7_fahrenheit\" value=\"F\"\n" +
"                        class=\"\"\n" +
" role=\"radio\"\n" +
"  data-id=\"77\" data-m='{\"i\":77,\"p\":76,\"n\":\"weafahrenheit\",\"y\":11,\"o\":1}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id0ec343ae6f874e55adddd937501339a7_fahrenheit\" form=\"id0ec343ae6f874e55adddd937501339a7\">�ؤ�</label>\n" +
"            </div>\n" +
"            <div>\n" +
"                <button name=\"weaDegreeType\" id=\"id0ec343ae6f874e55adddd937501339a7_celsius\" value=\"C\"\n" +
"                        class=\"selected\"\n" +
" role=\"radio\"\n" +
"  data-id=\"78\" data-m='{\"i\":78,\"p\":76,\"n\":\"weacelsius\",\"y\":11,\"o\":2}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id0ec343ae6f874e55adddd937501339a7_celsius\" form=\"id0ec343ae6f874e55adddd937501339a7\">���</label>\n" +
"</div>\n" +
" \n" +
"</form>\n" +
"</div>\n" +
"\n" +
"<button  data-id=\"79\" data-m='{\"i\":79,\"p\":67,\"n\":\"weatherTodayMiniDone\",\"t\":\"DoneBtn\",\"o\":7}' class=\"donebutton disabled\" disabled=\"disabled\" title=\"����\">����</button>\n" +
"</div>\n" +
"</div> </div>\n" +
" <div class=\"stripenav\"  data-aop=\"stripe.today.navigation_todaystripenavigation\"  data-id=\"80\" data-m='{\"i\":80,\"p\":67,\"n\":\"stripe.today.navigation\",\"t\":\"todayStripeNavigation\",\"o\":8}'>\n" +
" \n" +
"<ul>\n" +
" <li class=\"makehomepage\"  data-id=\"81\" data-m='{\"i\":81,\"p\":80,\"n\":\"make_homepage_text\",\"y\":4,\"o\":1}'><h2><a href=\"https://chrome.google.com/webstore/detail/msn-homepage-bing-search/aodojjhnfnfhaplflfohfddffmjkdjak\" target=\"_blank\"  data-id=\"82\" data-m='{\"i\":82,\"p\":80,\"n\":\"make_homepage_text\",\"y\":4,\"o\":2}'>�N MSN �]�w���ڪ�����</a></h2></li>\n" +
"\n" +
"\n" +
" <li  class=\"weatoday weather\"  data-id=\"83\" data-m='{\"i\":83,\"p\":80,\"n\":\"weather\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/weather\">�Ѯ�</a></li>\n" +
" <li  class=\"news\"  data-id=\"84\" data-m='{\"i\":84,\"p\":80,\"n\":\"news\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/news\">�s�D</a></li>\n" +
" <li  class=\"entertainment\"  data-id=\"85\" data-m='{\"i\":85,\"p\":80,\"n\":\"entertainment\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/entertainment\">�T��</a></li>\n" +
" <li  class=\"lifestyle\"  data-id=\"86\" data-m='{\"i\":86,\"p\":80,\"n\":\"lifestyle\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/lifestyle\">�ͬ�</a></li>\n" +
" <li  class=\"sports\"  data-id=\"87\" data-m='{\"i\":87,\"p\":80,\"n\":\"sports\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/sports\">�B��</a></li>\n" +
" <li  class=\"finance\"  data-id=\"88\" data-m='{\"i\":88,\"p\":80,\"n\":\"finance\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/money\">�]�g</a></li>\n" +
" <li  class=\"healthfitness\"  data-id=\"89\" data-m='{\"i\":89,\"p\":80,\"n\":\"health\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/health\">���d</a></li>\n" +
" <li  class=\"fooddrink\"  data-id=\"90\" data-m='{\"i\":90,\"p\":80,\"n\":\"foodanddrink\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/foodanddrink\">����</a></li>\n" +
" <li  class=\"travel\"  data-id=\"91\" data-m='{\"i\":91,\"p\":80,\"n\":\"travel\",\"y\":4,\"o\":11}'><a href=\"/zh-tw/travel\">�ȹC</a></li>\n" +
" <li  class=\"autos\"  data-id=\"92\" data-m='{\"i\":92,\"p\":80,\"n\":\"autos\",\"y\":4,\"o\":12}'><a href=\"/zh-tw/autos\">�T��</a></li>\n" +
" <li  class=\"video\"  data-id=\"93\" data-m='{\"i\":93,\"p\":80,\"n\":\"video\",\"y\":4,\"o\":13}'><a href=\"/zh-tw/video\">�v��</a></li>\n" +
"  </ul>\n" +
" \n" +
"</div>\n" +
"\n" +
"\n" +
"            </div>\n" +
"            <button tabindex=\"-1\" class=\"stripearrow\"  data-aop=\"rightarrow\"  data-id=\"94\" data-m='{\"i\":94,\"p\":67,\"n\":\"rightarrow\",\"y\":12,\"o\":9}'  title=\"�U�@��\"></button>\n" +
"        </div>\n" +
"        \n" +
"    </div>\n" +
"        <div class=\"msbrand\">\n" +
"            <span class=\"poweredby\">powered by</span> <span class=\"msnews\">Microsoft News</span>\n" +
"        </div>\n" +
"<div class='normalsection' role='region'  data-section-id=\"outlooklogout\"><div class='full-width'><div class='sectioncontent'  data-region=\"outlooklogout_section\">\n" +
" <div id=\"outlooklogout\"  data-aop=\"outlooklogout\"  data-id=\"95\" data-m='{\"i\":95,\"p\":19,\"n\":\"outlookLogoutModule\",\"t\":\"outlookLogoutModule\",\"o\":4}'  data-outlook-url=\"http://www.outlook.com\">\n" +
"<span>Outlook</span>\n" +
"<a class=\"outlookcontent\" href=\"http://www.outlook.com\" target=\"_blank\">�w�N�z�n�X�C���s�n�J?</a>\n" +
"<a class=\"signintext\" href=\"http://www.outlook.com\" target=\"_blank\">�n�J</a>\n" +
"</div>\n" +
"</div></div></div>\n" +
" <div  class=\"todaystripe grid layout-large\"  data-section-id=\"today\"  data-module-id=\"startpage|today|todaystripe|today.Hero|todayStripeHeadlines\"  data-aop=\"today.hero_todaystripeheadlines\"  data-id=\"96\" data-m='{\"i\":96,\"p\":19,\"n\":\"today.Hero\",\"t\":\"todayStripeHeadlines\",\"o\":5}'>\n" +
" \n" +
" <h2 class=\"hide\">�̷s����</h2>\n" +
" <ul>\n" +
"<li class=\"infopane-placeholder\">\n" +
" \n" +
" <div class=\"ip infopanestripe slideshow \"\n" +
" data-placements=\"infopane-headtohead-1:2;infopane-headtohead-2:2;infopane-headtohead-3:2\" data-positions=\"4,10,16\" data-section-id=\"infopane\"\n" +
"  data-module-id=\"startpage|infopane|infopanestripe|infopane_a|infopaneStripeHeadlines\" data-param=\"{&quot;text&quot;:&quot;���W�w��&quot;,&quot;url&quot;:&quot;ms-gwx:launch&quot;,&quot;track&quot;:&quot;msn&quot;}\"  data-aop=\"infopane_a_infopanestripeheadlines\"  data-id=\"97\" data-m='{\"i\":97,\"p\":96,\"n\":\"infopane_a\",\"t\":\"infopaneStripeHeadlines\",\"o\":1}'\n" +
">\n" +
" \n" +
"<ul class=\"swipenav\"\n" +
">\n" +
"    <li tabindex=\"0\" class=\" triptych   hasimage  selected \"  data-aop=\"slide1>triptych \"  data-id=\"98\" data-m='{\"i\":98,\"p\":97,\"n\":\"tryptic\",\"y\":8,\"o\":1}' >\n" +
"        \n" +
"\n" +
"\n" +
"		    <h3>����̪`��</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/national/%e6%88%91%e5%9c%8b%e7%8d%84%e6%94%bf%e5%8f%b2%e9%a6%96%e4%be%8b%ef%bc%81%e6%ad%bb%e5%9b%9a%e8%87%aa%e6%ae%ba%e4%ba%a1/ar-BBSqXDl?li=BBqiNIb\"\n" +
"         data-id=\"99\" data-m='{\"i\":99,\"p\":98,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqXDl\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"�ڰ꺻�F�v���ҡI���}�۱��`\" onerror=\"this.className=&#39;err&#39;\" onload=\"this.className=&#39;loaded&#39;\" src=\"https://static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqXDi.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=469&amp;y=164\" title=\"�ڰ꺻�F�v���ҡI���}�۱��` - Copyright? ���ɹq�l��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�ڰ꺻�F�v���ҡI���}��ֵ����V�`-�峹\">�ڰ꺻�F�v���ҡI���}��ֵ����V�`</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/news/national/%e6%9a%97%e5%96%bb%e8%94%a1%e8%a6%aa%e7%be%8e%e3%80%8c%e5%bc%b7%e7%9b%9c%e6%90%b6%e9%8c%a2%e6%b2%92%e7%9c%8b%e5%88%b0%e8%ad%a6%e5%af%9f%e3%80%8d/ar-BBSr2qh?li=BBqiNIb\"\n" +
"         data-id=\"100\" data-m='{\"i\":100,\"p\":98,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr2qh\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"�t�뽲�ˬ��u�j�s�m���S�ݨ�ĵ��v\" onerror=\"this.className=&#39;err&#39;\" onload=\"this.className=&#39;loaded&#39;\" src=\"https://static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqPQv.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=347&amp;y=193\" title=\"�t�뽲�ˬ��u�j�s�m���S�ݨ�ĵ��v - Copyright? ���ɹq�l��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�_�t�뽲�ˬ��u�j�s�m���S�ݨ�ĵ��v-�峹\">�_�t�뽲�ˬ��u�j�s�m���S�ݨ�ĵ��v</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"    <a   href=\"/zh-tw/news/national/%e7%a7%98%e6%9b%b8%e6%92%9e%e8%87%89%e5%a5%b3%e6%98%9f-%e8%bf%bd%e5%b0%8f%e8%8b%b1%e9%80%9b%e8%a5%bf%e9%96%80%e5%8f%a6%e9%a1%9e%e5%ac%8c%e9%bb%9e/ar-BBSpEPe?li=BBqiNIb\"\n" +
"         data-id=\"101\" data-m='{\"i\":101,\"p\":98,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpEPe\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" onerror=\"this.className=&#39;err&#39;\" onload=\"this.className=&#39;loaded&#39;\" src=\"https://static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpT7V.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=206&amp;y=111\" title=\"���Ѽ��y�k�P �l�p�^�}����t���b�I - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"���Ѽ��y�k�P �l�p�^�}����t���b�I-�峹\">���Ѽ��y�k�P �l�p�^�}����t���b�I</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"            <h3>�ɨƵJ�I</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/national/%e8%ba%ab%e5%bd%a2%e5%a4%a7%e8%ae%8a-%e9%a8%99%e6%89%81%e5%b0%8f%e5%ad%90%e8%81%b2%e8%ab%8b%e5%81%9c%e5%af%a9%e8%a2%ab%e9%a7%81/ar-BBSqUW0?li=BBqiNIb\"\n" +
"         data-id=\"103\" data-m='{\"i\":103,\"p\":102,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqUW0\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"���Τj�� �F��p�l�n�а��f�Q��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqXG3.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=256&amp;y=288&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���Τj�� �F��p�l�n�а��f�Q�� - Copyright? ���ɹq�l��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"���Τj�� �F��p�l�n�а��f�Q��-�峹\">���Τj�� �F��p�l�n�а��f�Q��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��        </span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSq2o4.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�v�w�Ӧn�H�騮����{�j�����å� - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�v�w�Ӧn�H�騮����{�j�����å�-�峹\">�v�w�Ӧn�H�騮����{�j�����å�</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrfXq.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=406&amp;y=118&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�`�g�z���աK���u�ͤ@�y�ܤu�@���F - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�`�g�z���աK���u�ͤ@�y�ܤu�@���F-�峹\">�`�g�z���աK���u�ͤ@�y�ܤu�@���F</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"            <h3>�T�ַs�D</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/news/%e4%bd%99%e5%a4%a9%e9%81%b8%e8%88%89%e8%b3%a0%e5%85%895%e9%96%93%e6%88%bf-%e9%99%b3%e6%8f%ae%e6%96%87%e8%b3%a3%e5%81%87%e5%95%a6%ef%bc%81%e6%8f%ad%e7%ab%8b%e5%a7%94%e5%a4%9a%e5%a5%bd%e8%b3%ba/ar-BBSpX1N?li=BBqiNIb\"\n" +
"         data-id=\"107\" data-m='{\"i\":107,\"p\":106,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpX1N\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"�E�ѿ��|�ߥ�5���� ������G�氲�աI���ߩe�h�n��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrqad.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=129&amp;y=132&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�E�ѿ��|�ߥ�5���� �L���y���ߩe�h�n�� - ���ɹq�l��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�E�ѿ��|�ߥ�5���� �L���y���ߩe�h�n��-�峹\">�E�ѿ��|�ߥ�5���� �L���y���ߩe�h�n��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��        </span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrBuB.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=186&amp;y=234&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�d�q�i���p�T�Q�� �����o�㬵�G����ٴ� - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�d�q�i���p�T�Q�� �����o�㬵�G����ٴ�-�峹\">�d�q�i���p�T�Q�� �����o�㬵�G����ٴ�</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"<img alt=\"�P�l��,TWICE/½���TWICE IG\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrBv8.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=117&amp;y=150&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����`�¯٭��{���I�l��o���S�߯k - �T�߷s�D��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�����`�¯٭��{���I�l��o���S�߯k-�峹\">�����`�¯٭��{���I�l��o���S�߯k</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"            <h3>�T�֬P�A��</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/news/%e4%bd%99%e5%a4%a9%e5%93%ad%e4%ba%86%ef%bc%9f%e5%a5%b3%e5%85%92%e5%a9%9a%e5%ae%b4%e6%9d%8e%e4%ba%9e%e8%90%8d%e5%98%b2%e5%83%8f%e7%b4%85%e5%8c%85%e5%a0%b4/ar-BBSfL0v?li=BBqiNIb\"\n" +
"         data-id=\"111\" data-m='{\"i\":111,\"p\":110,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfL0v\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"���ȵ�,�p���P�j��Z,�����Ѵ���\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfUvm.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=315&amp;y=191&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ȵ�,�p���P�j��Z,�����Ѵ��� - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�E�ѭ��F�H�k��B�b���ȵӼJ�����]��-�峹\">�E�ѭ��F�H�k��B�b���ȵӼJ�����]��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/entertainment/news/%e9%bb%83%e5%98%89%e5%8d%83%e5%92%8c%e5%a4%8f%e5%85%8b%e7%ab%8b%e6%93%94%e5%bf%83%e5%ae%b6%e5%ba%ad%e6%88%b0%e7%88%ad-%e5%af%ab%e9%81%ba%e5%9b%91%e3%80%8c%e4%ba%a4%e4%bb%a3%e5%a5%bd%e5%a4%8f%e5%a4%a9%e5%8e%bb%e5%90%91%e3%80%8d/ar-BBSgQAy?li=BBqiNIb\"\n" +
"         data-id=\"112\" data-m='{\"i\":112,\"p\":110,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgQAy\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"���Ťd�M�L�J�߾�߮a�x�Ԫ� �g����u��N�n�L�ѥh�V�v\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSh7iz.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=284&amp;y=156&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���Ťd�M�L�J�߾�߮a�x�Ԫ� �g����u��N�n�L�ѥh�V�v - Copyright? ���ɹq�l��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"���Ťd�M�L�J�߾�߮a�x�Ԫ� �g����u��N�n�L�ѥh�V�v-�峹\">���Ťd�M�L�J�߾�߮a�x�Ԫ� �g����u��N�n�L�ѥh�V�v</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��        </span>\n" +
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
"            <h3>���d�s��</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/health/topic/%e4%ba%ba%e7%94%9f%e7%b5%82%e9%9c%80%e4%b8%80%e5%88%a5-%e9%80%99%e6%a8%a3%e5%81%9a%e5%ad%b8%e6%9c%83%e9%9d%a2%e5%b0%8d%e6%ad%bb%e4%ba%a1%e3%80%81%e4%b8%8d%e5%86%8d%e6%81%90%e6%87%bc/ar-BBSdt76?li=BBqiNIb\"\n" +
"         data-id=\"114\" data-m='{\"i\":114,\"p\":113,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdt76\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"�H�Ͳ׻ݤ@�O �o�˰��Ƿ|���了�`�B���A����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdt70.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=207&amp;y=244&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�H�Ͳ׻ݤ@�O �o�˰��Ƿ|���了�`�B���A���� - �� PIN NETWORK CO LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�H�Ͳ׻ݤ@�O �o�˰��Ƿ|���了�`�B���A����-�峹\">�H�Ͳ׻ݤ@�O �o�˰��Ƿ|���了�`�B���A����</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�ؤH���d��        </span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgESv.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=299&amp;y=176&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ָ��O�֤����H��ĵ�i5���γt�N�� - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"���ָ��O�֤����H��ĵ�i5���γt�N��-�峹\">���ָ��O�֤����H��ĵ�i5���γt�N��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"<img alt=\"������o�̷Q���G��l�Чڪ��ѪB�͡A���§A\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjrkW.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=266&amp;y=140&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"������o�̷Q���G��l�Чڪ��ѪB�͡A���§A - �� Common Wealth Magazine Group ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"������o�̷Q���G��l�Чڪ��ѪB�͡A���§A-�峹\">������o�̷Q���G��l�Чڪ��ѪB�͡A���§A</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�d�����x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�d�����x        </span>\n" +
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
"            <h3>��°ʺA</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/sports/sports-badminton/%e5%b0%8f%e6%88%b4%e4%b8%8d%e6%95%b5%e6%b3%b0%e5%9c%8b%e4%b8%80%e5%a7%90-%e9%96%8b%e5%ad%a3%e9%a6%96%e7%ab%99%e6%ad%a2%e6%ad%a58%e5%bc%b7/ar-BBSpn66?li=BBqiNIb\"\n" +
"         data-id=\"118\" data-m='{\"i\":118,\"p\":117,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpn66\",\"h\":0,\"v\":\"sports\",\"c\":\"sports-badminton\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"�p�����Į���@�j�@�}�u������B8�j\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBO3dlj.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=397&amp;y=128&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����o�C�]�i���r����^ - TSNA\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�p�����Į���@�j �}�u������B8�j-�峹\">�p�����Į���@�j �}�u������B8�j</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"TSNA �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />TSNA        </span>\n" +
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
"<img alt=\"���²Q���C�]�ϡ�½��ۿD�� Twitter�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrgkc.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=240&amp;y=145&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���²Q���C�]�ϡ�½��ۿD�� Twitter�^ - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"���y��������I �²Q���L�t16�j-�峹\">���y��������I �²Q���L�t16�j</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"<img alt=\"��¾�n�L���Ӯ��D�j���~ 21���H���H�K�V\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpBra.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=318&amp;y=111&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��¾�n�L���Ӯ��D�j���~ 21���H���H�K�V - Copyright? ���ɹq�l��\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�L���Ӯ��D�j���~ 21���H���H�K�V-�峹\">�L���Ӯ��D�j���~ 21���H���H�K�V</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��        </span>\n" +
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
"            <h3>�]�g�J�I</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/money/topstories/%e8%98%8b%e6%9e%9c%e7%a0%8d%e5%96%ae%e6%8e%83%e5%88%b0%e9%b4%bb%e6%b5%b7-%e5%af%8c%e5%a3%ab%e5%ba%b7%e9%84%ad%e5%b7%9e%e5%bb%a0%e7%b4%af%e8%a8%88%e8%a3%81%e6%92%a45%e8%90%ac%e4%ba%ba%e5%8a%9b%ef%bc%9f/ar-BBSruXG?li=BBqiNIb\"\n" +
"         data-id=\"122\" data-m='{\"i\":122,\"p\":121,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSruXG\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"������C���ɡA�ۥh�]2018�^�~�H�ӡA�]iPhone�ݨD��w�A�I�h�d�e�n�G�{�t�w�֭p���M5�U�W�H�O�C (�ϡ�NOWnews��ƷӤ�)\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrH00.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2141&amp;y=793&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"������C���ɡA�ۥh�]2018�^�~�H�ӡA�]iPhone�ݨD��w�A�I�h�d�e�n�G�{�t�w�֭p���M5�U�W�H�O�C (�ϡ�NOWnews��ƷӤ�) - �� NOWnews Network Co.,Ltd ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"ī�G��汽���E�� �I�h�d�G�{�t�֭p���M5�U�H�O�H-�峹\">ī�G��汽���E�� �I�h�d�G�{�t�֭p���M5�U�H�O�H</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />NOWnews        </span>\n" +
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
"<img alt=\"�e�a2�U�W�B�h�F40�ɫؿv�����u���J�K�Ѱ���[���s���v�w�g�}�l����B�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS9T5V.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�e�a2�U�W�B�h�F40�ɫؿv�����u���J�K�Ѱ���[���s���v�w�g�}�l����B�C - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"60�����y���ث������� �Ὤ�}�i�D�Ԧh�ӥ��x�Ĥ@-�峹\">60�����y���ث������� �Ὤ�}�i�D�Ԧh�ӥ��x�Ĥ@</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjymb.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=432&amp;y=296&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�a�V�W���x�W�_�� ���z���I�~2,200���׷l - �� Home Media Group LTD., Cite Branch ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�O����L�I�a�V�W���x�W�_�� ���z���I�~2200���׷l-�峹\">�O����L�I�a�V�W���x�W�_�� ���z���I�~2200���׷l</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�ӷ~�P�Z  �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3igyX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�ӷ~�P�Z         </span>\n" +
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
"            <h3>�V�Ү����F</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/national/%e3%80%90%e4%b8%88%e5%a4%ab%e6%b6%88%e5%a4%b1%e4%ba%86%e4%b8%80%e3%80%91%e5%8c%96%e5%90%8d%e5%90%b3%e5%b0%8f%e5%a7%90%e7%99%bb%e5%a0%b1%e5%be%b5%e5%a9%9a-%e5%a9%9a%e5%89%8d%e5%b0%8b%e6%84%9b%e5%a9%9a%e5%be%8c%e5%8d%bb%e6%83%b3%e8%91%97%e4%b8%88%e5%a4%ab%e4%b8%8d%e8%a6%8b%e4%ba%86/ar-BBSfFtP?li=BBqiNIb\"\n" +
"         data-id=\"126\" data-m='{\"i\":126,\"p\":125,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfFtP\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"��~���ɼz�]���^�]����q�v�A ���������ɶ���b�x�W�A �ѩ������b�w��B�k��A �x�W��o�ӻ����@�Ѳ���P�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfK9H.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=415&amp;y=185&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��~���ɼz�]���^�]����q�v�A ���������ɶ���b�x�W�A �ѩ������b�w��B�k��A �x�W��o�ӻ����@�Ѳ���P�C - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�ƦW�d�p�j�n���x�B �B��o�Q�ۤV�Ҥ����F-�峹\">�ƦW�d�p�j�n���x�B �B��o�Q�ۤV�Ҥ����F</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"<img alt=\"���ɼz���e�ҩ��L�D�줺�d���C�]���ɼz���ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfFut.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=377&amp;y=196&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ɼz���e�ҩ��L�D�줺�d���C�]���ɼz���ѡ^ - �� Mirror Media Inc ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�s�V�ҡu���}�v�p�ۿߪ� �o�n�B�ï}���D�]-�峹\">�s�V�ҡu���}�v�p�ۿߪ� �o�n�B�ï}���D�]</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"<img alt=\"���ɼz������s�_�����M�ϡA 20���K��k������@�A�q���ȩ~��~�A �����ĳX�O�o�Ĥ@���^�쵣�~�G�~�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfFui.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=393&amp;y=294&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ɼz������s�_�����M�ϡA 20���K��k������@�A�q���ȩ~��~�A �����ĳX�O�o�Ĥ@���^�쵣�~�G�~�C - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"��׾D�ʫI �o���Q�߲z�vĵ�i�������X���v-�峹\">��׾D�ʫI �o���Q�߲z�vĵ�i�������X���v</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"            <h3>���°ʺA</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/autos/news/%e8%b2%b7%e8%bb%8a%e8%ad%b0%e5%83%b9%e6%9c%89%e7%9c%89%e8%a7%92-5%e5%a4%a7%e5%9c%b0%e9%9b%b7%e6%9c%80%e5%a5%bd%e5%88%a5%e5%87%ba%e5%8f%a3/ar-BBSaXVN?li=BBqiNIb\"\n" +
"         data-id=\"130\" data-m='{\"i\":130,\"p\":129,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSaXVN\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"����,�X�@,���,�ͧP,�ӽ�,¾���]�ϡ�Pixabay�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBScWtD.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2933&amp;y=1566&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ʨ��A�樮�A�R�� - Catalyst Images\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�R��ĳ�����ܨ� 5�j�a�p�̦n�O�X�f-�峹\">�R��ĳ�����ܨ� 5�j�a�p�̦n�O�X�f</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"<img alt=\"�|�ӽ��l���T��ABS�����i�ίʤF�A��ӽ��l�O?\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSg39R.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�|�ӽ��l���T��ABS�����i�ίʤF�A��ӽ��l�O? - �� Mirror Media Inc ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"abs�o��n�B�ͳ�40���F�A�j�a�٤��Ӽ��K-�峹\">ABS�o��n�B�ͳ�40���F�A�j�a�٤��Ӽ��K</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"<img alt=\"�����Q�ߤ��WPO��|�@�ϳQ�N�u�����׸��v\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQBsCu.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����A���� - Catalyst Images\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�������W�O�_�i�H�����H���;�½�F-�峹\">�������W�O�_�i�H�����H���;�½�F</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"				<h3>?�@�_�h�Ȧ�</h3>\n" +
"            <a \n" +
"       \n" +
"       href=\"/zh-tw/lifestyle/travel/%e6%9f%8f%e6%9e%97-%e5%be%b7%e5%9c%8b%e5%89%8d%e4%b8%96%e4%bb%8a%e7%94%9f%e7%9a%84%e7%b8%ae%e5%bd%b1/ar-BBSgsEz?li=BBqiNIb\"\n" +
"        data-id=\"134\" data-m='{\"i\":134,\"p\":133,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgsEz\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":1}'  >\n" +
"\n" +
"        \n" +
"\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgsEn.img?h=515&amp;w=871&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=319&amp;y=226&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� Yu Ho Corporation ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�f�L�G�w��e�@���ͪ��Y�v-�峹\">�f�L�G�w��e�@���ͪ��Y�v</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�I�]�ȴ� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAvVD2u.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�I�]�ȴ�        </span>\n" +
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
"            <h3>?2019�~�B�j���}</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/zodiac-signs/%e5%95%8f%e7%a5%9e%e9%81%94%e4%ba%ba%ef%bc%8f12%e7%94%9f%e8%82%96%e5%b7%a5%e4%bd%9c%e9%81%8b%e5%8b%a2%ef%bc%88%e4%b8%8a%ef%bc%89/ar-BBSdaGe?li=BBqiNIb\"\n" +
"         data-id=\"136\" data-m='{\"i\":136,\"p\":135,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdaGe\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"zodiac-signs\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdaGc.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=352&amp;y=107&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ݯ��F�H��12�ͨv�u�@�B�ա]�W�^ - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"2019�K�u12�ͨv�u�@�B�ա]�W�^-�峹\">2019�K�u12�ͨv�u�@�B�ա]�W�^</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/lifestyle/zodiac-signs/%e5%95%8f%e7%a5%9e%e9%81%94%e4%ba%ba%ef%bc%8f12%e7%94%9f%e8%82%96%e5%b7%a5%e4%bd%9c%e9%81%8b%e5%8b%a2-%e4%b8%8b/ar-BBSd5FZ?li=BBqiNIb\"\n" +
"         data-id=\"137\" data-m='{\"i\":137,\"p\":135,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd5FZ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"zodiac-signs\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdd9c.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=155&amp;y=102&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ݯ��F�H��12�ͨv�u�@�B��(�U) - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"2019�K�u12�ͨv�u�@�B�ա]�U�^-�峹\">2019�K�u12�ͨv�u�@�B�ա]�U�^</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
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
"        <span class=\"title\"   aria-label=\"�i�ϡj��f�X�����W�C �o�ǹq�v�o�j��-�Ϥ���\">�i�ϡj��f�X�����W�C �o�ǹq�v�o�j��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
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
"        <span class=\"title\"   aria-label=\"�i�ϡj���򯫤u!�L�I���y�u�Q��v�_��-�Ϥ���\">�i�ϡj���򯫤u!�L�I���y�u�Q��v�_��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"    <a   href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e6%97%a5%e7%b6%b2%e8%a9%95%e5%8f%b0%e7%81%a3%e6%9c%80%e7%be%8e%e8%97%9d%e4%ba%ba-%e6%9e%97%e5%bf%97%e7%8e%b2%e9%80%a3%e5%89%8d10%e9%83%bd%e9%80%b2%e4%b8%8d%e4%ba%86%ef%bc%81/ss-BBSiIyB?li=BBqiNIb\"\n" +
"         data-id=\"141\" data-m='{\"i\":141,\"p\":138,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSiIyB\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSiSvd.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1234&amp;y=1356&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�Ӭ� - Getty\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj������x�W���k �L�Ӭ³����H-�Ϥ���\">�i�ϡj������x�W���k �L�Ӭ³����H</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
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
"            <h3>���v��</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/video/viral/%e8%a2%ab%e7%8d%b5%e4%ba%ba%e6%94%be%e7%94%9f%e5%be%8c%e6%9a%b4%e6%80%92-%e9%80%b2%e6%93%8a%e7%9a%84%e8%b1%ac%e5%a4%a7%e5%8f%8d%e6%8a%97%ef%bc%81/vi-BBS5o7x\"\n" +
"         data-id=\"143\" data-m='{\"i\":143,\"p\":142,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS5o7x\",\"h\":0,\"v\":\"video\",\"c\":\"viral\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdlhx.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2734&amp;y=1823&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Marcassin, Sanglier (Sus scrofa) - Getty\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�Q�y�H��ͫ�ɫ� �i�����ޤj�ϧܡI-�v��\">�Q�y�H��ͫ�ɫ� �i�����ޤj�ϧܡI</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />BuzzVideos        </span>\n" +
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
"<img alt=\"�J�ԯ������X�ӡH�ͬ����ۦA�@�o\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdfjp.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=538&amp;y=447&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�J�ԯ������X�ӡH�ͬ����ۦA�@�o - buzzvideos\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�J�ԯ������X�ӡH�ͬ����ۦA�@�o-�v��\">�J�ԯ������X�ӡH�ͬ����ۦA�@�o</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />BuzzVideos        </span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS5JSi.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ש������Y...�s����i��w�ˡI - BUZZVIDEOS\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�ש������Y...�s����i��w�ˡI-�v��\">�ש������Y...�s����i��w�ˡI</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />BuzzVideos        </span>\n" +
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
"            <h3>�����ͬ�</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/lifestyleliving/%e4%bd%a0%e4%b9%9f%e6%9c%89%ef%bc%9f%e9%80%99%e4%b8%89%e5%80%8b%e5%b9%b4%e7%b4%80%e6%98%af%e4%ba%ba%e7%94%9f%e5%ad%a4%e7%8d%a8%e6%84%9f%e9%ab%98%e5%b3%b0/ar-BBSfNjl?li=BBqiNIb\"\n" +
"         data-id=\"147\" data-m='{\"i\":147,\"p\":146,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfNjl\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQooCN.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=152&amp;y=163&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�樭�`�N�I ��s�G�o�����ҧ󦭦� - �� Sanlih E-television Co., LTD ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�A�]���H�o�T�Ӧ~���O�H�ͩt�W�P���p-�峹\">�A�]���H�o�T�Ӧ~���O�H�ͩt�W�P���p</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/lifestyle/decor/%e7%85%ae%e8%8f%9c%e5%8b%95%e7%b7%9a%e5%a5%bd%e6%b5%81%e6%9a%a2%ef%bc%8112-%e6%ac%be%e4%ba%8c%e5%ad%97%e5%bd%a2%e5%bb%9a%e6%88%bf%e7%9a%84%e8%a8%ad%e8%a8%88%e5%af%a6%e4%be%8b/ss-BBSef8T?li=BBqiNIb\"\n" +
"         data-id=\"148\" data-m='{\"i\":148,\"p\":146,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSef8T\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyledecor\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"�H�զ�t���ɩ��G�סA�`�Ǧa�O�h��y�X�Hí�𮧡A�@�䪺�d�馳�ਤ�]�p�A�ݰ_�ӧ󬰬X�M�~�ϥΤW�]��K�Q�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSef8v.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=545&amp;y=417&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�H�զ�t���ɩ��G�סA�`�Ǧa�O�h��y�X�Hí�𮧡A�@�䪺�d�馳�ਤ�]�p�A�ݰ_�ӧ󬰬X�M�~�ϥΤW�]��K�Q�C - homify / �����]�p�������q\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�N��ʽu�n�y�Z�I12�ڤG�r�μp�Ъ��]�p���-�Ϥ���\">�N��ʽu�n�y�Z�I12�ڤG�r�μp�Ъ��]�p���</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Homify �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAuTnto.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Homify        </span>\n" +
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
"            <h3>2018�^�U</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/yearinreview2018/%e3%80%90%e5%9c%96%e3%80%912018%e3%80%8a%e5%af%8c%e6%af%94%e5%a3%ab%e3%80%8b%e5%8f%b0%e7%81%a3%e5%af%8c%e8%b1%aa%e6%a6%9c%e5%87%ba%e7%88%90-%e4%ba%ae%e9%bb%9e%e6%98%af%ef%bc%9f/ss-BBPIQG6?li=BBqiNIb\"\n" +
"         data-id=\"150\" data-m='{\"i\":150,\"p\":149,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPIQG6\",\"h\":0,\"v\":\"news\",\"c\":\"yearinreview2018\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"���l���B���x��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPJ0wE.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=257&amp;y=93&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���l���B���x�� - �F��IC�BReuters\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj2018�m�I��h�n�x�W�I���]�u�L�v���𭺴I-�Ϥ���\">�i�ϡj2018�m�I��h�n�x�W�I���]�u�L�v���𭺴I</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
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
"        <span class=\"title\"   aria-label=\"�i�ϡj30���ӪŹq�v �D�ԧA���Q���O�����I-�Ϥ���\">�i�ϡj30���ӪŹq�v �D�ԧA���Q���O�����I</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
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
"<img alt=\"�����۫H���B�B�w�g44���F�I���10kg�H�W���G�l�����a�u�o4�ۡv\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPYHBs.img?h=232&amp;w=434&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1015&amp;y=189&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����۫H���B�B�w�g44���F�I���10kg�H�W���G�l�����a�u�o4�ۡv - bella\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj��άO�@���l���j�~�I�O�i�G���𲤬ݧ��ʰ_��-�Ϥ���\">�i�ϡj��άO�@���l���j�~�I�O�i�G���𲤬ݧ��ʰ_��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos        </span>\n" +
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
"<img alt=\"ī�G�h�~���q���󴫭p�e���Τᴫ�F�h�ֶ��q���H���׬O 1100 �U\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoVP3.img?h=515&amp;w=871&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"ī�G�h�~���q���󴫭p�e���Τᴫ�F�h�ֶ��q���H���׬O 1100 �U - �� Home Media Group (II) ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"ī�G�h�~���q���󴫭p�e���Τᴫ�F�h�ֶ��q���H���״���-�峹\">ī�G�h�~���q���󴫭p�e���Τᴫ�F�h�ֶ��q���H���״���</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"T�Ȩ� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBjPbZW.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />T�Ȩ�        </span>\n" +
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
"            <h3>��ڭn�D</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/news/world/%e9%99%b8%e5%81%89%e8%81%b0%e8%a7%80%e9%bb%9e%e7%bf%92%e8%bf%91%e5%b9%b3%e7%a9%bf%e4%b8%8a%e4%ba%86%e3%80%8c%e7%9a%87%e5%b8%9d%e7%9a%84%e6%96%b0%e8%a1%a3%e3%80%8d/ar-BBSoDTW?li=BBqiNIb\"\n" +
"         data-id=\"156\" data-m='{\"i\":156,\"p\":155,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoDTW\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"�����o�[�I�G�ߪ񥭬�W�F�u�ӫҪ��s��v\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRJodk.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=295&amp;y=148&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���K�s�[�I�G���@�o��m�i�O�W�P�M�ѡn�|�Q�~�A�⩤���Y���J�u�N��ܡv - �� Storm Media Group ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�����o�[�I�G�ߪ񥭬�W�F�u�ӫҪ��s��v-�峹\">�����o�[�I�G�ߪ񥭬�W�F�u�ӫҪ��s��v</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ǴC        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/news/world/%e5%a2%a8%e8%a5%bf%e5%93%a5%e9%a0%ad%e8%99%9f%e6%af%92%e6%a2%9f%e7%9a%84%e4%b8%96%e7%b4%80%e5%af%a9%e5%88%a4%e3%80%8b%e3%80%8c%e7%9f%ae%e5%ad%90%e3%80%8d%e5%8f%a4%e8%8c%b2%e6%9b%bc%e6%89%8b%e4%b8%8b%e4%be%9b%e7%a8%b1%e5%89%8d%e7%b8%bd%e7%b5%b1%e6%94%b6%e5%8f%971%e5%84%84%e8%b3%84%e8%b3%82%ef%bc%8c%e5%8d%94%e5%8a%a9%e8%b6%8a%e7%8d%84%e9%80%83%e4%ba%a1/ar-BBSmPO0?li=BBqiNIb\"\n" +
"         data-id=\"157\" data-m='{\"i\":157,\"p\":155,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmPO0\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"������Y���r�����@���f�P�n�u�G�l�v�j���Ҥ�U�Ѻ١G�e�`�Φ���1�����A��U�V���k�`\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmLdN.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=275&amp;y=185&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"������Y���r�����@���f�P�n�u�G�l�v�j���Ҥ�U�Ѻ١G�e�`�Φ���1�����A��U�V���k�` - �� Storm Media Group ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�u�G�l�v�j���Ҥ�U�Ѻ١G�e�`�Φ���1�����-�峹\">�u�G�l�v�j���Ҥ�U�Ѻ١G�e�`�Φ���1�����</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ǴC        </span>\n" +
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
"            <h3>&#127909;�@�_�ݹq�v</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/entertainment/news/%e3%80%8a%e9%8e%96%e5%91%bd%e5%8d%b1%e6%a9%9f%e3%80%8b%e4%b9%9f%e8%a8%b1%ef%bc%8c%e5%a6%b3%e6%a0%b9%e6%9c%ac%e4%b8%8d%e6%98%af%e4%b8%80%e5%80%8b%e4%ba%ba%e4%bd%8f/ar-BBSpeo0?li=BBqiNIb\"\n" +
"         data-id=\"159\" data-m='{\"i\":159,\"p\":158,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpeo0\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpbRr.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=322&amp;y=173&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�m��R�M���n�G�]�\�A�p�ڥ����O�@�ӤH�� - �� Global Views Commonwealth ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�m��R�M���n�G�]�\�A�p�ڥ����O�@�ӤH��-�峹\">�m��R�M���n�G�]�\�A�p�ڥ����O�@�ӤH��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"�������x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�������x        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/entertainment/news/%e3%80%90%e5%bd%b1%e8%a9%95%e3%80%91%e3%80%8a%e8%b3%ad%e5%91%bd%e9%81%8b%e8%bd%89%e6%89%8b%e3%80%8b-%e9%81%8b%e6%af%92%e4%b8%80%e5%93%a5%e7%9a%84%e7%86%9f%e9%bd%a1%e6%a8%82%e6%b4%bb/ar-BBSdzdX?li=BBqiNIb\"\n" +
"         data-id=\"160\" data-m='{\"i\":160,\"p\":158,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdzdX\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"�J�L�촵�¯S�۾ɦۺt�A�`�O�t�X�x�T���Y���L�A�A�׬��m��R�B���n�a�ӽm�F���ɮ�P���M�C�]�دǴ��ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdIK0.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=517&amp;y=173&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�J�L�촵�¯S�۾ɦۺt�A�`�O�t�X�x�T���Y���L�A�A�׬��m��R�B���n�a�ӽm�F���ɮ�P���M�C�]�دǴ��ѡ^ - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�v���j�m��R�B���n �B�r�@�������ּ֬�-�峹\">�i�v���j�m��R�B���n �B�r�@�������ּ֬�</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
"            <h3>�����o����&#128170;</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e3%80%8a%e5%bb%b6%e7%a6%a7%e6%94%bb%e7%95%a5%e3%80%8b%e5%a8%98%e5%a8%98%e5%80%91%e3%80%8c%e4%b8%80%e5%ad%97%e9%8e%96%e9%aa%a8%e3%80%8d%e8%b6%85%e9%a1%af%e7%98%a6%ef%bc%81%e7%88%be%e6%99%b4%e8%a6%aa%e8%87%aa%e7%a4%ba%e7%af%84%e9%8e%96%e9%aa%a8%e6%93%8d%ef%bc%8c%e5%8a%a0%e7%a2%bc4%e6%8b%9b%e8%ae%93%e9%8e%96%e9%aa%a8%e7%8f%be%e5%bd%a2/ar-BBSaMXp?li=BBqiNIb\"\n" +
"         data-id=\"162\" data-m='{\"i\":162,\"p\":161,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSaMXp\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"�m���H�𲤡n�Q�Q�̡u�@�r�갩�v�W��G�I�����˦ۥܽd�갩�ޡA�[�X4�����갩�{��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfZIg.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=282&amp;y=194&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�m���H�𲤡n�Q�Q�̡u�@�r�갩�v�W��G�I�����˦ۥܽd�갩�ޡA�[�X4�����갩�{�� - Beauty321\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�m���H�𲤡n�Q�Q�̡u�@�r�갩�v�W��G�I�����˦ۥܽd�갩��-�峹\">�m���H�𲤡n�Q�Q�̡u�@�r�갩�v�W��G�I�����˦ۥܽd�갩��</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />beauty321        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/lifestyle/lifestylefashionbeauty/krystal%e7%b2%89%e7%b5%b2%e6%8a%93%e6%8b%8d%e7%85%a7%e8%a2%ab%e7%98%8b%e5%82%b35%e8%90%ac%e6%ac%a1%e5%88%86%e4%ba%ab%ef%bc%81%e3%80%8c%e6%b0%b4%e7%85%ae%e8%9b%8b%e6%b8%9b%e8%82%a5%e9%a3%9f%e8%ad%9c%e3%80%8d%e5%85%a9%e9%80%b1%e5%9c%93%e8%87%89%e7%98%a6%e5%9b%9e%e5%ae%8c%e7%be%8e%e5%81%b4%e9%a1%8f/ar-BBS6eaJ?li=BBqiNIb\"\n" +
"         data-id=\"163\" data-m='{\"i\":163,\"p\":161,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS6eaJ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"Krystal�������ӳQ�ƶ�5�U�����ɡI�u���N�J��έ��Сv��g���y�G�^�������C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm97a.img?h=466&amp;w=435&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=211&amp;y=123&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Krystal�������ӳQ�ƶ�5�U�����ɡI�u���N�J��έ��Сv��g���y�G�^�������C - Beauty321\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�u���N�J��έ��Сv��g���y��krystal�������C-�峹\">�u���N�J��έ��Сv��g���y��Krystal�������C</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />beauty321        </span>\n" +
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
"		    <h3>�����𲤤@��n&#128523;</h3>\n" +
"\n" +
"            <a   href=\"/zh-tw/lifestyle/food/%e5%bd%b0%e5%8c%96%e8%b6%85%e4%ba%ba%e6%b0%a3%e8%82%89%e5%9c%93-%e5%a4%96%e5%b8%b6%e7%9c%9f%e7%9a%84%e8%a6%81%e8%a8%98%e5%be%97%e8%ab%8b%e8%80%81%e9%97%86%e5%8a%a0%e8%be%a3%e6%89%8d%e5%a4%a0%e5%91%b3/ar-BBSd7jU?li=BBqiNIb\"\n" +
"         data-id=\"165\" data-m='{\"i\":165,\"p\":164,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd7jU\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefood\",\"o\":1}'   >\n" +
"        \n" +
"<img alt=\"���Ʀ׶�t������A�T��O�H�������C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdcc4.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=586&amp;y=818&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�u�p�׶�v�]�ۦ׶��B�n�J�B��ۣ�C�]40�������^ - �� Mirror Media Inc ����\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"���ƶW�H��׶� �~�a�O�o�[���~����-�峹\">���ƶW�H��׶� �~�a�O�o�[���~����</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"\n" +
"\n" +
"    <a   href=\"/zh-tw/lifestyle/food/%e5%b9%b4%e8%8f%9c%e6%90%ad%e9%85%92%e9%87%8d%e9%bb%9e%e7%ad%86%e8%a8%98-%e9%9b%9e%e6%b9%af%e7%81%ab%e9%8d%8b%e8%a6%81%e9%85%8d%e8%82%a5%e8%85%b4%e6%9c%89%e9%87%8d%e9%87%8f%e7%9a%84%e7%99%bd%e9%85%92/ar-BBSdIcf?li=BBqiNIb\"\n" +
"         data-id=\"166\" data-m='{\"i\":166,\"p\":164,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdIcf\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefood\",\"o\":2}'   >\n" +
"        \n" +
"<img alt=\"�����˪���������f�t�εͦ����q���հs�A�o�˪��~��f�s�w���L���C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSdDre.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=400&amp;y=228&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����˪���������f�t�εͦ����q���հs�A�o�˪��~��f�s�w���L���C - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�~��f�s���I���O ��������n�t�հs-�峹\">�~��f�s���I���O ��������n�t�հs</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
"    </div>\n" +
"\n" +
"        \n" +
"    </a>\n" +
"    <a   href=\"/zh-tw/lifestyle/food/%e7%b1%b3%e5%85%b6%e6%9e%972%e6%98%9f%e5%b9%b4%e5%a4%9c%e9%a3%af-%e7%83%8f%e9%ad%9a%e5%ad%90%e5%8a%a0%e3%80%8c%e9%87%91%e7%b2%89%e3%80%8d%e5%a4%a7%e6%b0%a3%e5%8f%88%e9%96%8b%e8%83%83/ar-BBSd5QB?li=BBqiNIb\"\n" +
"         data-id=\"167\" data-m='{\"i\":167,\"p\":164,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd5QB\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefood\",\"o\":3}'   >\n" +
"        \n" +
"<img alt=\"�u�J�}�Q���l�v�L�~�ɯšA���W�����P��}���N�A�Э��߳n�A�p�n�}�C�]1,900���_�����A��3�ѫe�w�q�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBScWwS.img?h=350&amp;w=288&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=390&amp;y=231&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�u�J�}�Q���l�v�L�~�ɯšA���W�����P��}���N�A�Э��߳n�A�p�n�}�C�]1,900���_�����A��3�ѫe�w�q�^ - Mirror Media\" />\n" +
"    <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�̨�L2�P�~�]�� �Q���l�[�u�����v-�峹\">�̨�L2�P�~�]�� �Q���l�[�u�����v</span>\n" +
"\n" +
"\n" +
"        <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z        </span>\n" +
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
" <button class=\"leftarrow fade\" title=\"�W�@�i��v��\"  data-id=\"168\" data-m='{\"i\":168,\"p\":97,\"n\":\"previousSlideArrow\",\"o\":21}'>�W�@�i��v��</button>\n" +
" <button class=\"rightarrow fade\" title=\"�U�@�i��v��\"  data-id=\"169\" data-m='{\"i\":169,\"p\":97,\"n\":\"nextSlideArrow\",\"o\":22}'>�U�@�i��v��</button>\n" +
"\n" +
" \n" +
"</div>\n" +
"\n" +
"</li>\n" +
"\n" +
"    <li  class=\"pos1 replacead23 smalla smalla-twoimages \"  data-id=\"170\" data-m='{\"i\":170,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgiJO\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  data-aop=\"river>1\">\n" +
"        <a href=\"/zh-tw/entertainment/news/%e5%a5%b3%e5%85%92%e5%87%ba%e7%94%9f%e8%a2%ab%e8%a8%ba%e6%96%b7%e5%a4%b1%e8%81%b0-%e5%b0%8f%e7%a6%8e%e6%84%a7%e7%96%9a%e3%80%8c%e6%98%af%e6%88%91%e5%93%aa%e8%a3%a1%e6%b2%92%e5%81%9a%e5%a5%bd%ef%bc%9f%e3%80%8d/ar-BBSgiJO?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"�p�դ��ѥX�u���w�ऽ�q�O�̷|�A�ݨ���w�઺�����v���A�Ԥ���C�|���\�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgyau.img?h=350&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=373&amp;y=219&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�p�դ��ѥX�u���w�ऽ�q�O�̷|�A�ݨ���w�઺�����v���A�Ԥ���C�|���\�C - Mirror Media\" /><img alt=\"�p�դ��ѥX�u���w�ऽ�q�O�̷|�A�ݨ���w�઺�����v���A�Ԥ���C�|���\�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSgyau.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=373&amp;y=219&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�p�դ��ѥX�u���w�ऽ�q�O�̷|�A�ݨ���w�઺�����v���A�Ԥ���C�|���\�C - Mirror Media\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�k��X�ͳQ�E�_���o �p�շ\���u�O�ڭ��̨S���n�H�v-�峹\">�k��X�ͳQ�E�_���o �p�շ\���u�O�ڭ��̨S���n�H�v</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />��g�Z            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos2 smalla \"  data-id=\"171\" data-m='{\"i\":171,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSg05E\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"livingsocial\",\"o\":3}'  data-aop=\"river>2\">\n" +
"        <a href=\"/zh-tw/lifestyle/livingsocial/%e8%b6%85%e7%9e%8e%e5%88%86%e6%89%8b%e7%90%86%e7%94%b1%ef%bc%81%e7%94%b7%e3%80%8c%e4%b8%8d%e8%b2%a0%e8%b2%ac%e4%bb%bb%e3%80%8d%e6%88%90%e5%89%8d%e4%bb%bb/ar-BBSg05E?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSg1WI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=267&amp;y=122&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�W�M����z�ѡI�k�u���t�d���v���e�� - �� Sanlih E-television Co., LTD ����\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�W�M�z�ѡI�k�]�u�o��ơv�Q����-�峹\">�W�M�z�ѡI�k�]�u�o��ơv�Q����</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos3 smalla \"  data-id=\"172\" data-m='{\"i\":172,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSh9WI\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":4}'  data-aop=\"river>3\">\n" +
"        <a href=\"/zh-tw/entertainment/news/%e6%97%a5%e7%b6%b2%e8%a9%95%e9%81%b8%e5%8f%b0%e6%9c%80%e7%be%8e%e5%a5%b3%e6%98%9f-%e4%b8%8d%e6%98%af%e6%9e%97%e5%bf%97%e7%8e%b2%e3%80%81%e9%83%ad%e9%9b%aa%e8%8a%99%e6%98%af%e3%80%8c%e5%a5%b9%e3%80%8d%e5%a5%aa%e5%86%a0%ef%bc%81/ar-BBSh9WI?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"FotoJet\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSiB4d.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1328&amp;y=1468&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�Ӭ� - Getty\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�������x�̬��k�P �L�Ӭ¡B�}�Yޱ���X���I-�峹\">�������x�̬��k�P �L�Ӭ¡B�}�Yޱ���X���I</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />NOWnews            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos4 smalla \"  data-id=\"173\" data-m='{\"i\":173,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSfFcx\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"livingsocial\",\"o\":5}'  data-aop=\"river>4\">\n" +
"        <a href=\"/zh-tw/lifestyle/livingsocial/%e9%ab%98%e8%81%b7%e5%a6%b9%e9%85%b8%e7%84%a1%e8%85%a6%e5%8f%88%e9%ab%92-%e6%8a%80%e5%b8%abpo%e6%96%87%e5%98%86%e3%80%8c%e5%a5%b9%e6%b2%92%e8%aa%aa%e9%8c%af%e3%80%8d%e6%83%b9%e5%93%ad%e7%b6%b2%e5%8f%8b/ar-BBSfFcx?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"��¾�f�ĵL���Sż�@�ޮvPO��ġu�o�S����...�v�S������\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfJPQ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=522&amp;y=268&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��¾�f�ĵL���Sż �ޮvPO��ġu�o�S����...�v�S������ - �� NOWnews Network Co.,Ltd ����\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"��¾�f�ĵL���Sż �ޮvpo��ġu�o�S����...�v�S������-�峹\">��¾�f�ĵL���Sż �ޮvPO��ġu�o�S����...�v�S������</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />NOWnews            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\" mediuma \"  data-id=\"174\" data-m='{\"i\":174,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpRH\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":6,\"a\":\"mediuma Unknown\"}'  data-aop=\"river>5\">\n" +
"        <a href=\"/zh-tw/entertainment/news/%e7%8b%82%e6%af%86%e5%a5%b3%e5%8f%8b%e5%ae%b3%e6%b5%81%e7%94%a2%ef%bc%81%e7%94%b7%e6%98%9f%e5%82%b3%e8%bd%89%e7%95%b6%e7%89%9b%e9%83%8e%e6%b1%82%e7%94%9f/ar-BBSrpRH?li=BBRN0RL\" >\n" +
"<img alt=\"�ͤ����G\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3kPi.img?h=350&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=248&amp;y=163&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ͤ����G - �� Sanlih E-television Co., LTD ����\" /><img alt=\"�ͤ����G\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3kPi.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=248&amp;y=163&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ͤ����G - �� Sanlih E-television Co., LTD ����\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�g�ޤk�ͮ`�y���I�k�P���������D��-�峹\">�g�ޤk�ͮ`�y���I�k�P���������D��</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos6 smalla \"  data-id=\"175\" data-m='{\"i\":175,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdcCV\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":7}'  data-aop=\"river>6\">\n" +
"        <a href=\"/zh-tw/news/national/%e5%85%a5%e5%a2%83%e6%b8%af%e6%be%b3%e5%b8%b6%e3%80%8c%e9%80%99%e5%80%8b%e3%80%8d-%e6%81%90%e7%bd%b040%e8%90%ac%ef%bc%81/ar-BBSdcCV?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS2Z6G.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=204&amp;y=134&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ũj�n������]�N 3�۳гy�j�Ŷ� - �� Sanlih E-television Co., LTD ����\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�J�Ҵ�D�a�u�o�ӡv ���@40�U�I-�峹\">�J�Ҵ�D�a�u�o�ӡv ���@40�U�I</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�T�߷s�D��            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos7 smalla \"  data-id=\"176\" data-m='{\"i\":176,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSg7rU\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":8}'  data-aop=\"river>7\">\n" +
"        <a href=\"/zh-tw/news/world/%e5%a5%bd%e5%b8%82%e5%a4%9a%e4%b8%80%e4%b8%8a%e5%b8%82%e5%b0%b1%e8%b3%a3%e5%88%b0%e7%bc%ba%e8%b2%a8-%e7%ab%9f%e6%98%af%e5%8f%af%e4%bf%9d%e5%ad%9820%e5%b9%b4%e7%9a%84%e9%80%99%e9%a3%9f%e7%89%a9/ar-BBSg7rU?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"File photo of a Costco store in Teterboro, N.J. on Aug. 5, 2018.\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAAwF1q.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1380&amp;y=1075&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"File photo of a Costco store in Teterboro, N.J. on Aug. 5, 2018. - Michael Brochstein/SOPA Images/LightRocket/Getty Images\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�n���h���ʳf�I�o�����i�O�s20�~-�峹\">�n���h���ʳf�I�o�����i�O�s20�~</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />���ɹq�l��            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos8 smalla \"  data-id=\"177\" data-m='{\"i\":177,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdyTc\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":9}'  data-aop=\"river>8\">\n" +
"        <a href=\"/zh-tw/money/topstories/40percent-%e5%93%a1%e5%b7%a5%e5%87%ba%e8%b5%b0%ef%bc%8c%e9%83%bd%e6%98%af%e5%a3%9e%e4%b8%bb%e7%ae%a1%e5%ae%b3%e7%9a%84%ef%bc%81%e6%b2%92%e5%81%9a%e5%88%b0-5-%e4%bb%b6%e4%ba%8b%ef%bc%8c%e5%b0%8f%e5%bf%83%e5%88%a5%e8%b5%b0%e9%80%bc%e8%b5%b0%e9%83%a8%e5%b1%ac/ar-BBSdyTc?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBgNdfI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=2020&amp;y=707&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���W�����q�D�� ��O�������C - Bloomberg\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"40%���u�X�� ���O�a�D�ޮ`���I-�峹\">40%���u�X�� ���O�a�D�ޮ`���I</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"�g�z�H��Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />�g�z�H��Z            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos9 smalla smalla-twoimages media photo\"  data-id=\"178\" data-m='{\"i\":178,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS8teW\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":10}'  data-aop=\"river>9\">\n" +
"        <a href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e5%a5%b3%e7%a5%9e%e3%80%81%e5%a5%b3%e8%8b%b1%e9%9b%84%e6%8e%9b%e5%b8%a5-%e6%9c%89%e5%a5%b9%e5%80%91%e5%b0%b1%e6%98%af%e7%a5%a8%e6%88%bf%e4%bf%9d%e8%ad%89%ef%bc%81/ss-BBS8teW?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8k6Y.img?h=350&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=353&amp;y=139&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�u�¹���v�����R�E������ - picture alliance/dpa/Jay Maidment/Marvel\" /><img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8k6Y.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=353&amp;y=139&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�u�¹���v�����R�E������ - picture alliance/dpa/Jay Maidment/Marvel\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj�k���B�k�^������ ���o�̴N�O���ЫO�ҡI-�Ϥ���\">�i�ϡj�k���B�k�^������ ���o�̴N�O���ЫO�ҡI</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"dw.com �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBMQmHU.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />dw.com            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos10 smalla media photo\"  data-id=\"179\" data-m='{\"i\":179,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSgn7v\",\"h\":0,\"v\":\"weather\",\"c\":\"photos\",\"o\":11}'  data-aop=\"river>10\">\n" +
"        <a href=\"/zh-tw/weather/photos/%e3%80%90%e5%9c%96%e3%80%91%e4%be%86%e5%8e%bb%e8%b3%9e%e9%9b%aa%e5%9b%89%ef%bc%81%e5%9c%a8%e5%ae%b6%e4%b9%9f%e8%83%bd%e7%9c%8b%e9%81%8d%e4%b8%96%e7%95%8c%e5%90%84%e5%9c%b0%e9%9b%aa%e5%ad%a3%e5%8d%b3%e6%99%af/ss-BBSgn7v?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"BOWLING GREEN, NEW YORK, UNITED STATES - 2018/11/15: Fearless Girl statue covere...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRtUVT.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"New York City, New York, U.S. - Erik McGregor/Pacific Press/LightRocket via Getty Images\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj�ӥh�೷�o�I�b�a�]��ݹM�@�ɦU�a���u�Y��-�Ϥ���\">�i�ϡj�ӥh�೷�o�I�b�a�]��ݹM�@�ɦU�a���u�Y��</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos11 smalla media photo\"  data-id=\"180\" data-m='{\"i\":180,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSdmJU\",\"h\":0,\"v\":\"sports\",\"c\":\"sportsphotos\",\"o\":12}'  data-aop=\"river>11\">\n" +
"        <a href=\"/zh-tw/sports/sportsphotos/%e3%80%90%e5%9c%96%e3%80%91%e6%88%b0%e8%a2%8d%e4%b8%8b%e7%9a%84%e5%8f%a6%e4%b8%80%e9%9d%a2%ef%bc%81%e4%bd%a0%e6%b2%92%e7%9c%8b%e9%81%8e%e7%9a%84%e7%b6%b2%e7%90%83%e5%90%8d%e5%b0%87/ss-BBSdmJU?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"At the WTA Pre-Wimbledon Party at The Roof Gardens, Kensington High Street, Lond...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBzT6PO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=835&amp;y=295&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Maria Sharapova, 2017 - Gregg DeGuire/Getty Images\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj�ԳT�U���t�@���I�A�S�ݹL�u��o�ˡv�����y�W�N-�Ϥ���\">�i�ϡj�ԳT�U���t�@���I�A�S�ݹL�u��o�ˡv�����y�W�N</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos            </span>\n" +
"    </div>\n" +
"\n" +
"        </a>\n" +
"    </li>\n" +
"    <li  class=\"pos12 smalla media photo\"  data-id=\"181\" data-m='{\"i\":181,\"p\":96,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSd2Pk\",\"h\":0,\"v\":\"entertainment\",\"c\":\"entertainment-gallery\",\"o\":13}'  data-aop=\"river>12\">\n" +
"        <a href=\"/zh-tw/entertainment/gallery/%e3%80%90%e5%9c%96%e3%80%91%e5%af%8c%e5%af%9f%e7%9a%87%e5%90%8e%e8%b7%9f%e5%ab%bb%e5%a6%83%e9%83%bd%e6%b2%92%e4%bb%bd%ef%bc%81%e8%81%b6%e9%81%a0%e5%b8%b6%e6%ad%a3%e5%ae%ae%e6%94%be%e9%96%83/ss-BBSd2Pk?li=BBRN0RL\"\n" +
">\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBScTtC.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=jpg&amp;x=1280&amp;y=722&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�Ӭ� - Getty\" />\n" +
"                <div class=\"caption\">\n" +
"        <span class=\"title\"   aria-label=\"�i�ϡj���k�P���A �L�Ӭ»�½�L�դ��]-�Ϥ���\">�i�ϡj���k�P���A �L�Ӭ»�½�L�դ��]</span>\n" +
"\n" +
"            <span class=\"sourcename\">\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />Photos            </span>\n" +
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
"          aria-label=\"�J�I\"\n" +
"          data-section-id=\"stripe.photos\"\n" +
"          data-section-id=\"stripe.photos\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.photos_stripe\"  data-id=\"184\" data-m='{\"i\":184,\"p\":19,\"n\":\"stripe.photos\",\"t\":\"stripe\",\"o\":7}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"185\" data-m='{\"i\":185,\"p\":184,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.photos.navigation_stripenavigation\"  data-id=\"186\" data-m='{\"i\":186,\"p\":184,\"n\":\"stripe.photos.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"187\" data-m='{\"i\":187,\"p\":186,\"n\":\"�J�I\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"https://www.msn.com/zh-tw/news\"  data-id=\"188\" data-m='{\"i\":188,\"p\":186,\"n\":\"�J�I\",\"y\":4,\"o\":2}'>�J�I</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"189\" data-m='{\"i\":189,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"?�ڦV2019�I�h�~�j�ƧA�ٰO�o�H?\",\"o\":3}'><a href=\"https://www.msn.com/zh-tw/news/yearinreview2018\">?�ڦV2019�I�h�~�j�ƧA�ٰO�o�H?</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"190\" data-m='{\"i\":190,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"�u�Q�~�D�ԡv���q�@�k�P�ظ@���m����\",\"o\":4}'><a href=\"/zh-tw/news/trendingnews\">�u�Q�~�D�ԡv���q�@�k�P�ظ@���m����</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"191\" data-m='{\"i\":191,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"??�Ѯ�w��\",\"o\":5}'><a href=\"https://www.msn.com/zh-tw/weather\">??�Ѯ�w��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"192\" data-m='{\"i\":192,\"p\":186,\"n\":\"listlink\",\"y\":4,\"l\":\"? �ײv����\",\"o\":6}'><a href=\"/zh-tw/money/currencyconverter\">&#128181; �ײv����</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"193\" data-m='{\"i\":193,\"p\":186,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":7}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"194\" data-m='{\"i\":194,\"p\":186,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":8}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"195\" data-m='{\"i\":195,\"p\":186,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":9}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"196\" data-m='{\"i\":196,\"p\":186,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":10}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"197\" data-m='{\"i\":197,\"p\":186,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":11}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"�x�_�����_����]�k1�^���Ѧb�����������꾧�ǹ���N��C�]�x�_���F�����ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpujs.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=431&amp;y=130&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�x�_�����_����]�k1�^���Ѧb�����������꾧�ǹ���N��C�]�x�_���F�����ѡ^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�_���Ϲ���� �_����G�������o��-�峹\">�_���Ϲ���� �_����G�������o��</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"��M�w,�_���,���߭ۡ@�X���ϡ���Ʒ�\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRcXjy.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=347&amp;y=96&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��M�w,�_���,���߭ۡ@�X���ϡ���Ʒ� - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�o2�H�Y�X��2020�K�_p�����ѿ�-�峹\">�o2�H�Y�X��2020�K�_P�����ѿ�</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"  aria-label=\"�J�I\" >\n" +
" \n" +
" <h2><a href=\"https://www.msn.com/zh-tw/news\" >�J�I</a></h2>\n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"206\" data-m='{\"i\":206,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr6GK\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e8%be%9c%e5%af%ac%e6%95%8f%e7%b1%b2%e8%94%a1-%e8%ab%8b%e8%b3%b4%e5%87%ba%e4%be%86%e9%81%b8%e7%b8%bd%e7%b5%b1/ar-BBSr6GK?li=BBqj0iS\"   aria-label=\"�d�e���~�� �п�X�ӿ��`��-�峹\">\n" +
"\n" +
"                    <h3>�d�e���~�� �п�X�ӿ��`��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"207\" data-m='{\"i\":207,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrfPh\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%8d%81%e5%b9%b4%e5%a6%82%e4%b8%80%e6%97%a5-%e6%9f%afp%e5%85%a9%e5%b2%b8%e7%ab%8b%e5%a0%b4%e4%b8%95%e8%ae%8a%e8%a2%ab%e9%85%b8%e7%88%86/ar-BBSrfPh?li=BBqj0iS\"   aria-label=\"�Q�~�p�@�� �_p�⩤�߳��A�ܳQ���z-�峹\">\n" +
"\n" +
"                    <h3>�Q�~�p�@�� �_P�⩤�߳��A�ܳQ���z</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"208\" data-m='{\"i\":208,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq7kj\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e8%b7%af%e4%b8%8d%e5%b9%b3%e7%ab%9f%e6%80%aa%e9%9f%93%e5%9c%8b%e7%91%9c-%e6%b8%b8%e6%b7%91%e6%85%a7%e6%8f%ad%e6%b0%91%e9%80%b2%e9%bb%a8%e5%bf%83%e4%b8%ad%e5%8f%aa%e4%b8%80%e5%80%8b%e5%ad%97/ar-BBSq7kj?li=BBqj0iS\"   aria-label=\"��������������� ��Q�z�����i�Ҥߤ��u�@�Ӧr-�峹\">\n" +
"\n" +
"                    <h3>��������������� ��Q�z�����i�Ҥߤ��u�@�Ӧr</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"209\" data-m='{\"i\":209,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr6Gm\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e6%87%bc%e6%80%95%e9%80%86%e5%ad%90-%e6%af%8d%e6%b1%82%e6%b3%95%e5%ae%98%e7%82%ba%e6%b0%91%e9%99%a4%e5%ae%b3%e5%88%a4%e6%ad%bb/ar-BBSr6Gm?li=BBqj0iS\"   aria-label=\"�ߩȰf�l ���D�k�x�������`�P��-�峹\">\n" +
"\n" +
"                    <h3>�ߩȰf�l ���D�k�x�������`�P��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"210\" data-m='{\"i\":210,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpGs\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e5%b8%b6%e7%81%ab%e8%85%bf%e5%85%a5%e5%a2%83%e8%a2%ab%e9%80%ae-%e5%8f%b0%e7%94%b7%e6%80%92%e9%a8%99%e9%8c%a2%e7%9a%84%e6%94%bf%e5%ba%9c/ar-BBSrpGs?li=BBqj0iS\"   aria-label=\"�a���L�J�ҳQ�e �x�k��G�F�����F��-�峹\">\n" +
"\n" +
"                    <h3>�a���L�J�ҳQ�e �x�k��G�F�����F��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"211\" data-m='{\"i\":211,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr6Gc\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e4%b8%8d%e7%9f%a5%e8%83%bd%e4%b8%8d%e8%83%bd%e7%9c%8b%e5%88%b0%e6%98%8e%e5%a4%a9%e7%9a%84%e5%a4%aa%e9%99%bd%ef%bc%81%e6%ad%bb%e5%88%91%e5%ae%9a%e8%ae%9e%e4%b8%8d%e6%a7%8d%e6%b1%ba-%e8%a6%81%e5%91%bd%e7%9a%84%e7%85%8e%e7%86%ac/ar-BBSr6Gc?li=BBqj0iS\"   aria-label=\"�����ण��ݨ���Ѫ��Ӷ��I���D�w�����j�M �n�R���μ�-�峹\">\n" +
"\n" +
"                    <h3>�����ण��ݨ���Ѫ��Ӷ��I���D�w�����j�M �n�R���μ�</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"212\" data-m='{\"i\":212,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrtHE\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e8%b6%85%e7%8b%82%ef%bc%81%e8%80%81%e5%a4%96%e6%8c%87%e4%ba%94%e6%98%9f%e6%97%97%e9%ab%98%e5%96%8a%e3%80%8c%e6%88%91%e6%84%9b%e5%8f%b0%e7%81%a3%e3%80%8d/ar-BBSrtHE?li=BBqj0iS\"   aria-label=\"�W�g�I�ѥ~�����P�X���ۡu�ڷR�x�W�v-�峹\">\n" +
"\n" +
"                    <h3>�W�g�I�ѥ~�����P�X���ۡu�ڷR�x�W�v</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"213\" data-m='{\"i\":213,\"p\":204,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrpb6\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":9}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e4%ba%8c%e6%ac%a1%e3%80%8c%e5%b7%9d%e9%87%91%e6%9c%83%e3%80%8d%e8%ac%9b%e5%ae%9a%e4%ba%86%ef%bc%81%e5%b7%9d%e6%99%ae%e8%88%87%e9%87%91%e6%ad%a3%e6%81%a92%e6%9c%88%e5%ba%95%e5%86%8d%e5%ba%a6%e6%9c%83%e9%9d%a2-%e5%9c%b0%e9%bb%9e%ef%bc%9f%e8%b6%8a%e5%8d%97%e3%80%81%e6%b3%b0%e5%9c%8b%e3%80%81%e5%a4%8f%e5%a8%81%e5%a4%b7%e9%83%bd%e6%9c%89%e5%8f%af%e8%83%bd/ar-BBSrpb6?li=BBqj0iS\"   aria-label=\"�G���u�t���|�v���w�F�I�t���P������2�멳�A�׷|�� �a�I�H�V�n�B����B�L�¦i�����i��-�峹\">\n" +
"\n" +
"                    <h3>�G���u�t���|�v���w�F�I�t���P������2�멳�A�׷|�� �a�I�H�V�n�B����B�L�¦i�����i��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<img alt=\"�ʺ��ܷN��_pixabay\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSq6R6.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ʺ��ܷN��_pixabay - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�[�{�V�������ǩ_ �ǤH���_����-�峹\">�[�{�V�������ǩ_ �ǤH���_����</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"217\" data-m='{\"i\":217,\"p\":184,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�T��\"\n" +
"          data-positions=\".entertainment .stripecontent .tertiary li:nth-child(3)\" data-section-id=\"stripe.entertainment\"\n" +
"          data-section-id=\"stripe.entertainment\">\n" +
"        <div class=\"entertainment stripeouter\"  data-aop=\"stripe.entertainment_stripe\"  data-id=\"218\" data-m='{\"i\":218,\"p\":19,\"n\":\"stripe.entertainment\",\"t\":\"stripe\",\"o\":8}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"219\" data-m='{\"i\":219,\"p\":218,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.entertainment.navigation_stripenavigation\"  data-id=\"220\" data-m='{\"i\":220,\"p\":218,\"n\":\"stripe.entertainment.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"221\" data-m='{\"i\":221,\"p\":220,\"n\":\"entertainment\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/entertainment\"  data-id=\"222\" data-m='{\"i\":222,\"p\":220,\"n\":\"entertainment\",\"y\":4,\"o\":2}'>�T��</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"223\" data-m='{\"i\":223,\"p\":220,\"n\":\"tv\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/entertainment/tv\">&#128293;�l�@���I</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"224\" data-m='{\"i\":224,\"p\":220,\"n\":\"news\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/entertainment/news\">�s�D�`��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"225\" data-m='{\"i\":225,\"p\":220,\"n\":\"entertainment-gallery\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/entertainment/gallery\">�Ͽ��`��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"226\" data-m='{\"i\":226,\"p\":220,\"n\":\"movies\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/entertainment/movies\">�q�v</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"227\" data-m='{\"i\":227,\"p\":220,\"n\":\"video\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/entertainment/video\">���D�v��</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"228\" data-m='{\"i\":228,\"p\":220,\"n\":\"music\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/entertainment/music\">���ַs�D</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"229\" data-m='{\"i\":229,\"p\":220,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":9}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"230\" data-m='{\"i\":230,\"p\":220,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":10}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"231\" data-m='{\"i\":231,\"p\":220,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":11}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"232\" data-m='{\"i\":232,\"p\":220,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":12}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"233\" data-m='{\"i\":233,\"p\":220,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":13}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpo3R.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=240&amp;y=93&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����3600��§�H�@�i�ϡu���]�v - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���3�d6�Q���֡I�o�n�T�ҼƦr�O�]-�峹\">���3�d6�Q���֡I�o�n�T�ҼƦr�O�]</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"     <a href=\"/zh-tw/entertainment/news/%e5%89%8d%e7%94%b7%e5%8f%8b%e6%81%90%e5%9a%87%e5%ae%98%e5%8f%b8%e8%90%bd%e5%b9%95-%e6%a5%8a%e9%ba%97%e8%8f%81%e5%93%bd%e5%92%bd%e7%b5%82%e6%96%bc%e9%82%84%e6%88%91%e5%85%ac%e9%81%93/ar-BBSpKTq?li=BBqiNIf\"   aria-label=\"�e�k�ͮ��~�x�q���� ���R�׮C�|�G�ש��٧ڤ��D-�峹\">\n" +
"\n" +
"                    <h3>�e�k�ͮ��~�x�q���� ���R�׮C�|�G�ש��٧ڤ��D</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"239\" data-m='{\"i\":239,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqd4Y\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%b0%8f%e4%b8%89%e6%80%92%e6%8f%ad%e3%80%8a%e8%bb%8d%e5%b8%ab%e8%81%af%e7%9b%9f%e3%80%8b%e5%90%b3%e7%a7%80%e6%b3%a2%e5%a4%9ap%e4%b8%8d%e5%80%ab-%e7%b5%90%e6%9e%9c%e7%ab%9f%e7%84%b6%e8%a2%ab%e6%8d%95%e4%ba%86/ar-BBSqd4Y?li=BBqiNIf\"   aria-label=\"�p�T�㴦�m�x�v�p���n�d�q�i�hp���� ���G���M�Q���F-�峹\">\n" +
"\n" +
"                    <h3>�p�T�㴦�m�x�v�p���n�d�q�i�hP���� ���G���M�Q���F</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"240\" data-m='{\"i\":240,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrdtR\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%85%a8%e6%b0%91%e7%98%8b%e3%80%8c10%e5%b9%b4%e6%8c%91%e6%88%b0%e3%80%8d%e7%b6%b2%e8%ae%9a%e5%b0%b1%e4%bb%96%e6%b2%92%e8%ae%8a/ar-BBSrdtR?li=BBqiNIf\"   aria-label=\"�����ơu10�~�D�ԡv���g�G�N�L�S��-�峹\">\n" +
"\n" +
"                    <h3>�����ơu10�~�D�ԡv���g�G�N�L�S��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"241\" data-m='{\"i\":241,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpcBL\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e6%be%8e%e6%81%b0%e6%81%b0%e5%8c%853600%e8%a2%ab%e9%80%80%e7%b4%85%e5%8c%85-%e6%9d%8e%e4%ba%9e%e8%90%8d%e8%aa%8d%e9%8c%af%e8%87%aa%e6%89%b9%e3%80%8c%e5%a4%a7%e5%98%b4%e5%b7%b4%e3%80%8d/ar-BBSpcBL?li=BBqiNIf\"   aria-label=\"����]3600�Q�h���] ���ȵӻ{���ۧ�u�j�L�ڡv-�峹\">\n" +
"\n" +
"                    <h3>����]3600�Q�h���] ���ȵӻ{���ۧ�u�j�L�ڡv</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"242\" data-m='{\"i\":242,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpxw5\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e7%89%bd%e6%89%8b%e9%83%ad%e7%a2%a7%e5%a9%b7%e9%80%9b%e5%b1%95-%e5%90%91%e8%8f%af%e5%bc%b7%e4%b9%8b%e5%ad%90%e5%90%91%e4%bd%90%e9%bb%98%e8%aa%8d%e6%88%80%e6%83%85/ar-BBSpxw5?li=BBqiNIf\"   aria-label=\"�o�Ⳣ�Ѵ@�}�i �V�رj���l�V���q�{�ʱ�-�峹\">\n" +
"\n" +
"                    <h3>�o�Ⳣ�Ѵ@�}�i �V�رj���l�V���q�{�ʱ�</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"243\" data-m='{\"i\":243,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrlrO\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e8%a2%ab%e9%85%b8%e5%9c%8b%e9%9a%9b%e4%b9%9e%e4%b8%90%ef%bc%81%e9%85%92%e4%ba%95%e6%b3%95%e5%ad%90%e9%9b%99%e6%96%87%e6%b1%82%e5%8e%9f%e8%ab%92%e2%80%a6/ar-BBSrlrO?li=BBqiNIf\"   aria-label=\"�Q�İ�ڤ^���I�s���k�l����D��̡K-�峹\">\n" +
"\n" +
"                    <h3>�Q�İ�ڤ^���I�s���k�l����D��̡K</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"244\" data-m='{\"i\":244,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrrQ4\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e8%80%81%e5%a9%86%e6%87%b7%e4%ba%86%e5%80%8b%e7%94%b7%e5%af%b6%e5%af%b6%ef%bc%81-%e5%89%8d%e5%81%b6%e5%83%8f%e5%9c%98%e9%ab%94%e6%88%90%e5%93%a1%e6%ad%a1%e5%96%9c%e7%a7%80%e5%96%9c%e8%a8%8a/ar-BBSrrQ4?li=BBqiNIf\"   aria-label=\"�ѱC�h�F�Өk�_�_�I �e�������馨���w�ߨq�߰T-�峹\">\n" +
"\n" +
"                    <h3>�ѱC�h�F�Өk�_�_�I �e�������馨���w�ߨq�߰T</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"245\" data-m='{\"i\":245,\"p\":237,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq6o4\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/entertainment/news/%e5%8f%88%e5%82%b3%e6%80%a7%e9%a8%b7%ef%bc%81%e5%a5%b3%e6%98%9f%e8%87%aa%e7%88%86%e8%a2%ab%e7%94%b7%e6%bc%94%e5%93%a1%e5%90%83%e8%b1%86%e8%85%90/ar-BBSq6o4?li=BBqiNIf\"   aria-label=\"�S�ǩ��̡I�k�P���z�Q�k�t���Y���G-�峹\">\n" +
"\n" +
"                    <h3>�S�ǩ��̡I�k�P���z�Q�k�t���Y���G</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<img alt=\"���Եء]���@�^��]���]���G�^���p���A�j���u��ELVA�F�a�I���LELVA�w�H���]�o�A���e�S��ELVA���ԵػӱK���H�A�E�ݷ��Եظ�]���]�S�n����h�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrkL8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=411&amp;y=145&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���Եء]���@�^��]���]���G�^���p���A�j���u��ELVA�F�a�I���LELVA�w�H���]�o�A���e�S��ELVA���ԵػӱK���H�A�E�ݷ��Եظ�]���]�S�n����h�C - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�i�m���Y�jelva�s�»ӱK�j�I ���ԵءB�]����y����-�峹\">�i�m���Y�jELVA�s�»ӱK�j�I ���ԵءB�]����y����</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"249\" data-m='{\"i\":249,\"p\":247,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrtXo\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%a5%b3%e6%98%9f%e9%81%87%e6%81%90%e6%80%96%e6%83%85%e4%ba%ba%e2%80%a6%e6%83%a1%e7%94%b7%e6%8b%bf%e5%88%80%e6%8a%b5%e8%84%96%e5%ad%90%e9%a3%86%e7%bd%b5/ar-BBSrtXo?li=BBqiNIf\"  >\n" +
"<img alt=\"�B�B�X\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrwp9.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=301&amp;y=284&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�B�B�X - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�k�P�J���Ʊ��H�K�c�k���M���l�t�|-�峹\">�k�P�J���Ʊ��H�K�c�k���M���l�t�|</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"250\" data-m='{\"i\":250,\"p\":247,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZAj\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%8c%853600%e8%a2%ab%e6%9d%8e%e4%ba%9e%e8%90%8d%e9%80%80%e7%b4%85%e5%8c%85-%e6%be%8e%e6%81%b0%e6%81%b0%e3%80%8c%e5%ab%8c%e5%b0%91-%e9%82%a3%e5%b0%b1%e5%b0%8d%e4%b8%8d%e8%b5%b7%e3%80%8d%e5%be%8c%e5%88%aa%e6%96%87/ar-BBSoZAj?li=BBqiNIf\"  >\n" +
"<img alt=\"�]3600�Q���ȵӰh���] ����u���� ���N�藍�_�v��R��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp8UV.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=142&amp;y=97&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���� - ���ɹq�l��\" /> <div>\n" +
"<h3   aria-label=\"�]3600�Q���ȵӰh���] ����u���� ���N�藍�_�v��R��-�峹\">�]3600�Q���ȵӰh���] ����u���� ���N�藍�_�v��R��</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
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
"<img alt=\"���ȵӡB���m��B�Υߤ͡B�䶮���m�����~�N�n�B���� �ϡ��ص����ѡB��Ʒ�\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmlVw.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=261&amp;y=161&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ȵӡB���m��B�Υߤ͡B�䶮���m�����~�N�n�B���� �ϡ��ص����ѡB��Ʒ� - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"����R��u5�r�F���v3600����-�峹\">����R��u5�r�F���v3600����</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"254\" data-m='{\"i\":254,\"p\":252,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoORg\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%bc%b5%e6%9f%8f%e8%8a%9d%e7%a7%81%e4%b8%8b%e5%8c%96%e5%a6%9d%e5%8f%aa%e6%9c%894%e6%ad%a5%e9%a9%9f-%e7%9c%8b%e5%ae%8c%e8%ae%93%e4%ba%ba%e5%bf%83%e7%a2%8e%ef%bc%81/ar-BBSoORg?li=BBqiNIf\"  >\n" +
"<img alt=\"�i�f��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqgOJ8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=790&amp;y=920&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�f�� - Getty Images\" /> <div>\n" +
"<h3   aria-label=\"�i�f�ۨp�U�Ƨ��u��4�B�J �ݧ����H�߸H�I-�峹\">�i�f�ۨp�U�Ƨ��u��4�B�J �ݧ����H�߸H�I</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"255\" data-m='{\"i\":255,\"p\":252,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp8Lj\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e3%80%8c%e9%be%8d%e4%ba%94%e3%80%8d%e4%b9%8b%e5%ad%90%e8%aa%8d%e6%88%80%e9%83%ad%e7%a2%a7%e5%a9%b7%e8%ac%9d%e5%a4%a7%e5%ae%b6%e7%a5%9d%e7%a6%8f/ar-BBSp8Lj?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpbk3.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=251&amp;y=172&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�u�s���v���l�{�ʳ��Ѵ@�G�¤j�a���� - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�u�s���v���l�{�ʳ��Ѵ@�G�¤j�a����-�峹\">�u�s���v���l�{�ʳ��Ѵ@�G�¤j�a����</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1vl.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=298&amp;y=175&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���q��̷s�x�����n�� ���ͯ��Q�G��o��O�u�R - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"���q��̷s�x�����n�� ���ͯ��Q�G��o��O�u�R-�峹\">���q��̷s�x�����n�� ���ͯ��Q�G��o��O�u�R</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"258\" data-m='{\"i\":258,\"p\":256,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoVvp\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e9%80%a310%e6%ac%a1%e9%81%93%e6%ad%89%ef%bc%81%e7%94%b7%e6%98%9f%e8%aa%8d%e6%af%80%e7%b4%84%e2%80%a6%e7%b5%90%e5%b1%80%e9%80%86%e8%bd%89/ar-BBSoVvp?li=BBqiNIf\"  >\n" +
"<img alt=\"���ź��C�]�ϡ�½��ۤ��ź��L�ա^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp06e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=264&amp;y=127&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ź��C�]�ϡ�½��ۤ��ź��L�ա^ - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�s10���D�p�I�k�P�{�����K�����f��-�峹\">�s10���D�p�I�k�P�{�����K�����f��</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"259\" data-m='{\"i\":259,\"p\":256,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGiV\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%af%94%e4%be%8b%e8%b6%85%e7%8b%82%ef%bc%81%e9%a4%a8%e9%95%b7%e6%90%ad%e3%80%8c%e6%ad%a3%e5%a6%b9%e5%a5%b3%e8%ad%a6%e3%80%8d-%e7%b2%89%e7%b5%b2%e9%a9%9a%e5%91%86%e6%89%8b%e8%87%82%e5%aa%b2%e7%be%8e%e9%a0%ad%e5%9c%8d/ar-BBSoGiV?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoURK.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=658&amp;y=235&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��ҶW�g�I�]���f�u���f�kĵ�v ������b�G���u�B���Y�� - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"��ҶW�g�I�]���f�u���f�kĵ�v ������b�G���u�B���Y��-�峹\">��ҶW�g�I�]���f�u���f�kĵ�v ������b�G���u�B���Y��</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
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
"<img alt=\"���m�]�ϡ��y�ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoV5G.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=266&amp;y=155&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���m�]�ϡ��y�ѡ^ - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���m��|���D�����٥~�y�I��㥸�u�����f�H�v-�峹\">���m��|���D�����٥~�y�I��㥸�u�����f�H�v</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"FotoJet (13)\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoVhK.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"FotoJet (13) - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�k�P�M�c175���I�a�d�� 13�~�����u��ͬ��n��-�峹\">�k�P�M�c175���I�a�d�� 13�~�����u��ͬ��n��</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"264\" data-m='{\"i\":264,\"p\":262,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmLrZ\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e5%bb%96%e5%b3%bb%e7%88%86%e5%b0%8f%e4%b8%ad%e9%a2%a8%ef%bc%81%e5%85%92%e5%ad%90%e8%a6%aa%e6%9b%9d%e9%9a%b1%e8%97%8f%e7%97%85%e6%83%85%e5%8e%9f%e5%9b%a0/ar-BBSmLrZ?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmX7W.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=268&amp;y=214&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���m�z�p�����I��l���n���ïf����] - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���m�z�p�����I��l���n���ïf����]-�峹\">���m�z�p�����I��l���n���ïf����]</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"265\" data-m='{\"i\":265,\"p\":262,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSolwV\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/3%e6%ad%b2%e5%85%92%e5%96%8a%e8%a6%81%e5%bc%9f%e5%bc%9f-%e9%bb%83%e5%a6%83%e5%98%86%e4%b8%8d%e6%83%b3%e5%86%8d%e7%94%9f/ar-BBSolwV?li=BBqiNIf\"  >\n" +
"<img alt=\"3����ۭn�̧� ���m�ġG���Q�A��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoq5e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=416&amp;y=110&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"3����ۭn�̧� ���m�ġG���Q�A�� - Copyright? ���ɹq�l��\" /> <div>\n" +
"<h3   aria-label=\"3����ۭn�̧� ���m�ġG���Q�A��-�峹\">3����ۭn�̧� ���m�ġG���Q�A��</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
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
"<img alt=\"collage\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoLBD.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=769&amp;y=324&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"collage - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�M�X���ȱl�m���m���h�äH�� ���H�f�D�ͦs�[�J����-�峹\">�M�X���ȱl�m���m���h�äH�� ���H�f�D�ͦs�[�J����</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"268\" data-m='{\"i\":268,\"p\":266,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm8nd\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e4%b8%8a%e7%b7%9a%e4%ba%86%ef%bc%81%e6%ad%90%e9%99%bd%e5%a8%9c%e5%a8%9c%e7%b6%b2%e5%90%8d%e6%9b%9d%e5%85%89-%e7%b6%b2%e5%8f%8b%e6%9a%b4%e5%8b%95/ar-BBSm8nd?li=BBqiNIf\"  >\n" +
"<img alt=\" �ڶ��R�R,�w��,���z�L/½��ۼڶ��R�R�L��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3j2e.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=178&amp;y=105&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ڶ��R�R,�w��,���z�L/½��ۼڶ��R�R�L�� - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�W�u�F�I�ڶ��R�R���W�n�� ���ͼɰ�-�峹\">�W�u�F�I�ڶ��R�R���W�n�� ���ͼɰ�</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"269\" data-m='{\"i\":269,\"p\":266,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmQwG\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%9e%97%e6%9b%b4%e6%96%b0%e5%86%8d%e8%a2%ab%e6%8a%93%e7%b4%84%e6%9c%83%e3%80%8a%e7%be%8e%e4%ba%ba%e5%bf%83%e8%a8%88%e3%80%8b%e7%9a%84%e5%a5%b9-%e7%a0%b4%e9%99%a4%e5%8a%88%e8%85%bf%e5%88%86%e6%89%8b%e8%ac%a0%e8%a8%80%ef%bc%81/ar-BBSmQwG?li=BBqiNIf\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoIEZ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=663&amp;y=488&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L��s - Getty\" /> <div>\n" +
"<h3   aria-label=\"�L��s�A�Q����|�m���H�߭p�n���o �}���A�L���������I-�峹\">�L��s�A�Q����|�m���H�߭p�n���o �}���A�L���������I</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSnfAJ.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=538&amp;y=486&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"10�~�D�ԡI�p�նWV�ʤl�y�n�� ����Y�ڥ��S�� - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"10�~�D�ԡI�p�նWv�ʤl�y�n�� ����Y�ڥ��S��-�峹\">10�~�D�ԡI�p�նWV�ʤl�y�n�� ����Y�ڥ��S��</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp0vI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=1328&amp;y=1496&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���� - Getty\" /> <div>\n" +
"<h3   aria-label=\"�t�\��������ʿ�X�� ���šG�u�ˤ��o-�峹\">�t�\��������ʿ�X�� ���šG�u�ˤ��o</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"274\" data-m='{\"i\":274,\"p\":272,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmH9j\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e3%80%8a%e5%b0%8f%e5%a5%b3%e8%8a%b1%e4%b8%8d%e6%a3%84%e3%80%8b%e8%b4%8f%e9%81%8e%e5%bb%b6%e7%a6%a7%ef%bc%81%e9%99%b8%e5%8a%87%e3%80%8c%e7%a0%b4%e7%99%be%e8%90%ac%e6%b5%81%e9%87%8f%e6%8e%92%e8%a1%8c%e3%80%8d%e9%80%9f%e5%ba%a6%ef%bc%8c%e6%99%a8%e7%a5%9e%e5%88%b7%e6%96%b0%e5%80%8b%e4%ba%ba%e7%b4%80%e9%8c%84/ar-BBSmH9j?li=BBqiNIf\"  >\n" +
"<img alt=\"�m�p�k�ᤣ��nĹ�L���H�I���@�u�}�ʸU�y�q�Ʀ�v�t�סA�ᯫ��s�ӤH����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoCog.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=152&amp;y=185&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�̱� - beauty321\" /> <div>\n" +
"<h3   aria-label=\"�m�p�k�ᤣ��n�y�q�g�t�I�ᯫ��s�ӤH����-�峹\">�m�p�k�ᤣ��n�y�q�g�t�I�ᯫ��s�ӤH����</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"275\" data-m='{\"i\":275,\"p\":272,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSndOy\",\"h\":0,\"v\":\"entertainment\",\"c\":\"news\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/entertainment/news/%e6%8c%ba%e9%81%8e%e5%a4%a7%e8%85%b8%e7%99%8c%ef%bc%81%e3%80%8c%e5%b0%8f%e8%99%8e%e9%9a%8a%e3%80%8d%e6%88%90%e5%93%a1%e7%b5%82%e6%96%bc%e6%88%80%e6%84%9b/ar-BBSndOy?li=BBqiNIf\"  >\n" +
"<img alt=\"�L�Q�]�ϡ��y�ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSnf4M.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=331&amp;y=209&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�Q�]�ϡ��y�ѡ^ - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���L�B�ܸ�j�z���I�L�߬v�ש��ʷR-�峹\">���L�B�ܸ�j�z���I�L�߬v�ש��ʷR</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"����W�ɧ�A�@�k�P�t�e�k�� �D������u�����p���v�I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmOQ9.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=378&amp;y=140&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����W�ɧ�A�@�k�P�t�e�k�� �D������u�����p���v�I - Copyright? ���ɹq�l��\" /> <div>\n" +
"<h3   aria-label=\"����W�ɧ�a�@�k�P�t�e�k�� �D������u�����p���v�I-�峹\">����W�ɧ�A�@�k�P�t�e�k�� �D������u�����p���v�I</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"278\" data-m='{\"i\":278,\"p\":218,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�]�g\"\n" +
"          data-section-id=\"stripe.finance\"\n" +
"          data-section-id=\"stripe.finance\">\n" +
"        <div class=\"finance stripeouter\"  data-aop=\"stripe.finance_stripe\"  data-id=\"279\" data-m='{\"i\":279,\"p\":19,\"n\":\"stripe.finance\",\"t\":\"stripe\",\"o\":9}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"280\" data-m='{\"i\":280,\"p\":279,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.finance.navigation_stripenavigation\"  data-id=\"281\" data-m='{\"i\":281,\"p\":279,\"n\":\"stripe.finance.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"282\" data-m='{\"i\":282,\"p\":281,\"n\":\"finance\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/money\"  data-id=\"283\" data-m='{\"i\":283,\"p\":281,\"n\":\"finance\",\"y\":4,\"o\":2}'>�]�g</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"284\" data-m='{\"i\":284,\"p\":281,\"n\":\"�Y�ɷs�D�`��\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/money/moneyrealtime\">�Y�ɷs�D�`��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"285\" data-m='{\"i\":285,\"p\":281,\"n\":\"Markets\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/money/markets\">����</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"286\" data-m='{\"i\":286,\"p\":281,\"n\":\"PersonalFinance\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/money/personalfinance\">�ӤH�z�]</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"287\" data-m='{\"i\":287,\"p\":281,\"n\":\"finance-real-estate\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/money/realestate\">�Цa��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"288\" data-m='{\"i\":288,\"p\":281,\"n\":\"CareerAndEducation\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/money/careerandeducation\">¾���J�I</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"289\" data-m='{\"i\":289,\"p\":281,\"n\":\"FinanceCurrencyConverter\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/money/currencyconverter\">�ײv����</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"290\" data-m='{\"i\":290,\"p\":281,\"n\":\"stockscreener\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/money/stockscreener\">�Ѳ��z��</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"291\" data-m='{\"i\":291,\"p\":281,\"n\":\"FinanceTools\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/money/tools\">�u��</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"292\" data-m='{\"i\":292,\"p\":281,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"293\" data-m='{\"i\":293,\"p\":281,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"294\" data-m='{\"i\":294,\"p\":281,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"295\" data-m='{\"i\":295,\"p\":281,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"296\" data-m='{\"i\":296,\"p\":281,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqSk1.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=469&amp;y=227&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�W�Ҥj�Y�� �����_�N�n�� - Copyright? ���ɹq�l��\" /> <div>\n" +
"<h3   aria-label=\"���_���e8�� ���~�n���̴���I�W�Ҥj�Y�� �����u�_�N�n���v-�峹\">���_���e8�� ���~�n���̴���I�W�Ҥj�Y�� �����u�_�N�n���v</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"300\" data-m='{\"i\":300,\"p\":298,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphH4\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e6%93%84%e7%8d%b2%e6%96%87%e9%9d%92%e9%ad%82-%e6%9e%97%e5%8f%a3%e9%80%99%e8%a3%a1%e4%ba%a4%e6%98%93%e9%87%8f%e5%85%a8%e5%b9%b4%e4%bd%8d%e5%b1%85%e7%ac%ac%e4%ba%8c/ar-BBSphH4?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp6Bq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� �n�к� ����\" /> <div>\n" +
"<h3   aria-label=\"�����C�� �L�f�o�̥���q���~��~�ĤG-�峹\">�����C�� �L�f�o�̥���q���~��~�ĤG</h3>\n" +
"\n" +
"<img alt=\"�n�к� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�n�к�</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"301\" data-m='{\"i\":301,\"p\":298,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr3JW\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e4%bd%a0%e6%98%af%e3%80%8c%e6%bd%9b%e5%9c%a8-ceo-%e4%ba%ba%e9%81%b8%e3%80%8d%e5%97%8e%ef%bc%9flinkedin-%e7%a0%94%e7%a9%b6%e4%b8%80%e8%90%ac%e5%90%8d%e5%9f%b7%e8%a1%8c%e9%95%b7%e5%be%8c%ef%bc%8c%e5%be%97%e5%87%ba-3-%e5%a4%a7%e8%a6%81%e9%bb%9e/ar-BBSr3JW?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSqNJe.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=479&amp;y=249&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� Business Next Publishing Corp ����\" /> <div>\n" +
"<h3   aria-label=\"�A�O�u��b ceo �H��v�ܡHlinkedin ��s�@�U�W�������A�o�X 3 �j�n�I-�峹\">�A�O�u��b CEO �H��v�ܡHLinkedIn ��s�@�U�W�������A�o�X 3 �j�n�I</h3>\n" +
"\n" +
"<img alt=\"�g�z�H��Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�g�z�H��Z</span>\n" +
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
"     <a href=\"/zh-tw/money/topstories/%e8%b1%90%e5%8e%9f%e9%96%8b%e5%83%b9%e8%b5%b0%e9%ab%98%ef%bc%8111%e6%96%b0%e6%a1%88%e5%b0%87%e5%80%92%e5%85%a5%e5%8d%83%e6%88%b6-%e3%80%8c%e4%b8%8b%e4%bf%ae%e6%bd%ae%e3%80%8d%e7%b7%8a%e8%b7%9f%e5%9c%a8%e5%be%8c/ar-BBSp6Bo?li=BBqiQ9P\"   aria-label=\"�׭�}�������I11�s�ױN�ˤJ�d�� �u�U�׼�v���b��-�峹\">\n" +
"\n" +
"                    <h3>�׭�}�������I11�s�ױN�ˤJ�d�� �u�U�׼�v���b��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�n�к� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"304\" data-m='{\"i\":304,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr3BQ\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e9%a0%98%e5%ae%8c%e5%b9%b4%e7%b5%82%e6%83%b3%e8%b7%b3%e6%a7%bd%ef%bc%9f%e9%9d%a2%e8%a9%a6%e5%89%8d%e6%ba%96%e5%82%99%e5%a5%bd%e9%80%99-9-%e9%a1%8c%ef%bc%8c%e6%9c%83%e5%a4%a7%e5%b9%85%e6%8f%90%e9%ab%98%e9%8c%84%e5%8f%96%e7%8e%87/ar-BBSr3BQ?li=BBqiQ9P\"   aria-label=\"�⧹�~�׷Q���ѡH���իe�ǳƦn�o 9 �D�A�|�j�T���������v-�峹\">\n" +
"\n" +
"                    <h3>�⧹�~�׷Q���ѡH���իe�ǳƦn�o 9 �D�A�|�j�T���������v</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�g�z�H��Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"305\" data-m='{\"i\":305,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpnkM\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e6%88%bf%e5%b1%8b%e7%a8%85%e6%93%ac%e5%86%8d%e9%99%8d%ef%bc%81%e8%87%aa%e4%bd%8f%e8%80%85%e8%a6%81%e7%9c%81%e7%a8%852%e9%bb%9e%e9%a0%88%e7%9f%a5/ar-BBSpnkM?li=BBqiQ9P\"   aria-label=\"�Ыε|���A���I�ۦ�̭n�ٵ|2�I����-�峹\">\n" +
"\n" +
"                    <h3>�Ыε|���A���I�ۦ�̭n�ٵ|2�I����</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�n�к� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"306\" data-m='{\"i\":306,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpnkD\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e7%88%9b%e5%b0%be%e6%a8%93%e4%b9%9f%e8%83%bd%e6%8b%89%e6%8a%ac%e5%9c%b0%e5%8d%80%e8%a1%8c%e6%83%85-%e6%88%bf%e4%bb%b2%e5%96%ae%e5%9d%aa%e4%b8%8a%e6%bc%b23%ef%bd%9e5%e8%90%ac/ar-BBSpnkD?li=BBqiQ9P\"   aria-label=\"����Ӥ]��ԩ�a�Ϧ污 �Х�G��W�W��3��5�U-�峹\">\n" +
"\n" +
"                    <h3>����Ӥ]��ԩ�a�Ϧ污 �Х�G��W�W��3��5�U</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�n�к� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA7X1e8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"307\" data-m='{\"i\":307,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpvly\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e6%83%b3%e5%8d%87%e9%81%b7%e3%80%81%e5%8a%a0%e8%96%aa%ef%bc%8c%e6%80%8e%e9%ba%bc%e6%8f%90%e6%89%8d%e6%9c%83%e6%88%90%e5%8a%9f%ef%bc%9f%e7%b8%be%e6%95%88%e9%9d%a2%e8%ab%87%e5%89%8d%e8%a6%81%e5%81%9a%e7%9a%84-5-%e9%a0%85%e6%ba%96%e5%82%99/ar-BBSpvly?li=BBqiQ9P\"   aria-label=\"�Q�ɾE�B�[�~�A��򴣤~�|���\�H�Z�ĭ��ͫe�n���� 5 ���ǳ�-�峹\">\n" +
"\n" +
"                    <h3>�Q�ɾE�B�[�~�A��򴣤~�|���\�H�Z�ĭ��ͫe�n���� 5 ���ǳ�</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�g�z�H��Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"308\" data-m='{\"i\":308,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpDrC\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e5%85%a8%e7%90%83%e6%88%90%e9%95%b7%e8%b6%a8%e7%b7%a9%e9%83%bd%e6%80%aa%e4%b8%89d%e4%ba%ba%e5%8f%a3%e6%b8%9b%e5%b0%91%e3%80%81%e5%8e%bb%e6%a7%93%e6%a1%bf%e5%8c%96%e3%80%81%e5%8e%bb%e5%85%a8%e7%90%83%e5%8c%96/ar-BBSpDrC?li=BBqiQ9P\"   aria-label=\"���y�����ͽw���ǤTd�G�H�f��֡B�h�b��ơB�h���y��-�峹\">\n" +
"\n" +
"                    <h3>���y�����ͽw���ǤTD�G�H�f��֡B�h�b��ơB�h���y��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"309\" data-m='{\"i\":309,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSqXAP\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e7%92%b0%e7%8b%80%e7%b7%9a6%e6%9c%88%e9%96%8b%e9%80%9a-%e6%88%bf%e5%b8%82%e8%b2%b7%e6%b0%a3%e6%97%ba/ar-BBSqXAP?li=BBqiQ9P\"   aria-label=\"�����u6��}�q �Х��R���-�峹\">\n" +
"\n" +
"                    <h3>�����u6��}�q �Х��R���</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"310\" data-m='{\"i\":310,\"p\":302,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpC6t\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e7%9c%8b%e5%9c%96%e8%ab%96%e5%b8%82%e8%b2%bf%e6%98%93%e6%88%b0%e7%9a%84%e8%b2%a0%e9%9d%a2%e6%b2%96%e6%93%8a%e5%b7%b2%e7%b6%93%e5%9c%a8%e7%be%8e%e5%9c%8b%e8%82%a1%e5%b8%82%e4%b8%ad%e9%a1%af%e7%8f%be/ar-BBSpC6t?li=BBqiQ9P\"   aria-label=\"�ݹϽץ��G�T���Ԫ��t���R���w�g�b����ѥ�����{-�峹\">\n" +
"\n" +
"                    <h3>�ݹϽץ��G�T���Ԫ��t���R���w�g�b����ѥ�����{</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"Bloomberg �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3lldo.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"     <a href=\"/zh-tw/money/topstories/%e4%b8%ad%e9%bc%8e%e5%8e%bb%e5%b9%b4%e5%9c%a8%e5%bb%ba%e5%8f%8a%e6%96%b0%e6%8e%a5%e6%a1%88%e9%87%91%e9%a1%8d%e9%9b%99%e5%89%b5%e6%ad%b7%e5%8f%b2%e6%96%b0%e9%ab%98%ef%bc%8c%e4%bb%8a%e5%b9%b4%e5%8a%9b%e6%8b%bc%e7%ba%8c%e6%94%80%e5%b3%b0/ar-BBSrrXm?li=BBqiQ9P\"   aria-label=\"�����h�~�b�ؤηs���ת��B���о��v�s���A���~�O�����k�p-�峹\">\n" +
"\n" +
"                    <h3>�����h�~�b�ؤηs���ת��B���о��v�s���A���~�O�����k�p</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�]�T�ֳ� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AApH8da.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"314\" data-m='{\"i\":314,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSr018\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e5%82%b3%e7%94%a2%e6%a5%ad-%e4%b8%ad%e8%a6%8f%e4%b8%ad%e7%9f%a9%e4%b8%8d%e8%8a%b1%e4%bf%8f%ef%bc%81%e6%b2%92%e4%ba%86%e5%9a%b4%e5%87%b1%e6%b3%b0-%e8%a3%95%e9%9a%86%e5%b0%be%e7%89%99%e5%8f%96%e6%b6%88%e6%8a%bd%e6%b1%bd%e8%bb%8a/ar-BBSr018?li=BBqiQ9P\"   aria-label=\"�ǲ��~ ���W���x����N�I�S�F�Y�ͮ� �ζ�����������T��-�峹\">\n" +
"\n" +
"                    <h3>�ǲ��~ ���W���x����N�I�S�F�Y�ͮ� �ζ�����������T��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"315\" data-m='{\"i\":315,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrEwm\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e4%b8%8a%e9%8a%80%e4%bb%8a%e5%b9%b4%e6%a5%ad%e7%b8%be%e5%8a%9b%e6%8b%9a%e5%85%a9%e4%bd%8d%e6%95%b8%e6%88%90%e9%95%b7%ef%bc%8c%e6%9c%9d%e5%85%a8%e7%90%83%e5%8c%96%e4%bd%88%e5%b1%80/ar-BBSrEwm?li=BBqiQ9P\"   aria-label=\"�W�Ȥ��~�~�Z�O����Ʀ����A�¥��y�ƧG��-�峹\">\n" +
"\n" +
"                    <h3>�W�Ȥ��~�~�Z�O����Ʀ����A�¥��y�ƧG��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�]�T�ֳ� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AApH8da.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"316\" data-m='{\"i\":316,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpbAY\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e8%97%8d%e6%b5%b7%e7%ad%96%e7%95%a5%e7%99%bc%e8%a1%a8%e4%ba%8614%e5%b9%b4%ef%bc%8c%e7%82%ba%e4%bd%95%e9%82%84%e9%80%99%e9%ba%bc%e5%a4%9a%e4%bc%81%e6%a5%ad%e8%b5%b0%e4%b8%8d%e5%87%ba%e7%b4%85%e6%b5%b7%ef%bc%9f%e5%b0%88%e8%a8%aa%e4%bd%9c%e8%80%85%e8%ab%87%e3%80%8c%e8%88%aa%e5%90%91%e8%97%8d%e6%b5%b7%e3%80%8d%e7%9a%84%e6%8a%80%e8%a1%93/ar-BBSpbAY?li=BBqiQ9P\"   aria-label=\"�Ů������o��F14�~�A�����ٳo��h���~�����X�����H�M�X�@�̽͡u��V�Ů��v���޳N-�峹\">\n" +
"\n" +
"                    <h3>�Ů������o��F14�~�A�����ٳo��h���~�����X�����H�M�X�@�̽͡u��V�Ů��v���޳N</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�g�z�H��Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"317\" data-m='{\"i\":317,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HV\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e9%80%99%e5%ae%b6%e5%85%a8%e5%8f%b0%e5%8c%96%e5%a6%9d%e5%93%81%e5%9d%aa%e6%95%88%e7%8e%8b-%e9%9d%a0%e5%93%81%e7%89%8c%e3%80%8c%e8%b5%b7%e5%ae%b6%e5%8e%9d%e3%80%8d%e6%a8%a1%e5%bc%8f%e7%a9%a9%e5%9d%90%e7%ac%ac%e4%b8%80/ar-BBSp1HV?li=BBqiQ9P\"   aria-label=\"�o�a���x�Ƨ��~�W�Ĥ� �a�~�P�u�_�a��v�Ҧ�í���Ĥ@-�峹\">\n" +
"\n" +
"                    <h3>�o�a���x�Ƨ��~�W�Ĥ� �a�~�P�u�_�a��v�Ҧ�í���Ĥ@</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"318\" data-m='{\"i\":318,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpbHs\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e9%99%b8%e4%bc%81%e9%81%95%e7%b4%84%e5%82%b5%e5%bd%88%e9%a0%bb%e7%88%86%ef%bc%81%e7%ab%84%e6%94%b9%e8%b2%a1%e5%a0%b1%e5%a4%b1%e4%bf%a1%e6%8a%95%e8%b3%87%e4%ba%ba%e3%80%81%e5%89%8d%e6%99%af%e5%a0%aa%e6%86%82%ef%bc%9f/ar-BBSpbHs?li=BBqiQ9P\"   aria-label=\"�����H���żu�W�z�I«��]�����H���H�B�e�����~�H-�峹\">\n" +
"\n" +
"                    <h3>�����H���żu�W�z�I«��]�����H���H�B�e�����~�H</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"319\" data-m='{\"i\":319,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpbhC\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e5%a4%8f%e6%99%ae%e9%a3%868percent%ef%bc%81pc%e4%ba%8b%e6%a5%ad%e5%ad%90%e5%85%ac%e5%8f%b8dynabook%e7%99%bc%e8%a1%a8%e3%80%8c%e9%a6%96%e6%ac%be%e3%80%8d%e6%96%b0%e6%a9%9f/ar-BBSpbhC?li=BBqiQ9P\"   aria-label=\"�L���t8%�Ipc�Ʒ~�l���qdynabook�o��u���ڡv�s��-�峹\">\n" +
"\n" +
"                    <h3>�L���t8%�IPC�Ʒ~�l���qDynabook�o��u���ڡv�s��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"320\" data-m='{\"i\":320,\"p\":312,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2nb\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/money/topstories/%e6%98%af%e8%97%95%e6%96%b7%e7%b5%b2%e9%80%a3%e9%82%84%e6%98%af%e4%b8%80%e5%88%80%e5%85%a9%e6%96%b7%ef%bc%9f%e8%8b%b1%e5%9c%8b%e8%84%ab%e6%ad%90%e5%85%ad%e7%a8%ae%e7%b5%90%e5%b1%80%e7%8c%9c%e6%83%b3/ar-BBSp2nb?li=BBqiQ9P\"   aria-label=\"�O���_���s�٬O�@�M���_�H�^���ڤ��ص����q�Q-�峹\">\n" +
"\n" +
"                    <h3>�O���_���s�٬O�@�M���_�H�^���ڤ��ص����q�Q</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"Bloomberg �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3lldo.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<h3   aria-label=\"�x�ѫ����˼� ���ɾ_����W9800�I-�峹\">�x�ѫ����˼� ���ɾ_����W9800�I</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5I03M.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"324\" data-m='{\"i\":324,\"p\":322,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HW\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%8c%af%e6%90%8d%e9%87%8d%e5%82%b7%e4%bf%9d%e9%9a%aa%e6%a5%ad%e7%8d%b2%e5%88%a9-%e4%bf%a1%e8%a9%95%e9%80%99%e9%ba%bc%e7%9c%8b-%e8%bf%8e%e6%8c%91%e6%88%b0%e9%9d%a0%e9%80%993%e5%8a%a9%e5%8a%9b/ar-BBSp1HW?li=BBqiQ9P\"  >\n" +
"<img alt=\"coins-1726618_1280\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZnW.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"coins-1726618_1280 - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�׷l���˫O�I�~��Q �H���o��� ��D�Ծa�o3�U�O-�峹\">�׷l���˫O�I�~��Q �H���o��� ��D�Ծa�o3�U�O</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"325\" data-m='{\"i\":325,\"p\":322,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp3i0\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e9%a2%a8%e9%9a%aa%e8%83%83%e7%b4%8d%e9%96%8b%ef%bc%81%e5%9e%83%e5%9c%be%e5%82%b5%e5%89%b52%e5%b9%b4%e6%9c%80%e5%a4%a7%e5%90%b8%e9%87%91%e9%a1%8d%e3%80%81%e6%96%b0%e8%88%88%e5%b8%82%e5%a0%b4%e9%8c%a2%e6%bd%ae%e6%97%ba/ar-BBSp3i0?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpdrq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� MoneyDJ ����\" /> <div>\n" +
"<h3   aria-label=\"���I�G�Ƕ}�I�U���ų�2�~�̤j�l���B�B�s�����������-�峹\">���I�G�Ƕ}�I�U���ų�2�~�̤j�l���B�B�s�����������</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ�z�]��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoOZV.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� Business Next Publishing Corp ����\" /> <div>\n" +
"<h3   aria-label=\"�b���ѬO�ѰO�H�K�X������s�H�饻��z�U�ݪ��u�b��M��v�M�u�K�X�W�h�v�A�n�O�S�n��-�峹\">�b���ѬO�ѰO�H�K�X������s�H�饻��z�U�ݪ��u�b��M��v�M�u�K�X�W�h�v�A�n�O�S�n��</h3>\n" +
"\n" +
"<img alt=\"�g�z�H��Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBiIJZk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�g�z�H��Z</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"328\" data-m='{\"i\":328,\"p\":326,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoX2B\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e6%9b%b4%e5%a4%a7%e7%9a%84%e9%81%95%e7%b4%84%e5%b7%a8%e6%b5%aa%e5%b0%87%e6%92%b2%e5%90%91%e6%b0%91%e4%bc%81%ef%bc%9f%e9%99%b8%e4%bb%8a%e5%b9%b4%e5%88%b0%e6%9c%9f%e5%85%ac%e5%8f%b8%e5%82%b5%e9%a3%86%e6%ad%b7%e5%8f%b2%e9%ab%98/ar-BBSoX2B?li=BBqiQ9P\"  >\n" +
"<img alt=\"FILE - In this Nov. 9, 2017, file photo, a member of the Chinese military marche...\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjCwJ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=2421&amp;y=838&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"FILE - In this Nov. 9, 2017, file photo, a member of the Chinese military marche... - The Associated Press\" /> <div>\n" +
"<h3   aria-label=\"��j���H�������N���V�����H�����~������q���t���v��-�峹\">��j���H�������N���V�����H�����~������q���t���v��</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ�z�]��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"329\" data-m='{\"i\":329,\"p\":326,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGPD\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%a1%8c%e5%8b%95%e9%9b%bb%e6%ba%90%e6%8e%b0%e4%ba%86-%e8%98%8b%e6%9e%9c%e9%96%8b%e8%b3%a3%e4%b8%89%e6%ac%be%e6%96%b0iphone-%e6%99%ba%e6%85%a7%e9%9b%bb%e6%b1%a0%e8%ad%b7%e6%ae%bc/ar-BBSoGPD?li=BBqiQ9P\"  >\n" +
"<img alt=\"��ʹq���T�F�@ī�G�}��T�ڷsiPhone���z�q���@��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoYgm.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��ʹq���T�F ī�G�}��T�ڷsiPhone���z�q���@�� - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"��ʹq���T�F ī�G�}��T�ڷsiphone ���z�q���@��-�峹\">��ʹq���T�F ī�G�}��T�ڷsiPhone ���z�q���@��</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1ad.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� MoneyDJ ����\" /> <div>\n" +
"<h3   aria-label=\"�P�⤣���I�鲣����@�y�ո˼t�̰�����700�H-�峹\">�P�⤣���I�鲣����@�y�ո˼t�̰�����700�H</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ�z�]��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjymc.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=296&amp;y=177&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���I�j�v���J���G���ɵo�͡A�o���ȿ��̮e�� - �� Home Media Group LTD., Cite Branch ����\" /> <div>\n" +
"<h3   aria-label=\"���I�j�v���J���G���ɵo�͡A�o���ȿ��̮e��-�峹\">���I�j�v���J���G���ɵo�͡A�o���ȿ��̮e��</h3>\n" +
"\n" +
"<img alt=\"�ӷ~�P�Z  �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3igyX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ӷ~�P�Z </span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"334\" data-m='{\"i\":334,\"p\":332,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTi0\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e5%8f%b0%e7%a9%8d%e9%9b%bb%e6%8b%8b%e9%87%8d%e6%96%b0%e8%ad%b0%e5%83%b9%e9%9c%87%e6%92%bc%e5%bd%88-%e7%9f%bd%e6%99%b6%e5%9c%93%e6%97%8f%e7%be%a4%e8%82%a1%e5%83%b9%e6%8c%ab/ar-BBSoTi0?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA8eqYY.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�x�n�q�⺦ �x�Ѥ��^26.8�I - AP\" /> <div>\n" +
"<h3   aria-label=\"�x�n�q�߭��sĳ���_�ټu ������ڸs�ѻ���-�峹\">�x�n�q�߭��sĳ���_�ټu ������ڸs�ѻ���</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5I03M.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"335\" data-m='{\"i\":335,\"p\":332,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSowCX\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%b2%bf%e6%98%93%e6%88%b0%e8%a1%9d%e6%93%8a%e3%80%81nidec%e7%a0%8d%e8%b2%a1%e6%b8%ac%ef%bc%9b%e6%9c%83%e9%95%b7%e4%b8%8b%e6%bb%91%e6%83%85%e6%b3%81%e5%89%8d%e6%89%80%e6%9c%aa%e8%a6%8b/ar-BBSowCX?li=BBqiQ9P\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoSDg.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�T���Խ����BNidec��]���F�|���G�U�Ʊ��p�e�ҥ��� - �� SysJust Co. Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�T���Խ����Bnidec��]���F�|���G�U�Ʊ��p�e�ҥ���-�峹\">�T���Խ����BNidec��]���F�|���G�U�Ʊ��p�e�ҥ���</h3>\n" +
"\n" +
"<img alt=\"MoneyDJ�z�]�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6lrB7.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>MoneyDJ�z�]��</span>\n" +
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
"<h3   aria-label=\"�x�n�q�D5�~��U�ץؼл� �̧C210��-�峹\">�x�n�q�D5�~��U�ץؼл� �̧C210��</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5I03M.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"338\" data-m='{\"i\":338,\"p\":336,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSozuh\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e9%a2%a8%e8%a9%95%e9%99%8d%e5%82%99%e8%bd%89%e5%ae%b9%e9%87%8f%e7%8e%87%e2%94%80%e8%94%a1%e6%94%bf%e5%ba%9c%e5%8f%88%e8%a6%81%e7%8e%a9%e6%95%b8%e5%ad%97%e9%81%8a%e6%88%b2%ef%bc%9f/ar-BBSozuh?li=BBqiQ9P\"  >\n" +
"<img alt=\"�����G������e�q�v�w���F���S�n���Ʀr�C���H\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSozud.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=307&amp;y=108&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����G������e�q�v�w���F���S�n���Ʀr�C���H - �� Storm Media Group ����\" /> <div>\n" +
"<h3   aria-label=\"�����G������e�q�v�w���F���S�n���Ʀr�C���H-�峹\">�����G������e�q�v�w���F���S�n���Ʀr�C���H</h3>\n" +
"\n" +
"<img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ǴC</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"339\" data-m='{\"i\":339,\"p\":336,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSow4p\",\"h\":0,\"v\":\"finance\",\"c\":\"finance-top-stories\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/money/topstories/%e8%8a%b1%e9%8c%a2%e4%b9%9f%e5%88%86%e7%97%9b%e6%88%96%e4%b8%8d%e7%97%9b%ef%bc%9f%e9%87%91%e9%8c%a2%e5%bf%83%e7%90%86%e5%ad%b8%e6%95%99%e4%bd%a0%e7%a0%b4%e8%a7%a3%e5%95%86%e4%ba%ba%e5%bf%85%e6%ae%ba%e6%8a%80/ar-BBSow4p?li=BBqiQ9P\"  >\n" +
"<img alt=\"����]������h�������h����k�H�ӤH�x���F�����߲z�ǡA�N�໴�����A�L�h���r���C�]�F��IC�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoFFE.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����]������h�������h����k�H�ӤH�x���F�����߲z�ǡA�N�໴�����A�L�h���r���C�]�F��IC�^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"����]���h�Τ��h�H�����߲z�ǱЧA�}�ѰӤH������-�峹\">����]���h�Τ��h�H�����߲z�ǱЧA�}�ѰӤH������</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoo9K.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=465&amp;y=83&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�{�d50�U���s�״� ���ȧK�d - Copyright? ���ɹq�l��\" /> <div>\n" +
"<h3   aria-label=\"�{�d50�U���s�״� ���ȧK�d-�峹\">�{�d50�U���s�״� ���ȧK�d</h3>\n" +
"\n" +
"<img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ɹq�l��</span>\n" +
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
"<img alt=\"�E�w���I�X�b����~�D�o���ɪ�5�j����n���A�~���קKAI�����������ɡC\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmBud.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=283&amp;y=166&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�E�w���I�X�b����~�D�o���ɪ�5�j����n���A�~���קKAI�����������ɡC - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�H�u���z�C�b���駹�����ɡH���������I�X5�j����D�藍�i-�峹\">�H�u���z�C�b���駹�����ɡH���������I�X5�j����D�藍�i</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"344\" data-m='{\"i\":344,\"p\":279,\"n\":\"rightarrow\",\"y\":12,\"o\":8}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�s�D\"\n" +
"          data-positions=\".news .stripecontent:nth-of-type(1) .tertiary li:nth-child(3)\" data-section-id=\"stripe.news\"\n" +
"          data-section-id=\"stripe.news\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.news_stripe\"  data-id=\"345\" data-m='{\"i\":345,\"p\":19,\"n\":\"stripe.news\",\"t\":\"stripe\",\"o\":10}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"346\" data-m='{\"i\":346,\"p\":345,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.news.navigation_stripenavigation\"  data-id=\"347\" data-m='{\"i\":347,\"p\":345,\"n\":\"stripe.news.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"348\" data-m='{\"i\":348,\"p\":347,\"n\":\"news\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/news\"  data-id=\"349\" data-m='{\"i\":349,\"p\":347,\"n\":\"news\",\"y\":4,\"o\":2}'>�s�D</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"350\" data-m='{\"i\":350,\"p\":347,\"n\":\"other\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/news/other\">�Y�ɷs�D�`��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"351\" data-m='{\"i\":351,\"p\":347,\"n\":\"?�T�T2018?\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/news/yearinreview2018\">?�T�T2018?</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"352\" data-m='{\"i\":352,\"p\":347,\"n\":\"newsphotos\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/news/photos\">��m�Ͽ�</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"353\" data-m='{\"i\":353,\"p\":347,\"n\":\"newsnational\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/news/national\">�ꤺ</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"354\" data-m='{\"i\":354,\"p\":347,\"n\":\"newsbusiness\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/news/money\">�]�g</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"355\" data-m='{\"i\":355,\"p\":347,\"n\":\"newsmilitary\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/news/military\">�x��</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"356\" data-m='{\"i\":356,\"p\":347,\"n\":\"newsworld\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/news/world\">�⩤���</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"357\" data-m='{\"i\":357,\"p\":347,\"n\":\"living\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/news/living\">�ͬ����</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"358\" data-m='{\"i\":358,\"p\":347,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"359\" data-m='{\"i\":359,\"p\":347,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"360\" data-m='{\"i\":360,\"p\":347,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"361\" data-m='{\"i\":361,\"p\":347,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"362\" data-m='{\"i\":362,\"p\":347,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"�W���̶����u�i�i�۱��v�H�g�ħ��S���K�屽�r�O�u�|�@��d�v�A�������d�`�ΡG�ڭn��ĵ�߻��I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrrw1.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=296&amp;y=109&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�W���̶����u�i�i�۱��v�H�g�ħ��S���K�屽�r�O�u�|�@��d�v�A�������d�`�ΡG�ڭn��ĵ�߻��I - �� Storm Media Group ����\" /> <div>\n" +
"<h3   aria-label=\"�W���̶����u�i�i�۱��v�H�g�ħ��S���K�屽�r�O�u�|�@��d�v�A�������d�`�ΡG�ڭn��ĵ�߻��I-�峹\">�W���̶����u�i�i�۱��v�H�g�ħ��S���K�屽�r�O�u�|�@��d�v�A�������d�`�ΡG�ڭn��ĵ�߻��I</h3>\n" +
"\n" +
"<img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���ǴC</span>\n" +
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
"     <a href=\"/zh-tw/news/national/%e9%a6%96%e5%ba%a6%e8%a1%a8%e6%85%8b%e5%8f%83%e9%81%b82020%e7%b8%bd%e7%b5%b1-%e7%8e%8b%e9%87%91%e5%b9%b3%e5%8f%aa%e5%b7%ae%e6%b2%92%e8%aa%aa%e5%87%ba%e5%8f%a3%e8%80%8c%e5%b7%b2/ar-BBSmTgd?li=BBqj0iS\"   aria-label=\"���ת�A�ѿ�2020�`�� �������G�u�t�S���X�f�Ӥw-�峹\">\n" +
"\n" +
"                    <h3>���ת�A�ѿ�2020�`�� �������G�u�t�S���X�f�Ӥw</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"368\" data-m='{\"i\":368,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSplTl\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%b0%8d%e6%8a%97%e5%81%87%e6%b6%88%e6%81%af-%e8%94%a1%e7%b8%bd%e7%b5%b1%e8%ab%8b%e5%8a%a0%e6%88%91%e8%87%89%e6%9b%b8line%e7%be%a4%e7%b5%84/ar-BBSplTl?li=BBqj0iS\"   aria-label=\"��ܰ����� ���`��:�Х[���y��line�s��-�峹\">\n" +
"\n" +
"                    <h3>��ܰ����� ���`��:�Х[���y��LINE�s��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"369\" data-m='{\"i\":369,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnhFh\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/2019%e4%b8%96%e7%95%8c%e4%ba%ba%e6%ac%8a%e5%a0%b1%e5%91%8a%e3%80%8b%e4%b8%ad%e5%9c%8b%e7%af%87%e7%bf%92%e8%bf%91%e5%b9%b3%e9%8e%ae%e5%a3%93%e8%ae%8a%e6%9c%ac%e5%8a%a0%e5%8e%b2%e3%80%81%e6%8b%98%e7%95%99%e5%a4%a7%e9%87%8f%e6%96%b0%e7%96%86%e5%b1%85%e6%b0%91%e3%80%81%e8%b5%b7%e8%a8%b4%e5%92%8c%e5%b9%b3%e8%a8%80%e8%ab%96/ar-BBSnhFh?li=BBqj0iS\"   aria-label=\"2019�@�ɤH�v���i�n����g�G�ߪ������ܥ��[�F�B��d�j�q�sæ�~���B�_�D�M������-�峹\">\n" +
"\n" +
"                    <h3>2019�@�ɤH�v���i�n����g�G�ߪ������ܥ��[�F�B��d�j�q�sæ�~���B�_�D�M������</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"370\" data-m='{\"i\":370,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpvlw\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e6%98%a5%e7%af%80%e9%80%a3%e5%81%87%e5%87%ba%e5%8b%a4-%e5%8a%a0%e7%8f%ad%e8%b2%bb%e9%80%99%e9%ba%bc%e7%ae%97/ar-BBSpvlw?li=BBqj0iS\"   aria-label=\"�K�`�s���X�� �[�Z�O�o���-�峹\">\n" +
"\n" +
"                    <h3>�K�`�s���X�� �[�Z�O�o���</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"371\" data-m='{\"i\":371,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp3s8\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e8%94%a1%e7%b8%bd%e7%b5%b1%e7%aa%81%e8%a5%b2%e8%a5%bf%e9%96%80%e7%94%ba%ef%bc%8c%e7%a9%b6%e7%ab%9f%e5%90%83%e4%ba%86%e5%93%aa%e4%ba%9b%e5%90%8d%e5%ba%97%ef%bc%9f%e8%80%81%e5%a4%a9%e7%a5%bf%e3%80%81%e5%a4%a9%e5%a4%a9%e5%88%a9%e2%80%a6%e9%80%99%e4%ba%9b%e9%83%bd%e6%98%af%e5%95%86%e5%9c%88%e6%9c%80%e5%a4%af%e7%be%8e%e9%a3%9f%ef%bc%81/ar-BBSp3s8?li=BBqj0iS\"   aria-label=\"���`�ά�ŧ����m�A�s���Y�F���ǦW���H�ѤѸS�B�ѤѧQ�K�o�ǳ��O�Ӱ���q�����I-�峹\">\n" +
"\n" +
"                    <h3>���`�ά�ŧ����m�A�s���Y�F���ǦW���H�ѤѸS�B�ѤѧQ�K�o�ǳ��O�Ӱ���q�����I</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ǴC �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB57Rxa.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"372\" data-m='{\"i\":372,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSplPE\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e8%99%90%e7%ab%a5%e6%9a%b4%e5%8a%9b%e9%a0%bb%e5%82%b3-%e7%9b%a3%e5%af%9f%e9%99%a2%e5%b0%87%e8%a8%ad%e5%85%92%e7%ab%a5%e6%ac%8a%e5%88%a9%e4%bf%9d%e9%9a%9c%e5%b0%88%e6%a1%88%e5%b0%8f%e7%b5%84/ar-BBSplPE?li=BBqj0iS\"   aria-label=\"�h���ɤO�W�� �ʹ�|�G�N�]�ൣ�v�Q�O�ٱM�פp��-�峹\">\n" +
"\n" +
"                    <h3>�h���ɤO�W�� �ʹ�|�G�N�]�ൣ�v�Q�O�ٱM�פp��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA8I0td.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"373\" data-m='{\"i\":373,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSppZU\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e7%be%8e%e5%a5%b3%e6%88%bf%e4%bb%b2%e3%80%8c%e6%9b%be%e7%b6%93%e8%b3%a3%e6%88%bf%e8%b3%a3%e5%88%b0%e5%93%ad%e3%80%8d-%e8%8b%a6%e7%9b%a1%e7%94%98%e4%be%86%e5%b9%b4%e6%88%90%e4%ba%a442%e4%bb%b6/ar-BBSppZU?li=BBqj0iS\"   aria-label=\"�~�ȩ_�~�I���k�Х�G����н���-�峹\">\n" +
"\n" +
"                    <h3>�~�ȩ_�~�I���k�Х�G����н���</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"374\" data-m='{\"i\":374,\"p\":366,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphzL\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e9%a1%8f%e5%af%ac%e6%81%92%e6%94%af%e6%8c%81%e8%99%90%e7%ab%a5%e8%80%85%e5%88%a4%e6%ad%bb-%e7%b6%b2%e5%8f%8b%e6%ad%aa%e6%a8%93%e5%81%9a%e6%88%90%e6%b6%88%e6%b3%a2%e5%a1%8a/ar-BBSphzL?li=BBqj0iS\"   aria-label=\"�C�e�ڤ���h���̧P�� ���ͬn�ӡG�������i��-�峹\">\n" +
"\n" +
"                    <h3>�C�e�ڤ���h���̧P�� ���ͬn�ӡG�������i��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"     <a href=\"/zh-tw/news/national/%e5%8f%88%e8%a6%8b%e8%99%90%e7%ab%a5%ef%bc%81%e6%9c%89%e4%bf%9d%e8%ad%b7%e4%bb%a4%e4%b9%9f%e4%b8%8d%e6%80%95-%e6%83%a1%e7%88%b6%e6%af%86%e6%89%93%e5%ad%90%e5%a5%b3%e9%81%8d%e9%ab%94%e9%b1%97%e5%82%b7/ar-BBSpeT0?li=BBqj0iS\"   aria-label=\"�S���h���I���O�@�O�]���� �c���ޥ��l�k�M�����-�峹\">\n" +
"\n" +
"                    <h3>�S���h���I���O�@�O�]���� �c���ޥ��l�k�M�����</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"377\" data-m='{\"i\":377,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpcLH\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%b9%ab%e9%ab%98%e8%aa%bf%ef%bc%81%e5%a4%96%e5%aa%92%e6%8f%ad%e4%b8%ad%e5%85%b1%e6%bb%b2%e9%80%8f%e5%8f%b0%e7%81%a3%e6%9c%89%e9%80%99%e5%b9%be%e6%8b%9b/ar-BBSpcLH?li=BBqj0iS\"   aria-label=\"�����աI�~�C�����@���z�x�W���o�X��-�峹\">\n" +
"\n" +
"                    <h3>�����աI�~�C�����@���z�x�W���o�X��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"378\" data-m='{\"i\":378,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp8Xt\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e6%8f%ad%e5%af%86%ef%bc%8f%e8%ad%a6%e7%95%8c%e3%80%8c%e5%a4%a7%e4%bb%81%e5%93%a5%e3%80%8d%e7%82%ba%e4%bd%95%e5%8f%97%e5%9f%ba%e5%b1%a4%e6%84%9b%e6%88%b4/ar-BBSp8Xt?li=BBqj0iS\"   aria-label=\"���K��ĵ�ɡu�j�����v�������h�R��-�峹\">\n" +
"\n" +
"                    <h3>���K��ĵ�ɡu�j�����v�������h�R��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"379\" data-m='{\"i\":379,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpdq5\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e6%8f%ad%e8%91%9b%e4%be%86%e5%84%80%e5%8a%9b%e6%8c%ba%e5%8f%a3%e8%ad%af%e5%93%a5%e5%b9%95%e5%be%8c%e8%91%89%e6%85%b6%e5%85%83%e6%8f%90%e3%80%8c3%e9%bb%9e%e3%80%8d%e6%8b%bf%e4%ba%ba%e5%98%b4%e8%bb%9f/ar-BBSpdq5?li=BBqj0iS\"   aria-label=\"�����ӻ��O���fĶ������...���y�����u3�I�v�G���H�L�n-�峹\">\n" +
"\n" +
"                    <h3>�����ӻ��O���fĶ������...���y�����u3�I�v�G���H�L�n</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"380\" data-m='{\"i\":380,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoWWc\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e4%b8%ad%e5%9c%8b%e9%a0%bb%e5%97%86%e6%ad%a6%e7%b5%b1-%e7%be%8e%e5%9c%8b%e9%98%b2%e9%83%a8%e6%8c%ba%e5%8f%b0%e7%81%a3%e8%aa%aa%e8%a9%b1%e4%ba%86/ar-BBSoWWc?li=BBqj0iS\"   aria-label=\"�����W��Z�� ���꨾�����x�W���ܤF-�峹\">\n" +
"\n" +
"                    <h3>�����W��Z�� ���꨾�����x�W���ܤF</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"381\" data-m='{\"i\":381,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpc31\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/living/%e6%b5%b7%e9%82%8a%e6%92%bf%e9%80%8f%e6%98%8e%e8%bb%9f%e6%a3%92%ef%bc%81%e5%a5%b9%e7%8d%b2%e7%9c%9f%e7%9b%b8%e9%a9%9a%e5%91%86%e6%98%af%e5%8d%b5/ar-BBSpc31?li=BBqj0iS\"   aria-label=\"����߳z���n�ΡI�o��u����b�G�O�Z-�峹\">\n" +
"\n" +
"                    <h3>����߳z���n�ΡI�o��u����b�G�O�Z</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"382\" data-m='{\"i\":382,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoUmK\",\"h\":0,\"v\":\"news\",\"c\":\"newsworld\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/world/%e7%8f%ad%e5%85%8b%e8%a5%bf%e7%9c%9f%e8%b7%a1%e3%80%8c%e6%92%90%e5%82%98%e8%80%81%e9%bc%a0%e3%80%8d-%e6%97%a5%e6%9c%ac%e7%8f%be%e8%b9%a4/ar-BBSoUmK?li=BBqj0iS\"   aria-label=\"�Z�J��u��u���ʦѹ��v �饻�{��-�峹\">\n" +
"\n" +
"                    <h3>�Z�J��u��u���ʦѹ��v �饻�{��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"383\" data-m='{\"i\":383,\"p\":375,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpf8s\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/news/national/%e5%85%a9%e5%b2%b8%e7%b7%8a%e5%bc%b5%e5%8a%a0%e5%8a%87-cnn%e5%8f%b0%e7%81%a3%e8%bb%8d%e6%bc%94%e5%b0%8d%e6%8a%97%e4%be%b5%e7%95%a5%e5%a8%81%e8%84%85/ar-BBSpf8s?li=BBqj0iS\"   aria-label=\"�⩤��i�[�@ cnn�G�x�W�x�t��ܫI���¯�-�峹\">\n" +
"\n" +
"                    <h3>�⩤��i�[�@ CNN�G�x�W�x�t��ܫI���¯�</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<img alt=\"����Ұ��������Կ�H�����y�ձ߷|�C�]��Ʒӡ�������y�ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQ0Qwq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����Ұ��������Կ�H�����y�ձ߷|�C�]��Ʒӡ�������y�ѡ^ - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�Ǫ̥Υ��դ��R�����S�� ����G�k�ʤ���̤񳯨����٦h-�峹\">�Ǫ̥Υ��դ��R�����S�� ����G�k�ʤ���̤񳯨����٦h</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"387\" data-m='{\"i\":387,\"p\":385,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp9wG\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/%e3%80%8c%e8%9b%8b%e3%80%8d%e6%b4%97%e7%a4%be%e7%be%a4%e7%b6%b2%e7%ab%99-instagram%e7%b6%b2%e7%b4%85%e8%9b%8b%e5%be%80twitter%e6%8c%91%e6%88%b0/ar-BBSp9wG?li=BBqj0iS\"  >\n" +
"<img alt=\"�����J��� Twitter�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp9wC.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����J��� Twitter�C - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�u�J�v�~���s���� instagram�����J��twitter�D��-�峹\">�u�J�v�~���s���� Instagram�����J��Twitter�D��</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"388\" data-m='{\"i\":388,\"p\":385,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpeTz\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/national/%e8%be%a6%e8%99%90%e7%ab%a5%e6%a1%88-%e5%8d%97%e8%ad%a6%e5%b1%80%e9%95%b7%e8%87%89%e6%9b%b8po%e5%87%ba%e4%b8%8d%e6%8d%a8%e8%88%87%e6%86%a4%e6%80%92/ar-BBSpeTz?li=BBqj0iS\"  >\n" +
"<img alt=\"��h���� �nĵ�����y��PO�X���˻P����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp9A7.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��h���� �nĵ�����y��PO�X���˻P���� - ������\" /> <div>\n" +
"<h3   aria-label=\"��h���� �nĵ�����y��po�X���˻P����-�峹\">��h���� �nĵ�����y��PO�X���˻P����</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5HUNe.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp9Hm.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�v�W�̥��I6���ؤj���T�{���L�¦i - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�v�W�̥��I6���ؤj���T�{���L�¦i-�峹\">�v�W�̥��I6���ؤj���T�{���L�¦i</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"391\" data-m='{\"i\":391,\"p\":389,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoRl5\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/%e3%80%90%e8%b1%aa%e5%ae%85%e6%8e%89%e6%bc%86%e3%80%91%e5%85%ac%e8%a8%ad%e7%bc%ba%e5%a4%b1%e9%81%94800%e9%a0%85-%e6%b6%88%e8%b2%bb%e8%80%85%e6%8e%a7%e5%bb%ba%e5%95%86%e4%b8%8d%e7%b5%a6%e9%a9%97%e5%b1%8b/ar-BBSoRl5?li=BBqj0iS\"  >\n" +
"<img alt=\"���O�̱��D�����v��F�W�J���˪L����B���B���A��Ʀa�q�u�աC�]Ū�̴��ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoRl3.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���O�̱��D�����v��F�W�J���˪L����B���B���A��Ʀa�q�u�աC�]Ū�̴��ѡ^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"���]�ʥ��F800�� ���O�̱��ذӤ������-�峹\">���]�ʥ��F800�� ���O�̱��ذӤ������</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"392\" data-m='{\"i\":392,\"p\":389,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZvR\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/national/%e8%94%a1%e8%8b%b1%e6%96%87%e8%b7%9f%e9%a2%a8%e8%87%89%e6%9b%b8%e6%8c%91%e6%88%b0-%e5%8e%9f%e4%be%8610%e5%b9%b4%e5%89%8d%e5%b0%b1%e6%98%af%e3%80%8c%e8%be%a3%e5%8f%b0%e6%b4%be%e3%80%8d/ar-BBSoZvR?li=BBqj0iS\"  >\n" +
"<img alt=\"�`�ν��^��b�y�Ѹ򭷰ѥ[10�~�j�D�ԡC�]½��۽��^�寻���M���^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoWXS.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=421&amp;y=206&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�`�ν��^��b�y�Ѹ򭷰ѥ[10�~�j�D�ԡC�]½��۽��^�寻���M���^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"���^����y�ѬD�� ���10�~�e�N�O�u���x���v-�峹\">���^����y�ѬD�� ���10�~�e�N�O�u���x���v</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1xp.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=105&amp;y=229&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�q�x�߯����J3�r�_�y����� �O�o�����~��`�i���I�N���j - �� Next Media Publishing Limited ����\" /> <div>\n" +
"<h3   aria-label=\"�_�y����� �O�o�����~��`-�峹\">�_�y����� �O�o�����~��`</h3>\n" +
"\n" +
"<img alt=\"���g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���g�Z</span>\n" +
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
"<img alt=\"���k���X�A�ذӳw��t����2�Ө���]����^���]�p�岫�C�]Ū�̴��ѡ^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoTRD.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���k��ܡA�]���خת��Ѧh���D�ɭP�o�X�{�ίv��ê�A�i�ӽT�E�~�{�g�C�]Ū�̴��ѡ^ - �� Mirror Media Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�ذӺٶ��@��50�U�� �o���A�D�H7�ʦs�ҫH��-�峹\">�ذӺٶ��@��50�U�� �o���A�D�H7�ʦs�ҫH��</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"397\" data-m='{\"i\":397,\"p\":395,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoRZ7\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/%e8%b6%85%e9%9d%92%e6%98%a5%e5%91%8a%e7%99%bd%e6%b3%95%e9%96%83%e7%9e%8e%e7%b6%b2%e5%8f%8b-%e3%80%8c%e4%b8%80%e5%bc%b5%e5%95%8f%e5%8d%b7%e3%80%8d%e5%91%8a%e7%99%bd%e6%88%90%e5%8a%9f%e7%9c%9f%e7%9a%84%e8%b6%85%e6%9c%83/ar-BBSoRZ7?li=BBqj0iS\"  >\n" +
"<img alt=\"Nw1GwrL\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp8ST.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Nw1GwrL - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�W�C�K�i�ժk�{�M���� �u�@�i�ݨ��v�i�զ��\�u���W�|-�峹\">�W�C�K�i�ժk�{�M���� �u�@�i�ݨ��v�i�զ��\�u���W�|</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"398\" data-m='{\"i\":398,\"p\":395,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpb1w\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/national/%e7%ac%91%e7%bf%bb%ef%bc%81-%e4%b8%80%e5%bc%b5%e5%9c%96%e7%a5%9e%e8%a7%a3%e9%a6%ac%e8%8b%b1%e4%b9%9d%e8%94%a1%e8%8b%b1%e6%96%87%e5%b7%ae%e5%88%a5/ar-BBSpb1w?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpfR4.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=267&amp;y=529&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��½�I �@�i�ϯ��Ѱ��^�E���^��t�O - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"��½�I �@�i�ϯ��Ѱ��^�E���^��t�O-�峹\">��½�I �@�i�ϯ��Ѱ��^�E���^��t�O</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSp1HS.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�Y��u�b�}���v�ũR�H�w�ԤC���εh�W�˦a �e��ᤣ�v - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�Y��u�b�}���v�ũR�H�C���ΰe��ᤣ�v-�峹\">�Y��u�b�}���v�ũR�H�C���ΰe��ᤣ�v</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"401\" data-m='{\"i\":401,\"p\":399,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTRu\",\"h\":0,\"v\":\"news\",\"c\":\"newsnational\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/news/national/97%e6%ad%b2%e8%8f%b2%e5%88%a9%e6%99%ae%e8%a6%aa%e7%8e%8b%e8%87%aa%e9%a7%95%e7%ab%9f%e7%bf%bb%e8%bb%8a-%e9%a9%9a%e9%9a%aa%e6%af%ab%e9%ab%ae%e7%84%a1%e5%82%b7/ar-BBSoTRu?li=BBqj0iS\"  >\n" +
"<img alt=\"97������Q���ˤ��۾r�ɹJ�쨮�סA�ҩ��@�v�L�ˡC�]�F��IC�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoRkZ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=435&amp;y=160&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"97������Q���ˤ��۾r�ɹJ�쨮�סA�ҩ��@�v�L�ˡC�]�F��IC�^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"97����Q���ˤ��۾r��½�� ���I�@�v�L��-�峹\">97����Q���ˤ��۾r��½�� ���I�@�v�L��</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"402\" data-m='{\"i\":402,\"p\":399,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2B2\",\"h\":0,\"v\":\"news\",\"c\":\"living\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/news/living/%e7%83%98%e8%a1%a3%e6%a9%9f%e8%a6%8b%e3%80%8c%e5%8d%83%e5%b1%a4%e8%a1%a3%e5%b1%91%e3%80%8d-%e7%b6%b2%e6%9b%9d%e9%a9%9a%e4%ba%ba%e4%ba%8b%e5%af%a6/ar-BBSp2B2?li=BBqj0iS\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoX9a.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�M������u�d�h��h�v ���n��H�ƹ� - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�M������u�d�h��h�v ���n��H�ƹ�-�峹\">�M������u�d�h��h�v ���n��H�ƹ�</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"�Ѥ��Z�T�֤p�s�K�ߴ������͡A��i�e��Ӥ��u�S����ϡv�C�]½��ۦѤ��Z�T�֯����M���^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoOmG.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=429&amp;y=228&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�Ѥ��Z�T�֤p�s�K�ߴ������͡A��i�e��Ӥ��u�S����ϡv�C�]½��ۦѤ��Z�T�֯����M���^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�F�v�H��10�~�j�D�� �u��������H�u�f�ͪ��v-�峹\">�F�v�H��10�~�j�D�� �u��������H�u�f�ͪ��v</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"��F�|�ư|�������کM��q�����L���s�]�ѥ[�u�Q�~�D�ԡv�A���ͪ�ܶV�ӶV�~���C�]½��L���s�B������IG�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZIx.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=414&amp;y=167&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��F�|�ư|�������کM��q�����L���s�]�ѥ[�u�Q�~�D�ԡv�A���ͪ�ܶV�ӶV�~���C�]½��L���s�B������IG�^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"������10�~�D�ԦۼJ�������� �L���s�Q�p�s�u���scam�v�c��-�峹\">������10�~�D�ԦۼJ�������� �L���s�Q�p�s�u���scam�v�c��</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<form tabindex=\"0\"  aria-label=\"�벼\"\n" +
">\n" +
"  <header>\n" +
" <h3>�벼</h3>\n" +
" </header>\n" +
"\n" +
"<div class=\"questions\" data-action=\"https://ratingsedge.rnr.microsoft.com/v1.0/ratingsedge/polls/vote/aaa07ys-tw2018electioncampaign01-zhtw-amp/\" id=\"poll-aaa07ys-tw2018electioncampaign01-zhtw-amp\">\n" +
"<h4 id=\"pollquestion-aaa07ys-tw2018electioncampaign01-zhtw-amp\">�P�s�_����ġA�x�_����������䭷���A�A�{���O�_�|�v�T�_������~���ﱡ�H</h4>\n" +
" <ul role=\"radiogroup\" aria-labelledby=\"pollquestion-aaa07ys-tw2018electioncampaign01-zhtw-amp\">\n" +
"\n" +
" <li role=\"radio\" aria-checked=\"false\" aria-setsize=\"3\" aria-posinset=\"1\" aria-labelledby=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0-label\">\n" +
"<input type=\"radio\" value=\"0\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0\" name=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"408\" data-m='{\"i\":408,\"p\":407,\"n\":\"poll_answer\",\"y\":10,\"o\":1}' />\n" +
"<label for=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0\" class=\"answer\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-0-label\"><span class=\"radio-icon\"><span></span></span>���|</label>\n" +
"</li>\n" +
" <li role=\"radio\" aria-checked=\"false\" aria-setsize=\"3\" aria-posinset=\"2\" aria-labelledby=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1-label\">\n" +
"<input type=\"radio\" value=\"1\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1\" name=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"409\" data-m='{\"i\":409,\"p\":407,\"n\":\"poll_answer\",\"y\":10,\"o\":2}' />\n" +
"<label for=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1\" class=\"answer\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-1-label\"><span class=\"radio-icon\"><span></span></span>�|</label>\n" +
"</li>\n" +
" <li role=\"radio\" aria-checked=\"false\" aria-setsize=\"3\" aria-posinset=\"3\" aria-labelledby=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2-label\">\n" +
"<input type=\"radio\" value=\"2\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2\" name=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"410\" data-m='{\"i\":410,\"p\":407,\"n\":\"poll_answer\",\"y\":10,\"o\":3}' />\n" +
"<label for=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2\" class=\"answer\" id=\"pa-aaa07ys-tw2018electioncampaign01-zhtw-amp-2-label\"><span class=\"radio-icon\"><span></span></span>�S�N��</label>\n" +
"</li>\n" +
" </ul>\n" +
"<div class=\"ctr\"><button disabled=\"disabled\" name=\"vote\" id=\"poll-button-aaa07ys-tw2018electioncampaign01-zhtw-amp\"  data-id=\"411\" data-m='{\"i\":411,\"p\":407,\"n\":\"poll_submit\",\"y\":11,\"o\":4}'>�벼</button></div>\n" +
"                    </div>\n" +
"                </form>\n" +
"                <div class=\"results\">\n" +
"  <header>\n" +
" <h3>�벼���G</h3>\n" +
" </header>\n" +
"\n" +
"<h4>�P�s�_����ġA�x�_����������䭷���A�A�{���O�_�|�v�T�_������~���ﱡ�H</h4>\n" +
" <ul>\n" +
" <li >\n" +
"<div class=\"resultsdivpadding\">\n" +
"<div class=\"value\">50%</div>\n" +
"<div class=\"answer\">���|<div class=\"bar\"><div class=\"meter\" role=\"progressbar\" aria-valuenow=\"50\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:50%;\"></div></div>\n" +
"                                </div>\n" +
"                           </div>\n" +
"                        </li>\n" +
" <li >\n" +
"<div class=\"resultsdivpadding\">\n" +
"<div class=\"value\">50%</div>\n" +
"<div class=\"answer\">�|<div class=\"bar\"><div class=\"meter\" role=\"progressbar\" aria-valuenow=\"50\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:50%;\"></div></div>\n" +
"                                </div>\n" +
"                           </div>\n" +
"                        </li>\n" +
" <li >\n" +
"<div class=\"resultsdivpadding\">\n" +
"<div class=\"value\">0%</div>\n" +
"<div class=\"answer\">�S�N��<div class=\"bar\"><div class=\"meter\" role=\"progressbar\" aria-valuenow=\"0\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:0%;\"></div></div>\n" +
"                                </div>\n" +
"                           </div>\n" +
"                        </li>\n" +
" </ul>\n" +
"<div class=\"ctr\">\n" +
"<footer>\n" +
"  <a href=\"https://www.msn.com/zh-tw/news/opinion\"  data-id=\"412\" data-m='{\"i\":412,\"p\":407,\"n\":\"PollModuleResultTextLink\",\"y\":14,\"o\":5}'  target=\"_blank\">\n" +
"<span>&#128227;�M�Բ����󵹧A�̦h��������</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"413\" data-m='{\"i\":413,\"p\":345,\"n\":\"rightarrow\",\"y\":12,\"o\":8}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�ͬ�\"\n" +
"          data-positions=\".lifestyle .stripecontent:nth-of-type(2) .tertiary li:nth-child(3)\" data-section-id=\"stripe.lifestyle\"\n" +
"          data-section-id=\"stripe.lifestyle\">\n" +
"        <div class=\"lifestyle stripeouter\"  data-aop=\"stripe.lifestyle_stripe\"  data-id=\"414\" data-m='{\"i\":414,\"p\":19,\"n\":\"stripe.lifestyle\",\"t\":\"stripe\",\"o\":11}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"415\" data-m='{\"i\":415,\"p\":414,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.lifestyle.navigation_stripenavigation\"  data-id=\"416\" data-m='{\"i\":416,\"p\":414,\"n\":\"stripe.lifestyle.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"417\" data-m='{\"i\":417,\"p\":416,\"n\":\"lifestyle\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/lifestyle\"  data-id=\"418\" data-m='{\"i\":418,\"p\":416,\"n\":\"lifestyle\",\"y\":4,\"o\":2}'>�ͬ�</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"419\" data-m='{\"i\":419,\"p\":416,\"n\":\"fortune2019\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/lifestyle/fortune2019\">?2019�~�׹B�ե���?</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"420\" data-m='{\"i\":420,\"p\":416,\"n\":\"��νG���j�@��\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/lifestyle/foreverdiet\">��νG���j�@��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"421\" data-m='{\"i\":421,\"p\":416,\"n\":\"���d\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/health\">���d</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"422\" data-m='{\"i\":422,\"p\":416,\"n\":\"�ȹC\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/travel\">�ȹC</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"423\" data-m='{\"i\":423,\"p\":416,\"n\":\"lifestylehoroscope\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/lifestyle/horoscope\">�P�y�B��</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"424\" data-m='{\"i\":424,\"p\":416,\"n\":\"lifestylebeauty\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/lifestyle/beauty\">���e�ɩ|</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"425\" data-m='{\"i\":425,\"p\":416,\"n\":\"lifestyledecor\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/lifestyle/decor\">�~�a�]�p</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"426\" data-m='{\"i\":426,\"p\":416,\"n\":\"����\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/foodanddrink\">����</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"427\" data-m='{\"i\":427,\"p\":416,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"428\" data-m='{\"i\":428,\"p\":416,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"429\" data-m='{\"i\":429,\"p\":416,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"430\" data-m='{\"i\":430,\"p\":416,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"431\" data-m='{\"i\":431,\"p\":416,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoOuV.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� &quot;Bella.tw ���� ����\" /> <div>\n" +
"<h3   aria-label=\"�x�H�Ʒm���urimowa����c�v�s�N�z�v�֮���H���ײש󴦾�I-�峹\">�x�H�Ʒm���uRimowa����c�v�s�N�z�v�֮���H���ײש󴦾�I</h3>\n" +
"\n" +
"<img alt=\"Bella.tw ���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw ����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"435\" data-m='{\"i\":435,\"p\":433,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmdW8\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e9%9c%8d%e5%bb%ba%e8%8f%af%e3%80%8a%e5%a6%82%e6%87%bf%e5%82%b3%e3%80%8b%e5%be%8c%e5%ae%ae%e9%bd%8a%e8%81%9a%e4%b8%80%e5%a0%82%ef%bc%81%e5%91%a8%e8%bf%85%e4%b9%9f%e5%88%b0%e5%a0%b4%ef%bc%8c%e5%ae%8c%e7%b5%90%e7%af%87%e5%be%8c%e6%98%8e%e6%98%9f%e8%bf%91%e6%b3%81/ar-BBSmdW8?li=BBwkz21\"  >\n" +
"<img alt=\"�N�صءm�p�t�ǡn��c���E�@��I�P���]����A�����g����P��p\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmsb7.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=516&amp;y=266&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�N�صءm�p�t�ǡn��c���E�@��I�P���]����A�����g����P��p - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�N�صءm�p�t�ǡn��c���E�@��I�P���]����A�����g����P��p-�峹\">�N�صءm�p�t�ǡn��c���E�@��I�P���]����A�����g����P��p</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"436\" data-m='{\"i\":436,\"p\":433,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpfwZ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e8%be%a6%e5%b9%b4%e8%b2%a8%e5%b0%b1%e5%88%b0%e8%aa%a0%e5%93%81%e7%94%9f%e6%b4%bb%ef%bc%81%e9%ab%98%e8%a8%ad%e8%a8%88%e8%b3%aa%e6%84%9f%e7%9a%84%e8%b1%ac%e5%b9%b4%e9%96%8b%e9%81%8b%e5%b0%8f%e7%89%a9%e9%80%9a%e9%80%9a%e5%9c%a8%e9%80%99%e8%a3%a1/ar-BBSpfwZ?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoRDI.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� &quot;Bella.tw ���� ����\" /> <div>\n" +
"<h3   aria-label=\"��~�f�N��۫~�ͬ��I���]�p��P���ަ~�}�B�p���q�q�b�o��-�峹\">��~�f�N��۫~�ͬ��I���]�p��P���ަ~�}�B�p���q�q�b�o��</h3>\n" +
"\n" +
"<img alt=\"Bella.tw ���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw ����</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8Svk.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=406&amp;y=669&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����ѫΦH�աB��X��ú޽u�A�b�ɩ|�˪L�����系��SPA�ɨ� - �� Home Media Group (II) ����\" /> <div>\n" +
"<h3   aria-label=\"����ѫΦH�� �b�ɩ|�˪L�����系��spa�ɨ�-�峹\">����ѫΦH�� �b�ɩ|�˪L�����系��SPA�ɨ�</h3>\n" +
"\n" +
"<img alt=\"�]�p�a �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAbxtYs.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�]�p�a</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"440\" data-m='{\"i\":440,\"p\":438,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoOx8\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e6%ad%90%e9%99%bd%e5%a8%9c%e5%a8%9c%e9%a9%9a%e7%8f%be%e8%80%b3%e4%b8%8b%e7%9f%ad%e9%ab%ae%ef%bc%81%e5%a8%9c%e6%af%94%e7%9a%845%e5%b9%b4%e9%95%b7%e9%ab%ae%e9%80%b2%e5%8c%96%e5%8f%b2%ef%bc%8c%e5%8a%a0%e7%a2%bc%e6%8e%a8%e8%96%a62019%e7%9f%ad%e9%ab%ae%e7%af%84%e6%9c%ac/ar-BBSoOx8?li=BBwkz21\"  >\n" +
"<img alt=\"�ڶ��R�R��{�դU�u�v�I�R��5�~���v�i�ƥv�A�[�X����2019�u�v�d��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZSL.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=807&amp;y=275&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ڶ��R�R��{�դU�u�v�I�R��5�~���v�i�ƥv�A�[�X����2019�u�v�d�� - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�ڶ��R�R��{�դU�u�v�I�R��5�~���v�i�ƥv�A�[�X����2019�u�v�d��-�峹\">�ڶ��R�R��{�դU�u�v�I�R��5�~���v�i�ƥv�A�[�X����2019�u�v�d��</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"441\" data-m='{\"i\":441,\"p\":438,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmDD2\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e3%80%8a%e7%9f%a5%e5%90%a6%e7%9f%a5%e5%90%a6%e3%80%8b%e5%a6%82%e8%98%ad%e4%ba%94%e5%b0%8f%e5%a7%90%e5%94%87%e8%89%b2%e6%98%af%e9%80%99%e6%94%af%ef%bc%81-3%e5%b9%b4%e4%be%86%e6%9c%80%e6%84%9b%e7%97%98%e7%97%98%e7%a5%9e%e5%99%a8%ef%bc%8c%e7%a7%81%e4%b8%8b%e7%8b%82%e6%8e%a85%e6%ac%be%e7%94%a2%e5%93%81/ar-BBSmDD2?li=BBwkz21\"  >\n" +
"<img alt=\"�m���_���_�n�p�����p�j�B��O�o��I 3�~�ӳ̷R�k�k�����A�p�U�g��5�ڲ��~\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmDCh.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=481&amp;y=218&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�m���_���_�n�p�����p�j�B��O�o��I 3�~�ӳ̷R�k�k�����A�p�U�g��5�ڲ��~ - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�m���_���_�n�p�����p�j�B��O�o��I 3�~�ӳ̷R�k�k�����A�p�U�g��5�ڲ��~-�峹\">�m���_���_�n�p�����p�j�B��O�o��I 3�~�ӳ̷R�k�k�����A�p�U�g��5�ڲ��~</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
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
"<img alt=\"���x�����¤�������ئӦ��P�ڧJ�b�o�̡I�٥i�H�@��Y������@��ܩ@��~\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjGM4.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���x�����¤�������ئӦ��P�ڧJ�b�o�̡I�٥i�H�@��Y������@��ܩ@��~ - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"���x�����¤�������ئӦ��P�ڧJ�b�o�̡I�٥i�H�@��Y������@��ܩ@��~-�峹\">���x�����¤�������ئӦ��P�ڧJ�b�o�̡I�٥i�H�@��Y������@��ܩ@��~</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"445\" data-m='{\"i\":445,\"p\":443,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmRmT\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e5%a5%b3%e4%ba%ba%e8%a6%81%e4%b8%80%e6%99%82%e7%9a%84%e5%90%b8%e5%bc%95%e5%8a%9b%e3%80%81%e9%82%84%e6%98%af%e7%84%a1%e9%99%90%e6%9c%9f%e7%9a%84%e8%bf%b7%e4%ba%ba%e6%b0%a3%e5%a0%b4%ef%bc%9f/ar-BBSmRmT?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmLaP.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=470&amp;y=118&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�k�H�n�@�ɪ��l�ޤO�B�٬O�L�������g�H����H - �� Global Views Commonwealth ����\" /> <div>\n" +
"<h3   aria-label=\"�k�H�n�@�ɪ��l�ޤO�B�٬O�L�������g�H����H-�峹\">�k�H�n�@�ɪ��l�ޤO�B�٬O�L�������g�H����H</h3>\n" +
"\n" +
"<img alt=\"�������x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�������x</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"446\" data-m='{\"i\":446,\"p\":443,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjwj6\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e8%b6%85%e7%b0%a1%e5%96%ae%e3%80%8c%e9%9f%93%e5%9c%8b%e4%ba%ba%e5%8f%83%e9%9b%9e%e6%b9%af%e3%80%8dbunny%e6%95%99%e4%bd%a0%e8%bc%95%e9%ac%86%e5%8b%95%e6%89%8b%e5%81%9a%ef%bc%8c%e8%a3%9c%e6%b0%a3%e9%a4%8a%e8%ba%ab%e6%ba%ab%e6%9a%96%e4%bd%a0%e6%95%b4%e5%80%8b%e5%86%ac%ef%bd%9e/ar-BBSjwj6?li=BBwkz21\"  >\n" +
"<img alt=\"�W²��u����H�������vBunny�ЧA���P�ʤⰵ�A�ɮ�i���ŷx�A��ӥV��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjwiq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=402&amp;y=393&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�W²��u����H�������vBunny�ЧA���P�ʤⰵ�A�ɮ�i���ŷx�A��ӥV�� - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�W²��u����H�������vbunny�ЧA���P�ʤⰵ�A�ɮ�i���ŷx�A��ӥV��-�峹\">�W²��u����H�������vBunny�ЧA���P�ʤⰵ�A�ɮ�i���ŷx�A��ӥV��</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
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
"<img alt=\"Angelababy���o�����S�W���j�I�����B�����B�B�m�ϥΫ~�P+�e�k�j���}\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmcKo.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=486&amp;y=176&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Angelababy���o�����S�W���j�I�����B�����B�B�m�ϥΫ~�P+�e�k�j���} - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"angelababy���o�����S�W���j�I�����B�����B�B�m�ϥΫ~�P+�e�k�j���}-�峹\">Angelababy���o�����S�W���j�I�����B�����B�B�m�ϥΫ~�P+�e�k�j���}</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"450\" data-m='{\"i\":450,\"p\":448,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYlY\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/travel/%e5%87%ba%e5%9c%8b%e6%97%85%e9%81%8a%e8%a9%b2%e6%80%8e%e9%ba%bc%e8%a8%82%e6%88%bf%ef%bc%9f%e7%94%a8%e9%80%993%e5%80%8b%e9%bb%9e%e6%8e%8c%e6%8f%a1%e3%80%8c2019%e7%89%b9%e8%89%b2%e4%bd%8f%e5%ae%bf%e7%86%b1%e6%bd%ae%e3%80%8d/ar-BBSoYlY?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoQXf.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=263&amp;y=180&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� &quot;Bella.tw ���� ����\" /> <div>\n" +
"<h3   aria-label=\"�X��ȹC�ӫ��q�СH�γo3�I�x���u2019�S���J����v-�峹\">�X��ȹC�ӫ��q�СH�γo3�I�x���u2019�S���J����v</h3>\n" +
"\n" +
"<img alt=\"Bella.tw ���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw ����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"451\" data-m='{\"i\":451,\"p\":448,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjY5d\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/%e5%ad%b8%e6%ad%90%e9%99%bd%e5%a8%9c%e5%a8%9c%e7%9a%84%e6%8b%8d%e7%85%a7%e5%a7%bf%e5%8b%a2%ef%bc%815%e5%80%8b%e5%b0%8f%e6%8a%80%e5%b7%a7%e8%ae%93%e5%a6%b3%e9%9b%99%e8%85%bf%e7%ab%8b%e5%88%bb%e6%8b%89%e9%95%b710%e5%85%ac%e5%88%86/ar-BBSjY5d?li=BBwkz21\"  >\n" +
"<img alt=\"�Ǽڶ��R�R����ӫ��աI5�Ӥp�ޥ����p���L�ߨ�Ԫ�10����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjJOR.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=350&amp;y=74&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�Ǽڶ��R�R����ӫ��աI5�Ӥp�ޥ����p���L�ߨ�Ԫ�10���� - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�Ǽڶ��R�R����ӫ��աI5�Ӥp�ޥ����p���L�ߨ�Ԫ�10����-�峹\">�Ǽڶ��R�R����ӫ��աI5�Ӥp�ޥ����p���L�ߨ�Ԫ�10����</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
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
"<img alt=\"���O��ۥ�I�L�������~�~�M�i�H��@���㾯�ӥΡA�]�ӯ��F�a�H�I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjtfN.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���O��ۥ�I�L�������~�~�M�i�H��@���㾯�ӥΡA�]�ӯ��F�a�H�I - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"���O��ۥ�I�L�������~�~�M�i�H��@���㾯�ӥΡA�]�ӯ��F�a�H�I-�峹\">���O��ۥ�I�L�������~�~�M�i�H��@���㾯�ӥΡA�]�ӯ��F�a�H�I</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"454\" data-m='{\"i\":454,\"p\":452,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSk6e5\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyleliving\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestyleliving/%e9%81%8e%e5%b9%b4%e5%a4%a7%e6%8e%83%e9%99%a4%e9%80%99%e6%a8%a3%e6%8e%83%e8%ae%8a%e8%bc%95%e9%ac%86%ef%bc%81%e5%8e%bb%e9%99%a4%e5%86%b0%e7%ae%b1%e7%95%b0%e5%91%b3%e3%80%81%e5%90%84%e9%a1%9e%e6%b2%99%e7%99%bc%e3%80%81%e7%a2%97%e7%9b%a4%e6%b8%85%e6%bd%94%e5%85%a8%e6%94%bb%e7%95%a5/ar-BBSk6e5?li=BBwkz21\"  >\n" +
"<img alt=\"�L�~�j�����o�˱��ܻ��P�I�h���B�c�����B�U���F�o�B�J�L�M�����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSk3Vh.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=528&amp;y=200&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�~�j�����o�˱��ܻ��P�I�h���B�c�����B�U���F�o�B�J�L�M����� - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"�L�~�j�����ܻ��P�I�h���B�c�����B�U���F�o�B�J�L�M�����-�峹\">�L�~�j�����ܻ��P�I�h���B�c�����B�U���F�o�B�J�L�M�����</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"455\" data-m='{\"i\":455,\"p\":452,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS8hxh\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/2019%e9%a1%af%e7%99%bd%e9%ab%ae%e8%89%b2%e6%8e%a8%e8%96%a6%ef%bc%8c%e9%9f%93%e5%9c%8b%e5%a5%b3%e6%98%8e%e6%98%9f%e6%9c%80%e6%84%9b%e7%9a%84%e6%b7%b1%e9%ab%ae%e8%89%b2top5%ef%bc%8c%e9%80%99%e5%b9%be%e8%89%b2%e9%83%bd%e7%be%8e%e5%91%86%e4%ba%86%ef%bc%81/ar-BBS8hxh?li=BBwkz21\"  >\n" +
"<img alt=\"2019��վv����ˡA����k���P�̷R���`�v��TOP5�A�o�X�ⳣ���b�F�I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS8qof.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=225&amp;y=180&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2019��վv����ˡA����k���P�̷R���`�v��TOP5�A�o�X�ⳣ���b�F�I - �� Ever Shinning Publications, Inc ����\" /> <div>\n" +
"<h3   aria-label=\"2019��վv����ˡA����k���P�̷R���`�v��top5�A�o�X�ⳣ���b�F�I-�峹\">2019��վv����ˡA����k���P�̷R���`�v��TOP5�A�o�X�ⳣ���b�F�I</h3>\n" +
"\n" +
"<img alt=\"beauty321 �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA9GtF8.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>beauty321</span>\n" +
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
"<img alt=\"����O�Ĥl�@���ɡA�k���e���O�Ĥl�ⷳ�ɡA�Q���˩�b�h�����g��@�~�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoW7h.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=338&amp;y=260&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����O�Ĥl�@���ɡA�k���e���O�Ĥl�ⷳ�ɡA�Q���˩�b�h�����g��@�~�C - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�Y�«����̪��g���~ �@�_���J����ة����u�a�U��ơv-�峹\">�Y�«����̪��g���~ �@�_���J����ة����u�a�U��ơv</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSogWk.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=651&amp;y=159&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� &quot;Bella.tw ���� ����\" /> <div>\n" +
"<h3   aria-label=\"angus chiang �������ǡA�����󫰥����O�дN�ΪA�˨ө���-�峹\">ANGUS CHIANG �������ǡA�����󫰥����O�дN�ΪA�˨ө���</h3>\n" +
"\n" +
"<img alt=\"Bella.tw ���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw ����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"460\" data-m='{\"i\":460,\"p\":458,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoTbb\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylefashionbeauty\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/lifestylefashionbeauty/supernumber10yearschallenge-%e6%a0%b9%e6%9c%ac%e5%9b%9e%e6%86%b6%e6%ae%ba%ef%bc%81%e5%a6%b9%e5%a6%b9%e9%a0%ad%e3%80%81%e9%9b%a2%e5%ad%90%e7%87%99%e3%80%81%e7%8e%89%e7%b1%b3%e9%ac%9a%e9%80%99%e4%ba%9b%e9%ab%ae%e5%9e%8b%e4%bd%a0%e4%b8%80%e5%ae%9a%e7%95%99%e9%81%8e/ar-BBSoTbb?li=BBwkz21\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoJhR.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=388&amp;y=161&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�� &quot;Bella.tw ���� ����\" /> <div>\n" +
"<h3   aria-label=\"#10yearschallenge �ڥ��^�б��I�f�f�Y�B���l�S�o�Ǿv���A�@�w�d�L-�峹\">#10YearsChallenge �ڥ��^�б��I�f�f�Y�B���l�S�o�Ǿv���A�@�w�d�L</h3>\n" +
"\n" +
"<img alt=\"Bella.tw ���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAqX6cw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Bella.tw ����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"461\" data-m='{\"i\":461,\"p\":458,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYTH\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestyletravel\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/travel/%e3%80%90%e8%be%b2%e6%b3%8a%e8%a7%80%e5%85%89%ef%bc%88%e4%b8%8a%ef%bc%89%e3%80%91%e9%95%b7%e4%bd%8f%e5%bc%8f%e6%97%85%e9%81%8a-%e5%85%a8%e7%90%83%e6%97%85%e5%ae%a2%e6%84%9b%e4%b8%8a%e6%97%a5%e6%9c%ac%e8%be%b2%e5%ae%b6%e6%a8%82/ar-BBSoYTH?li=BBwkz21\"  >\n" +
"<img alt=\"�������W�Х��Z�ۦa�Ϫ��A�y�]�I�u�H�{�C�K���]�H�{?????���^�v�@���C�]�H�{�C�K���x���^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoWip.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�������W�Х��Z�ۦa�Ϫ��A�y�]�I�u�H�{�C�K���]�H�{?????���^�v�@���C�]�H�{�C�K���x���^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�i�A�y�[���]�W�^�j�����ȹC ���y�ȫȷR�W�饻�A�a��-�峹\">�i�A�y�[���]�W�^�j�����ȹC ���y�ȫȷR�W�饻�A�a��</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"�C�˿��C��A�a���J���j�[�СC�]�C��A�a���J�x�賡����^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoO93.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�C�˿��C��A�a���J���j�[�СC�]�C��A�a���J�x�賡����^ - Mirror Media\" /> <div>\n" +
"<h3   aria-label=\"�i�A�y�[���]�U�^�j�o�Ǧa�賣�i�H����饻�г��y�O-�峹\">�i�A�y�[���]�U�^�j�o�Ǧa�賣�i�H����饻�г��y�O</h3>\n" +
"\n" +
"<img alt=\"��g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BByClun.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>��g�Z</span>\n" +
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
"<img alt=\"���󤣦P���i��w�w28���u���֡v���^��ӤuGap Year�A���ڧ��u�����w���ۤv\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjies.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=710&amp;y=225&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���󤣦P���i��w�w28���u���֡v���^��ӤuGap Year�A���ڧ��u�����w���ۤv - �� Common Wealth Magazine Group ����\" /> <div>\n" +
"<h3   aria-label=\"���󤣦P���i��w�w28���u���֡v���^��Ӥugap year�A���ڧ��u�����w���ۤv-�峹\">���󤣦P���i��w�w28���u���֡v���^��ӤuGap Year�A���ڧ��u�����w���ۤv</h3>\n" +
"\n" +
"<img alt=\"����u �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBluhS9.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"466\" data-m='{\"i\":466,\"p\":414,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"���d\"\n" +
"          data-section-id=\"stripe.health\"\n" +
"          data-section-id=\"stripe.health\">\n" +
"        <div class=\"healthfitness stripeouter\"  data-aop=\"stripe.health_stripe\"  data-id=\"467\" data-m='{\"i\":467,\"p\":19,\"n\":\"stripe.health\",\"t\":\"stripe\",\"o\":12}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"468\" data-m='{\"i\":468,\"p\":467,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.health.navigation_stripenavigation\"  data-id=\"469\" data-m='{\"i\":469,\"p\":467,\"n\":\"stripe.health.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"470\" data-m='{\"i\":470,\"p\":469,\"n\":\"���d\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/health\"  data-id=\"471\" data-m='{\"i\":471,\"p\":469,\"n\":\"���d\",\"y\":4,\"o\":2}'>���d</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"472\" data-m='{\"i\":472,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"���Ĵ��\",\"o\":3}'><a href=\"/zh-tw/health/search/filter?Filter=focus%7c10&amp;cluster=fitness\">���Ĵ��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"473\" data-m='{\"i\":473,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"���q�V�m\",\"o\":4}'><a href=\"/zh-tw/health/search/filter?Filter=type%7c1&amp;cluster=fitness\">���q�V�m</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"474\" data-m='{\"i\":474,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"�֩Դ���\",\"o\":5}'><a href=\"/zh-tw/health/search/filter?Filter=type%7c2&amp;cluster=fitness\">�֩Դ���</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"475\" data-m='{\"i\":475,\"p\":469,\"n\":\"listlink\",\"y\":4,\"l\":\"����\",\"o\":6}'><a href=\"/zh-tw/health/search/filter?Filter=type%7c3&amp;cluster=fitness\">����</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"476\" data-m='{\"i\":476,\"p\":469,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":7}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"477\" data-m='{\"i\":477,\"p\":469,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":8}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"478\" data-m='{\"i\":478,\"p\":469,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":9}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"479\" data-m='{\"i\":479,\"p\":469,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":10}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"480\" data-m='{\"i\":480,\"p\":469,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":11}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"���_�_�~���n�i�ȡH�s�⪨���԰O5�B�J��NG\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpcjf.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=313&amp;y=136&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���_�_�~���n�i�ȡH�s�⪨���԰O5�B�J��NG - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���_�_�~���n�i�ȡH�s�⪨���԰O5�B�J��ng-�峹\">���_�_�~���n�i�ȡH�s�⪨���԰O5�B�J��NG</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
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
"  aria-label=\"���d\" >\n" +
" \n" +
" <h2><a href=\"/zh-tw/health\" >���d</a></h2>\n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"486\" data-m='{\"i\":486,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBShcbq\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%ae%8a%e8%80%81%e9%9b%96%e7%84%b6%e9%80%a0%e6%88%90%e4%b8%8d%e5%ae%89%ef%bc%8c%e8%87%aa%e5%b7%b1%e5%89%b5%e9%80%a0%e4%ba%ba%e7%94%9f%e4%b8%8b%e5%8d%8a%e9%83%a8%e6%89%8d%e7%b2%be%e9%87%87/ar-BBShcbq?li=AA51Z6\"   aria-label=\"�ܦ����M�y�����w�A�ۤv�гy�H�ͤU�b���~���-�峹\">\n" +
"\n" +
"                    <h3>�ܦ����M�y�����w�A�ۤv�гy�H�ͤU�b���~���</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�������x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"487\" data-m='{\"i\":487,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphAh\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%85%ab%e6%ae%b5%e9%8c%a6%e5%a4%af%e4%bb%80%e9%ba%bc%ef%bc%9f%e8%88%92%e7%ad%8b%e6%b4%bb%e8%a1%80%e7%90%86%e6%b0%a3%ef%bc%8c6%e5%a4%a7%e5%bc%b7%e8%ba%ab%e5%8a%9f%e6%95%88%e5%a0%b1%e4%bd%a0%e7%9f%a5%ef%bc%81/ar-BBSphAh?li=AA51Z6\"   aria-label=\"�K�q�A�q����H�ε�����z��A6�j�j���\�ĳ��A���I-�峹\">\n" +
"\n" +
"                    <h3>�K�q�A�q����H�ε�����z��A6�j�j���\�ĳ��A���I</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"488\" data-m='{\"i\":488,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnkay\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e4%ba%ba%e8%94%98%e5%be%88%e8%a3%9c-%e4%bd%86%e9%80%998%e7%a8%ae%e4%ba%ba%e4%b8%8d%e9%81%a9%e5%90%88%e5%90%83/ar-BBSnkay?li=AA51Z6\"   aria-label=\"�H�x�ܸ� ���o8�ؤH���A�X�Y-�峹\">\n" +
"\n" +
"                    <h3>�H�x�ܸ� ���o8�ؤH���A�X�Y</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"489\" data-m='{\"i\":489,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm23r\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e7%99%b2%e7%99%87%e7%99%bc%e4%bd%9c%e6%80%8e%e9%ba%bc%e8%be%a6%ef%bc%9f%e8%aa%8d%e8%ad%98%e7%99%b2%e7%99%87%e6%80%a5%e6%95%918%e6%ad%a5%e9%a9%9f%e4%bf%9d%e5%91%bd/ar-BBSm23r?li=AA51Z6\"   aria-label=\"���w�o�@����H�{�����w���8�B�J�O�R-�峹\">\n" +
"\n" +
"                    <h3>���w�o�@����H�{�����w���8�B�J�O�R</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���w���d �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAdgxC6.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"490\" data-m='{\"i\":490,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSn9GS\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%bf%85%e9%80%9f%e7%b7%a9%e8%a7%a3%e8%b6%b3%e5%ba%95%e7%ad%8b%e8%86%9c%e7%82%8e%ef%bc%8c%e9%86%ab%e5%b8%ab%e5%a6%99%e6%96%b9%e7%ab%9f%e6%98%af%e3%80%8c%e7%a9%bf%e9%ab%98%e8%b7%9f%e9%9e%8b%e3%80%8d%ef%bc%9f/ar-BBSn9GS?li=AA51Z6\"   aria-label=\"���t�w�Ѩ����������A��v���賺�O�u�ﰪ��c�v�H-�峹\">\n" +
"\n" +
"                    <h3>���t�w�Ѩ����������A��v���賺�O�u�ﰪ��c�v�H</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�������x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"491\" data-m='{\"i\":491,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpgyX\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e6%88%91%e5%80%91%e9%83%bd%e5%90%83%e9%8c%af%e4%ba%86%ef%bc%9f%e9%80%99%e6%a8%a3%e5%90%83%e9%ab%98%e9%ba%97%e8%8f%9c%e6%89%8d%e6%9c%80%e6%9c%89%e6%95%88/ar-BBSpgyX?li=AA51Z6\"   aria-label=\"�ڭ̳��Y���F�H�o�˦Y���R��~�̦���-�峹\">\n" +
"\n" +
"                    <h3>�ڭ̳��Y���F�H�o�˦Y���R��~�̦���</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"492\" data-m='{\"i\":492,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSjnqo\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e6%b3%8c%e5%b0%bf%e7%a7%91%e9%86%ab%e5%b8%ab%e6%95%993%e6%8b%9b%e9%8d%9b%e9%8d%8a%e9%aa%a8%e7%9b%86%e5%ba%95%e8%82%8c%ef%bc%8c%e6%96%ac%e9%99%a4%e6%bc%8f%e5%b0%bf%e3%80%81%e9%a0%bb%e5%b0%bf%e7%85%a9%e6%83%b1/ar-BBSjnqo?li=AA51Z6\"   aria-label=\"�c������v��3�����尩�֩��١A�ٰ��|���B�W���дo-�峹\">\n" +
"\n" +
"                    <h3>�c������v��3�����尩�֩��١A�ٰ��|���B�W���дo</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���w���d �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAdgxC6.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"493\" data-m='{\"i\":493,\"p\":484,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp35j\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":9}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%a5%b9%e6%8b%89%e5%87%ba%e7%81%b0%e7%99%bd%e8%89%b2%e5%a4%a7%e4%be%bf-%e7%ab%9f%e7%bd%b9%e7%84%a1%e8%81%b2%e7%99%8c2%e6%9c%9f/ar-BBSp35j?li=AA51Z6\"   aria-label=\"�o�ԥX�ǥզ�j�K �����L�n��2��-�峹\">\n" +
"\n" +
"                    <h3>�o�ԥX�ǥզ�j�K �����L�n��2��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"  aria-label=\"���d\" >\n" +
" \n" +
" <h2><a href=\"/zh-tw/health\" >���d</a></h2>\n" +
" <div class=\"one-col\">\n" +
"  <ul  class=\"col\">\n" +
"  <li  class=\"hdlist  primary\"\n" +
"  data-id=\"496\" data-m='{\"i\":496,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYCE\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%90%8d%e9%86%ab40%e6%ad%b2%e5%be%8c%e9%a3%b2%e9%a3%9f%e6%b8%85%e5%96%ae%ef%bc%8c%e5%bf%85%e5%82%99%e7%b6%ad%e7%94%9f%e7%b4%a0d%e3%80%81%e9%a6%99%e8%95%89%e7%b6%a0%e6%8b%bf%e9%90%b5/ar-BBSoYCE?li=AA51Z6\"   aria-label=\"�W��G40���ᶼ���M��A���ƺ��ͯ�d�B�������K-�峹\">\n" +
"\n" +
"                    <h3>�W��G40���ᶼ���M��A���ƺ��ͯ�D�B�������K</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���w���d �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAdgxC6.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"497\" data-m='{\"i\":497,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSeeMx\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e9%9f%b3%e6%a8%82%e6%98%af%e8%89%af%e8%97%a5%ef%bc%81%e9%80%80%e4%bc%91%e7%9a%84%e4%bb%96%e9%87%8d%e6%8b%be%e6%a8%82%e5%99%a8%ef%bc%8c%e5%b1%85%e7%84%b6%e6%94%b9%e5%96%84%e5%81%a5%e5%bf%98%e3%80%81%e8%ae%8a%e5%be%97%e6%9b%b4%e5%81%a5%e5%ba%b7/ar-BBSeeMx?li=AA51Z6\"   aria-label=\"���֬O�}�ġI�h�𪺥L���B�־��A�~�M�ﵽ���ѡB�ܱo�󰷱d-�峹\">\n" +
"\n" +
"                    <h3>���֬O�}�ġI�h�𪺥L���B�־��A�~�M�ﵽ���ѡB�ܱo�󰷱d</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�������x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA3fudT.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"498\" data-m='{\"i\":498,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnhmH\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e3%80%8c%e8%b5%b7%e5%8f%b8%e8%87%89%e3%80%8d%e6%95%91%e4%ba%86%e5%a5%b9%e5%b9%b8%e9%81%8b%e6%8f%aa%e5%87%ba%e7%99%8c%e7%8e%8b/ar-BBSnhmH?li=AA51Z6\"   aria-label=\"�u�_�q�y�v�ϤF�o...���B���X����-�峹\">\n" +
"\n" +
"                    <h3>�u�_�q�y�v�ϤF�o...���B���X����</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"499\" data-m='{\"i\":499,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmZ2d\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%96%9d%e3%80%8c%e4%b9%b3%e6%b8%85%e8%9b%8b%e7%99%bd%e3%80%8d%e5%a2%9e%e8%82%8c-%e9%81%8e%e9%87%8f%e4%bd%bf%e7%94%a8%e6%81%90%e6%9a%b4%e8%82%a5/ar-BBSmZ2d?li=AA51Z6\"   aria-label=\"�ܡu�ŲM�J�աv�W�� �L�q�ϥή��ɪ�-�峹\">\n" +
"\n" +
"                    <h3>�ܡu�ŲM�J�աv�W�� �L�q�ϥή��ɪ�</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"500\" data-m='{\"i\":500,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmDUt\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%96%9d%e5%92%96%e5%95%a1%e6%9c%89%e7%a6%81%e5%bf%8c-%e5%b0%88%e5%ae%b6%e9%80%99%e6%99%82%e9%96%93%e5%8d%83%e8%90%ac%e5%88%a5%e5%96%9d/ar-BBSmDUt?li=AA51Z6\"   aria-label=\"�ܩ@�ئ��T�� �M�a�G�o�ɶ��d�U�O��-�峹\">\n" +
"\n" +
"                    <h3>�ܩ@�ئ��T�� �M�a�G�o�ɶ��d�U�O��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"501\" data-m='{\"i\":501,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSn9dN\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%82%9a%e8%87%8d%e5%86%b7%e6%98%93%e7%83%99%e8%b3%bd6%e9%83%a8%e4%bd%8d%e5%8f%97%e5%af%92%e6%81%90%e6%90%8d%e5%99%a8%e5%ae%98/ar-BBSn9dN?li=AA51Z6\"   aria-label=\"�{���N�����m �����o6������H���l���x-�峹\">\n" +
"\n" +
"                    <h3>�{���N�����m �����o6������H���l���x</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"502\" data-m='{\"i\":502,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoYy7\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e8%8f%a0%e8%8f%9c%ef%bc%8b%e8%b1%86%e8%85%90%ef%bc%9d%e8%85%8e%e7%b5%90%e7%9f%b3%ef%bc%9f%e7%87%9f%e9%a4%8a%e5%b8%ab%e7%a0%b4%e8%a7%a3%e5%8d%83%e5%8f%a4%e8%bf%b7%e6%80%9d%ef%bc%81/ar-BBSoYy7?li=AA51Z6\"   aria-label=\"�Ե�Ϩ��G�׵ǵ��ۡH��i�v�}�Ѥd�j�g��I-�峹\">\n" +
"\n" +
"                    <h3>�Ե�Ϩ��G�׵ǵ��ۡH��i�v�}�Ѥd�j�g��I</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"503\" data-m='{\"i\":503,\"p\":494,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoNV0\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":9}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/health/topic/%e5%86%ac%e5%ad%a3%e8%8d%89%e8%8e%93%e5%ae%89%e5%bf%83%e5%90%83-2%e4%bb%b6%e4%ba%8b%e6%9c%80%e9%87%8d%e8%a6%81/ar-BBSoNV0?li=AA51Z6\"   aria-label=\"�p��M�~�~���b�H�V�u����w�ߦY 2��Ƴ̭��n-�峹\">\n" +
"\n" +
"                    <h3>�p��M�~�~���b�H�V�u����w�ߦY 2��Ƴ̭��n</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�d�����x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<img alt=\"�ͪ��ް_����ʩI�l�I�ܡA�p��w���H\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoTea.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=414&amp;y=165&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ͪ��ް_����ʩI�l�I�ܡA�p��w���H - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�ͪ��ް_����ʩI�l�I�ܡA�p��w���H-�峹\">�ͪ��ް_����ʩI�l�I�ܡA�p��w���H</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"507\" data-m='{\"i\":507,\"p\":505,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoVql\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%b0%a3%e6%ba%ab%e9%a9%9f%e9%99%8d%e5%b0%8f%e5%bf%83%e8%85%a6%e4%b8%ad%e9%a2%a8-%e5%ae%b9%e6%98%93%e8%a2%ab%e5%bf%bd%e7%95%a5%e7%9a%845%e5%be%b5%e5%85%86/ar-BBSoVql?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoQMu.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����J���p�߸����� �e���Q������5�x�� - �� Common Wealth Magazine Group ����\" /> <div>\n" +
"<h3   aria-label=\"����J���p�߸����� �e���Q������5�x��-�峹\">����J���p�߸����� �e���Q������5�x��</h3>\n" +
"\n" +
"<img alt=\"�d�����x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�d�����x</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"508\" data-m='{\"i\":508,\"p\":505,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoLXP\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e9%ab%98%e8%a1%80%e8%84%82%e6%98%af%e5%bf%83%e8%82%8c%e6%a2%97%e5%a1%9e%e9%9a%b1%e5%bd%a2%e6%ae%ba%e6%89%8b%ef%bc%81%e5%90%b3%e6%98%8e%e7%8f%a0%e5%96%9d%e9%bb%83%e8%80%86%e9%a4%8a%e5%bf%83%e8%8c%b6%e6%b4%bb%e8%a1%80%e5%8c%96%e7%98%80/ar-BBSoLXP?li=AA51Z6\"  >\n" +
"<img alt=\"����i�次��Ʒ�]���U��w���ߦٱ��A�H�U����ܡu�C�C�i�߯��v�A�H���@�ߥަ�O�i�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoSWq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=573&amp;y=317&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����i�次��Ʒ�]���U��w���ߦٱ��A�H�U����ܡu�C�C�i�߯��v�A�H���@�ߥަ�O�i�C - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"����׬O�ߦٱ�����α���I�d���]�G�ܶ��Ͼi�߯�����Ʒ�-�峹\">����׬O�ߦٱ�����α���I�d���]�G�ܶ��Ͼi�߯�����Ʒ�</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
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
"<img alt=\"�ѪᲴ��M�ﵽ�A�p�ߥդ��٤W���I�X�{�o5�x���n���\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoXkp.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=495&amp;y=95&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ѪᲴ��M�ﵽ�A�p�ߥդ��٤W���I�X�{�o5�x���n��� - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�ѪᲴ��M�ﵽ�A�p�ߥդ��٤W���I�X�{�o5�x���n���-�峹\">�ѪᲴ��M�ﵽ�A�p�ߥդ��٤W���I�X�{�o5�x���n���</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"511\" data-m='{\"i\":511,\"p\":509,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGx7\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e7%88%b8%e5%aa%bd%e8%be%9b%e8%8b%a6%e4%ba%86%ef%bc%81%e5%86%8d%e5%bf%99%e4%b9%9f%e8%a6%81%e8%87%aa%e5%b7%b1%e7%85%ae-%e9%86%ab%e5%b0%8f%e5%bf%83%e5%ad%a9%e5%ad%90%e9%ae%ae%e4%b9%b3%e9%88%a3%e8%b3%aa%e9%9b%99%e4%b8%8d%e8%b6%b3/ar-BBSoGx7?li=AA51Z6\"  >\n" +
"<img alt=\"�c�l�p���E�Ұ|������a�|�ҡA�p�F��饻�A�b�����۷����A�šA�F����q�U�u�Ǯյ����k�v�A�N�A�ŭ����״��ɸ�̶��@�˭��n-�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoMIG.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=254&amp;y=136&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�c�l�p���E�Ұ|������a�|�ҡA�p�F��饻�A�b�����۷����A�šA�F����q�U�u�Ǯյ����k�v�A�N�A�ŭ����״��ɸ�̶��@�˭��n-�C - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�������W�F�I�A���]�n�ۤv�N ��G�p�߫Ĥl�A�Ŷt��������-�峹\">�������W�F�I�A���]�n�ۤv�N ��G�p�߫Ĥl�A�Ŷt��������</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"512\" data-m='{\"i\":512,\"p\":509,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmsUp\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e8%bf%91%e7%99%be%e4%ba%ba%e7%91%9e%e8%a9%b2%e6%89%8b%e8%a1%93%e5%97%8e%ef%bc%9f%e5%be%ae%e5%89%b5%e6%89%8b%e8%a1%93%e5%8a%a999%e6%ad%b2%e5%ac%a4%e6%88%b0%e5%8b%9d%e9%ab%96%e9%83%a8%e9%aa%a8%e6%8a%98/ar-BBSmsUp?li=AA51Z6\"  >\n" +
"<img alt=\"�쩳��������o���b������A�Ӥ������L�̱�����N�v���O�H\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmokH.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�쩳��������o���b������A�Ӥ������L�̱�����N�v���O�H - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"��ʤH��Ӥ�N�ܡH�L�Ф�N�U99�����Գ��b������-�峹\">��ʤH��Ӥ�N�ܡH�L�Ф�N�U99�����Գ��b������</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmIiq.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�`�N�I�ۧU�\�o2�ثC��u�A�ĶW�Сv - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�`�N�I�ۧU�\�o2�ثC��u�A�ĶW�Сv-�峹\">�`�N�I�ۧU�\�o2�ثC��u�A�ĶW�Сv</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmIuk.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=601&amp;y=191&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�Y�ɷs�D�j�饻�p�k���髬�����A�M�a�I�X�o���� - �� Nong Nong Magazine Co., Ltd. ����\" /> <div>\n" +
"<h3   aria-label=\"�i�Y�ɷs�D�j�饻�p�k���髬�����A�M�a�I�X�o����-�峹\">�i�Y�ɷs�D�j�饻�p�k���髬�����A�M�a�I�X�o����</h3>\n" +
"\n" +
"<img alt=\"�����_�_ �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBmWMqY.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����_�_</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"517\" data-m='{\"i\":517,\"p\":515,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmBmr\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e3%80%90%e7%84%a6%e9%bb%9e%e8%ad%b0%e9%a1%8c%e3%80%91%e4%b8%8d%e5%ad%95%e7%97%87%e6%b2%bb%e7%99%82%ef%bc%8c%e5%9c%93%e4%b8%80%e5%80%8b%e7%94%9f%e5%ad%a9%e5%ad%90%e7%9a%84%e5%a4%a2%ef%bc%81/ar-BBSmBmr?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmKA6.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�J�Iĳ�D�j�����g�v���A��@�ӥͫĤl���ڡI - �� Nong Nong Magazine Co., Ltd. ����\" /> <div>\n" +
"<h3   aria-label=\"�i�J�Iĳ�D�j�����g�v���A��@�ӥͫĤl���ڡI-�峹\">�i�J�Iĳ�D�j�����g�v���A��@�ӥͫĤl���ڡI</h3>\n" +
"\n" +
"<img alt=\"�����_�_ �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBmWMqY.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����_�_</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"518\" data-m='{\"i\":518,\"p\":515,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmloM\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e5%b0%8d%e6%8a%97%e8%85%a6%e9%83%a8%e8%80%81%e5%8c%96%e8%a6%81%e6%8a%97%e6%b0%a7%e5%8c%96%ef%bc%81%e7%a0%94%e7%a9%b6%e7%b6%ad%e7%94%9f%e7%b4%a0e%e8%83%bd%e5%bb%b6%e7%b7%a9%e9%98%bf%e8%8c%b2%e6%b5%b7%e9%bb%98%e7%97%87%e7%99%bc%e7%97%85/ar-BBSmloM?li=AA51Z6\"  >\n" +
"<img alt=\"��ܸ����Ѥƭn�ܮ�ơI��s�G���ͯ�E�ੵ�w�������q�g�o�f\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmeba.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��ܸ����Ѥƭn�ܮ�ơI��s�G���ͯ�E�ੵ�w�������q�g�o�f - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"��ܸ����Ѥƭn�ܮ�ơI��s�G���ͯ�e�ੵ�w�������q�g�o�f-�峹\">��ܸ����Ѥƭn�ܮ�ơI��s�G���ͯ�E�ੵ�w�������q�g�o�f</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
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
"<img alt=\"�g�`�V�����w�A�i��O��եX���D�I���o2�ʧ@�ۧ��ˬd\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmzey.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�g�`�V�����w�A�i��O��եX���D�I���o2�ʧ@�ۧ��ˬd - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�g�`�V�����w�A�i��O��եX���D�I���o2�ʧ@�ۧ��ˬd-�峹\">�g�`�V�����w�A�i��O��եX���D�I���o2�ʧ@�ۧ��ˬd</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"521\" data-m='{\"i\":521,\"p\":519,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp2w8\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e4%b8%80%e5%a4%a9%e5%86%b7%e5%b0%b1%e6%84%9f%e5%86%92%e3%80%81%e7%8b%82%e5%92%b3%e5%97%bd%ef%bc%9f%e4%b8%ad%e9%86%ab%e6%8f%ad%e8%ba%ab%e9%ab%94%e5%8f%af%e8%83%bd%e3%80%8c6%e5%80%8b%e9%83%a8%e4%bd%8d%e3%80%8d%e5%8f%97%e5%af%92/ar-BBSp2w8?li=AA51Z6\"  >\n" +
" <div>\n" +
"<h3   aria-label=\"�@�ѧN�N�P�_�B�g�y�¡H���崦����i��u6�ӳ���v���H-�峹\">�@�ѧN�N�P�_�B�g�y�¡H���崦����i��u6�ӳ���v���H</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"522\" data-m='{\"i\":522,\"p\":519,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1HN\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%89%be%e5%88%b0%e8%a1%b0%e8%80%81%e7%9a%84%e9%97%9c%e9%8d%b5%e4%ba%86%ef%bc%81%e8%a1%80%e6%b6%b2%e4%b8%ad%e3%80%8c%e9%80%99%e5%80%8b%e6%8c%87%e6%a8%99%e3%80%8d%e6%bf%83%e5%ba%a6%e9%80%8f%e9%9c%b2%e5%a4%b1%e8%83%bd%e6%a9%9f%e7%8e%87/ar-BBSp1HN?li=AA51Z6\"  >\n" +
" <div>\n" +
"<h3   aria-label=\"���I�Ѫ�����F�I��G���u�o�ӫ��Сv�@�׳z�S������v-�峹\">���I�Ѫ�����F�I��G���u�o�ӫ��Сv�@�׳z�S������v</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmP6G.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=551&amp;y=184&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�Y�ɷs�D�j��Z�ު���k�ʤ֦Y�B�N�A�߱����P���U�n�� - �� Nong Nong Magazine Co., Ltd. ����\" /> <div>\n" +
"<h3   aria-label=\"�i�Y�ɷs�D�j��Z�ު���k�ʤ֦Y�B�N�A�߱����P���U�n��-�峹\">�i�Y�ɷs�D�j��Z�ު���k�ʤ֦Y�B�N�A�߱����P���U�n��</h3>\n" +
"\n" +
"<img alt=\"�����_�_ �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBmWMqY.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����_�_</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm1iE.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=245&amp;y=115&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���C�ŤU��13�J�I�A���D�������n���u�ɸ�������k�v�ܡH - �� Common Wealth Magazine Group ����\" /> <div>\n" +
"<h3   aria-label=\"�N��Τ@�i���@�i�I�A���D�������n���u�ɸ�������k�v�ܡH-�峹\">�N��Τ@�i���@�i�I�A���D�������n���u�ɸ�������k�v�ܡH</h3>\n" +
"\n" +
"<img alt=\"�d�����x �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBFZkqb.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�d�����x</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"527\" data-m='{\"i\":527,\"p\":525,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSm2YZ\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e8%9c%82%e8%9c%9c%e6%aa%b8%e6%aa%ac%e8%bc%b8%e4%ba%86%ef%bc%81%e5%b7%a7%e5%85%8b%e5%8a%9b%e6%89%8d%e6%98%af%e6%ad%a2%e5%92%b3%e6%9c%80%e4%bd%b3%e8%a7%a3/ar-BBSm2YZ?li=AA51Z6\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPGnXs.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=257&amp;y=116&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�u�y��e�ݡv�O2�g�@���o�P�R�fĵ�T - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���e�f�c��F�I���J�O�~�O��y�̨θ�-�峹\">���e�f�c��F�I���J�O�~�O��y�̨θ�</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"528\" data-m='{\"i\":528,\"p\":525,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSlWvf\",\"h\":0,\"v\":\"health\",\"c\":\"topic\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/health/topic/%e6%97%a9%e9%a4%90%e4%b8%8d%e5%a4%a9%e7%84%b6%ef%bc%8c%e7%90%86%e6%89%80%e7%95%b6%e7%84%b6%ef%bc%9f/ar-BBSlWvf?li=AA51Z6\"  >\n" +
"<img alt=\"���ʽ\�����������~�ɡA�Ƿ|�����]�ˤW�������ХܡA�D��֦��y����b�г�����Clean Label�z�����~�A�N�O�Y���w�ߪ��n��k�C\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm4ph.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=315&amp;y=118&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ʽ\�����������~�ɡA�Ƿ|�����]�ˤW�������ХܡA�D��֦��y����b�г�����Clean Label�z�����~�A�N�O�Y���w�ߪ��n��k�C - �� PIN NETWORK CO LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���\���ѵM�A�z�ҷ�M�H-�峹\">���\���ѵM�A�z�ҷ�M�H</h3>\n" +
"\n" +
"<img alt=\"�ؤH���d�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBoaJ4b.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�ؤH���d��</span>\n" +
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
"<h3   aria-label=\"�p���G���U�H�o5�ؤ��G��Y�^�p�Z�y-�峹\">�p���G���U�H�o5�ؤ��G��Y�^�p�Z�y</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"531\" data-m='{\"i\":531,\"p\":467,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�B��\"\n" +
"          data-positions=\".sports .stripecontent .tertiary:nth-of-type(1) li:nth-child(3)\" data-section-id=\"stripe.sports\"\n" +
"          data-section-id=\"stripe.sports\">\n" +
"        <div class=\"sports stripeouter\"  data-aop=\"stripe.sports_stripe\"  data-id=\"532\" data-m='{\"i\":532,\"p\":19,\"n\":\"stripe.sports\",\"t\":\"stripe\",\"o\":13}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"533\" data-m='{\"i\":533,\"p\":532,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.sports.navigation_stripenavigation\"  data-id=\"534\" data-m='{\"i\":534,\"p\":532,\"n\":\"stripe.sports.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"535\" data-m='{\"i\":535,\"p\":534,\"n\":\"sports\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/sports\"  data-id=\"536\" data-m='{\"i\":536,\"p\":534,\"n\":\"sports\",\"y\":4,\"o\":2}'>�B��</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"537\" data-m='{\"i\":537,\"p\":534,\"n\":\"basketball_nba\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/sports/nba\">NBA</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"538\" data-m='{\"i\":538,\"p\":534,\"n\":\"baseball_mlb\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/sports/mlb\">MLB</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"539\" data-m='{\"i\":539,\"p\":534,\"n\":\"baseball_cpbl\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/sports/cpbl\">����¾��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"540\" data-m='{\"i\":540,\"p\":534,\"n\":\"baseball_npb\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/sports/npb\">�饻¾��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"541\" data-m='{\"i\":541,\"p\":534,\"n\":\"golf\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/sports/golf\">�����Ҳy</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"542\" data-m='{\"i\":542,\"p\":534,\"n\":\"tennis\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/sports/tennis\">���y</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"543\" data-m='{\"i\":543,\"p\":534,\"n\":\"soccer\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/sports/soccer\">���y</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"544\" data-m='{\"i\":544,\"p\":534,\"n\":\"racing_form_one\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/sports/formula1\">F1</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"545\" data-m='{\"i\":545,\"p\":534,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"546\" data-m='{\"i\":546,\"p\":534,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"547\" data-m='{\"i\":547,\"p\":534,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"548\" data-m='{\"i\":548,\"p\":534,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"549\" data-m='{\"i\":549,\"p\":534,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<h3   aria-label=\"�L�ѻ��ǳƴ_�X ���C�w���U�����o-�峹\">�L�ѻ��ǳƴ_�X ���C�w���U�����o</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
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
"     <a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e6%81%90%e6%b9%96%e7%97%87%ef%bc%9f%e5%a8%81%e5%b0%912%e6%88%b0%e7%8b%82%e6%89%9340%e9%90%b5/ar-BBSpvck?li=BBqiVh0\"   aria-label=\"����g�H�¤�2�Ԩg��40�K-�峹\">\n" +
"\n" +
"                    <h3>����g�H�¤�2�Ԩg��40�K</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"555\" data-m='{\"i\":555,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrGwd\",\"h\":0,\"v\":\"sports\",\"c\":\"tennis\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/tennis/%e6%be%b3%e7%b6%b2%ef%bc%8f%e6%89%93%e5%88%b0%e5%b0%8d%e6%89%8b%e9%83%bd%e9%bc%93%e6%8e%8c-%e8%ac%9d%e6%b7%91%e8%96%87%e8%b4%8f%e5%be%97%e5%b0%8a%e9%87%8d/ar-BBSrGwd?li=BBqiVh0\"   aria-label=\"�����ⳣ���x �²Q��Ĺ�o�L��-�峹\">\n" +
"\n" +
"                    <h3>�����ⳣ���x �²Q��Ĺ�o�L��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"556\" data-m='{\"i\":556,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrExW\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/baseball/%e9%9f%93%e8%81%b7%ef%bc%8f%e5%85%8d%e7%95%b6%e5%85%b5%e5%be%88%e8%a3%9c-%e5%90%b3%e6%99%ba%e7%85%a5%e5%8a%a0%e8%96%aa%e7%ad%89fa/ar-BBSrExW?li=BBqiVh0\"   aria-label=\"�K��L�ܸ� �d���إ[�~��fa-�峹\">\n" +
"\n" +
"                    <h3>�K��L�ܸ� �d���إ[�~��FA</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"557\" data-m='{\"i\":557,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpKPN\",\"h\":0,\"v\":\"sports\",\"c\":\"soccer\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/soccer/%e5%bd%b1%e3%80%8b%e7%94%b7%e8%b6%b3%e4%b8%ad%e5%a0%b4%e6%a0%b8%e5%bf%83-%e6%ba%ab%e6%99%ba%e8%b1%aa%e8%88%87%e5%8c%97%e6%8e%a7%e7%ba%8c%e7%b4%843%e5%b9%b4/ar-BBSpKPN?li=BBqiVh0\"   aria-label=\"�v�n�k�������֤� �Ŵ����P�_�����3�~-�峹\">\n" +
"\n" +
"                    <h3>�v�n�k�������֤� �Ŵ����P�_�����3�~</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"558\" data-m='{\"i\":558,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpQLS\",\"h\":0,\"v\":\"sports\",\"c\":\"tennis\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/tennis/%e6%8a%80%e5%a3%93%e5%9c%b0%e4%b8%bb%e9%81%b8%e6%89%8b-nadal%e4%b8%80%e7%9b%a4%e6%9c%aa%e5%a4%b1%e9%97%96%e6%be%b3%e7%b6%b216%e5%bc%b7/ar-BBSpQLS?li=BBqiVh0\"   aria-label=\"�����a�D��� nadal�@�L�������D��16�j-�峹\">\n" +
"\n" +
"                    <h3>�����a�D��� Nadal�@�L�������D��16�j</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"559\" data-m='{\"i\":559,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpx8F\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball_mlb\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/mlb/mlb%ef%bc%8f%e5%a4%a7%e8%b0%b7%e7%bf%94%e5%b9%b3%e6%9c%aa%e4%be%86-%e7%8e%8b%e8%b2%9e%e6%b2%bb%e6%9c%89%e5%bb%ba%e8%ad%b0/ar-BBSpx8F?li=BBqiVh0\"   aria-label=\"mlb���j���������� ���s�v����ĳ-�峹\">\n" +
"\n" +
"                    <h3>MLB���j���������� ���s�v����ĳ</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"560\" data-m='{\"i\":560,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSq6Xh\",\"h\":0,\"v\":\"sports\",\"c\":\"soccer\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/soccer/%e7%94%b7%e8%b6%b3%e3%80%8c%e8%8b%b1%e6%b4%be%e3%80%8d%e7%ba%8c%e9%9b%86-%e8%98%ad%e5%8d%a1%e6%96%af%e7%89%b9%e6%8e%a5%e6%8e%8c%e5%85%b5%e7%ac%a6/ar-BBSq6Xh?li=BBqiVh0\"   aria-label=\"�k���u�^���v�� ���d���S���x�L��-�峹\">\n" +
"\n" +
"                    <h3>�k���u�^���v�� ���d���S���x�L��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���ɹq�l�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5JhZL.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"561\" data-m='{\"i\":561,\"p\":553,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpPps\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/basketball/%e6%96%b0%e4%bb%bb%e5%a5%b6%e7%88%b8%e7%8e%8b%e7%9a%93%e5%90%89-%e9%a3%86%e7%94%9f%e6%b6%af%e6%96%b0%e9%ab%98%e9%80%80%e7%92%9e%e5%9c%92/ar-BBSpPps?li=BBqiVh0\"   aria-label=\"�s���������q�N �t�ͲP�s���h�\��-�峹\">\n" +
"\n" +
"                    <h3>�s���������q�N �t�ͲP�s���h�\��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"     <a href=\"/zh-tw/sports/mlb/mlb%ef%bc%8f%e9%99%b3%e5%81%89%e6%ae%b7%e5%b8%b6%e6%b5%81%e6%b5%aa%e7%8a%ac%e9%a3%9b%e7%be%8e%e5%9c%8b/ar-BBSpyEN?li=BBqiVh0\"   aria-label=\"mlb��������a�y����������-�峹\">\n" +
"\n" +
"                    <h3>MLB��������a�y����������</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"564\" data-m='{\"i\":564,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpUph\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/baseball/%e5%b4%87%e8%b6%8a%e5%86%8d%e8%a6%8b%e4%bf%9d%e9%80%81-%e5%90%88%e5%ba%ab2%e9%80%a3%e9%9c%b8%e5%8f%aa%e5%b7%ae%e4%b8%80%e6%ad%a5/ar-BBSpUph?li=BBqiVh0\"   aria-label=\"�R�V�A���O�e �X�w2�s�Q�u�t�@�B-�峹\">\n" +
"\n" +
"                    <h3>�R�V�A���O�e �X�w2�s�Q�u�t�@�B</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"565\" data-m='{\"i\":565,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrEnr\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball_nba\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e9%81%8b%e7%90%83%e5%83%8f%e5%9c%a8%e8%b7%b3%e8%88%9e-%e5%8e%84%e6%96%87%e6%88%b2%e8%80%8d%e5%b0%8d%e6%89%8b/ar-BBSrEnr?li=BBqiVh0\"   aria-label=\"nba���B�y���b���R �̤����A���-�峹\">\n" +
"\n" +
"                    <h3>NBA���B�y���b���R �̤����A���</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"566\" data-m='{\"i\":566,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpZm3\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/basketball/%e4%bd%90%e8%97%8d%e8%9e%8d%e5%85%a5%e9%87%91%e9%85%92%e4%bd%b3-%e9%81%94%e6%ac%a32%e9%80%a3%e6%88%b0%e7%8f%be%e7%96%b2%e6%85%8b/ar-BBSpZm3?li=BBqiVh0\"   aria-label=\"���ſĤJ���s�� �F�Y2�s�Բ{�h�A-�峹\">\n" +
"\n" +
"                    <h3>���ſĤJ���s�� �F�Y2�s�Բ{�h�A</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"567\" data-m='{\"i\":567,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp9GE\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/nba%ef%bc%8f%e5%8e%84%e6%96%87%e8%87%b4%e9%9b%bb%e8%a9%b9%e7%9a%87%e9%81%93%e6%ad%89-%e8%83%8c%e5%be%8c%e5%85%a7%e5%b9%95/ar-BBSp9GE?li=BBqiVh0\"   aria-label=\"�̤�P�q��ӹD�p �I�᤺��-�峹\">\n" +
"\n" +
"                    <h3>�̤�P�q��ӹD�p �I�᤺��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"568\" data-m='{\"i\":568,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpj1h\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/%e6%be%b3%e7%b6%b2%e5%a5%b3%e9%9b%99%e5%83%85%e8%8a%b165%e5%88%86%e9%90%98-%e8%a9%b9%e8%a9%a0%e7%84%b6%e8%a9%b9%e7%9a%93%e6%99%b4%e6%8c%ba%e9%80%b2%e7%ac%ac3%e8%bc%aa/ar-BBSpj1h?li=BBqiVh0\"   aria-label=\"�D���k���Ȫ�65���� ����M��q�����i��3��-�峹\">\n" +
"\n" +
"                    <h3>�D���k���Ȫ�65���� ����M��q�����i��3��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5Iv9i.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"569\" data-m='{\"i\":569,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoGWC\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/%e7%be%bd%e7%90%83%ef%bc%8f%e6%88%b4%e8%b3%87%e7%a9%8e%e8%b2%bc%e5%bf%83%e5%b0%8f%e5%8b%95%e4%bd%9c-%e7%b6%b2%e5%8f%8b%e7%8b%82%e8%ae%9a%ef%bc%81/ar-BBSoGWC?li=BBqiVh0\"   aria-label=\"����o�K�ߤp�ʧ@ ���ͨg�g�I-�峹\">\n" +
"\n" +
"                    <h3>����o�K�ߤp�ʧ@ ���ͨg�g�I</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"570\" data-m='{\"i\":570,\"p\":562,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSphgn\",\"h\":0,\"v\":\"sports\",\"c\":\"allcompetitions\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/sports/sports-index/%e6%9a%b4%e9%be%8dsiakam%e6%9c%80%e5%be%8c%e4%b8%80%e6%93%8a%e7%b5%95%e6%ae%ba-%e5%b0%8d%e6%89%8b%e4%b9%9f%e6%84%8f%e5%a4%96/ar-BBSphgn?li=BBqiVh0\"   aria-label=\"���ssiakam�̫�@������ ���]�N�~-�峹\">\n" +
"\n" +
"                    <h3>���sSiakam�̫�@������ ���]�N�~</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"TSNA �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBDPlus.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<img alt=\"�����s�s�q�u�ȱd�]Pascal Siakam�^��i�P������W�x�����Ӷ��C�]�ϡ�½��۱��S�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpd86.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=175&amp;y=105&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����s�s�q�u�ȱd�]Pascal Siakam�^��i�P������W�x�����Ӷ��C�]�ϡ�½��۱��S�^ - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�i�R���� �L��i�P������y-�峹\">�i�R���� �L��i�P������y</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"574\" data-m='{\"i\":574,\"p\":572,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp0ln\",\"h\":0,\"v\":\"sports\",\"c\":\"baseball_mlb\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/sports/mlb/mlb%ef%bc%8f%e6%9b%be%e8%aa%87%e5%8f%a3%e8%83%bd%e4%b8%89%e6%8c%af%e8%b2%9d%e6%af%94%e9%ad%af%e6%96%af-%e5%a6%82%e4%bb%8a%e4%bb%96%e8%a2%ab%e6%b4%8b%e5%9f%ba%e9%87%8d%e9%87%91%e7%b0%bd%e4%b8%8b/ar-BBSp0ln?li=BBqiVh0\"  >\n" +
"<img alt=\"Adam Ottavino�ඤ�ܬv��]�ϡ����p�����F�Ӽv���^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoYgn.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=651&amp;y=150&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Adam Ottavino�ඤ�ܬv��]�ϡ����p�����F�Ӽv���^ - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"���ؤf��T������|�� �p���L�Q�v�򭫪�ñ�U-�峹\">���ؤf��T������|�� �p���L�Q�v�򭫪�ñ�U</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"575\" data-m='{\"i\":575,\"p\":572,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSoZIX\",\"h\":0,\"v\":\"sports\",\"c\":\"basketball_nba\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/sports/nba/nba%ef%bc%8f%e4%b9%9f%e5%a4%aa%e5%a4%a9%ef%bc%81-%e4%bb%96%e4%b8%8a%e5%a0%b4%e5%bf%98%e8%a8%98%e7%a9%bf%e7%90%83%e8%a4%b2/ar-BBSoZIX?li=BBqiVh0\"  >\n" +
"<img alt=\"����H�������Q�]Michael Beasley�^�ǳƴ��ɤW���o�{�ۤv�ѰO��y�ǡC�]�ϡ�½���House of Highlights�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoXaO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=226&amp;y=86&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"����H�������Q�]Michael Beasley�^�ǳƴ��ɤW���o�{�ۤv�ѰO��y�ǡC�]�ϡ�½���House of Highlights�^ - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�]�ӤѡI�L�W�����ѰO��y�� �Q���{�{��live����-�峹\">�]�ӤѡI�L�W�����ѰO��y�� �Q���{�{��Live����</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"576\" data-m='{\"i\":576,\"p\":532,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�T��\"\n" +
"          data-positions=\".autos .stripecontent .tertiary li:nth-child(3)\" data-section-id=\"stripe.autos\"\n" +
"          data-section-id=\"stripe.autos\">\n" +
"        <div class=\"autos stripeouter\"  data-aop=\"stripe.autos_stripe\"  data-id=\"577\" data-m='{\"i\":577,\"p\":19,\"n\":\"stripe.autos\",\"t\":\"stripe\",\"o\":14}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"578\" data-m='{\"i\":578,\"p\":577,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.autos.navigation_stripenavigation\"  data-id=\"579\" data-m='{\"i\":579,\"p\":577,\"n\":\"stripe.autos.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"580\" data-m='{\"i\":580,\"p\":579,\"n\":\"autos\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/autos\"  data-id=\"581\" data-m='{\"i\":581,\"p\":579,\"n\":\"autos\",\"y\":4,\"o\":2}'>�T��</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"582\" data-m='{\"i\":582,\"p\":579,\"n\":\"autosnews\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/autos/news\">�s�D�`��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"583\" data-m='{\"i\":583,\"p\":579,\"n\":\"autosBuying\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/autos/buying\">�ʨ�����</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"584\" data-m='{\"i\":584,\"p\":579,\"n\":\"autosEnthusiasts\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/autos/enthusiasts\">�ɯŧ��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"585\" data-m='{\"i\":585,\"p\":579,\"n\":\"autosracing\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/autos/racing\">�ɨ��ʺA</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"586\" data-m='{\"i\":586,\"p\":579,\"n\":\"gallery\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/autos/gallery\">��m�Ͽ�</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"587\" data-m='{\"i\":587,\"p\":579,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":8}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"588\" data-m='{\"i\":588,\"p\":579,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":9}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"589\" data-m='{\"i\":589,\"p\":579,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":10}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"590\" data-m='{\"i\":590,\"p\":579,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":11}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"591\" data-m='{\"i\":591,\"p\":579,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":12}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoZpW.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=355&amp;y=313&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�q�w�t�����Ш�����-3�r���P��� BMW���s3�t�C�~��W���i���S���j - �� Next Media Publishing Limited ����\" /> <div>\n" +
"<h3   aria-label=\"���P��� bmw���s3�t�C�~��W��-�峹\">���P��� BMW���s3�t�C�~��W��</h3>\n" +
"\n" +
"<img alt=\"���g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���g�Z</span>\n" +
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
"     <a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e5%9b%9b%e7%92%b0%e6%97%97%e8%89%a6%e9%81%8b%e5%8b%95%e4%bc%91%e6%97%85%ef%bc%8caudi-q8%e5%af%a6%e8%bb%8a%e8%b3%9e%e6%9e%90/ar-BBSp2Gf?li=AAivr37\"   aria-label=\"2019�s�[�Y���i�G�|���Xĥ�B�ʥ�ȡAaudi q8�ꨮ��R-�峹\">\n" +
"\n" +
"                    <h3>2019�s�[�Y���i�G�|���Xĥ�B�ʥ�ȡAAudi Q8�ꨮ��R</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"597\" data-m='{\"i\":597,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1Lg\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e5%be%b7%e7%b3%bb%e4%b8%ad%e5%9e%8b%e6%88%bf%e8%bb%8a%e5%a4%a7%e6%88%b0-1%e5%8b%95%e5%8a%9b%e9%80%b2%e5%8c%96-mbenz-c-200%e5%b0%8f%e6%94%b9%e6%ac%be%e8%a9%a6%e9%a7%95%e3%80%90%e5%a3%b9%e7%89%b9%e5%a0%b1%e3%80%91/ar-BBSp1Lg?li=AAivr37\"   aria-label=\"�ʤO�i�� m.benz c 200�p��ڸվr-�峹\">\n" +
"\n" +
"                    <h3>�ʤO�i�� M.Benz C 200�p��ڸվr</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"598\" data-m='{\"i\":598,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp1Ld\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e5%be%b7%e7%b3%bb%e4%b8%ad%e5%9e%8b%e6%88%bf%e8%bb%8a%e4%b9%8b%e6%88%b0-2%e6%ac%b2%e5%bc%b7%e5%89%87%e5%bc%b7-bmw%e8%88%87audi%e5%85%a8%e5%8a%9b%e4%bf%83%e9%8a%b7%e5%8f%8d%e6%93%8a%e3%80%90%e5%a3%b9%e7%89%b9%e5%a0%b1%e3%80%91/ar-BBSp1Ld?li=AAivr37\"   aria-label=\"�J�j�h�j�Ibmw�Paudi���O�P�P����-�峹\">\n" +
"\n" +
"                    <h3>�J�j�h�j�IBMW�PAudi���O�P�P����</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"���g�Z �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPcytw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"599\" data-m='{\"i\":599,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmXKh\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":4}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e4%ba%a4%e9%80%9a%e9%83%a8%e7%99%bc479%e8%90%ac%e7%b4%85%e5%8c%85-%e6%a9%9f%e8%bb%8aabs%e8%a3%9c%e5%8a%a9%e6%ac%be%e6%8f%90%e6%97%a9%e7%99%bc%e6%94%be/ar-BBSmXKh?li=AAivr37\"   aria-label=\"��q���o479�U���] ����abs�ɧU�ڴ����o��-�峹\">\n" +
"\n" +
"                    <h3>��q���o479�U���] ����ABS�ɧU�ڴ����o��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"600\" data-m='{\"i\":600,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSp05S\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":5}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e5%8c%97%e7%be%8e%e8%bb%8a%e5%b1%95%e8%b3%bd%e8%bb%8a%e6%96%b0%e5%8b%a2%e5%8a%9b%ef%bc%81hyundai-veloster-n-tcr%e6%ad%a3%e5%bc%8f%e4%ba%ae%e7%9b%b8/ar-BBSp05S?li=AAivr37\"   aria-label=\"2019�_�����i�G�ɨ��s�դO�Ihyundai veloster n tcr�����G��-�峹\">\n" +
"\n" +
"                    <h3>2019�_�����i�G�ɨ��s�դO�IHyundai Veloster N TCR�����G��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"601\" data-m='{\"i\":601,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmJJN\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":6}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e5%8c%97%e7%be%8e%e8%bb%8a%e5%b1%95n-line%e8%bb%8a%e5%9e%8b%e9%a6%96%e5%ba%a6%e8%b8%8f%e4%b8%8a%e7%be%8e%e5%9c%8b%ef%bc%8chyundai%e7%99%bc%e8%a1%a8elantra-gt-n-line/ar-BBSmJJN?li=AAivr37\"   aria-label=\"2019�_�����i�Gn line�������׽�W����Ahyundai�o��elantra gt n line-�峹\">\n" +
"\n" +
"                    <h3>2019�_�����i�GN Line�������׽�W����AHyundai�o��Elantra GT N Line</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"602\" data-m='{\"i\":602,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmIpL\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":7}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/%e9%9b%bb%e8%bb%8a%e9%ad%85%e5%8a%9b%e5%a4%af-300%e5%a4%9a%e4%ba%ba%e6%90%b6%e8%b3%bcporsche%e7%b4%94%e9%9b%bb%e8%b7%91%e8%bb%8a/ar-BBSmIpL?li=AAivr37\"   aria-label=\"�¹q�]���q�Iporsche taycan �x�W�q��}�T�ʱi-�峹\">\n" +
"\n" +
"                    <h3>�¹q�]���q�IPorsche Taycan �x�W�q��}�T�ʱi</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
"                    </span>\n" +
"    </a>\n" +
"\n" +
" \n" +
"</li>\n" +
" <li  class=\"hdlist  primary\"\n" +
"  data-id=\"603\" data-m='{\"i\":603,\"p\":595,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmjln\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":8}'\n" +
" >\n" +
" \n" +
"     <a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e5%80%bc%e5%be%97%e7%ad%89%e5%be%85%e7%9a%84%e7%91%9e%e5%85%b8%e4%bf%8a%e4%bf%8f%e8%b7%91%e6%88%bf%e8%bb%8a%ef%bc%8cvolvo-%e7%ac%ac%e4%b8%89%e4%bb%a3-s60-t5-%e4%ba%9e%e5%a4%aa%e5%8d%80%e5%9f%9f%e9%a6%96%e5%ba%a6%e4%ba%ae%e7%9b%b8/ar-BBSmjln?li=AAivr37\"   aria-label=\"2019�s�[�Y���i�G�ȱo���ݪ����T�N�]�Ш��Avolvo �ĤT�N s60 t5 �ȤӰϰ쭺�׫G��-�峹\">\n" +
"\n" +
"                    <h3>2019�s�[�Y���i�G�ȱo���ݪ����T�N�]�Ш��AVolvo �ĤT�N S60 T5 �ȤӰϰ쭺�׫G��</h3>\n" +
"                    <span class=\"sourcename\">\n" +
"                        <img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
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
"<img alt=\"2019-mazda3-sedan\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJIb.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"IMG_2534.JPG - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"2019�s�[�Y���i�Gmazda 3 sedan �m���n���I-�峹\">2019�s�[�Y���i�GMazda 3 Sedan �m���n���I</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"607\" data-m='{\"i\":607,\"p\":605,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSnhXv\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e4%bd%a0%e4%bf%a1%e4%b8%8d%e4%bf%a1%e6%88%91%e6%89%93%e4%bd%a0%ef%bc%9f%e6%83%a1%e9%84%b0%e6%9a%b4%e5%8a%9b%e5%81%9c%e8%bb%8a%e9%9a%aa%e6%8f%8d%e4%ba%ba/ar-BBSnhXv?li=AAivr37\"  >\n" +
"<img alt=\"���������Q�h 8/1�_��v�϶g�餣���O\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBL8syq.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���������Q�h 8/1�_��v�϶g�餣���O - ������\" /> <div>\n" +
"<h3   aria-label=\"�A�H���H�ڥ��A�H�c�F�ɤO�����I�~�H-�峹\">�A�H���H�ڥ��A�H�c�F�ɤO�����I�~�H</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"608\" data-m='{\"i\":608,\"p\":605,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmjmv\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/2019%e6%96%b0%e5%8a%a0%e5%9d%a1%e8%bb%8a%e5%b1%95%e6%9b%b4%e5%b9%b4%e8%bc%95%e5%a4%a7%e6%b0%a3%e7%9a%84%e4%b8%89%e6%8e%92%e4%b8%83%e4%ba%ba%e5%ba%a7suv%ef%bc%8chyundai-%e7%ac%ac%e5%9b%9b%e4%bb%a3-santa-fe-%e5%af%a6%e8%bb%8a%e8%b3%9e%e6%9e%90/ar-BBSmjmv?li=AAivr37\"  >\n" +
"<img alt=\"2019-suv-hyundai-santa-fe\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmqcu.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2019-suv-hyundai-santa-fe - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"2019�s�[�Y���i�G��~���j�𪺤T�ƤC�H�ysuv�Ahyundai �ĥ|�N santa fe �ꨮ��R-�峹\">2019�s�[�Y���i�G��~���j�𪺤T�ƤC�H�ySUV�AHyundai �ĥ|�N Santa Fe �ꨮ��R</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
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
"<img alt=\"��2.108�~1��8��08��41����5�_�V15.6K�ۤp�Ȩ����N���A�^��4.5����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmX4z.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��2.108�~1��8��08��41����5�_�V15.6K�ۤp�Ȩ����N���A�^��4.5���� - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�i���G�S�O�i�p�߶˲��] �p�Ȩ���϶O3��_3�d�_��-�峹\">�i���G�S�O�i�p�߶˲��] �p�Ȩ���϶O3��_3�d�_��</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"612\" data-m='{\"i\":612,\"p\":610,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSofkI\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e7%9c%8b%e4%ba%86%e6%9c%83%e7%86%b1%e8%a1%80%e7%9a%84leaf-nismo-rc326hp%e7%9a%84%e7%99%be%e9%87%8c%e5%8a%a0%e9%80%9f%e5%8f%aa%e8%a6%8134%e7%a7%92/ar-BBSofkI?li=AAivr37\"  >\n" +
"<img alt=\"�ݤF�|���媺Leaf Nismo RC326hp���ʨ��[�t�u�n3.4��....\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSo8qX.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ݤF�|���媺Leaf Nismo RC326hp���ʨ��[�t�u�n3.4��.... - �� PROTO Taiwan Co. Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�ݤF�|���媺leaf nismo rc326hp���ʨ��[�t�u�n3.4��....-�峹\">�ݤF�|���媺Leaf Nismo RC326hp���ʨ��[�t�u�n3.4��....</h3>\n" +
"\n" +
"<img alt=\"���T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBeTHK.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���T��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"613\" data-m='{\"i\":613,\"p\":610,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmJIf\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/vision-x-%e5%be%9e%e6%a6%82%e5%bf%b5%e5%8c%96%e4%bd%9c%e9%87%8f%e7%94%a2%ef%bc%8cskoda-%e6%97%97%e4%b8%8b%e6%9c%80%e5%85%a5%e9%96%80-suv-%e5%8d%b3%e5%b0%87%e6%96%bc-2019-%e6%97%a5%e5%85%a7%e7%93%a6%e8%bb%8a%e5%b1%95%e5%89%8d%e5%a4%95%e5%95%8f%e4%b8%96%ef%bc%81/ar-BBSmJIf?li=AAivr37\"  >\n" +
"<img alt=\"vision-x-skoda-suv-2019\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJHp.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"vision-x-skoda-suv-2019 - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"vision x �q�����Ƨ@�q���Askoda �X�U�̤J�� suv �Y�N�� 2019 �餺�˨��i�e�i�ݥ@�I-�峹\">Vision X �q�����Ƨ@�q���ASkoda �X�U�̤J�� SUV �Y�N�� 2019 �餺�˨��i�e�i�ݥ@�I</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
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
"<img alt=\"�̲z�ʪ��ɨ� Lexus UX 250h\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmeI0.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�̲z�ʪ��ɨ� Lexus UX 250h - �� isCar! ����\" /> <div>\n" +
"<h3   aria-label=\"�̲z�ʪ��ɨ� lexus ux 250h-�峹\">�̲z�ʪ��ɨ� Lexus UX 250h</h3>\n" +
"\n" +
"<img alt=\"isCar! �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/CCelz1.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>isCar!</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"616\" data-m='{\"i\":616,\"p\":614,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmCxf\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%85%a8%e6%96%b0mazda3%e5%90%8c%e7%b4%9a%e4%b9%8b%e6%9c%80%ef%bc%8c%e6%8e%a1%e7%94%a8%e5%85%a8%e7%90%83%e9%a6%96%e5%89%b51310-mpa%e9%ab%98%e5%bc%b7%e5%ba%a6%e9%8b%bc%e6%9d%90%e5%86%b7%e6%b2%96%e5%a3%93%e8%bb%8a%e8%ba%ab%e7%b5%90%e6%a7%8b/ar-BBSmCxf?li=AAivr37\"  >\n" +
"<img alt=\"mazda3-1-310-mpa\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmjkr.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"mazda3-1-310-mpa - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���smazda3�P�Ť��̡A�ĥΥ��y����1,310 mpa���j�׿����N�R���������c-�峹\">���sMazda3�P�Ť��̡A�ĥΥ��y����1,310 MPa���j�׿����N�R���������c</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"617\" data-m='{\"i\":617,\"p\":614,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmP64\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/%e5%a4%96%e8%a7%80%e5%85%a7%e8%a3%9d%e5%be%ae%e6%95%b4%e5%bd%a2%e3%80%81%e6%8f%90%e5%8d%87%e6%b2%b9%e8%80%97%e8%87%b3-224-km-l%ef%bc%8chyundai-ioniq-hybrid-plug-in-hybrid-%e5%b0%8f%e6%94%b9%e6%ac%be%e9%9f%93%e5%9c%8b%e7%99%bc%e5%94%ae/ar-BBSmP64?li=AAivr37\"  >\n" +
"<img alt=\"22-4-km-l-hyundai-ioniq-hybrid-plug-in-hybrid\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmFXc.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"22-4-km-l-hyundai-ioniq-hybrid-plug-in-hybrid - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�~�[���˷L��ΡB���ɪo�Ӧ� 22.4 km/l�Ahyundai ioniq hybrid/plug-in hybrid �p�������o��-�峹\">�~�[���˷L��ΡB���ɪo�Ӧ� 22.4 km/l�AHyundai IONIQ Hybrid/Plug-In Hybrid �p�������o��</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
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
"<img alt=\"�ִ��q�ʨ��n�ӤF�ܡ@���ڲ��ʦ��ֳt�����R�q���{��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjvaD.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=2136&amp;y=1947&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ִ��q�ʨ��n�ӤF�� ���ڲ��ʦ��ֳt�����R�q���{�� - �� NOWnews Network Co.,Ltd ����\" /> <div>\n" +
"<h3   aria-label=\"�ִ��q�ʨ��n�ӤF�H���ڧֳt�����R�q���{��-�峹\">�ִ��q�ʨ��n�ӤF�H���ڧֳt�����R�q���{��</h3>\n" +
"\n" +
"<img alt=\"NOWnews �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBEKTpt.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>NOWnews</span>\n" +
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
"<img alt=\"mclaren-600lt-spider\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmjkt.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"mclaren-600lt-spider - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"���ѪŵL���өb�Imclaren 600lt spider�����G��(�����v��)-�峹\">���ѪŵL���өb�IMcLaren 600LT Spider�����G��(�����v��)</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"622\" data-m='{\"i\":622,\"p\":620,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmZWL\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/porsche-top5%e7%b3%bb%e5%88%97%e6%9c%80%e6%96%b0%e5%bd%b1%e7%89%87%e6%8f%ad%e7%a4%ba919-hybrid-evo%e7%9a%84%e4%ba%94%e9%a0%85%e5%bc%b7%e8%99%95/ar-BBSmZWL?li=AAivr37\"  >\n" +
"<img alt=\"porsche-top5-919-hybrid-evo\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmQR2.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"porsche-top5-919-hybrid-evo - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"porsche top5�t�C�̷s�v������919 hybrid evo�������j�B-�峹\">Porsche Top5�t�C�̷s�v������919 Hybrid EVO�������j�B</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"623\" data-m='{\"i\":623,\"p\":620,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmqdy\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/mini-60%e5%91%a8%e5%b9%b4%e7%b4%80%e5%bf%b5%e7%89%88%e9%9a%86%e9%87%8d%e6%8e%a8%e5%87%ba%ef%bc%81-%e5%85%a7%e6%9c%89%e5%bd%b1%e7%89%87/ar-BBSmqdy?li=AAivr37\"  >\n" +
"<img alt=\"mini-60\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJHu.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"mini-60 - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"mini 60�P�~�������������X�I(�����v��)-�峹\">MINI 60�P�~�������������X�I(�����v��)</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
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
"<img alt=\"golf-gti-volkswagen-golf-gti-tcr\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmJHn.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"golf-gti-volkswagen-golf-gti-tcr - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"��t�X�~�̱jgolf gti�Ivolkswagen golf gti tcr�q���������G��-�峹\">��t�X�~�̱jGolf GTI�IVolkswagen Golf GTI TCR�q���������G��</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"626\" data-m='{\"i\":626,\"p\":624,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSlVdb\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/autos/news/3%e5%80%8b%e7%8d%8e%e9%a0%85%e5%9b%8a%e6%8b%ac2%e5%80%8b%e5%86%a0%e8%bb%8d%ef%bc%81hyundai%e6%88%90%e7%82%ba2019%e5%8c%97%e7%be%8e%e5%b9%b4%e5%ba%a6%e9%a2%a8%e9%9b%b2%e8%bb%8a%e6%9c%80%e5%a4%a7%e8%b4%8f%e5%ae%b6/ar-BBSlVdb?li=AAivr37\"  >\n" +
"<img alt=\"3-2-hyundai-2019\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSlVd8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=440&amp;y=628&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2.jpg - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�n�A2�a�Ihyundai ����2019�~�׭������̤jĹ�a-�峹\">�n�A2�a�IHyundai ����2019�~�׭������̤jĹ�a</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"627\" data-m='{\"i\":627,\"p\":624,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSmgYW\",\"h\":0,\"v\":\"autos\",\"c\":\"autosnews\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/autos/news/2019-vw-tiguan-offroad%e7%89%b9%e5%bc%8f%e7%89%88%e5%a4%96%e8%a7%80%e5%88%86%e6%9e%90%e7%af%87/ar-BBSmgYW?li=AAivr37\"  >\n" +
"<img alt=\"2019-vw-tiguan-offroad\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSmg0M.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"2019-vw-tiguan-offroad - �� Carstuff Auto-media LTD ����\" /> <div>\n" +
"<h3   aria-label=\"2019 vw tiguan offroad�S�����~�[���R�g-�峹\">2019 VW Tiguan Offroad�S�����~�[���R�g</h3>\n" +
"\n" +
"<img alt=\"�H���� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA2KjKw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�H����</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjR6d.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�յP��������D ���h�Q���d�����_�� - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�յP��������D ���h�Q���d�����_��-�峹\">�յP��������D ���h�Q���d�����_��</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"<img alt=\"���j�����������]�ϡ�½��Youtube�^\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSjG5z.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���j�����������]�ϡ�½��Youtube�^ - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�j���������h�j�H����v�����A��-�峹\">�j���������h�j�H����v�����A��</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"632\" data-m='{\"i\":632,\"p\":577,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�v��\"\n" +
"          data-section-id=\"stripe.video\"\n" +
"          data-section-id=\"stripe.video\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.video_stripe\"  data-id=\"633\" data-m='{\"i\":633,\"p\":19,\"n\":\"stripe.video\",\"t\":\"stripe\",\"o\":15}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"634\" data-m='{\"i\":634,\"p\":633,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.video.navigation_stripenavigation\"  data-id=\"635\" data-m='{\"i\":635,\"p\":633,\"n\":\"stripe.video.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"636\" data-m='{\"i\":636,\"p\":635,\"n\":\"video\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/video\"  data-id=\"637\" data-m='{\"i\":637,\"p\":635,\"n\":\"video\",\"y\":4,\"o\":2}'>�v��</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"638\" data-m='{\"i\":638,\"p\":635,\"n\":\"entertainment\",\"y\":4,\"o\":3}'><a href=\"/zh-tw/video/entertainment\">�T��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"639\" data-m='{\"i\":639,\"p\":635,\"n\":\"news\",\"y\":4,\"o\":4}'><a href=\"/zh-tw/video/news\">�s�D</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"640\" data-m='{\"i\":640,\"p\":635,\"n\":\"viral\",\"y\":4,\"o\":5}'><a href=\"/zh-tw/video/viral\">�s�_</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"641\" data-m='{\"i\":641,\"p\":635,\"n\":\"�Ȧ�\",\"y\":4,\"o\":6}'><a href=\"/zh-tw/travel/video/\">�Ȧ�</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"642\" data-m='{\"i\":642,\"p\":635,\"n\":\"sports\",\"y\":4,\"o\":7}'><a href=\"/zh-tw/video/sports\">�B��</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"643\" data-m='{\"i\":643,\"p\":635,\"n\":\"healthandfitness\",\"y\":4,\"o\":8}'><a href=\"/zh-tw/video/healthandfitness\">���d</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"644\" data-m='{\"i\":644,\"p\":635,\"n\":\"military\",\"y\":4,\"o\":9}'><a href=\"/zh-tw/video/military\">�x��</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"645\" data-m='{\"i\":645,\"p\":635,\"n\":\"seeallvideos\",\"y\":4,\"o\":10}'><a href=\"/zh-tw/video/browse/mostwatchedtoday\">���v���`��</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"646\" data-m='{\"i\":646,\"p\":635,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":11}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"647\" data-m='{\"i\":647,\"p\":635,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":12}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"648\" data-m='{\"i\":648,\"p\":635,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":13}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"649\" data-m='{\"i\":649,\"p\":635,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":14}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"650\" data-m='{\"i\":650,\"p\":635,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":15}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"�޲z�����q �����Τ߬ݱo��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrDgj.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�޲z�����q �����Τ߬ݱo�� - �� CNA ����\" /> <div>\n" +
"<h3   aria-label=\"�޲z�����q �����Τ߬ݱo��-�v��\">�޲z�����q �����Τ߬ݱo��</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
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
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSr2EB.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=950&amp;y=400&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"������ˤW���@�d�L�G�ګܩʷP Thumbnail\" /> <div>\n" +
"<h3   aria-label=\"������ˤW���@�d�L�G�ګܩʷP-�v��\">������ˤW���@�d�L�G�ګܩʷP</h3>\n" +
"\n" +
"<img alt=\"wikienter �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBqbgYI.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>wikienter</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"657\" data-m='{\"i\":657,\"p\":655,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBS3BLX\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e9%9b%bb%e5%bd%b1%e3%80%8a%e8%ad%89%e4%ba%ba%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e9%84%ad%e9%9b%a8%e7%9b%9b%e9%80%8f%e9%9c%b2%e5%9b%a0%e6%8b%8d%e6%94%9d%e9%97%9c%e4%bf%82%e7%89%87%e5%a0%b4%e8%a6%81%e9%95%b7%e6%9c%9f%e6%ba%96%e5%82%99%e3%80%8c%e6%b0%a7%e6%b0%a3%e5%91%bc%e5%90%b8%e6%a9%9f%e3%80%8d%ef%bc%9f%ef%bc%81/vi-BBS3BLX\"  >\n" +
"<img alt=\"�i�q�v�m�ҤH�n�o�G�|�j�G�B���z�S�]�������Y�����n�����ǳơu���I�l���v�H�I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS3mJ8.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=723&amp;y=317&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�q�v�m�ҤH�n�o�G�|�j�G�B���z�S�]�������Y�����n�����ǳơu���I�l���v�H�I - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�q�v�m�ҤH�n�o�G�|�j�G�B���z�S�]�������Y�����n�����ǳơu���I�l���v�H�I-�v��\">�i�q�v�m�ҤH�n�o�G�|�j�G�B���z�S�]�������Y�����n�����ǳơu���I�l���v�H�I</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"658\" data-m='{\"i\":658,\"p\":655,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSo9B5\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e6%9e%97%e5%bf%83%e5%a6%82%e5%8b%9d%e8%a8%b4%e5%b0%8d%e8%ac%a0%e8%a8%80%e4%b8%8d%e5%a7%91%e6%81%af%e3%80%80%e9%80%8f%e9%9c%b2%e9%9c%8d%e5%bb%ba%e8%8f%af%e6%9c%80%e6%84%9b%e6%8b%8d%e8%83%8c%e5%bd%b1/vi-BBSo9B5\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSoe65.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�ߦp�ӶD���������h���@�z�S�N�صس̷R��I�v Thumbnail\" /> <div>\n" +
"<h3   aria-label=\"�L�ߦp�ӶD���������h���@�z�S�N�صس̷R��I�v-�v��\">�L�ߦp�ӶD���������h���@�z�S�N�صس̷R��I�v</h3>\n" +
"\n" +
"<img alt=\"wikienter �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBqbgYI.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>wikienter</span>\n" +
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
"<img alt=\"�L�׮ȹC�����j �O�𰪩ұo�ȸs\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrBN5.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=168&amp;y=110&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�L�׮ȹC�����j �O�𰪩ұo�ȸs - �� CNA ����\" /> <div>\n" +
"<h3   aria-label=\"�L�׮ȹC�����j �O�𰪩ұo�ȸs-�v��\">�L�׮ȹC�����j �O�𰪩ұo�ȸs</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"662\" data-m='{\"i\":662,\"p\":660,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpJFi\",\"h\":0,\"v\":\"video\",\"c\":\"news\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/news/%e9%a9%9a%e6%82%9a%e7%89%87%e3%80%8a%e7%95%b0%e8%a3%82%e3%80%8b-%e8%a1%97%e9%a0%ad%e8%b6%85%e8%83%bd%e5%b0%8d%e6%b1%ba/vi-BBSpJFi\"  >\n" +
"<img alt=\"�宪���m�����n ���Y�W���M\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpRxg.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=348&amp;y=128&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�宪���m�����n ���Y�W���M - �� CNA ����\" /> <div>\n" +
"<h3   aria-label=\"�宪���m�����n ���Y�W���M-�v��\">�宪���m�����n ���Y�W���M</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"663\" data-m='{\"i\":663,\"p\":660,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSpU0g\",\"h\":0,\"v\":\"video\",\"c\":\"news\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/news/%e5%a8%81%e5%b0%bc%e6%96%af%e4%b8%83%e6%9c%88%e8%b5%b7-%e5%be%b5%e6%97%85%e9%81%8a%e4%b8%8a%e5%b2%b8%e7%a8%85/vi-BBSpU0g\"  >\n" +
"<img alt=\"�¥����C��_ �x�ȹC�W���|\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSpRIw.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�¥����C��_ �x�ȹC�W���| - �� CNA ����\" /> <div>\n" +
"<h3   aria-label=\"�¥����C��_ �x�ȹC�W���|-�v��\">�¥����C��_ �x�ȹC�W���|</h3>\n" +
"\n" +
"<img alt=\"�����q�T�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5ICWw.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�����q�T��</span>\n" +
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
"<img alt=\"�e���t�A���D�Լs�F�ܸ򭻴䯻�����۩I��P�ɤ��}�m�F�Ѽɶ��n�T�j��ڻ���I�I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS9WDf.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=504&amp;y=257&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�e���t�A���D�Լs�F�ܸ򭻴䯻�����۩I��P�ɤ��}�m�F�Ѽɶ��n�T�j��ڻ���I�I - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�e���t�A���D�Լs�F�ܸ򭻴䯻�����۩I��P�ɤ��}�m�F�Ѽɶ��n�T�j��ڻ���I�I-�v��\">�e���t�A���D�Լs�F�ܸ򭻴䯻�����۩I��P�ɤ��}�m�F�Ѽɶ��n�T�j��ڻ���I�I</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
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
"<img alt=\"�i�m���N�A���B�F�n�o�G�|�j���F���b�|�W�������X�p�٦V���t���D�B�I�H\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBS09EJ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=683&amp;y=302&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m���N�A���B�F�n�o�G�|�j���F���b�|�W�������X�p�٦V���t���D�B�I�H - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m���N�A���B�F�n�o�G�|�j���F���b�|�W�������X�p�٦V���t���D�B�I�H-�v��\">�i�m���N�A���B�F�n�o�G�|�j���F���b�|�W�������X�p�٦V���t���D�B�I�H</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"669\" data-m='{\"i\":669,\"p\":667,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBRPo3h\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8acoffee-friends%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e5%ad%ab%e6%b5%a9%e4%bf%8a%e7%88%86%e6%96%99%e3%80%8c%e7%86%b1%e6%83%85%e5%85%81%e6%b5%a9%e5%81%9a%e6%8d%90%e8%b4%88%e4%b9%9f%e4%b8%8d%e9%a1%98%e8%bc%b8%ef%bc%81%e3%80%8d/vi-BBRPo3h\"  >\n" +
"<img alt=\"�i�mCoffee Friends�n�o�G�|�j�]�E�T�z�ơG�u�������E�����ؤ]���@��I�v\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRP6wy.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=680&amp;y=206&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�mCoffee Friends�n�o�G�|�j�]�E�T�z�ơG�u�������E�����ؤ]���@��I�v - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�mcoffee friends�n�o�G�|�j�]�E�T�z�ơG�u�������E�����ؤ]���@��I�v-�v��\">�i�mCoffee Friends�n�o�G�|�j�]�E�T�z�ơG�u�������E�����ؤ]���@��I�v</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"670\" data-m='{\"i\":670,\"p\":667,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBRKarq\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e6%88%90%e7%82%ba%e7%8e%8b%e7%9a%84%e7%94%b7%e4%ba%ba%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e5%91%82%e7%8f%8d%e4%b9%9d%e5%be%9e%e7%94%b7%e5%ad%a9%e8%ae%8a%e6%88%90%e4%ba%86%e7%94%b7%e4%ba%ba%ef%bc%81%e8%a8%b1%e8%ab%be%e6%94%b6%e8%a6%96%e7%8e%87%e5%85%ac%e7%b4%84%e9%81%94%e6%88%90%e5%b0%87%e7%a9%bf%e5%8f%a4%e8%a3%9d%e9%80%81%e6%8a%b1%e6%8a%b1%ef%bd%9e/vi-BBRKarq\"  >\n" +
"<img alt=\"�i�m���������k�H�n�o�G�|�j�f�äE�q�k���ܦ��F�k�H�I�\�զ����v�����F���N��j�˰e����\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRKhpy.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=670&amp;y=201&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m���������k�H�n�o�G�|�j�f�äE�q�k���ܦ��F�k�H�I�\�զ����v�����F���N��j�˰e���� - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m���������k�H�n�o�G�|�j�f�äE�q�k���ܦ��F�k�H�I�\�զ����v�����F���N��j�˰e����-�v��\">�i�m���������k�H�n�o�G�|�j�f�äE�q�k���ܦ��F�k�H�I�\�զ����v�����F���N��j�˰e����</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
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
"<img alt=\"�i�m�F�k�p�e�n�o�G�|�j�վ家�z�ƨk�D�r�p�޳N�G��F�]�Oí�r���B�h�T�P�l�D�t�סI\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBRfmJO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=651&amp;y=137&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m�F�k�p�e�n�o�G�|�j�վ家�z�ƨk�D�r�p�޳N�G��F�]�Oí�r���B�h�T�P�l�D�t�סI - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m�F�k�p�e�n�o�G�|�j�վ家�z�ƨk�D�r�p�޳N�G��F�]�Oí�r���B�h�T�P�l�D�t�סI-�v��\">�i�m�F�k�p�e�n�o�G�|�j�վ家�z�ƨk�D�r�p�޳N�G��F�]�Oí�r���B�h�T�P�l�D�t�סI</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"673\" data-m='{\"i\":673,\"p\":671,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBQc0fS\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e9%98%bf%e7%88%be%e7%bd%95%e5%b8%83%e6%8b%89%e5%ae%ae%e7%9a%84%e5%9b%9e%e6%86%b6%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e7%8e%84%e5%bd%acand%e6%9c%b4%e4%bf%a1%e6%83%a0%e4%ba%92%e8%ae%9a-%e9%87%91%e7%be%a9%e8%81%96%e9%a2%a8%e8%b6%a3%e5%90%90%e6%a7%bd%e5%8f%88%e6%98%af%e6%bc%94%e7%88%b6%e8%a6%aa%ef%bc%8c%e6%88%91%e6%9c%89%e9%82%a3%e9%ba%bc%e8%80%81%e5%97%8e%ef%bc%9f/vi-BBQc0fS\"  >\n" +
"<img alt=\"�i�m�����u���Ԯc���^�Сn�o�G�|�j�ȱl&amp;���H�f���g ���q�t����R�ѡG�S�O�t���ˡA�ڦ�����ѶܡH\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQc0fQ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=570&amp;y=183&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m�����u���Ԯc���^�Сn�o�G�|�j�ȱl&amp;���H�f���g ���q�t����R�ѡG�S�O�t���ˡA�ڦ�����ѶܡH - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m�����u���Ԯc���^�Сn�o�G�|�j�ȱl&amp;���H�f���g ���q�t����R�ѡG�S�O�t���ˡA�ڦ�����ѶܡH-�v��\">�i�m�����u���Ԯc���^�Сn�o�G�|�j�ȱl&amp;���H�f���g ���q�t����R�ѡG�S�O�t���ˡA�ڦ�����ѶܡH</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"674\" data-m='{\"i\":674,\"p\":671,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBQ6zwl\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e3%80%8a%e5%85%88%e7%86%b1%e6%83%85%e5%9c%b0%e6%89%93%e6%8e%83%e5%90%a7%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e3%80%91%e4%bb%8a%e6%99%9a%e9%a6%96%e6%92%ad%ef%bc%81%e4%b8%bb%e6%bc%94%e9%87%91%e8%a3%95%e8%b2%9e%e3%80%81%e5%b0%b9%e9%88%9e%e7%9b%b8%e3%80%81%e5%ae%8b%e5%86%8d%e8%87%a8%e5%9d%87%e5%87%ba%e5%b8%ad-%e7%94%b7%e7%94%b7cp%e4%b9%9f%e5%be%88%e8%ae%93%e4%ba%ba%e6%9c%9f%e5%be%85%e5%93%a6%ef%bd%9e%e2%99%a5-xd/vi-BBQ6zwl\"  >\n" +
"<img alt=\"�i�m�������a�����a�n�o�G�|�j���߭����I�D�t���έs�B���v�ۡB���A�{���X�u �k�kCP�]�����H���ݮ@��? XD\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBQ6zwj.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=602&amp;y=142&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m�������a�����a�n�o�G�|�j���߭����I�D�t���έs�B���v�ۡB���A�{���X�u �k�kCP�]�����H���ݮ@��? XD - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m�������a�����a�n�o�G�|�j���߭����I�D�t���έs�B���v�ۡB���A�{���X�u �k�kcp�]�����H���ݮ@��? xd-�v��\">�i�m�������a�����a�n�o�G�|�j���߭����I�D�t���έs�B���v�ۡB���A�{���X�u �k�kCP�]�����H���ݮ@��? XD</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
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
"<img alt=\"�i�m�k�B�͡n�o�G�|�j���_�C���v�S�����s�@�[�o�G�ӥi�R�ա�\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPWDoB.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=644&amp;y=193&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m�k�B�͡n�o�G�|�j���_�C���v�S�����s�@�[�o�G�ӥi�R�ա� - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m�k�B�͡n�o�G�|�j���_�C���v�S�����s�@�[�o�G�ӥi�R�ա�-�v��\">�i�m�k�B�͡n�o�G�|�j���_�C���v�S�����s�@�[�o�G�ӥi�R�ա�</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
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
"<img alt=\"�i�m�ӦZ���~��n�o�G�|�j�Z�����t�˫G�۲r�D�p �i�R�ԭq�U���������I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPVIpP.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=659&amp;y=223&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�m�ӦZ���~��n�o�G�|�j�Z�����t�˫G�۲r�D�p �i�R�ԭq�U���������I - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�i�m�ӦZ���~��n�o�G�|�j�Z�����t�˫G�۲r�D�p �i�R�ԭq�U���������I-�v��\">�i�m�ӦZ���~��n�o�G�|�j�Z�����t�˫G�۲r�D�p �i�R�ԭq�U���������I</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"679\" data-m='{\"i\":679,\"p\":677,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPRwWL\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/exo%e5%9c%a8%e6%a9%9f%e5%a0%b4%e5%b8%b6%e4%be%86%e9%a9%9a%e5%96%9c%e7%a6%ae%e7%89%a9%ef%bc%81suho%e4%b8%80%e4%b8%8b%e8%bb%8a%e5%b0%b1%e7%bf%bb%e8%b7%9f%e6%96%97%e6%af%94%e6%84%9b%e5%bf%83%ef%bc%8c%e7%87%a6%e7%83%88%e5%89%87%e5%9c%a8%e8%bb%8a%e8%a3%a1%e7%ac%91%e8%91%97%e9%82%84%e6%8b%bf%e8%91%97%e6%89%8b%e6%a9%9f%e6%8b%8d%e6%94%9d%ef%bc%81/vi-BBPRwWL\"  >\n" +
"<img alt=\"EXO�b�����a�����§���ISuho�@�U���N½����R�ߡA��P�h�b���̯����ٮ��ۤ������I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPRlms.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=1208&amp;y=127&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"EXO�b�����a�����§���ISuho�@�U���N½����R�ߡA��P�h�b���̯����ٮ��ۤ������I - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"exo�b�����a�����§���Isuho�@�U���N½����R�ߡA��P�h�b���̯����ٮ��ۤ������I-�v��\">EXO�b�����a�����§���ISuho�@�U���N½����R�ߡA��P�h�b���̯����ٮ��ۤ������I</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"680\" data-m='{\"i\":680,\"p\":677,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPDEQi\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%8apriest%e3%80%8b%e7%99%bc%e4%bd%88%e6%9c%83%e5%bb%b6%e5%ae%87%e6%8c%af%e6%8e%a5%e6%9b%bf%e9%87%91%e6%9d%90%e6%98%b1%e7%b9%bc%e7%ba%8c%e9%a9%85%e9%ad%94-%e8%8b%a6%e7%b7%b4%e6%8b%89%e4%b8%81%e6%96%87%e8%88%87%e8%ae%9a%e9%a0%8c%e6%ad%8c%e5%8f%aa%e6%b1%82%e5%a5%bd%e5%a4%a2/vi-BBPDEQi\"  >\n" +
"<img alt=\"�mPriest�n�o�G�|�G���t�����������R�~���X�] �W�m�ԤB��P�g�|�q�u�D�n��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPDNde.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=634&amp;y=281&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�mPriest�n�o�G�|�G���t�����������R�~���X�] �W�m�ԤB��P�g�|�q�u�D�n�� - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"�mpriest�n�o�G�|�G���t�����������R�~���X�] �W�m�ԤB��P�g�|�q�u�D�n��-�v��\">�mPriest�n�o�G�|�G���t�����������R�~���X�] �W�m�ԤB��P�g�|�q�u�D�n��</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
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
"<img alt=\"D.O.�o�G�|�{�ɳQCue�j����ľ�R�I�W�Ũ�ꪺ�m�n�\�k�ġn\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPDRdn.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=640&amp;y=231&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"D.O.�o�G�|�{�ɳQCue�j����ľ�R�I�W�Ũ�ꪺ�m�n�\�k�ġn - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"d.o.�o�G�|�{�ɳQcue�j����ľ�R�I�W�Ũ�ꪺ�m�n�\�k�ġn-�v��\">D.O.�o�G�|�{�ɳQCue�j����ľ�R�I�W�Ũ�ꪺ�m�n�\�k�ġn</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"683\" data-m='{\"i\":683,\"p\":681,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPr3e9\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":2}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e9%98%b2%e5%bd%88%e5%b0%91%e5%b9%b4%e5%9c%98%e6%88%90%e7%82%ba2018-mga%e7%9a%84%e4%b8%bb%e4%ba%ba%e5%85%ac%ef%bc%8cwanna-one%e3%80%81twice%e4%b8%89%e5%86%a0%e7%8e%8b/vi-BBPr3e9\"  >\n" +
"<img alt=\"���u�֦~�Φ���2018 MGA���D�H���AWanna One�BTWICE�T�a��\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPr0Hr.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=356&amp;y=168&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���u�֦~�Φ���2018 MGA���D�H���AWanna One�BTWICE�T�a�� - �� ���P�� ����\" /> <div>\n" +
"<h3   aria-label=\"���u�֦~�Φ���2018 mga���D�H���Awanna one�Btwice�T�a��-�v��\">���u�֦~�Φ���2018 MGA���D�H���AWanna One�BTWICE�T�a��</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"684\" data-m='{\"i\":684,\"p\":681,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBPlDgB\",\"h\":0,\"v\":\"video\",\"c\":\"watch\",\"o\":3}'   class=\"media video\"   >\n" +
"<a href=\"/zh-tw/video/watch/%e3%80%90%e5%a4%9a%e5%9c%96%e3%80%91%e9%87%91%e4%bf%8a%e7%a7%80%e9%80%80%e4%bc%8d%e7%8f%be%e5%a0%b4%e7%85%a7%e7%89%87%e5%85%ac%e9%96%8b%ef%bc%81-ig%e9%80%8f%e9%9c%b2%e5%bf%83%e5%a2%83%e3%80%8c%e6%84%9f%e8%ac%9d%e6%89%80%e6%9c%89%e4%b8%80%e5%90%8c%e8%b5%b0%e9%81%8e%e7%9a%84%e4%ba%ba%e3%80%8d/vi-BBPlDgB\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBPlYvQ.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�i�h�ϡj���T�q�h��{���Ӥ����}�I IG�z�S�߹ҡG�u�P�©Ҧ��@�P���L���H�v Thumbnail\" /> <div>\n" +
"<h3   aria-label=\"�i�h�ϡj���T�q�h��{���Ӥ����}�I ig�z�S�߹ҡG�u�P�©Ҧ��@�P���L���H�v-�v��\">�i�h�ϡj���T�q�h��{���Ӥ����}�I IG�z�S�߹ҡG�u�P�©Ҧ��@�P���L���H�v</h3>\n" +
"\n" +
"<img alt=\"���P�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB6wjOu.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>���P��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"685\" data-m='{\"i\":685,\"p\":633,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�s�_\"\n" +
"          data-section-id=\"stripe.viralvideo\"\n" +
"          data-section-id=\"stripe.viralvideo\">\n" +
"        <div class=\"stripeouter\"  data-aop=\"stripe.viralvideo_stripe\"  data-id=\"686\" data-m='{\"i\":686,\"p\":19,\"n\":\"stripe.viralvideo\",\"t\":\"stripe\",\"o\":16}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"687\" data-m='{\"i\":687,\"p\":686,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.viralvideo.navigation_stripenavigation\"  data-id=\"688\" data-m='{\"i\":688,\"p\":686,\"n\":\"stripe.viralvideo.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"689\" data-m='{\"i\":689,\"p\":688,\"n\":\"�s�_\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/video/viral\"  data-id=\"690\" data-m='{\"i\":690,\"p\":688,\"n\":\"�s�_\",\"y\":4,\"o\":2}'>�s�_</a></h2>\n" +
"</li>\n" +
"  </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"691\" data-m='{\"i\":691,\"p\":688,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":3}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"692\" data-m='{\"i\":692,\"p\":688,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":4}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"693\" data-m='{\"i\":693,\"p\":688,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":5}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"694\" data-m='{\"i\":694,\"p\":688,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":6}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"695\" data-m='{\"i\":695,\"p\":688,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":7}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"���F���ߨơH�o�Q�ȤH�~��L�ӥ|�}�¤�\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSfUKk.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=122&amp;y=68&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���F���ߨơH�o�Q�ȤH�~��L�ӥ|�}�¤� - buzzvideos\" /> <div>\n" +
"<h3   aria-label=\"���F���ߨơH�o�Q�ȤH�~��L�ӥ|�}�¤�-�v��\">���F���ߨơH�o�Q�ȤH�~��L�ӥ|�}�¤�</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
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
"<h3   aria-label=\"�����]�������������I-�v��\">�����]�������������I</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
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
"<img alt=\"�ۦb�@�_�Τ�ı������I\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSm8Hy.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;x=388&amp;y=770&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ۦb�@�_�Τ�ı������I - buzzvideos\" /> <div>\n" +
"<h3   aria-label=\"�ۦb�@�_�Τ�ı������I-�v��\">�ۦb�@�_�Τ�ı������I</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
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
"<h3   aria-label=\"���ʽ��L�X�� �D�H�l�v�����v���ѲH�H���s��-�v��\">���ʽ��L�X�� �D�H�l�v�����v���ѲH�H���s��</h3>\n" +
"\n" +
"<img alt=\"BuzzVideos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBAp9C5.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>BuzzVideos</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"708\" data-m='{\"i\":708,\"p\":686,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�u��\"\n" +
"          data-section-id=\"stripe.weather\"\n" +
"          data-section-id=\"stripe.weather\">\n" +
"        <div class=\"weather stripeouter\"  data-aop=\"stripe.weather_stripe\"  data-id=\"709\" data-m='{\"i\":709,\"p\":19,\"n\":\"Stripe.weather\",\"t\":\"stripe\",\"o\":17}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"710\" data-m='{\"i\":710,\"p\":709,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.weather.navigation_stripenavigation\"  data-id=\"711\" data-m='{\"i\":711,\"p\":709,\"n\":\"Stripe.weather.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"712\" data-m='{\"i\":712,\"p\":711,\"n\":\"�u��\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/weather\"  data-id=\"713\" data-m='{\"i\":713,\"p\":711,\"n\":\"�u��\",\"y\":4,\"o\":2}'>�u��</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"714\" data-m='{\"i\":714,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"�Y�ɤѮ�s�D\",\"o\":3}'><a href=\"/zh-tw/weather/news\">�Y�ɤѮ�s�D</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"715\" data-m='{\"i\":715,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"��H��\",\"o\":4}'><a href=\"/zh-tw/weather/maps\">��H��</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"716\" data-m='{\"i\":716,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"��ūB�q�έp\",\"o\":5}'><a href=\"/zh-tw/weather/records\">��ūB�q�έp</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"717\" data-m='{\"i\":717,\"p\":711,\"n\":\"listlink\",\"y\":4,\"l\":\"��q���p\",\"o\":6}'><a href=\"/zh-tw/weather/traffic\">��q���p</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"718\" data-m='{\"i\":718,\"p\":711,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":7}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"719\" data-m='{\"i\":719,\"p\":711,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":8}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"720\" data-m='{\"i\":720,\"p\":711,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":9}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"721\" data-m='{\"i\":721,\"p\":711,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":10}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"722\" data-m='{\"i\":722,\"p\":711,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":11}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
" <div class=\"city\">�O�_��</div>\n" +
"<div class=\"now\">�{�b</div>\n" +
"<div class=\"currentcond\">\n" +
"<span>19</span>\n" +
"<span class=\"unit\">�XC</span>\n" +
"</div>\n" +
"<div  class=\"wind winddir_sw\">SW 2 ����/�p��</div>\n" +
"\n" +
"<div class=\"fl\">��P�ū�: 19&#176;</div>\n" +
"<div class=\"text\">�h���ɳ�</div>\n" +
"<div class=\"time\">��s�ɶ�: �U�� 11:35 2019�~1��19��</div>\n" +
"</div>\n" +
"<div class=\"hovereff\"></div>\n" +
"</a>\n" +
" <a  href=\"/zh-tw/weather/today/%e8%87%ba%e5%8c%97%e5%b8%82,%e8%87%ba%e7%9d%a3/we-city?iso=TW&amp;el=88BvMEEFglY1eFnLmpENHA%3D%3D\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\">\n" +
"<div class=\"today\">\n" +
"<div>����</div>\n" +
"<div class=\"avglow\">�C��: 17&#176;</div>\n" +
"<div class=\"avghigh\">����: 19&#176;</div>\n" +
"</div>\n" +
"</a>\n" +
" <style>.skybg{background-color: #022332 !important; } </style>\n" +
" <div class=\"herobg skybg\" data-skycode=\"30\"  data-current-bg-img=\"{&quot;baseUrl&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/&quot;,&quot;size4Img&quot;:&quot;BBaI7S.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=305&amp;h=300&quot;}\"></div>\n" +
" <div class=\"gradient\" style=\"background: url(//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2J3Pd.img?m=6&amp;o=true&amp;u=true&amp;n=true&amp;w=305&amp;h=300) repeat-x left bottom;\"></div>\n" +
"\n" +
" <span class=\"edithome\" data-degreetype=\"C\"  data-id=\"724\" data-m='{\"i\":724,\"p\":709,\"n\":\"weathereditbtn\",\"y\":12,\"o\":4}'\n" +
"data-home=\"�j�M�a�I/����\" title=\"�ܧ�\" aria-label=\"�ܧ��m�ηū׳��\">�ܧ�</span>\n" +
"<div class=\"weapopup\" role=\"dialog\" aria-labelledby=\"weaaddlocation-label\"  data-aop=\"editweatherflyout\"  data-region=\"editweatherflyout\">\n" +
"<div class=\"weaddn wpopbg\"></div>\n" +
"<div class=\"weaddn wpopctn\">\n" +
"<a class=\"close\"  data-id=\"725\" data-m='{\"i\":725,\"p\":709,\"n\":\"weatherTodayMiniClose\",\"t\":\"CloseBtn\",\"o\":5}' role=\"button\" href=\"#\" title=\"����\">����</a>\n" +
" \n" +
"\n" +
"<div class=\"weaaddlocation\">\n" +
"\n" +
"<form  data-id=\"726\" data-m='{\"i\":726,\"p\":709,\"n\":\"weasearchlocation\",\"y\":8,\"o\":6}' action=\"/zh-tw/weather/search\" data-action=\"/zh-tw/weather/ajax/places/search/\" method=\"get\"  class=\"nogps\">\n" +
" \n" +
"<p class=\"label\" id=\"weaaddlocation-label\">�]�w�w�]��m</p>\n" +
"<div class=\"add-loc-as-container\">\n" +
"<input name=\"q\" class=\"query\" accesskey=\"L\" autocomplete=\"off\" type=\"search\" aria-autocomplete=\"list\"\n" +
"value=\"\" maxlength=\"250\" data-auto-suggest-settings='{&quot;market&quot;:&quot;zh-tw&quot;,&quot;mode&quot;:&quot;AS&quot;,&quot;baseurl&quot;:&quot;/zh-tw/weather/today&quot;,&quot;action&quot;:&quot;sethome&quot;,&quot;method&quot;:&quot;custom&quot;,&quot;selector&quot;:&quot;.weaaddlocation&quot;,&quot;urltype&quot;:&quot;GeoLocation&quot;,&quot;formcode&quot;:&quot;&quot;,&quot;lat&quot;:22.9944,&quot;lon&quot;:120.199}'\n" +
"                   placeholder=\"�j�M�a�I/����\" data-seemoretext=\"���U &lt;Enter&gt; �H�d�ݧ�h���e\" data-autosuggestdelay=\"100\"\n" +
"                   aria-label=\"�j�M�a�I/����\"  data-id=\"727\" data-m='{\"i\":727,\"p\":726,\"n\":\"weaautosuggest\",\"y\":10,\"o\":1}' />\n" +
"<button type=\"submit\" title =\"�j�M\" class=\"searchbtn\"  data-id=\"728\" data-m='{\"i\":728,\"p\":726,\"n\":\"wealocationsearch\",\"y\":11,\"o\":2}'\n" +
"  aria-label=\"�j�M\">\n" +
"<span class=\"x-screen-reader\">�j�M</span>               \n" +
"            </button>\n" +
"        </div>\n" +
"        <div class=\"nolocerr\" aria-live=\"assertive\" data-message=\"�䤣��u{0}�v���j�M���G\"></div>\n" +
"<div class=\"errmsg\" aria-hidden=\"true\" data-error-in-service-message=\"�o�ͷN�~�����~�A�ЦA�դ@���C\"></div>\n" +
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
"<p>�ū���ܳ��</p>\n" +
"<form id=\"id75f499e11155466e901cd6acace69db1\" class=\"setdegree\"  data-id=\"730\" data-m='{\"i\":730,\"p\":709,\"n\":\"degreetype\",\"y\":12,\"o\":7}' action=\"/zh-tw/weather/ajax/places/savedegree/\" method=\"post\">\n" +
" \n" +
"<div>\n" +
"<button name=\"weaDegreeType\" id=\"id75f499e11155466e901cd6acace69db1_fahrenheit_tile\" value=\"F\"\n" +
"                        class=\"\"\n" +
" role=\"radio\"\n" +
"  data-id=\"731\" data-m='{\"i\":731,\"p\":730,\"n\":\"weafahrenheit\",\"y\":11,\"o\":1}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id75f499e11155466e901cd6acace69db1_fahrenheit_tile\" form=\"id75f499e11155466e901cd6acace69db1\">�ؤ�</label>\n" +
"            </div>\n" +
"            <div>\n" +
"                <button name=\"weaDegreeType\" id=\"id75f499e11155466e901cd6acace69db1_celsius_tile\" value=\"C\"\n" +
"                        class=\"selected\"\n" +
" role=\"radio\"\n" +
"  data-id=\"732\" data-m='{\"i\":732,\"p\":730,\"n\":\"weacelsius\",\"y\":11,\"o\":2}'>\n" +
"<span class=\"dot\"></span>\n" +
"</button>\n" +
"<label for=\"id75f499e11155466e901cd6acace69db1_celsius_tile\" form=\"id75f499e11155466e901cd6acace69db1\">���</label>\n" +
"</div>\n" +
" \n" +
"</form>\n" +
"</div>\n" +
"\n" +
"<button  data-id=\"733\" data-m='{\"i\":733,\"p\":709,\"n\":\"weatherTodayMiniDone\",\"t\":\"DoneBtn\",\"o\":8}' class=\"donebutton disabled\" disabled=\"disabled\" title=\"����\">����</button>\n" +
"</div>\n" +
"</div>\n" +
" <a  href=\"/zh-tw/weather/today\" data-loc=\"lat=25.04&amp;long=121.56&amp;c=%E8%87%BA%E5%8C%97%E5%B8%82&amp;cn=%E8%87%BA%E7%9D%A3&amp;iso=TW&amp;type=1\">\n" +
"<div class=\"dynlink\">\n" +
" 10 ��w��\n" +
"</div>\n" +
"</a>\n" +
"\n" +
"</div>\n" +
" <div  class=\"stripecontent normaldensity\"  data-module-id=\"startpage|Stripe.weather|stripe|Stripe.weather.WeatherNews|headlines\"  data-aop=\"stripe.weather.weathernews\"  data-id=\"734\" data-m='{\"i\":734,\"p\":709,\"n\":\"Stripe.weather.WeatherNews\",\"t\":\"headlines\",\"o\":9}'>\n" +
" \n" +
" <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"735\" data-m='{\"i\":735,\"p\":734,\"n\":\"secondary\",\"y\":8,\"o\":1}'>\n" +
" <li  data-id=\"736\" data-m='{\"i\":736,\"p\":735,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBSrKhN\",\"h\":0,\"v\":\"weather\",\"c\":\"other\",\"o\":1}'  >\n" +
"<a href=\"/zh-tw/weather/other/%e5%98%89%e7%be%a9%e5%9c%b0%e9%9c%87%e8%a6%8f%e6%a8%a138-%e6%9c%80%e5%a4%a7%e9%9c%87%e5%ba%a63%e7%b4%9a/ar-BBSrKhN\"  >\n" +
"<img alt=\"�a�_20190109\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBSrKhM.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�a�_20190109 - �� Sanlih E-television Co., LTD ����\" /> <div>\n" +
"<h3   aria-label=\"�Ÿq�a�_�W��3.8 �̤j�_��3��-�峹\">�Ÿq�a�_�W��3.8 �̤j�_��3��</h3>\n" +
"\n" +
"<img alt=\"�T�߷s�D�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAlkKeX.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>�T�߷s�D��</span>\n" +
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
"  <a href=\"/zh-tw/sports/nba/�ö��}���|-at-�i�S���ݯ��/game-center/sp-id-30401000002074178\" aria-label=\"�ö��}���| �� �i�S���ݯ�̡C���ɤ��: 1��19�� �W�� 11:30 CST �C�o���� 112-128 �C���ɵ����C\" class=\"game clearfix\"   data-id=\"740\" data-m='{\"i\":740,\"p\":737,\"n\":\"basketball_nba\",\"y\":15,\"l\":\"30401000002074178\",\"o\":3}'>\n" +
" <div class=\"teambased \">\n" +
"<div>\n" +
"<div>\n" +
"<img alt=\"�ö��}���| �лx\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cMXj?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">���|</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div class=\"score-container\">\n" +
" <p class=\"sports-header-bold\">1��19��</p>\n" +
"\n" +
" <div class=\"clearfix\">\n" +
"<p class=\"sports-header-light\">112</p>\n" +
"<p class=\"sports-header-light\">-</p>\n" +
"<p class=\"sports-header-light\">128</p>\n" +
"</div>\n" +
"\n" +
" <p class=\"sports-header-bold\">���ɵ���</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div>\n" +
"<img alt=\"�i�S���ݯ�� �лx\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cXfr?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">�ݯ��</p>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" </a>\n" +
" <a href=\"/zh-tw/sports/nba/���{�i�h-at-�����F�ָ�/game-center/sp-id-30401000002073943\" aria-label=\"���{�i�h �� �����F�ָ��C���ɤ��: 1��19�� �W�� 11:30 CST �C�o���� 112-94 �C���ɵ����C\" class=\"game clearfix\"   data-id=\"741\" data-m='{\"i\":741,\"p\":737,\"n\":\"basketball_nba\",\"y\":15,\"l\":\"30401000002073943\",\"o\":4}'>\n" +
" <div class=\"teambased \">\n" +
"<div>\n" +
"<div>\n" +
"<img alt=\"���{�i�h �лx\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cS5z?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">�i�h</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div class=\"score-container\">\n" +
" <p class=\"sports-header-bold\">1��19��</p>\n" +
"\n" +
" <div class=\"clearfix\">\n" +
"<p class=\"sports-header-light\">112</p>\n" +
"<p class=\"sports-header-light\">-</p>\n" +
"<p class=\"sports-header-light\">94</p>\n" +
"</div>\n" +
"\n" +
" <p class=\"sports-header-bold\">���ɵ���</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div>\n" +
"<img alt=\"�����F�ָ� �лx\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AAfbmMi?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">�ָ�</p>\n" +
"</div>\n" +
"</div>\n" +
" </div>\n" +
" </a>\n" +
" <a href=\"/zh-tw/sports/nba/�J�������M�h-at-�S�L��h/game-center/sp-id-30401000002074313\" aria-label=\"�J�������M�h �� �S�L��h�C���ɤ��: 1��19�� �W�� 10:00 CST �C�o���� 99-115 �C���ɵ����C\" class=\"game clearfix\"   data-id=\"742\" data-m='{\"i\":742,\"p\":737,\"n\":\"basketball_nba\",\"y\":15,\"l\":\"30401000002074313\",\"o\":5}'>\n" +
" <div class=\"teambased \">\n" +
"<div>\n" +
"<div>\n" +
"<img alt=\"�J�������M�h �лx\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cZLB?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">�M�h</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div class=\"score-container\">\n" +
" <p class=\"sports-header-bold\">1��19��</p>\n" +
"\n" +
" <div class=\"clearfix\">\n" +
"<p class=\"sports-header-light\">99</p>\n" +
"<p class=\"sports-header-light\">-</p>\n" +
"<p class=\"sports-header-light\">115</p>\n" +
"</div>\n" +
"\n" +
" <p class=\"sports-header-bold\">���ɵ���</p>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div>\n" +
"            <div>\n" +
"<img alt=\"�S�L��h �лx\" data-src=\"{&quot;default&quot;:&quot;//img-s-msn-com.akamaized.net/tenant/amp/entityid/AA2cPAk?f=PNG&amp;h=84&amp;w=84&amp;m=6&amp;q=60&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <p class=\"sports-header-bold\">��h</p>\n" +
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
"               placeholder=\"�����j�M\"\n" +
"               title=\"�����j�M\"\n" +
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
"<span>����</span>\n" +
"<span class=\"multiquote-cheveron\" aria-hidden=\"true\"></span>\n" +
"</a>\n" +
" <a aria-label=\"�x�ѫ��� increase 9,836.06 +46.91 +0.48%\" href=\"/zh-tw/money/indexdetails/fi-144.10.%21WTIND\"  data-id=\"746\" data-m='{\"i\":746,\"p\":709,\"n\":\"DenseStartStripeEntitiesLink\",\"y\":14,\"o\":14}'>\n" +
" <div class=\"fi-multiquoteview\">\n" +
" <span class=\"fi-title\"><p class='truncated-string'  title='�x�ѫ���'>�x�ѫ���</p></span>\n" +
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
" <a aria-label=\"�x�n�q decrease 218.50 -2.00 -0.91%\" href=\"/zh-tw/money/stockdetails/fi-144.1.2330.TAI\"  data-id=\"747\" data-m='{\"i\":747,\"p\":709,\"n\":\"DenseStartStripeEntitiesLink\",\"y\":14,\"o\":15}'>\n" +
" <div class=\"fi-multiquoteview\">\n" +
" <span class=\"fi-title\"><p class='truncated-string'  title='�x�n�q'>�x�n�q</p></span>\n" +
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
"<header><h3><a href=\"/zh-tw/weather\" >�u��</a></h3></header>\n" +
"  <ul class=\"secondary\"  data-aop=\"secondary\"  data-id=\"752\" data-m='{\"i\":752,\"p\":750,\"n\":\"secondary\",\"y\":8,\"o\":2}'>\n" +
" <li  data-id=\"753\" data-m='{\"i\":753,\"p\":752,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":1}'  >\n" +
"<a href=\"http://clk.tradedoubler.com/click?p=235163&amp;a=2811343&amp;epi=PRIME_ZHTW_HP_ENTSS&amp;url=https://www.microsoft.com/zh-tw/store/d/office-365-university/cfq7ttc0k5bb\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AAhz6Z8.img?h=272&amp;w=420&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Office365 Students - Microsoft\" /> <div>\n" +
"<h3  >�@�MOffice�Ѧh�H�ϥ� �Ш|�M�ׯS����I��</h3>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"754\" data-m='{\"i\":754,\"p\":709,\"n\":\"rightarrow\",\"y\":12,\"o\":19}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"����P�y�B��\"\n" +
"          data-section-id=\"stripe.tv\"\n" +
"          data-section-id=\"stripe.tv\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.tv_stripe\"  data-id=\"755\" data-m='{\"i\":755,\"p\":19,\"n\":\"stripe.tv\",\"t\":\"stripe\",\"o\":18}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"756\" data-m='{\"i\":756,\"p\":755,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.tv.navigation_stripenavigation\"  data-id=\"757\" data-m='{\"i\":757,\"p\":755,\"n\":\"stripe.tv.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"758\" data-m='{\"i\":758,\"p\":757,\"n\":\"����P�y�B��\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"/zh-tw/lifestyle/horoscope\"  data-id=\"759\" data-m='{\"i\":759,\"p\":757,\"n\":\"����P�y�B��\",\"y\":4,\"o\":2}'>����P�y�B��</a></h2>\n" +
"</li>\n" +
"  </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"760\" data-m='{\"i\":760,\"p\":757,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":3}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"761\" data-m='{\"i\":761,\"p\":757,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":4}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"762\" data-m='{\"i\":762,\"p\":757,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":5}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"763\" data-m='{\"i\":763,\"p\":757,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":6}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"764\" data-m='{\"i\":764,\"p\":757,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":7}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<img alt=\"�d�Ϯy\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcrv.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�d�Ϯy - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"�d�Ϯy-�n�h�`�N����o�X��ĵ�T�C-�峹\">�d�Ϯy-�n�h�`�N����o�X��ĵ�T�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"768\" data-m='{\"i\":768,\"p\":766,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYefU\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e9%87%91%e7%89%9b%e5%ba%a7-%e5%9c%a8%e5%bf%99%e4%ba%82%e5%92%8c%e9%96%92%e9%81%a9%e4%b9%8b%e9%96%93%e6%89%be%e5%b9%b3%e8%a1%a1%e9%bb%9e%e3%80%82/ar-BBNYefU?li=BBuDJhq\"  >\n" +
"<img alt=\"�����y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYa1N.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"�����y-�b���éM���A�����䥭���I�C-�峹\">�����y-�b���éM���A�����䥭���I�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"769\" data-m='{\"i\":769,\"p\":766,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYcrB\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e9%9b%99%e5%ad%90%e5%ba%a7-%e9%96%8b%e6%9c%97%e6%a8%82%e8%a7%80%e7%9a%84%e6%85%8b%e5%ba%a6%e6%9c%89%e5%8a%a9%e5%81%a5%e5%ba%b7%e3%80%82/ar-BBNYcrB?li=BBuDJhq\"  >\n" +
"<img alt=\"���l�y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcry.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���l�y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"���l�y-�}�Լ��[���A�צ��U���d�C-�峹\">���l�y-�}�Լ��[���A�צ��U���d�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
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
"<img alt=\"���ɮy\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcrw.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���ɮy - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"���ɮy-�`�N�B�ʡA������ܤO�C-�峹\">���ɮy-�`�N�B�ʡA������ܤO�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"773\" data-m='{\"i\":773,\"p\":771,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYhd6\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e7%8d%85%e5%ad%90%e5%ba%a7-%e5%ae%8c%e5%85%a8%e7%9a%84%e6%ba%96%e5%82%99%e8%ae%93%e8%87%aa%e5%b7%b1%e8%a1%a8%e7%8f%be%e4%b8%8d%e5%87%a1%e3%80%82/ar-BBNYhd6?li=BBuDJhq\"  >\n" +
"<img alt=\"��l�y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGB.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"��l�y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"��l�y-�������ǳ����ۤv��{���Z�C-�峹\">��l�y-�������ǳ����ۤv��{���Z�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"774\" data-m='{\"i\":774,\"p\":771,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNY6BJ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e8%99%95%e5%a5%b3%e5%ba%a7-%e5%b1%95%e7%8f%be%e5%8f%a3%e6%89%8d%e8%83%bd%e5%8a%9b%e3%80%82/ar-BBNY6BJ?li=BBuDJhq\"  >\n" +
"<img alt=\"�B�k�y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGy.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�B�k�y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"�B�k�y-�i�{�f�~��O�C-�峹\">�B�k�y-�i�{�f�~��O�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
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
"<img alt=\"�ѯ��y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGz.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�ѯ��y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"�ѯ��y-����ۤv����í�w�����C-�峹\">�ѯ��y-����ۤv����í�w�����C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"778\" data-m='{\"i\":778,\"p\":776,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNY6BI\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e5%a4%a9%e8%a0%8d%e5%ba%a7-%e7%a9%8d%e6%a5%b5%e5%8f%83%e5%8a%a0%e5%90%84%e9%a0%85%e6%b4%bb%e5%8b%95%e3%80%82/ar-BBNY6BI?li=BBuDJhq\"  >\n" +
"<img alt=\"���Ȯy\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNY6BG.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���Ȯy - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"���Ȯy-�n���ѥ[�U�����ʡC-�峹\">���Ȯy-�n���ѥ[�U�����ʡC</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"779\" data-m='{\"i\":779,\"p\":776,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYcrA\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e5%b0%84%e6%89%8b%e5%ba%a7-%e5%a0%85%e6%8c%81%e8%87%aa%e5%b7%b1%e4%b8%80%e8%b2%ab%e7%9a%84%e7%94%9f%e6%b4%bb%e7%8b%80%e6%85%8b%e3%80%82/ar-BBNYcrA?li=BBuDJhq\"  >\n" +
"<img alt=\"�g��y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYhd0.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�g��y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"�g��y-����ۤv�@�e���ͬ����A�C-�峹\">�g��y-����ۤv�@�e���ͬ����A�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
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
"<img alt=\"���~�y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYcrx.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���~�y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"���~�y-�P�X�@�٦�Q�ץ��ӡC-�峹\">���~�y-�P�X�@�٦�Q�ץ��ӡC</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"783\" data-m='{\"i\":783,\"p\":781,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYjGI\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":2}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e6%b0%b4%e7%93%b6%e5%ba%a7-%e4%b8%8d%e8%a6%81%e6%94%be%e9%81%8e%e4%bb%bb%e4%bd%95%e6%a9%9f%e6%9c%83%e3%80%82/ar-BBNYjGI?li=BBuDJhq\"  >\n" +
"<img alt=\"���~�y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNYjGH.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"���~�y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"���~�y-���n��L������|�C-�峹\">���~�y-���n��L������|�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"784\" data-m='{\"i\":784,\"p\":781,\"n\":\"HeadlineItemViewModel\",\"y\":13,\"l\":\"BBNYjGJ\",\"h\":0,\"v\":\"lifestyle\",\"c\":\"lifestylehoroscope\",\"o\":3}'  >\n" +
"<a href=\"/zh-tw/lifestyle/horoscope/%e9%9b%99%e9%ad%9a%e5%ba%a7-%e9%96%b1%e8%ae%80%e4%ba%9b%e4%bf%9d%e9%a4%8a%e7%9a%84%e6%9b%b8%e7%b1%8d%e6%9c%83%e6%9c%89%e5%b9%ab%e5%8a%a9%e3%80%82/ar-BBNYjGJ?li=BBuDJhq\"  >\n" +
"<img alt=\"�����y\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBNY6BO.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"�����y - ����u�@��\" /> <div>\n" +
"<h3   aria-label=\"�����y-�\Ū�ǫO�i�����y�|�����U�C-�峹\">�����y-�\Ū�ǫO�i�����y�|�����U�C</h3>\n" +
"\n" +
"<img alt=\"����u�@�� �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BB973C.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>����u�@��</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"785\" data-m='{\"i\":785,\"p\":755,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
"            \n" +
"        </div>\n" +
"    </div>\n" +
"    <div  class=\"stripecontainer\"\n" +
"          role=\"region\"\n" +
"          aria-label=\"�L�n�ӫ�\"\n" +
"          data-section-id=\"stripe.special\"\n" +
"          data-section-id=\"stripe.special\">\n" +
"        <div class=\"news stripeouter\"  data-aop=\"stripe.special_stripe\"  data-id=\"786\" data-m='{\"i\":786,\"p\":19,\"n\":\"stripe.special\",\"t\":\"stripe\",\"o\":19}'>\n" +
"            \n" +
"                <button tabindex=\"-1\" class=\"leftarrow\"  data-id=\"787\" data-m='{\"i\":787,\"p\":786,\"n\":\"leftarrow\",\"y\":12,\"o\":1}'  title=\"�W�@��\"></button>\n" +
"            <div class=\"stripe full-width\">\n" +
"                \n" +
" <div class=\"stripenav\"  data-aop=\"stripe.special.navigation_stripenavigation\"  data-id=\"788\" data-m='{\"i\":788,\"p\":786,\"n\":\"stripe.special.navigation\",\"t\":\"stripeNavigation\",\"o\":2}'>\n" +
" \n" +
"<ul>\n" +
" <li  data-id=\"789\" data-m='{\"i\":789,\"p\":788,\"n\":\"�L�n�ӫ�\",\"y\":4,\"o\":1}'>\n" +
" <h2><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAV&u=https://www.microsoft.com/zh-tw/store/b/home\"  data-id=\"790\" data-m='{\"i\":790,\"p\":788,\"n\":\"�L�n�ӫ�\",\"y\":4,\"o\":2}'>�L�n�ӫ�</a></h2>\n" +
"</li>\n" +
"  <li  class=\"hide12\"  data-id=\"791\" data-m='{\"i\":791,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Office\",\"o\":3}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVOffice1&amp;u=https://www.microsoft.com/zh-tw/store/collections/alloffice\">Office</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"792\" data-m='{\"i\":792,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Windows\",\"o\":4}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVWin2&amp;u=https://www.microsoft.com/zh-tw/store/collections/windows/pc\">Windows</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"793\" data-m='{\"i\":793,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Visio\",\"o\":5}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVVisio3&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\">Visio</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"794\" data-m='{\"i\":794,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Project\",\"o\":6}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVProject4&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\">Project</a></li>\n" +
" <li  class=\"hide12\"  data-id=\"795\" data-m='{\"i\":795,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Visual Studio\",\"o\":7}'><a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_NAVVS5&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\">Visual Studio</a></li>\n" +
" <li  class=\"hide123\"  data-id=\"796\" data-m='{\"i\":796,\"p\":788,\"n\":\"listlink\",\"y\":4,\"l\":\"Outlook�H�c (Hotmail)\",\"o\":8}'><a href=\"https://www.hotmail.com\">Outlook�H�c (Hotmail)</a></li>\n" +
" </ul>\n" +
" <div class=\"stripemenu\"  role=\"menu\">\n" +
"<button class=\"edit\"  data-id=\"797\" data-m='{\"i\":797,\"p\":788,\"n\":\"personalization\",\"t\":\"dropdown\",\"o\":9}'>�s��</button>\n" +
" <button  role=\"menuitem\"  data-id=\"798\" data-m='{\"i\":798,\"p\":788,\"n\":\"remove\",\"t\":\"dropdownitem\",\"o\":10}' class=\"remove\">�����Ϭq</button>\n" +
" <button  role=\"menuitem\"  data-id=\"799\" data-m='{\"i\":799,\"p\":788,\"n\":\"moveup\",\"t\":\"dropdownitem\",\"o\":11}' class=\"up\">�N�Ϭq�V�W����</button>\n" +
"<button  role=\"menuitem\"  data-id=\"800\" data-m='{\"i\":800,\"p\":788,\"n\":\"movedown\",\"t\":\"dropdownitem\",\"o\":12}' class=\"down\">�N�Ϭq�V�U����</button>\n" +
" <button  role=\"menuitem\"  data-id=\"801\" data-m='{\"i\":801,\"p\":788,\"n\":\"addbelow\",\"t\":\"dropdownitem\",\"o\":13}' class=\"add\">�b�U���s�W�Ϭq</button>\n" +
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
"<h3  >Office 365�󥭥x�q�� ��߻��u�n219��</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"�s�i\">�s�i</span>\n" +
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
"<h3  >Windows 10�G���v�H�ӳ̦n���L�n�@�~�t��</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"�s�i\">�s�i</span>\n" +
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
"<h3  >���z�q�����y�����t�C Office</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"�s�i\">�s�i</span>\n" +
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
"<h3  >���s Visual Studio 2017 �n�� �ɨ����P�Ŷ}�o����</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"�s�i\">�s�i</span>\n" +
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
"<h3   aria-label=\"�i���n�j��m�c�N�ǯ��f�r �ХߧY�w�˧�s-�峹\">�i���n�j��m�c�N�ǯ��f�r �ХߧY�w�˧�s</h3>\n" +
"\n" +
"<img alt=\"Photos �лx\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBz3ebk.img?h=22&amp;w=22&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&amp;f=png&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" /> <span>Photos</span>\n" +
"\n" +
"                        </div>\n" +
"                    </a>\n" +
"\n" +
"                    \n" +
" </li>\n" +
" <li  data-id=\"816\" data-m='{\"i\":816,\"p\":814,\"n\":\"NativeAdHeadlineItemViewModel\",\"y\":13,\"o\":2}'  >\n" +
"<a href=\"https://afflnk.microsoft.com/c/1239701/439031/7808?sharedid=PRIME_ZHTW_HP_STORES_Project&amp;u=https://www.microsoft.com/zh-tw/store/collections/additionalsoftware\"   target=\"_blank\"     class=\"nativead\"  data-pg=\"TSTPRNUS32\" data-pid=\"7HD66FC\"  >\n" +
"<img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/BBqBJmP.img?h=105&amp;w=140&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Check list - iStock/Getty-Images\" /> <div>\n" +
"<h3  >�ϥ� Project �޲z�M�� �N�O�o�򤫵M����</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"�s�i\">�s�i</span>\n" +
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
"<h3  >�̴Ϊ���ѳB�z�n�� Mac �]��֦��I</h3>\n" +
"\n" +
" <span class=\"adslabel\" title=\"�s�i\">�s�i</span>\n" +
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
"                <button tabindex=\"-1\" class=\"rightarrow\"  data-id=\"818\" data-m='{\"i\":818,\"p\":786,\"n\":\"rightarrow\",\"y\":12,\"o\":7}'  title=\"�U�@��\"></button>\n" +
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
"            <a class=\"floatingfeedback\" href=\"#\"  data-id=\"820\" data-m='{\"i\":820,\"p\":819,\"n\":\"feedbackLink\",\"y\":12,\"o\":1}'  data-aop=\"floatingfeedbacklink\">�N������</a>\n" +
"\n" +
"\n" +
"        \n" +
"        \n" +
" <section id=\"stripemenuoptions\"  data-aop=\"stripe-personalization\">\n" +
"<p>�s�W�β����Ϭq</p>\n" +
"<button class=\"close\"  data-id=\"821\" data-m='{\"i\":821,\"y\":12,\"l\":\"stripe_personalization_close\"}'>����</button>\n" +
"<div>\n" +
" <button  aria-label=\"���� �J�I\"  data-stripe-id=\"stripe.photos\"  data-id=\"822\" data-m='{\"i\":822,\"y\":12,\"l\":\"stripe_toggle_stripe.photos\"}' >\n" +
" \n" +
" <span>�J�I</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �T��\"  data-stripe-id=\"stripe.entertainment\"  data-id=\"823\" data-m='{\"i\":823,\"y\":12,\"l\":\"stripe_toggle_stripe.entertainment\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5YPIS.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>�T��</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �]�g\"  data-stripe-id=\"stripe.finance\"  data-id=\"824\" data-m='{\"i\":824,\"y\":12,\"l\":\"stripe_toggle_stripe.finance\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4BwSM.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Finance\" />\n" +
" <span>�]�g</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �s�D\"  data-stripe-id=\"stripe.news\"  data-id=\"825\" data-m='{\"i\":825,\"y\":12,\"l\":\"stripe_toggle_stripe.news\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4CFdS.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"National News\" />\n" +
" <span>�s�D</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �ͬ�\"  data-stripe-id=\"stripe.lifestyle\"  data-id=\"826\" data-m='{\"i\":826,\"y\":12,\"l\":\"stripe_toggle_stripe.lifestyle\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oDps.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>�ͬ�</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� ���d\"  data-stripe-id=\"stripe.health\"  data-id=\"827\" data-m='{\"i\":827,\"y\":12,\"l\":\"stripe_toggle_stripe.health\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA5YKmV.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>���d</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �B��\"  data-stripe-id=\"stripe.sports\"  data-id=\"828\" data-m='{\"i\":828,\"y\":12,\"l\":\"stripe_toggle_stripe.sports\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oQGX.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>�B��</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �T��\"  data-stripe-id=\"stripe.autos\"  data-id=\"829\" data-m='{\"i\":829,\"y\":12,\"l\":\"stripe_toggle_stripe.autos\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4Ca1l.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Autos\" />\n" +
" <span>�T��</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �v��\"  data-stripe-id=\"stripe.video\"  data-id=\"830\" data-m='{\"i\":830,\"y\":12,\"l\":\"stripe_toggle_stripe.video\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oAOK.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>�v��</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �s�_\"  data-stripe-id=\"stripe.viralvideo\"  data-id=\"831\" data-m='{\"i\":831,\"y\":12,\"l\":\"stripe_toggle_stripe.viralvideo\"}' >\n" +
" \n" +
" <span>�s�_</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �u��\"  data-stripe-id=\"stripe.weather\"  data-id=\"832\" data-m='{\"i\":832,\"y\":12,\"l\":\"stripe_toggle_Stripe.weather\"}' >\n" +
" \n" +
" <span>�u��</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� ����P�y�B��\"  data-stripe-id=\"stripe.tv\"  data-id=\"833\" data-m='{\"i\":833,\"y\":12,\"l\":\"stripe_toggle_stripe.tv\"}' >\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oL47.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>����P�y�B��</span>\n" +
" </button>\n" +
" <button  aria-label=\"���� �L�n�ӫ�\"  data-stripe-id=\"stripe.special\"  data-id=\"834\" data-m='{\"i\":834,\"y\":12,\"l\":\"stripe_toggle_stripe.special\"}' >\n" +
" \n" +
" <span>�L�n�ӫ�</span>\n" +
" </button>\n" +
" <button  aria-label=\"�s�W �⩤���\"  data-stripe-id=\"stripe.world\"  data-id=\"835\" data-m='{\"i\":835,\"y\":12,\"l\":\"stripe_toggle_stripe.world\"}'  class=\"pending\">\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6olcF.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>�⩤���</span>\n" +
" </button>\n" +
" <button  aria-label=\"�s�W �ꤺ\"  data-stripe-id=\"stripe.national\"  data-id=\"836\" data-m='{\"i\":836,\"y\":12,\"l\":\"stripe_toggle_stripe.national\"}'  class=\"pending\">\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA6oAHY.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" />\n" +
" <span>�ꤺ</span>\n" +
" </button>\n" +
" <button  aria-label=\"�s�W ��޻P���\"  data-stripe-id=\"stripe.tech\"  data-id=\"837\" data-m='{\"i\":837,\"y\":12,\"l\":\"stripe_toggle_stripe.tech\"}'  class=\"pending\">\n" +
" <img alt=\"\" data-src=\"{&quot;default&quot;:&quot;//static-global-s-msn-com.akamaized.net/img-resizer/tenant/amp/entityid/AA4Cxu3.img?h=151&amp;w=203&amp;m=6&amp;q=60&amp;u=t&amp;o=t&amp;l=f&quot;,&quot;dpi&quot;:1.4}\" src=\"//static-global-s-msn-com.akamaized.net/hp-eas/sc/9b/e151e5.gif\" title=\"Khoa h?c &amp; C?ng ngh?\" />\n" +
" <span>��޻P���</span>\n" +
" </button>\n" +
" <div class=\"loading\"></div>\n" +
"</div>\n" +
"<button class=\"done\"  data-id=\"838\" data-m='{\"i\":838,\"y\":12,\"l\":\"stripe_personalization_submit\"}'>����</button>\n" +
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
"            <a href=\"https://itunes.apple.com/tw/app/microsoft-news/id945416273?pt=80423&amp;ct=prime_footer&amp;mt=8\"  target=\"_blank\"  title=\"App Store �U��\"  data-id=\"841\" data-m='{\"i\":841,\"p\":839,\"n\":\"amsnewsft\",\"y\":11,\"o\":2}'><img  alt=\"App Store �U��\" src=\"https://linkmaker.itunes.apple.com/assets/shared/badges/zh-tw/appstore-lrg.svg\")/></a>\n" +
"        </li>\n" +
"        <li class=\"google-badge\">\n" +
"            <a href=\"https://play.google.com/store/apps/details?id=com.microsoft.amp.apps.bingnews&amp;hl=zh-tw&amp;referrer=utm_source=prime_footer&amp;utm_campaign=footer\"  target=\"_blank\"  title=\"Google Play �ߧY�U��\"  data-id=\"842\" data-m='{\"i\":842,\"p\":839,\"n\":\"gmsnewsft\",\"y\":11,\"o\":3}'><img  alt=\"Google Play �ߧY�U��\" src=\"https://play.google.com/intl/en_us/badges/images/generic/zh-tw_badge_web_generic.png\")/></a>\n" +
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
"���p�v &amp; �p����r�ɮ�\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkID=246338\"    data-id=\"846\" data-m='{\"i\":846,\"p\":839,\"n\":\"footer_termsofuse\",\"y\":14,\"o\":7}'\n" +
">\n" +
"�ϥγW�w\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkID=286759\"    data-id=\"847\" data-m='{\"i\":847,\"p\":839,\"n\":\"footer_adprivacyinfo\",\"y\":14,\"o\":8}'\n" +
">\n" +
"����ڭ̪��s�i\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"#\"  id=\"footer_feedback\"   data-id=\"848\" data-m='{\"i\":848,\"p\":839,\"n\":\"footer_feedback\",\"y\":14,\"o\":9}'\n" +
" target=\"_self\">�N������\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?LinkId=512703\"    data-id=\"849\" data-m='{\"i\":849,\"p\":839,\"n\":\"footer_help\",\"y\":14,\"o\":10}'\n" +
">\n" +
"����\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"/zh-tw/msn-worldwide\"    data-id=\"850\" data-m='{\"i\":850,\"p\":839,\"n\":\"footer_worldwide\",\"y\":14,\"o\":11}'\n" +
">\n" +
"MSN ���y\n" +
"</a>\n" +
"</li>\n" +
" <li><a href=\"https://go.microsoft.com/fwlink/?linkid=875132\"    data-id=\"851\" data-m='{\"i\":851,\"p\":839,\"n\":\"footer_advertise\",\"y\":14,\"o\":12}'\n" +
">\n" +
"�s�i\n" +
"</a>\n" +
"</li>\n" +
" </ul>\n" +
"\n" +
"                \n" +
"            </footer>\n" +
"        </div>\n" +
"\n" +
"        <div id=\"feedback-flyout\"  data-aop=\"feedback_flyout\">\n" +
"             <button id=\"feedback-close\"  title=\"����\"  data-id=\"852\" data-m='{\"i\":852,\"n\":\"feedback\",\"y\":11,\"l\":\"close\"}'></button>\n" +
" <div class=\"feedbackheader mainheader\">\n" +
"<h2>�ǰe MSN �N������</h2>\n" +
"</div>\n" +
" <div class=\"feedbackheader thankyou\">\n" +
"<h2>�P�±z���ѷN������!</h2>\n" +
"</div>\n" +
" <div id=\"feedback-feedbackarea\">\n" +
"<div class=\"feedbackarea\">\n" +
"<label for=\"feedback-inputbox\">�ڭ̥i�H�p���i?</label>\n" +
"<textarea id=\"feedback-inputbox\" maxlength=\"400\" placeholder=\"�Цb����J�z���N�������C����U�O�@�z�����p�v�A�Ф��]�t�ӤH��T (�Ҧp�z���m�W�Φa�})�C\" aria-live=\"assertive\"></textarea>\n" +
"</div>\n" +
"</div>\n" +
" <div id=\"feedback-starrating\">\n" +
"  <div class=\"stars\">\n" +
"<p>�д��Ѿ����������:</p>\n" +
"<ul data-selected=\"0\" aria-label=\"�д��Ѿ����������:\" role=\"radiogroup\">\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 �P�ŵ����o�� 1\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 �P�ŵ����o�� 2\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 �P�ŵ����o�� 3\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 �P�ŵ����o�� 4\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" <li tabindex=\"0\" class=\"sensoryStars\" aria-label=\"5 �P�ŵ����o�� 5\" role=\"radio\" aria-checked=\"false\"></li>\n" +
" </ul>\n" +
"</div>\n" +
" </div>\n" +
" <button id=\"feedback-submit\" class=\"footerbutton\"  title=\"����\"  data-id=\"853\" data-m='{\"i\":853,\"n\":\"feedback\",\"y\":11,\"l\":\"submit\"}'>����</button>\n" +
" <button id=\"feedback-ok\" class=\"footerbutton\"  title=\"����\"  data-id=\"854\" data-m='{\"i\":854,\"n\":\"feedback\",\"y\":11,\"l\":\"ok\"}'>����</button>\n" +
" <div class=\"feedbackfooter\">\n" +
" <div id=\"feedback-privacy-link\">\n" +
"<a href=\"https://go.microsoft.com/fwlink/?LinkId=521839\" class=\"footerlink\" target=\"_blank\"  data-id=\"855\" data-m='{\"i\":855,\"n\":\"feedback\",\"y\":14,\"l\":\"feedbackPrivacyLink\"}'>���p�v�n��</a>\n" +
"</div>\n" +
"  <div id=\"feedback-help-link\">\n" +
"<a href=\"https://support.microsoft.com/product/msn/msn\" class=\"footerlink\" target=\"_blank\"  data-id=\"856\" data-m='{\"i\":856,\"n\":\"feedback\",\"y\":14,\"l\":\"feedbackHelpLink\"}'>����</a>\n" +
"</div>\n" +
"  <div id=\"feedback-help-support-link\">\n" +
"<a href=\"https://support.microsoft.com/product/msn/msn\" class=\"footerlink\" target=\"_blank\"  data-id=\"857\" data-m='{\"i\":857,\"n\":\"feedback\",\"y\":14,\"l\":\"feedbackHelpSupportLink\"}'>�����P�䴩</a>\n" +
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
